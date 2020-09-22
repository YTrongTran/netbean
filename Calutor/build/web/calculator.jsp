<%-- 
    Document   : calculator
    Created on : Jan 6, 2020, 4:04:25 PM
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
        <form action="Calculator">
            Number A: <input type="number" name="numbera"/><br>
            Number B: <input type="number" name="numberb"/><br>
            <input type="submit" name="action" value="ADD"/>
            <input type="submit" name="action" value="SUB"/>
            <input type="submit" name="action" value="MUL"/>
            <input type="submit" name="action" value="DIV"/>
        </form>
    </body>
</html>
