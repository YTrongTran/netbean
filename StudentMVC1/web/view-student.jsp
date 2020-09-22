<%-- 
    Document   : view-student
    Created on : Jan 8, 2020, 9:19:10 AM
    Author     : haubeo
--%>

<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
Student st=(Student) request.getAttribute("STUDENT");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Danh Sach Sinh Vien</h1>
        <p>ID :<%=st.getId()%></p>
         <p>NAMe :<%=st.getName()%></p>
          <p>Phone :<%=st.getPhone()%></p>
          <p>Email :<%=st.getEmail()%></p>
    </body>
</html>
