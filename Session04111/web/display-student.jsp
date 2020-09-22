<%-- 
    Document   : dangky
    Created on : Feb 26, 2020, 8:20:22 AM
    Author     : LAptop
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : register-user
    Created on : Feb 17, 2020, 8:32:20 AM
    Author     : LAptop
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>dangky</title>
    </head>
    <body>
        <div class="container" style="margin-top: 10px;">
            <div class="row" style="border: 1px darkgrey solid; border-radius: 10px;width: 50%; margin: 0 auto; padding: 20px;" >
                <div class="col-sm-12">
                    <h2>student</h2>
                    <form action="StudentServlet">
                        <input type="hidden" class="form-control" name="action" value="${ACTION}" >
                        <div class="form-group">
                            <label>Id</label>
                            <input type="text" class="form-control" name="id" value="${Departs.id} " placeholder="Enter Id">
                        </div>
                        <div class="form-group">
                            <label>Name:</label>
                            <input type="name" class="form-control" name="name" value="${USER.name} " placeholder="Enter name">
                        </div>
                        <div class="form-group">
                            <label>Birthday</label>
                            <input type="date" class="form-control" name="birthday" value="${USER.birthday} " style="padding: 0px 12px" placeholder="Enter Birthday">
                        </div>
                        <div class="form-group">
                            <label>Major</label>
                            <input type="number" class="form-control" name="age" value="${USER.major} " placeholder="Enter major">
                        </div>

               
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                        <a href="StudentServlet?action=List" class="btn btn-primary">Display Users</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
