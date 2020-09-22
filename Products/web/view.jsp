<%-- 
    Document   : view
    Created on : May 6, 2020, 8:57:19 AM
    Author     : Tran Y
--%>

<%@page import="models.ProductsDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>

        <div class="container">
            <h2>List Users 4</h2>
            <a href="productsServlet?action=AddOrEdit" class="btn btn-primary">Add Users</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>MA SAN  PHAM</th>
                        <th>TEN SAN PHAM</th>
                        <th>NGAY NHAP</th>
                        <th>GIA TIEN</th>
                        <th>SO LUONG</th>
                         <th>THANH TIEN</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                 
                    <c:forEach var="u" items="${LIST_PRODUCTS}">

                        <tr>
                            <td>${u.masp }</td>
                            <td>${u.tensp }</td>
                            <td>${u.ngaynhap}</td>
                            <td>${u.giatien }</td>
                           <td>${u.soluong }</td>
                           <td>${u.giatien *u.soluong }</td>
                            <td><a class="btn btn-primary btn-sm" href="productsServlet?action=AddOrEdit&masp=${u.masp }">Edit</a> |
                                <a class="btn btn-danger btn-sm" href="productsServlet?action=Delete&masp=${u.masp }">Del</a></td>
                        </tr>
                    </c:forEach>



                </tbody>
            </table>
        </div>
    </body>
</html>

