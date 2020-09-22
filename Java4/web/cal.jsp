<%-- 
    Document   : cal
    Created on : Mar 4, 2020, 9:40:12 PM
    Author     : Tran Y
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Thuc hien phep toan cong tru nhan chia</h1>
        <form action="Calculoter" method="post">
            Nhap Hang 1: <input type="text" name="txtSo1" value=""/><br>
            Nhap Hang 2: <input type="text" name="txtSo2" value=""/><br>
            <hr>
            <input type="submit" value="+" name="action"/>
            <input type="submit" value="-" name="action"/>
            <input type="submit" value="*" name="action"/>
            <input type="submit" value="/" name="action"/>
        </form>
    </body>
</html>
