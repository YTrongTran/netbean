<%-- 
    Document   : helloname
    Created on : Jan 6, 2020, 9:09:14 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="HelloNameServlet" method="post">
            <!--method (ẩn dữ liệu sao đuôi HelloNameServlet)-->
            Input Name: <input type="text" name="txtName"/>
            <input type="submit" value="send" />
        </form>
    </body>
</html>
