/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.User;
import Models.UserDAO;
import View.DateHelper;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tran Y
 */
public class UserServletController extends HttpServlet {

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
            UserDAO dao = new UserDAO();
            User user = null;

            String username;
            String action = request.getParameter("action");
            if (action == null || action.equals("")) {
                request.setAttribute("USER", new User("", "", "", 0, DateHelper.now(), true));
                request.setAttribute("ACTION", "SaveOrUpdate");
                request.getRequestDispatcher("view-user.jsp").forward(request, response);
                return;
            }

            switch (action) {
                case "SaveOrUpdate":
                    username = request.getParameter("username");
                    String pass = request.getParameter("password");
                    String fullname = request.getParameter("fullname");
                    int age = Integer.parseInt(request.getParameter("age"));
                    Date birthday = DateHelper.toDate(request.getParameter("birthday"));
                    int gender = Integer.parseInt(request.getParameter("gender"));
                    boolean _gender = false;
                    if (gender == 1) {
                        _gender = true;
                    }
                    user = new User(username, pass, fullname, age, birthday, _gender);
                    dao.save(user);
                    System.out.println("size: " + dao.getAll().size());
                    request.getRequestDispatcher("register-user.jsp").forward(request, response);
                    break;
                case "List":
                    request.getRequestDispatcher("view-user.jsp").forward(request, response);
                    break;

                case "AddOrEdit":

                    username = request.getParameter("username");
                    user = dao.findByID(username);
                    if (user == null) {
                        request.setAttribute("USER", new User("", "", "", 0, DateHelper.now(), true));
                    }
                    request.setAttribute("USER", user);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    request.getRequestDispatcher("register-user.jsp").forward(request, response);
                    break;
                case "Delete":

                    username = request.getParameter("username");
                    user = dao.findByID(username);
                    if (user != null) {
                       dao.delete(username);
                    }
                    request.getRequestDispatcher("view-user.jsp").forward(request, response);
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
