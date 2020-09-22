<%-- 
    Document   : list-student
    Created on : Jan 8, 2020, 9:43:45 AM
    Author     : haubeo
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.StudentDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Student"%>
<%
    StudentDAO st = new StudentDAO();
    ArrayList<Student> ls = (ArrayList<Student>) request.getAttribute("LIST-STUDENT");

%>
<%SimpleDateFormat dd = new SimpleDateFormat("dd-MM-yyyy");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh Sach Sinh Vien</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>

        <div class="container">
            <h2>Danh Sach Sinh Vien</h2>
            <p>The .table-bordered class adds borders on all sides of the table and the cells:</p>
            <form action="StudentDAOT" >
                <table   class="table table-bordered">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>NAME</th>
                            <th>PHONE</th>
                            <th>Email</th>
                            <th>NgaySinh</th>
                            <th>
                                ACTION
                            </th>


                    </thead>
                    <tbody>
                        </tr>
                        <% for (Student st1 : st.getALL()) {%>
                        <tr>
                            <td><%=st1.getId()%></td>
                            <td><%=st1.getName()%></td>
                            <td><%=st1.getPhone()%></td>
                            <td><%=st1.getEmail()%></td>
                            <td><%=dd.format(st1.getNgaysinh())%></td>
                            <td>
                                <button class="btn btn-primary" type="submit"  name="edit" value=<%=Integer.toString(st1.getId())%> 
                                        >EDIT</button> 
                                <button class="btn btn-danger" type="submit"  name="delete" value=<%=Integer.toString(st1.getId())%> 
                                        >DELETE</button> 
                                <button class="btn btn-primary" type="submit"  name="add" value=<%=Integer.toString(st1.getId())%> 
                                        >ADD</button> 
                            </td>
                            <!--           <td><a  class="btn btn-primary" href="http://localhost:8080/StudentMVC/student.jsp"
                                              name="edit" value=//<%//=Integer.toString(st.getId())%>
                                              >EDIT</a> | <a class="btn btn-danger" href="#">DEL</a></td>-->
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>
