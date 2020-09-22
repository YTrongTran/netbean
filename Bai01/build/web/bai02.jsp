<%-- 
    Document   : bai02
    Created on : Feb 24, 2020, 8:51:24 AM
    Author     : Tran Y
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <c:set var="number1" value="9" scope="page"/>
    <c:set var="number2" value="18" scope="page"/>
        <c:if test="${number1 > number2}">
            <c:out value="number1 > number2" ></c:out>
        </c:if>
        
    </body>
</html>
