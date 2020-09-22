<%-- 
    Document   : view-user
    Created on : Feb 19, 2020, 2:23:39 PM
    Author     : Tran Y
--%>

<%@page import="Model.User1Dao"%>
<%@page import="Model.User"%>
<%@page import="java.util.List"%>
<%@page import="Model.UserDAO"%>
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
        <%
            User1Dao dao = new User1Dao();
            List<User> ls = dao.getAll();
        %>
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
                <tbody>
                    <%
                        for (int i = 0; i < ls.size(); i++) {
                            User u = ls.get(i);
                            //in thong tin ra

                    %>
                    <tr>
                        <td><%=u.getUserName()%></td>
                        <td><%=u.getPassWord()%></td>
                        <td><%=u.getFullName()%></td>
                        <td><%=u.getAge()%></td>
                        <td><%=u.getBirthDay()%></td>
                        <td><%=u.isGenDer()%></td>
                        <td><a class="btn btn-primary btn-sm" href="UserServlet?action=AddOrEdit&username=<%=u.getUserName()%>">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="UserServlet?action=Delete&username=<%=u.getUserName()%>">Del</a></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>


