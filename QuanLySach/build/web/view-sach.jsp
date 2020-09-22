<%-- 
    Document   : view-sach
    Created on : May 1, 2020, 8:55:18 PM
    Author     : Tran Y
--%>

<%@page import="Models.Sach"%>
<%@page import="java.util.List"%>
<%@page import="Models.SachDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    SachDAO dao = new SachDAO();
    List<Sach> ls = dao.getAll();
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
            <h2>List Users 4</h2>
            <a href="SachController?action=AddOrEdit" class="btn btn-primary">Add Sach</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>MaSach</th>
                        <th>TenSach</th>
                        <th>NgayNhap</th>
                        <th>GiaTien</th>
                        <th>SoLuong</th>
                        <th>MaLoaiSach</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (int i = 0; i < ls.size(); i++) {
                            Sach s = ls.get(i);
                    %>
                    <tr>
                        <td><%=s.getMasach() %></td>
                        <td><%=s.getTensach()%></td>
                        <td><%=s.getNgaynhap()%></td>
                        <td><%=s.getGiatien()%></td>
                        <td><%=s.getSoluong()%></td>
                        <td><%=s.getLoaiSach().getMaLoaiSach()%></td>
                        <td><a class="btn btn-primary btn-sm" href="SachController?action=AddOrEdit&username=<%=s.getMasach() %>">Edit</a> |
                            <a class="btn btn-danger btn-sm" href="SachController?action=Delete&username=<%=s.getMasach() %>">Del</a></td>
                    </tr>

                    <%
                        }

                    %>

                </tbody>
            </table>
        </div>
    </body>
</html>


