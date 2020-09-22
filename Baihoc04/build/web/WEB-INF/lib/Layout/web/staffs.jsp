<%-- 
    Document   : staffs
    Created on : Mar 4, 2020, 10:11:03 AM
    Author     : admin
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <div class="container">
            <jsp:include page="layout/header.jsp"></jsp:include>
            <jsp:include page="layout/menu.jsp"></jsp:include>
                <div class="poly-sheet row">
                    <article class="col-sm-9">
                        <!--Nội dung trang web-->
                        <div class="col-sm-12">
                            <h2>DANG KY</h2>
                            <form action="StaffServlet?action=${ACTION}" method="post" enctype="multipart/form-data">

                            <div class="form-group">
                                <label>ID</label>
                                <input type="text" class="form-control" name="id" value="${STAFF.id}" placeholder="Enter Id">
                            </div>
                            <div class="form-group">
                                <label>NAME</label>
                                <input type="text" class="form-control" name="name" value="${STAFF.name}" placeholder="Enter Name">
                            </div>
                            <div class="form-group">
                                <label>Email</label>
                                <input type="text" class="form-control" name="email" value="${STAFF.email}" placeholder="Enter Email">
                            </div>

                            <div class="form-group">
                                <label>Gender</label>
                                <div class="radio"><!--value = 1 => Nam| 0 =>Nu -->
                                    <label class="checkbox-inline"><input type="radio" name="gender"  value="1" <c:if test="${STAFF.gender}">checked</c:if>>Male</label>
                                    <label class="checkbox-inline"><input type="radio" name="gender"  value="0" <c:if test="${not STAFF.gender}">checked</c:if>> Female</label>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>Birthday</label>
                                    <input type="date" class="form-control" name="birthday" value="<fmt:formatDate value="${STAFF.birthday}" pattern="dd-MM-yyyy"></fmt:formatDate>" style="padding: 0px 12px" placeholder="Enter Birthday">
                                </div>
                                <div class="form-group">
                                    <label>Photo</label> <br/>
                                <c:if test="${STAFF.photo != null}">
                                    <img src="uploads/${STAFF.photo}" width="80" height="70"/>
                                </c:if>
                                <input type="file" 
                                       class="form-control" name="photo" placeholder="Enter photo">
                            </div>
                            <div class="form-group">
                                <label>PHONE</label>
                                <input type="text" class="form-control" name="phone" value="${STAFF.phone}" placeholder="Enter phone">
                            </div>
                            <div class="form-group">
                                <label>SALARY</label>
                                <input type="number" class="form-control" name="salary" value="${STAFF.salary}" placeholder="Enter UserName">
                            </div>
                            <div class="form-group">
                                <label >Depart</label>
                                <select class="form-control" name="depart" >
                                    <c:forEach var="departs" items="${DEPARTS}">
                                        <c:if test="${STAFF.depart.id != departs.id}">
                                            <option value="${departs.id}" >${departs.name}</option>
                                        </c:if>
                                        <c:if test="${STAFF.depart.id == departs.id}">
                                            <option selected="" value="${departs.id}" >${departs.name}</option>
                                        </c:if>
                                    </c:forEach>
                                </select>
                            </div>
                            <button type="submit" class="btn btn-primary" >Submit</button>
                            <button type="reset" class="btn btn-primary">Cancel</button>
                            <a href="StaffServlet?action=List" class="btn btn-primary">Display Users</a>
                            </form>
                        </div>
                </article>
            <jsp:include page="layout/aside.jsp"></jsp:include>
            </div>
            <jsp:include page="layout/footer.jsp"></jsp:include>
        </div>
        
</body>
</html>
