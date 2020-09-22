<%-- 
    Document   : view-staff
    Created on : Mar 4, 2020, 9:56:42 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <h2>List Staff</h2>
            <a href="StaffServlet?action=AddOrEdit" class="btn btn-primary">Add Users</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NAME</th>
                        <th>Email</th>
                        <th>Gender</th>
                        <th>Birthday</th>
                        <th>Photo</th>
                        <th>Phone</th>
                        <th>Salary</th>
                        <th>Depart</th>
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
