<%-- 
    Document   : departs-display
    Created on : Mar 13, 2020, 8:07:31 PM
    Author     : Tran Y
--%>

<%@page import="abc.DAO.DepartsDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if (request.getParameter("LIST_DEPARTS") == null) {
        request.setAttribute("LIST_DEPARTS", new DepartsDAO().getAll());
    }
%>
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
            <h2>List Departs </h2>
            <a href="DepartsServlet?action=AddOrEdit" class="btn btn-primary">Add DEPARTS</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID:</th>
                        <th>NAME:</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:if test="${empty LIST_DEPARTS}">
                    <td colspan="4">
                        NO DATA
                    </td>
                </c:if>
                <c:forEach var="u" items="${LIST_DEPARTS}">
                    <tr>
                        <td>${u.id}</td>
                        <td>${u.name}</td>

                        <td><a class="btn btn-primary btn-sm" href="DepartsServlet?action=AddOrEdit&id=${u.id}">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="DepartsServlet?action=Delete&id=${u.id}">Del</a></td>
                    </tr>

                </c:forEach>



                </tbody>
            </table>
        </div>
    </body>
</html>


