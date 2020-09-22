<%-- 
    Document   : wiew-departs
    Created on : Feb 21, 2020, 8:35:30 AM
    Author     : LAptop
--%>

<%@page import="java.util.List"%>
<%@page import="model.DepartsDAO"%>
<%@page import="model.Departs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>wiew depart</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%
            DepartsDAO dao = new DepartsDAO();
            List<Departs> ls = dao.getALL();
        %>

        <div class="container">
            <h2>List Users 4</h2>
            <a href="DepartsServlet?action=AddOrEdit" class="btn btn-primary">Add Users</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Action</th>                        
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (int i = 0; i < ls.size(); i++) {
                            Departs d = ls.getClass();
                            //in thong tin ra
                    %>
                    <tr>
                        <td><%=d.getId() %></td>
                        <td><%=d.getName()%></td>                     
                        <td><a class="btn btn-primary btn-sm" href="DepartsServlet?action=AddOrEdit&id=<%=d.getId()%>">Edit</a> 
                            <a class="btn btn-danger btn-sm" href="DepartsServlet?action=Delete&id=<%=d.getId()%>">Del</a></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>
