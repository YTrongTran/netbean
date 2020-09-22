<%-- 
    Document   : wiew-student
    Created on : Mar 2, 2020, 9:07:54 AM
    Author     : LAptop
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page import="model.StudentDAO"%>
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
            <h2> Student </h2>
            <a href="StudentServlet?action=AddOrEdit" class="btn btn-primary">Add Users</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Birthday</th>
                        <th>MajorId</th>                       
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="st" items="${LIST_STUDENT}">
                      <tr>
                        <td>${u.id}</td>
                        <td>${u.name}</td>
                        <td>${u.birthday}</td>
                        <td>${u.major.name}</td>                                          
                        <td><a class="btn btn-primary btn-sm" href="StudentServlet?action=AddOrEdit&id=${st.id}">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="StudentServlet?action=Delete&id=${u.id}">Del</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>

