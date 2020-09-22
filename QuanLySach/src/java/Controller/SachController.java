/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.LoaiSach;
import Models.Sach;
import Models.SachDAO;
import View.DataHelpers;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tran Y
 */
public class SachController extends HttpServlet {

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
            SachDAO dao = new SachDAO();
            Sach sach = null;
            String action = request.getParameter("action");
            String masach;
            if (action == null || action.equals("")) {
                request.setAttribute("SACH", new Sach("", "", DataHelpers.now(), Float.parseFloat(""), "0", new LoaiSach()));
                request.setAttribute("ACTION", "SaveOrUpdate");
                request.getRequestDispatcher("").forward(request, response);
                return ;
            }
            switch(action){
                case "SaveOrUpdate":
                    masach = request.getParameter("masach");
                    String tensach =request.getParameter("tensach");
                    Date ngaynhap = DataHelpers.toDate(request.getParameter("ngaynhap"));
                    Float giatien = Float.parseFloat(request.getParameter("giatien"));
                    String soluong =request.getParameter("soluong");
                    
                    
                    
                    break;
                case "List":
                    break;
                case "AddOrEdit":
                    break;
                case "Delete":
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
