<%-- 
    Document   : Users-Displays
    Created on : Mar 13, 2020, 10:53:57 PM
    Author     : Tran Y
--%>

<%@page import="abc.DAO.UserDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if (request.getParameter("LIST_USRES") == null) {
        request.setAttribute("LIST_USRES", new UserDAO().getUAll());
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
            <h2>List Users </h2>
            <a href="UserServlet?action=AddOrEdit" class="btn btn-primary">Add Users</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>UserName</th>
                        <th>Password</th>
                        <th>FullName</th>
                        <th>Age</th>
                        <th>Birthday</th>
                        <th>Gender</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:if test="${empty LIST_USRES}">
                <td colspan="7">
                    No data
                </td>
                </c:if>
                <c:forEach var="u" items="${LIST_USRES}">
                    <tr>
                        <td>${u.username }</td>
                        <td>${u.password }</td>
                        <td>${u.fullname }</td>
                        <td>${u.age }</td>
                        <td>${u.birthday }</td>
                        <td>
                            <c:if test="${u.gender}">Name</c:if>
                            <c:if test="${not u.gender}">Nu</c:if>
                        </td>
                        <td><a class="btn btn-primary btn-sm" href="UserServlet?action=AddOrEdit&username=${u.username }">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="UserServlet?action=Delete&username=${u.username }">Del</a></td>
                    </tr>
                </c:forEach>
                    
                </tbody>
            </table>
        </div>
    </body>
</html>

