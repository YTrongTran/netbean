<%-- 
    Document   : layout_main
    Created on : Mar 10, 2020, 8:23:58 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
﻿<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Online Shopping Mall</title>
	
	<!-- jQuery -->
    <script src="js/jquery.min.js"></script>
	<!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <script src="js/bootstrap.min.js"></script>
	
	<!-- Poly -->
    <link href="css/poly.css" rel="stylesheet" />
</head>
<body>
    <div class="container">
        <jsp:include page="layout/header.jsp"></jsp:include>
        <jsp:include page="layout/menu.jsp"></jsp:include>
        <div class="poly-sheet row">
            <article class="col-sm-9">
                <!--Nội dung trang web-->
            </article>
            <jsp:include page="layout/aside.jsp"></jsp:include>
        </div>
        <jsp:include page="layout/footer.jsp"></jsp:include>
        
    </div>
</body>
</html>
