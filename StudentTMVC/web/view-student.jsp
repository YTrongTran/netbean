<%-- 
    Document   : view-student
    Created on : Jan 8, 2020, 9:19:14 AM
    Author     : Administrator
--%>
<%@page import="model.Student"%>
<%
Student st = (Student) request.getAttribute("STUDENT");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Danh Sách Sinh Viên</h1>
        <p>ID:<%=st.getId() %></p>
        <p>NAME:<%=st.getName()%></p>
        <p>PHONE:<%=st.getPhone() %></p>
        <p>EMAIL:<%=st.getEmail() %></p>
    </body>
</html>
