<%-- 
    Document   : list-employes
    Created on : Jan 15, 2020, 9:32:31 AM
    Author     : Administrator
--%>

<%@page import="model.Emplyoee"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
//viet code java
    List<Emplyoee> arr = (List<Emplyoee>) request.getAttribute("EMPLOYEES");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis;.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
          <div class="container">
            <h2>Danh Sach Nhan Vien</h2>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NAME</th>
                        <th>GENDER</th>
                        <th>ACTION</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Emplyoee ee : arr) {%>
                            <tr>
                                <td><%=ee.getId() %></td>
                                <td><%=ee.getName() %></td>
                                <td><%=ee.isGender()?"Nam":"Nu"%></td>
                                <td><a href="EmployeeServlet?id=<%=ee.getId() %>&action=edit" class="btn btn-primary">EDIT</a>|
                                    <a href="EmployeeServlet?id=<%=ee.getId() %>&action=del" class="btn btn-danger">DEL</a></td>
                            </tr>
                        <%}
                    %>
                    
                    
                </tbody>
            </table>
        </div>
    </body>
</html>
