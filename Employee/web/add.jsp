<%-- 
    Document   : add
    Created on : Jan 15, 2020, 8:23:37 AM
    Author     : Administrator
--%>

<%@page import="model.Emplyoee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String action = request.getParameter("action");
    Emplyoee ee = null;
    if (action == null || action.equals("")) {
        ee = new Emplyoee("", "", true);
        action = "add";
    } else {
        ee = (Emplyoee) request.getAttribute("EMPLOYEE");
        action = (String) request.getAttribute("ACTION");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <h2>Thêm Nhân Viên</h2>
            <form action="EmployeeServlet">
                <div class="form-group">
                    <label>Id:</label>
                    <input type="text" class="form-control"  placeholder="Enter id" name="id" value="<%=ee.getId() %>">
                </div>
                <div class="form-group">
                    <label>Name:</label>
                    <input type="text" class="form-control"  placeholder="Enter name" name="name" value="<%=ee.getName() %>">
                </div>
                <div class="form-group">
                    <label>Gioi tinh:</label>
                    <div class="form-check">
                        <label class="form-check-label">
                            <input type="radio" class="form-check-input" checked="Nam" name="gender" value="Nam">Nam
                        </label>
                    </div>
                    <div class="form-check">
                        <label class="form-check-label">
                            <input type="radio" class="form-check-input" name="gender"value="Nu">Nu
                        </label>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary" name="action" value="<%=action%>"><%=action%></button>

        </div>
    </body>
</html>
