<%-- 
    Document   : register-user
    Created on : Feb 19, 2020, 2:24:39 PM
    Author     : Tran Y
--%>

<%@page import="commons.DataHelps"%>
<%@page import="Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String action =(String) request.getAttribute("ACTION");
User u =(User) request.getAttribute("USER");
if (action == null) {
        action = "SaveOrUpdate";
    }
if (u == null) {
        u= new User("", "", "", 0, DataHelps.now(), true);
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
                            <input type="text" class="form-control" name="username" value="<%=u.getUserName() %>" placeholder="Enter UserName">
                        </div>
                        <div class="form-group">
                            <label>Password:</label>
                            <input type="password" class="form-control" name="password" value="<%=u.getPassWord()%>" placeholder="Enter password">
                        </div>
                        <div class="form-group">
                            <label>FullName</label>
                            <input type="text" class="form-control" name="fullname" value="<%=u.getFullName() %>" placeholder="Enter fullname">
                        </div>
                        <div class="form-group">
                            <label>Age</label>
                            <input type="number" class="form-control" name="age" value="<%=u.getAge() %>" placeholder="Enter age">
                        </div>

                        <div class="form-group">
                            <label>Birthday</label>
                            <input type="date" class="form-control" name="birthday" value="<%=u.getBirthDay() %>" style="padding: 0px 12px" placeholder="Enter Birthday">
                        </div>
                        <div class="form-group">
                            <label>Gender</label>
                            <div class="radio"><!--value = 1 => Nam| 0 =>Nu -->
                                <label class="checkbox-inline"><input type="radio" name="gender"  value="1"<%if (u.isGenDer()) {out.print("checked");}%>> Male</label>
                                <label class="checkbox-inline"><input type="radio" name="gender"  value="0"<%if (!u.isGenDer()) {out.print("checked");}%>> Female</label>

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
