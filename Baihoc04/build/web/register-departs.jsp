<%-- 
    Document   : register-departs
    Created on : Feb 21, 2020, 8:43:09 AM
    Author     : Tran Y
--%>

<%@page import="DeParts.Departs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String action =(String) request.getAttribute("ACTION");
Departs u =(Departs) request.getAttribute("Departs");
if (action == null) {
        action = "SaveOrUpdate";
    }
if (u == null) {
        u= new Departs("", "");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container" style="margin-top: 10px;">
            <div class="row" style="border: 1px darkgrey solid; border-radius: 10px;width: 50%; margin: 0 auto; padding: 20px;" >
                <div class="col-sm-12">
                    <h2>Register</h2>
                    <form action="DePartsServlet">
                        <input type="hidden" class="form-control" name="action" value="<%=action %>" >
                        <div class="form-group">
                            <label>ID</label>
                            <input type="text" class="form-control" name="id" value="<%=u.getId()%>" placeholder="Enter ID">
                        </div>
                        <div class="form-group">
                            <label>Name</label>
                            <input type="name" class="form-control" name="name" value="<%=u.getName()%>" placeholder="Enter Name">
                        </div>
                        
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                        <a href="DePartsServlet?action=List" class="btn btn-primary">Display ID</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>

