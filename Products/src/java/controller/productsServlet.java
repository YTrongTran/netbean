/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import helper.DateHelper;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Products;
import models.ProductsDAO;

/**
 *
 * @author Tran Y
 */
public class productsServlet extends HttpServlet {

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
            ProductsDAO dao = new ProductsDAO();
            Products products = null;
            String masp;
            String action = request.getParameter("action");
            if (action == null || action.equals("")) {
                request.setAttribute("PRODUCTS", new Products("", "", DateHelper.now(), 0, 0));
                request.setAttribute("ACTION", "SaveOrUpdate");
                request.getRequestDispatcher("register.jsp").forward(request, response);
                return;
            }
            switch(action){
            case "SaverOrUpdate":
                    masp = request.getParameter("masp");
                    String tensp = request.getParameter("tensp");
                    Date ngaynhap = DateHelper.toDate(request.getParameter("ngaynhap"));
                    float giatien= Float.parseFloat(request.getParameter("giatien"));
                    int soluong = Integer.parseInt(request.getParameter("soluong"));
                   
                    products = new Products(masp, tensp, ngaynhap, giatien, soluong);
                    if (dao.findById(masp) == null) {
                        dao.add(products);
                    } else {
                        dao.update(products);
                    }
                    System.out.println("size:" + dao.getAll().size());
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                    break;
            case "List":
                request.setAttribute("LIST_PRODUCTS", dao.getAll());
                    request.getRequestDispatcher("view.jsp").forward(request, response);
                    break;
            case "AddOrEdit":
                    masp = request.getParameter("masp");
                    products = dao.findById(masp);
                    if (products == null) {
                       request.setAttribute("PRODUCTS", new Products("", "", DateHelper.now(), 0, 0));
                    }
                     request.setAttribute("PRODUCTS", products);
                     request.setAttribute("ACTION", "SaverOrUpdate");
                     request.getRequestDispatcher("register.jsp").forward(request, response);
                    break;
                case "Delete":
                    masp = request.getParameter("masp");
                    products =dao.findById(masp);
                    if (products != null) {
                        dao.delete(masp);
                    }
                    request.setAttribute("LIST_PRODUCTS", dao.getAll());
                    request.getRequestDispatcher("view.jsp").forward(request, response);
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
