/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import abc.DAO.DepartsDAO;
import abc.Models.Departs;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tran Y
 */
public class DepartsServlet extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            DepartsDAO dao = new DepartsDAO();
            Departs departs = null;
            String action = request.getParameter("action");
            String id;
            if (action == null || action.equals("")) {
                request.setAttribute("Departs", new Departs());
                request.setAttribute("Action", "SaveOrUpdate");
                request.getRequestDispatcher("departs-view.jsp").forward(request, response);
            }
            switch (action) {
                case "SaveOrUpdate":
                    id = request.getParameter("id");
                    String name = request.getParameter("name");
                    departs = new Departs(id, name);
                    if (dao.finByID(id) == null) {
                        dao.inser(departs);
                    } else {
                        dao.update(departs);
                    }
                    request.getRequestDispatcher("departs-register.jsp").forward(request, response);
                    break;
                case "List":
                    request.setAttribute("LIST_DEPARTS", dao.getAll());
                    request.getRequestDispatcher("departs-view.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    id = request.getParameter("id");
                    departs = dao.finByID(id);
                    if (departs == null) {
                        departs = new Departs("", "");
                    }
                    request.setAttribute("Departs", departs);
                    request.setAttribute("Action", "SaveOrUpdate");
                    request.getRequestDispatcher("departs-register.jsp").forward(request, response);
                    break;
                
                case "Delete":
                    id=request.getParameter("id");
                  departs = dao.finByID(id);
                    if (departs != null) {
                        dao.delete(departs);
                    }
                    request.getRequestDispatcher("departs-view.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(DepartsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(DepartsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
