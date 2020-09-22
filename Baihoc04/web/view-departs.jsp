<%-- 
    Document   : departs
    Created on : Feb 21, 2020, 8:12:21 AM
    Author     : Tran Y
--%>

<%@page import="DeParts.Departs"%>
<%@page import="DeParts.DeParts1DAO"%>
<%@page import="java.util.List"%>


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
            DeParts1DAO dao = new DeParts1DAO();
            List<Departs> ls = dao.getAll();
        %>
        <div class="container">
            <h2>List Users 4</h2>
            <a href="DePartsServlet?action=AddOrEdit" class="btn btn-primary">Add ID</a>
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
                            Departs u = ls.get(i);
                            //in thong tin ra

                    %>
                    <tr>
                        <td><%=u.getId()%></td>
                        <td><%=u.getName()%></td>
                        
                        <td><a class="btn btn-primary btn-sm" href="DePartsServlet?action=AddOrEdit&id=<%=u.getId() %>">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="DePartsServlet?action=Delete&id=<%=u.getId()%>">Del</a></td>
                    </tr>
                    <% }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>

