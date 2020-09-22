/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DeParts.DeParts1DAO;
import DeParts.Departs;
import DeParts.DepartsDAO;
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
public class DePartsServlet extends HttpServlet {

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
            Departs departs = null;
            DeParts1DAO dao = new DeParts1DAO();
            String action = request.getParameter("action");
            String id;
            if (action == null || action.equals("")) {
                request.setAttribute("Departs", new Departs());
                request.setAttribute("Action", "SaveOrUpdate");
                request.getRequestDispatcher("display-depart.jsp").forward(request, response);
                return;

            }
            switch (action) {
                case "SaveOrUpdate":
                    id = request.getParameter("id");
                    String name = request.getParameter("name");
                    
                    departs= new Departs(id, name);
                    if (dao.findByID(id) == null) {
                        dao.add(departs);
                    }else{
                    dao.update(departs);
                    }
                  //  System.out.println("size" + dao.getAll().size());
                    request.getRequestDispatcher("dangky-depart.jsp").forward(request, response);
                    break;
                case "List":
                    request.setAttribute("LIST_DEPART", dao.getAll());
                    request.getRequestDispatcher("display-depart.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    id = request.getParameter("id");
                    departs = dao.findByID(id);
                    if (departs == null) {
                        departs = new Departs("", "");
                    }
                    request.setAttribute("Departs", departs);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("dangky-depart.jsp").forward(request, response);
                    break;
                     case "Delete":
                    id = request.getParameter("id");
                    departs = dao.findByID(id);
                    if (departs != null) {
                    dao.delete1(departs);
                    }
                    request.getRequestDispatcher("display-depart.jsp").forward(request, response);
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
