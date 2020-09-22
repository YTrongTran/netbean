<%-- 
    Document   : register-user
    Created on : Feb 17, 2020, 8:32:20 AM
    Author     : LAptop
--%>
<%@page import="model.Departs"%>
<%@page import="commons.DateHelper" %>
<%@page import="model.User" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        String action = (String) request.getAttribute("ACTION");     
        Departs d = (Departs) request.getAttribute("Departs");
        if (action == null) {
            action = "SaveOrUpdate";
        }
        if (d == null) {
            d = new Departs("","");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>Departs</title>
    </head>
    <body>
        <div class="container" style="margin-top: 10px;">
            <div class="row" style="border: 1px darkgrey solid; border-radius: 10px;width: 50%; margin: 0 auto; padding: 20px;" >
                <div class="col-sm-12">
                    <h2>Register-depart</h2>
                    <form action="DepartsServlet">
                        <input type="hidden" class="form-control" name="action" value="<%=action%>" >
                        <div class="form-group">
                            <label>ID</label>
                            <input type="text" class="form-control" name="id" value="<%= d.getId() %> " placeholder="Enter Id">
                        </div>
                        <div class="form-group">
                            <label>Name:</label>
                            <input type="name" class="form-control" name="name" value="<%= d.getName()%> " placeholder="Enter Name">
                        </div>                     
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                        <a href="DepartsServlet?action=List" class="btn btn-primary">Display Users</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>