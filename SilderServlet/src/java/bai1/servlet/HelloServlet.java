/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet Method");

        super.service(req, resp); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html"); //To change body of generated methods, choose Tools | Templates.
        try (PrintWriter out = resp.getWriter()) {
            String id = req.getParameter("studentId");

            out.println("<h1>doPOST method</h1>");
            out.println("<h1>Student ID:" + id + "</h1>");

        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        resp.setContentType("text/html"); //To change body of generated methods, choose Tools | Templates.
        try (PrintWriter out = resp.getWriter()) {
            String id = req.getParameter("studentId");

            out.println("<h1>doGET method</h1>");
            out.println("<h1>Student ID:" + id + "</h1>");
        }

    }

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Init Method");

    }

    @Override
    public void destroy() {
        super.destroy(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Destroy Method");

    }

}
