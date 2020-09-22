<%-- 
    Document   : register-user
    Created on : May 3, 2020, 7:57:32 PM
    Author     : Tran Y
--%>

<%@page import="models.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String action = (String) request.getAttribute("ACTION");
User u = (User) request.getAttribute("USERS");
if (action != null) {
        action ="SaveOrUpdate";
    }
if (u == null) {
        u = new User("", "", "", 0, true);
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
                            <input type="text" class="form-control" name="username" value="<%=u.getUsername() %>" placeholder="Enter UserName">
                        </div>
                        <div class="form-group">
                            <label>Password:</label>
                            <input type="password" class="form-control" name="password" value="<%=u.getPassword()%>" placeholder="Enter password">
                        </div>
                        <div class="form-group">
                            <label>FullName</label>
                            <input type="text" class="form-control" name="fullname" value="<%=u.getFullname()%>" placeholder="Enter fullname">
                        </div>
                        <div class="form-group">
                            <label>Age</label>
                            <input type="number" class="form-control" name="age" value="<%=u.getAge()%>" placeholder="Enter age">
                        </div>

                        
                        <div class="form-group">
                            <label>Gender</label>
                            <div class="radio"><!--value = 1 => Nam| 0 =>Nu -->
                                <label class="checkbox-inline"><input type="radio" name="gender"  value="1" <%if(u.isGender()) {out.println("checked");} %> >Male</label>
                                <label class="checkbox-inline"><input type="radio" name="gender"  value="0" <%if(!u.isGender()) {out.println("checked");} %>> Female</label>

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
