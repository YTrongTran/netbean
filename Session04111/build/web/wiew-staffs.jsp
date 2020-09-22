<%-- 
    Document   : wiew-student
    Created on : Mar 2, 2020, 9:07:54 AM
    Author     : LAptop
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="model.StaffsDAO"%>
<%@page import="model.Staffs"%>
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
            <h2> Staffs </h2>
            <a href="StaffsServlet?action=AddOrEdit" class="btn btn-primary">Add Staffs</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Birthday</th>
                        <th>Email</th>
                        <th>Gender</th>
                        <th>Name</th>
                        <th>Notes</th>
                        <th>Phone</th>
                        <th>Photo</th>
                        <th>Salary</th>
                        <th>Depart_Id</th>                       
                        <th>ACTION</th>
                    </tr>
                </thead>
                <tbody>
                    <c:if test="${empty STAFFS}" >
                        <tr>
                            <td colspan="10">NO DATA</td>
                        </tr>
                    </c:if>
                    <c:forEach var="st" items="${STAFFS}">

                        <tr>
                            <td>${st.id}</td>
                            <td>${st.name}</td>
                            <td>${st.email}</td>
                            <c:if test="${st.gender}">
                                <td>Nam</td>
                            </c:if>
                            <c:if test="${!st.gender}">
                                <td>Nu</td>
                            </c:if>
                            <td><fmt:formatDate value="${st.birthday}" pattern="dd-MM-yyyy"></fmt:formatDate></td>
                    <td width="100"><img src="uploads/${st.photo}" width="80" height="70"/> </td>
                    <td>${st.phone}</td>
                    <td>${st.salary}</td>
                    <td>${st.depart.name}</td>
                    <td><a class="btn btn-primary btn-sm" href="StaffsServlet?action=AddOrEdit&id=${st.id}">Edit</a> |
                        <a class="btn btn-danger btn-sm" href="StaffsServlet?action=Delete&id=${st.id}">Del</a></td>
                    </tr>
                </c:forEach>   
                </tbody>
            </table>
        </div>
    </body>
</html>

