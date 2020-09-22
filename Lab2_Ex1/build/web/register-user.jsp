<%-- 
    Document   : register-user
    Created on : Apr 27, 2020, 9:11:11 PM
    Author     : Tran Y
--%>

<%@page import="model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String action = (String) request.getAttribute("ACTION");
Users users = (Users)request.getAttribute("USERS");
if (action == null) {
        action ="SaverOrUpdate";
    }
if (users == null) {
        users = new Users("", "", "", true);
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
                    <form action="UserServlet">
                        <input type="hidden" class="form-control" name="action" value="<%=action %>" >
                        <div class="form-group">
                            <label>UserName</label>
                            <input type="text" class="form-control" name="username" value="<%=users.getUsername() %>" placeholder="Enter UserName">
                        </div>
                        <div class="form-group">
                            <label>Password:</label>
                            <input type="password" class="form-control" name="password" value="<%=users.getPassword()%>" placeholder="Enter password">
                        </div>
                        <div class="form-group">
                            <label>Name</label>
                            <input type="text" class="form-control" name="name" value="<%=users.getName()%>" placeholder="Enter name">
                        </div>
                       
                        <div class="form-group">
                            <label>Gender</label>
                            <div class="radio"><!--value = 1 => Nam| 0 =>Nu -->
                                <label class="checkbox-inline"><input type="radio" name="gender"  value="1"<%if(users.isGender()){out.println("checked");}%>>Male</label>
                                <label class="checkbox-inline"><input type="radio" name="gender"  value="0"<%if(!users.isGender()) {out.println("checked");} %> > Female</label>

                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                        <a href="UserServlet?action=List" class="btn btn-primary">Display Users</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
