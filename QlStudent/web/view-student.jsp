<%-- 
    Document   : new-student
    Created on : Mar 2, 2020, 1:15:04 PM
    Author     : Tran Y
--%>

<%@page import="Model.StudentDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if(request.getParameter("LIST_STUDENT") == null){
        request.setAttribute("LIST_STUDENT", new StudentDAO().getAll());
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
            <h2>view-student</h2>
            <a href="StudentServlet?action=List" class="btn btn-primary">Add ID</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Birthday</th>
                        <th>Major</th>
                        <th>Action</th>
                    </tr>
                </thead>
                
                <tbody>
                    
                    <c:forEach var="u" items="${LIST_STUDENT}">
                     <tr>
                        <td>${u.id}</td>
                        <td>${u.name}</td>
                        <td>${u.birthday}</td>
                        <td>${u.major.name}</td>
                        <td><a class="btn btn-primary btn-sm" href="StudentServlet?action=AddOrEdit&id=${u.id}">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="StudentServlet?action=Delete&id=${u.id}">Del</a></td>
                    </tr>
                   
                </c:forEach>
                   
                </tbody>
            </table>
        </div>
    </body>
</html>

