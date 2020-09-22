<%-- 
    Document   : display-user
    Created on : Feb 24, 2020, 9:18:48 AM
    Author     : Tran Y
--%>

<%@page import="Model.User"%>
<%@page import="java.util.List"%>
<%@page import="Model.User1Dao"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if (request.getParameter("LIST_USER")==null) {
        request.setAttribute("LIST_USER", new User1Dao().getAll());
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
            <h2>List Users 4</h2>
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
                <c:if test="${empty LIST_USER }" >
                        <td colspan="7">
                           no display data
                        </td>
                        </c:if>
                <tbody>
                   
                    <c:forEach var="u" items="${LIST_USER}">
                        <tr>
                            <td>${u.userName}</td>
                            <td>${u.passWord}</td>
                            <td>${u.fullName}</td>
                            <td>${u.age}</td>
                            <td>${u.birthDay}</td>
                            <td>
                                <c:if test="${u.genDer}" >Nam</c:if>
                                 <c:if test="${not u.genDer}" >Nu</c:if>
                            </td>
                            <td><a class="btn btn-primary btn-sm" href="UserServlet?action=AddOrEdit&username=${u.userName}">Edit</a> |
                                <a class="btn btn-danger btn-sm" href="UserServlet?action=Delete&username=${u.userName}">Del</a></td>
                        </tr>
                    </c:forEach>


                </tbody>
            </table>
        </div>
    </body>
</html>

