/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import commons.DateHelper;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Departs;
import model.DepartsDAO;
import model.Staff;
import model.StaffsDAO;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author LAptop
 */
@WebServlet(name = "StaffsServlet", urlPatterns = {"/StaffsServlet"})
public class StaffsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Staff staffs = null;
            StaffsDAO dao = new StaffsDAO();
            DepartsDAO ddao = new DepartsDAO();
            String action = request.getParameter("action");
            String id = null;
            String filename = null;
            if (action == null || action.equals("")) {
                request.setAttribute("STAFFS", new Staff());
                request.setAttribute("ACTION", "SaveOrUpdate");
                request.setAttribute("STAFFS", dao.getAll());
                request.getRequestDispatcher("wiew-staffs.jsp").forward(request, response);
                return;
            }
            switch (action) {
                case "List":
//                    request.getRequestDispatcher("wiew-user.jsp").forward(request, response);
                    request.setAttribute("STAFFS", dao.getAll());
                    request.getRequestDispatcher("wiew-staffs.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    id = request.getParameter("id");
                    staffs = dao.getByID(id);
                    if (staffs == null) {
                        staffs = new Staff("", DateHelper.now(), "", true, "", "", "", "", 0.0, null);
                    }
                    request.setAttribute("STAFFS", dao.getAll());
                    request.setAttribute("STAFFS", staffs);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("staffs.jsp").forward(request, response);
                    break;
                case "SaveOrUpdate":
                    try {
                        // Create a factory for disk-based file items
                        DiskFileItemFactory factory = new DiskFileItemFactory();
                        // Configure a repository (to ensure a secure temp location is used)
                        ServletContext servletContext = this.getServletConfig().getServletContext();
                        File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
                        factory.setRepository(repository);
                        // Create a new file upload handler
                        ServletFileUpload upload = new ServletFileUpload(factory);
                        // Parse the request
                        List<FileItem> items = upload.parseRequest(request);
                        // Process the uploaded items
                        Iterator<FileItem> iter = items.iterator();
                        HashMap<String, String> fields = new HashMap<>();
                        while (iter.hasNext()) {
                            FileItem item = iter.next();
                            if (item.isFormField()) {
                                fields.put(item.getFieldName(), item.getString());
                                String name = item.getFieldName();
                                String value = item.getString();
                                System.out.println("name:" + name);
                                System.out.println("value:" + value);
                            } else {
                                filename = item.getName();
                                System.out.println("filename:" + filename);
                                if (filename == null || filename.equals("")) {
                                    break;
                                } else {
                                    Path path = Paths.get(filename);
                                    String storePath = servletContext.getRealPath("/uploads");
                                    File uploadfile = new File(storePath + "/" + path.getFileName());
                                    item.write(uploadfile);
                                    System.out.println(storePath + "/" + path.getFileName());
                                }
                            }
                        }
                        id = fields.get("id");
                        staffs = dao.getByID(id);
                        if (staffs == null) {
                            System.out.println("ko tim thay");
                            Staff infornew = new Staff();
                            infornew.setId(fields.get("id"));
                            infornew.setBirthday(DateHelper.todate(fields.get("birthday")));
                            infornew.setEmail(fields.get("email"));
                            int gt = Integer.parseInt(fields.get("gender"));
                            if (gt > 0) {
                                infornew.setGender(true);
                            } else {
                                infornew.setGender(false);
                            }
                            infornew.setName(fields.get("name"));
                            infornew.setNote(fields.get("notes"));
                            infornew.setPhone(fields.get("phone"));
                            infornew.setSalary(Double.parseDouble(fields.get("salary")));
//                            infornew.setDepart(new Departs(fields.get("depart")));
                            infornew.setPhoto(filename);
                            dao.insert(infornew);
                            System.out.println("save");

                        } else {
                            System.out.println("tim thay");
                            Staff infornew = new Staff();
                            infornew.setId(fields.get("id"));
                            infornew.setName(fields.get("name"));
                            infornew.setEmail(fields.get("email"));
                            int gt = Integer.parseInt(fields.get("gender"));
                            if (gt > 0) {
                                infornew.setGender(true);
                            } else {
                                infornew.setGender(false);
                            }
                            infornew.setBirthday(DateHelper.todate(fields.get("birthday")));
                            infornew.setPhone(fields.get("phone"));
                            infornew.setSalary(Double.parseDouble(fields.get("salary")));
//                            infornew.setDepart(new Depart(fields.get("depart")));
                            if (filename == null || filename.equals("")) {
                                System.out.println("file not null:" + filename);
                                infornew.setPhoto(staffs.getPhoto());
                            } else {
                                infornew.setPhoto(filename);
                            }
                            dao.update(infornew);
                            System.out.println("update");
                        }
                    } catch (Exception e) {
                    }
                    request.getRequestDispatcher("staffs.jsp").forward(request, response);
                    break;
                case "Delete":
                    id = request.getParameter("id");
                    staffs = dao.getByID(id);
                    if (staffs != null) {
                        dao.delete(id);
                    }
                    request.setAttribute("STAFFS", dao.getAll());
                    request.getRequestDispatcher("wiew-staffs.jsp").forward(request, response);
                    break;
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
