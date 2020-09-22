<%-- 
    Document   : view-user
    Created on : May 3, 2020, 7:57:21 PM
    Author     : Tran Y
--%>

<%@page import="models.User"%>
<%@page import="java.util.List"%>
<%@page import="DAO.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    UserDAO dao = new UserDAO();
    List<User> ls = dao.getAll();

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
                        <th>Gender</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <%                        for (int i = 0; i < ls.size(); i++) {
                            User u = ls.get(i);

                    %>
                    <tr>
                        <td><%=u.getUsername() %></td>
                        <td><%=u.getPassword()%></td>
                        <td><%=u.getFullname()%></td>
                        
                        <td><%=u.getAge()%></td>
                        <td><%=u.isGender()%></td>
                        <td><a class="btn btn-primary btn-sm" href="UserServlet?action=AddOrEdit&username=<%=u.getUsername() %>">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="UserServlet?action=Delete&username=<%=u.getUsername() %>">Del</a></td>
                    </tr>


                    <%                        }
                    %>



                </tbody>
            </table>
        </div>
    </body>
</html>


