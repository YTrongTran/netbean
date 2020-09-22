<%-- 
    Document   : index
    Created on : Mar 5, 2020, 11:31:56 AM
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
        <div align="center">
        <h1>Danh ba dien thoai</h1>
        <form action="SearchAccount" method="post">
            Ten Thue Bao: <input type="text" name="txtTenThueBao" value=""/><br>
            So Dien Thoai: <input type="text" name="txtSoDT" value=""/><br>
            Dia Chi: <input type="text" name="txtDiaChi" value=""/><br>
            
            <hr>
            <input type="submit" value="search" name="action"/>
        </form>
        </div>
    </body>
</html>
