/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import abc.Controlller.DateHelpes;
import abc.DAO.UserDAO;
import abc.Models.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tran Y
 */
@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

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
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String action = request.getParameter("action");
            String username;
            UserDAO dao = new UserDAO();
            Users users = null;
            if (action == null || action.equals("")) {
                request.setAttribute("USERS", new Users());
                request.setAttribute("ACTION", "SaveOrUpdate");
                request.getRequestDispatcher("Users-Displays.jsp").forward(request, response);
            }
            switch (action) {
                case "SaveOrUpdate":
                    username = request.getParameter("username");
                    String password = request.getParameter("password");
                    String fullname = request.getParameter("fullname");
                    int age = Integer.parseInt(request.getParameter("age"));
                    Date birthday = DateHelpes.todate(request.getParameter("birthday"));
                    int gt = Integer.parseInt(request.getParameter("gender"));
                    boolean gender = false;
                    if (gt > 0) {
                        gender = true;
                    }
                    users = new Users(username, password, fullname, age, birthday, gender);
                    if (dao.findByID(username) == null) {
                        dao.addU(users);
                    } else {
                        dao.update(users);
                    }
                    request.getRequestDispatcher("Users-register.jsp").forward(request, response);
                    break;
                case "List":
                    request.setAttribute("LIST_USRES", dao.getUAll());
                    request.getRequestDispatcher("Users-Displays.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    username = request.getParameter("username");
                    users = dao.findByID(username);
                    if (users == null) {
                        users = new Users("", "", "", 0, DateHelpes.now(), true);
                    }
                    request.setAttribute("USERS", users);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("Users-register.jsp").forward(request, response);
                    break;
                case "Delete":
                    username = request.getParameter("username");
                    users = dao.findByID(username);
                    if (users != null) {
                        dao.dele(users);
                    }
                    request.getRequestDispatcher("Users-Displays.jsp").forward(request, response);
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
        } catch (ParseException ex) {
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
        } catch (ParseException ex) {
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
