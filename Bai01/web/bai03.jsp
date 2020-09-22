<%-- 
    Document   : bai03
    Created on : Feb 24, 2020, 8:58:32 AM
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
        <form>
            <input type="text" name="number1" /><br>
            <input type="text" name="number2" /><br>

            <c:catch var= "error">
                <c:if test="${not empty param.number1 and not empty param.number2}" >
                    <c:set var="kq" value="${param.number1 / param.number2}" />
                    Ket qua:<c:out value="${kq}" />
                </c:if>
            </c:catch>
            <input type="submit" value="submit" /><br>
            <c:if test="${not empty error}" >
                <c:out value="${error}" />
            </c:if>

        </form>
    </body>
</html>
