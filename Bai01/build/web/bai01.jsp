<%-- 
    Document   : bai01
    Created on : Feb 24, 2020, 8:45:23 AM
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
        <h1>Hello World!</h1>
        <c:set var="number" value="9" />
        <c:out value="${number}" />
        <c:out value="Xin chao cac ban" />
    </body>
</html>
