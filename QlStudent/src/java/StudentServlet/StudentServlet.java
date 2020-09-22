/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentServlet;

import Model.DataHelps;
import Model.Major;
import Model.MajorDAO;
import Model.Student;
import Model.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tran Y
 */
public class StudentServlet extends HttpServlet {

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
            Student student = null;
            StudentDAO dao = new StudentDAO();
            MajorDAO daomj = new MajorDAO();
            String action = request.getParameter("action");
            String id;
            if (action == null || action.equals("")) {
                action = "List";
            }
            switch (action) {
                case "SaveOrUpdate":
                    id = request.getParameter("id");
                    String name = request.getParameter("name");
                    String birthday = request.getParameter("birthday");
                    String major = request.getParameter("major");
                    student = new Student("", "", DataHelps.now(), new Major(0, ""));
                    if (dao.getStudentBYID(id) == null) {
                        dao.add(student);
                    } else {
                        dao.save(student);
                    }
                    System.out.println("size" + dao.getAll().size());
                    request.getRequestDispatcher("register-student.jsp").forward(request, response);
                    break;
                case "List":
                    request.setAttribute("LIST_STUDENT", dao.getAll());
                    request.setAttribute("LIST_MAJOR", daomj.getAll());

                    request.getRequestDispatcher("view-student.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    id = request.getParameter("id");
                    student = dao.getStudentBYID(id);
                    if (student == null) {
                        student = new Student("", "", DataHelps.now(), new Major(0, ""));
                    }
                    request.setAttribute("Student", student);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("register-student.jsp").forward(request, response);
                    break;
                case "Delete":
                    id = request.getParameter("id");
                    student = dao.getStudentBYID(id);
                    if (student != null) {
                        dao.delete(student);
                    }
                    request.getRequestDispatcher("view-student.jsp").forward(request, response);
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
