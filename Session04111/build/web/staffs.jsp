<%-- 
    Document   : wiew-student
    Created on : Mar 2, 2020, 9:07:54 AM
    Author     : LAptop
--%>
<%@page import="model.DepartsDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Departs"%>
<%@page import="commons.DateHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        if (request.getParameter("LIST_DEPARTS") == null) {
            request.setAttribute("LIST_DEPARTS", new DepartsDAO().getALL());
        }
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body> 
        <div class="container" style="margin-top: 10px;">
            <div class="row" style="border: 1px darkgrey solid; border-radius: 10px;width: 50%; margin: 0 auto; padding: 20px;" >
                <div class="col-sm-12">
                    <h2>Register Staffs </h2>
                    <form action="StaffsServlet?action=${ACTION}" method="post" enctype="multipart/form-data">
                        <c:if test="${ACTION == null}" >
                            <c:set var="ACTION" value="SaveOrUpdate"/>
                        </c:if>

                        <input type="hidden" class="form-control" name="action" value="${ACTION}" >
                        <div class="form-group">
                            <label>Id</label>
                            <input type="text" class="form-control" name="id" value="${STAFFS.id}" ${STUDENT != null ?"readonly":"" } placeholder="Enter Id">
                        </div>
                        <div class="form-group">
                            <label>Birthday</label>
                            <input type="date" class="form-control" name="birthday" value="${STAFFS.birthday}" style="padding: 0px 12px" placeholder="Enter Birthday">
                        </div>
                        <div class="form-group">
                            <label>Email</label>
                            <input type="text" class="form-control" name="email" value="${STAFFS.email} " placeholder="Enter email">
                        </div>
                        <label>Gender</label>
                        <div class="radio"><!--value = 1 => Nam| 0 =>Nu -->
                            <label class="checkbox-inline"><input type="radio" name="gender"  value="1" <c:if test="${STAFFS.gender}">checked</c:if>>Male</label>
                            <label class="checkbox-inline"><input type="radio" name="gender"  value="0" <c:if test="${not STAFFS.gender}">checked</c:if>> Female</label>

                            </div>
                            <div class="form-group">
                                <label>Name</label>
                                <input type="text" class="form-control" name="name" value="${STAFFS.name} " placeholder="Enter name">
                        </div>
                        <div class="form-group">
                            <label>Notes</label>
                            <input type="text" class="form-control" name="notes" value="${STAFFS.notes} " placeholder="Enter notes">
                        </div>
                        <div class="form-group">
                            <label>Phone</label>
                            <input type="text" class="form-control" name="phone" value="${STAFFS.phone} " placeholder="Enter phone">
                        </div>
                        <div class="form-group">
                            <label>Photo</label> <br/>
                            <c:if test="${STAFFS.photo != null}">
                                <img src="uploads/${STAFFS.photo}" width="80" height="70"/>
                            </c:if>
                            <input type="file" 
                                   class="form-control" name="photo" placeholder="Enter photo">
                        </div>
                        <div class="form-group">
                            <label>Depart_id</label>
                            <select name="departs" class="form-control">
                                <c:forEach var="u" items="${LIST_DEPARTS}" >
                                    <option value="${u.id}" >${u.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-primary">Cancel</button>
                        <a href="StaffsServlet?action=List" class="btn btn-primary">Display Users</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>

