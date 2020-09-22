/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Model.User;
import Model.User1Dao;
import Model.UserDAO;
import commons.DataHelps;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
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
            User user = null;
            // UserDAO dao = new UserDAO();
            User1Dao dao = new User1Dao();
            String action = request.getParameter("action");
            String username;
            if (action == null || action.equals("")) {
                request.setAttribute("USER", new User());
                request.setAttribute("Action", "SaveOrUpdate");
                request.getRequestDispatcher("display-user.jsp").forward(request, response);
                return;
            }
            switch (action) {
                case "SaveOrUpdate":
                    username = request.getParameter("username");
                    String password = request.getParameter("password");
                    String fullname = request.getParameter("fullname");
                    int age = Integer.parseInt(request.getParameter("age"));
                    Date birthday = DataHelps.todate(request.getParameter("birthday"));
                    int gt = Integer.parseInt(request.getParameter("gender"));
                    boolean gender = false;
                    if (gt > 0) {
                        gender = true;

                    }
                    user = new User(username, password, fullname, age, birthday, gender);
                    //  dao.save(user);
                    if (dao.findByID(username) == null) {
                        dao.add(user);
                    } else {
                        dao.update(user);
                    }
                    System.out.println("size" + dao.getAll().size());
                    request.getRequestDispatcher("dangky.jsp").forward(request, response);
                    break;
                case "List":
                    //  request.getRequestDispatcher("view-user.jsp").forward(request, response);
                    request.setAttribute("LIST_USER", dao.getAll());
                    request.getRequestDispatcher("display-user.jsp").forward(request, response);
                    break;
                case "AddOrEdit":
                    username = request.getParameter("username");
                    user = dao.findByID(username);
                    if (user == null) {
                        user = new User("", "", "", 0, DataHelps.now(), true);
                    }
                    request.setAttribute("USER", user);
                    request.setAttribute("ACTION", "SaveOrUpdate");
                    // request.getRequestDispatcher("register-user.jsp").forward(request, response);
                    request.getRequestDispatcher("dangky.jsp").forward(request, response);

                    break;
                case "Delete":
                    username = request.getParameter("username");
                    user = dao.findByID(username);
                    if (user != null) {
                        //   dao.delete(username);
                        dao.delete1(user);
                    }

                    request.getRequestDispatcher("display-user.jsp").forward(request, response);
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
