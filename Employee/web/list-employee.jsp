<%-- 
    Document   : list-employee
    Created on : Jan 15, 2020, 9:08:28 AM
    Author     : Administrator
--%>

<%@page import="java.util.List"%>
<%@page import="model.Emplyoee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh Sach Sinh Vien</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </head>
    <%
        List<Emplyoee> ls = (List<Emplyoee>) request.getAttribute("EMPLOYEES");
    %>
    <body>
        <div class="container">
            <h2>Danh Sách Nhan  Viên</h2>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NAME</th>
                        <th>GIOI TINH</th>
                        <th>ACTION</th>
                    </tr>
                </thead>
                <tbody>
                    <%for (Emplyoee st : ls) {%>
                    <!--   viet được  html-->
                    <tr>
                        <td><%=st.getId()%></td>
                        <td><%=st.getName()%></td>
                        <td><%=st.isGender() ? "Nam" : "Nu"%></td>
                        <td><a class="btn btn-primary" href="EmployeeServlet?action=edit">EDIT</a> | <a class="btn btn-danger" href="#">DEL</a></td>
                    </tr>
                    <%}
                    %>
                    <tr>
                        <td>John</td>
                        <td>Doe</td>
                        <td>Nam</td>
                        <td><a class="btn btn-primary" href="#">EDIT</a> | <a class="btn btn-danger" href="#">DEL</a></td>
                    </tr>
                    <tr>
                        <td>John</td>
                        <td>Doe</td>
                        <td>Nu</td>
                        <td><a class="btn btn-primary" href="#">EDIT</a> | <a class="btn btn-danger" href="#">DEL</a></td>
                    </tr>
                    <tr>
                        <td>John</td>
                        <td>Doe</td>
                        <td>Nam</td>
                        <td><a class="btn btn-primary" href="#">EDIT</a> | <a class="btn btn-danger" href="#">DEL</a></td>
                    </tr>
                    <tr>
                        <td>John</td>
                        <td>Doe</td>
                        <td>Nu</td>
                        <td><a class="btn btn-primary" href="#">EDIT</a> | <a class="btn btn-danger" href="#">DEL</a></td>
                    </tr>

                </tbody>
            </table>
        </div>
    </body>
</html>
