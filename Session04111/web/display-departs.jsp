<%-- 
    Document   : display-users
    Created on : Feb 24, 2020, 9:59:00 AM
    Author     : LAptop
--%>

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
            <a href="UserServlet?action=AddOrEdit" class="btn btn-primary">Add Id</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>                     
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:if test="${empty LIST_USER}">
                        <tr>
                            <td colspan="7">No data display</td>
                        </tr>
                    </c:if>
                    <c:forEach var="u" items="${LIST_USER}">
                      <tr>
                        <td>${u.id}</td>
                        <td>${u.name}</td>                   
                        <td>
                            <c:if test="${u.gender}">Nam</c:if>
                            <c:if test="${ not u.gender}">Nu</c:if>
                          </td>
                        <td><a class="btn btn-primary btn-sm" href="UserServlet?action=AddOrEdit&username=${u.id}">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="UserServlet?action=Delete&username=${u.id}">Del</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>


