<%-- 
    Document   : add-student
    Created on : Jan 8, 2020, 9:02:19 AM
    Author     : haubeo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            <h2>  add student</h2>
            
            <form action="AddStudentServlet">
                <div class="form-group">
                    <label for="ID">ID :</label>
                    <input type="text" class="form-control" id="email" placeholder="Enter id" name="ID">
                </div>
                <div class="form-group">
                    <label for="NAME">NAME :</label>
                    <input type="text" class="form-control" id="email" placeholder="Enter name" name="NAME
                           </div>
                           <div class="form-group">
                           <label for="PHONE">PHONE :</label>
                    <input type="text" class="form-control" id="email" placeholder="Enter phone" name="PHO
                           </div>
                           <div class="form-group">
                           <label for="email">Email:</label>
                    <input type="email" class="form-control" id="email" placeholder="Enter email" name="EM
                           </div>
                           <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
                </div>
                </body>
                </html>
