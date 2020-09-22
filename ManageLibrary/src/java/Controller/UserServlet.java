/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.User;

/**
 *
 * @author Tran Y
 */
public class UserServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response1
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            UserDAO dao = new UserDAO();
            User user = null;
            String action = request.getParameter("action");
            String username;
            if (action == null || action.equals("")) {
                request.setAttribute("USERS", new User("", "", "", 0, true));
                request.setAttribute("ACTION", "SaverOrUpdate");
                request.getRequestDispatcher("view-user.jsp").forward(request, response);
                return;
            }
            switch (action) {
                case "SaverOrUpdate":
                    username = request.getParameter("username");
                    String fullname = request.getParameter("fullname");
                    String password = request.getParameter("password");
                    Integer age = Integer.parseInt(request.getParameter("age"));
                    Integer gender = Integer.parseInt(request.getParameter("gender"));
                    boolean _gender = false;
                    if (gender == 1) {
                        _gender = true;
                    }
                    user = new User(username, password, fullname, 0, _gender);
                    if (dao.findById(username) == null) {
                        dao.add(user);
                    } else {
                        dao.save(user);
                    }

                    request.getRequestDispatcher("register-user.jsp").forward(request, response);
                    break;
                case "List":
                    request.getRequestDispatcher("view-user.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    username = request.getParameter("username");
                    user = dao.findById(username);
                    if (user == null) {
                        request.setAttribute("USERS", new User("", "", "", 0, true));
                    }
                    request.setAttribute("USERS", user);
                    request.setAttribute("ACTION", "SaverOrUpdate");
                    request.getRequestDispatcher("register-user.jsp").forward(request, response);
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
            Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
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
