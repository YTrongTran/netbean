/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EmployeeDAO;
import model.Emplyoee;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "EmployeeServlet", urlPatterns = {"/EmployeeServlet"})
public class EmployeeServlet extends HttpServlet {

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
            String id, name, gender;
            EmployeeDAO dao = new EmployeeDAO();
            String action = request.getParameter("action");
            if (action == null || action.equals("")) {
                RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
                rd.forward(request, response);
                return;
            }

            switch (action) {
                case "add":
                    id = request.getParameter("id");
                    name = request.getParameter("name");
                    gender = request.getParameter("gender");
                    boolean gt = false;
                    if (gender.equalsIgnoreCase("Nam")) {
                        gt = true;
                    }
                    Emplyoee ee = new Emplyoee(id, name, gt);
                    dao.add(ee);
                    System.out.println("size" + dao.getALL().size());
                    request.setAttribute("EMPLOYEES", dao.getALL());
                    RequestDispatcher rd = request.getRequestDispatcher("list-employes.jsp");
                    rd.forward(request, response);
                    break;
                case "edit":
                    id = request.getParameter("id");
                    Emplyoee ee1 = dao.getByID(id);
                    request.setAttribute("EMPLOYEE", ee1);
                    request.setAttribute("ACTION", "update");
                     request.getRequestDispatcher("add.jsp").forward(request, response);
                    break;
                case "update":
                    id = request.getParameter("id");
                    name = request.getParameter("name");
                    gender = request.getParameter("gender");
                     gt = false;
                    if (gender.equalsIgnoreCase("Nam")) {
                        gt = true;
                    }
                     ee = new Emplyoee(id, name, gt);
                     dao.edit(ee);
                     System.out.println("size" + dao.getALL().size());
                    request.setAttribute("EMPLOYEES", dao.getALL());
                   request.getRequestDispatcher("list-employes.jsp").forward(request, response);
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
