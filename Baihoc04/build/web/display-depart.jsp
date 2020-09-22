<%-- 
    Document   : display-depart
    Created on : Feb 26, 2020, 9:10:58 AM
    Author     : Tran Y
--%>

<%@page import="DeParts.DeParts1DAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
if (request.getParameter("LIST_DEPART") == null) {
        request.setAttribute("LIST_DEPART", new DeParts1DAO().getAll());
    }
%>
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
            <a href="DePartsServlet?action=AddOrEdit" class="btn btn-primary">Add ID</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Action</th>
                    </tr>
                </thead>
                
                <tbody>
                    <c:if test="${empty LIST_DEPART}" >
                        <td colspan="3">
                            no data display
                        </td>
                        </c:if>
                    <c:forEach var="u" items="${LIST_DEPART}" >
                     <tr>
                        <td>${u.id}</td>
                        <td>${u.name}</td>
                        
                        <td><a class="btn btn-primary btn-sm" href="DePartsServlet?action=AddOrEdit&id=${u.id}">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="DePartsServlet?action=Delete&id=${u.id}">Del</a></td>
                    </tr>
                   
                </c:forEach>
                   
                </tbody>
            </table>
        </div>
    </body>
</html>
