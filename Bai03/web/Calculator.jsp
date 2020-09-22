<%-- 
    Document   : Calculator
    Created on : Feb 24, 2020, 8:23:02 AM
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
        <h1>Hello World!</h1>
        <input type="text" placeholder="number1" name="txtnumber1" value="${param.txtnumber1}"/><br>
        <input type="text" placeholder="number2" name="txtnumber2" value="${param.txtnumber2} "/><br>
        <input type="submit"  />
        <p>Tong: ${param.txtnumber1 + param.txtnumber2}</p>

    </body>
</html>
