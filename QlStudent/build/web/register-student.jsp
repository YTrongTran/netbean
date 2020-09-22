<%-- 
    Document   : register-student
    Created on : Mar 4, 2020, 8:16:54 AM
    Author     : Tran Y
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
                    <h2>dang ky</h2>
                    <form action="StudentServlet">
                        <input type="hidden" class="form-control" name="action" value="" >
                        <div class="form-group">
                            <label>ID</label>
                            <input type="text" class="form-control" name="id" value="${Student.id}" placeholder="Enter ID">
                        </div>
                        <div class="form-group">
                            <label>Name</label>
                            <input type="name" class="form-control" name="name" value="${Student.id}" placeholder="Enter Name">
                        </div>
                        <div class="form-group">
                            <label>Birthday</label>
                            <input type="name" class="form-control" name="name" value="${Student.birthday}" placeholder="Enter Birthday">
                        </div>
                        <div class="form-group">
                            <label>Major</label>
                            <input type="name" class="form-control" name="name" value="${Student.major}" placeholder="Enter Major">
                        </div>
                        <div class="form-group">
                            <label>Choose Major</label>
                            <select class="form-control">
                                <!--                                <option>1</option>
                                                                <option>2</option>
                                                                <option>3</option>-->
                                <c:forEach var="major" items="LIST_MAJOR">
                                    <option value="${major.id}">${major.name}</option>

                                    </option>
                                </c:forEach>
                            </select>                                
                        </div>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
                <button type="reset" class="btn btn-primary">Cancel</button>
                <a href="StudentServlet?action=List" class="btn btn-primary">Display ID</a>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
