<%-- 
    Document   : index
    Created on : Mar 4, 2020, 9:09:44 PM
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
        <h1>Cong tru nhan chia</h1>
        <form action="controller" method="post">
            So hang 1 <input type="text" name="txtSo1" value=""/><br>
            So hang 2 <input type="text" name="txtSo2" value=""/><br>
            <input type="submit" name="action" value="+"/>
            <input type="submit" name="action" value="-"/>
            <input type="submit" name="action" value="*"/>
            <input type="submit" name="action" value="/"/>
        </form>
    </body>
</html>
