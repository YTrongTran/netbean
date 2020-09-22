<%-- 
    Document   : student
    Created on : Jan 8, 2020, 9:56:00 AM
    Author     : haubeo
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="controllers.StudentServlet"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.SQLException"%>
<%@page import="model.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%SimpleDateFormat dd=new SimpleDateFormat("dd-MM-yyyy");%>
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
        <h1>Hello World!</h1>
                <div class="container">
              <h2>  add student</h2>
  <%StudentDAO st=new StudentDAO();%>
  <%if(StudentDAO.v>=0){%>
       <form action="ListStudentServlet">
    <div class="form-group">
      <label for="ID">ID :</label>
    <%String a=Integer.toString(st.getALL().get(StudentDAO.v).getId());%>
           <input type="text" class="form-control" id="I"  name="ID" value="<%=a%>" >
           </div>
    <div class="form-group">
      <label for="NAME">NAME :</label>
       <%String b=st.getALL().get(StudentDAO.v).getName();%>
      <input type="text" class="form-control" id="nam" name="NAME" value="<%=b%>">
    </div>
       <div class="form-group">
      <label for="PHONE">PHONE :</label>
       <%String c=st.getALL().get(StudentDAO.v).getPhone();%>
      <input type="text" class="form-control" id="phon" name="PHONE" value="<%=c%>">
    </div>
       <div class="form-group">
      <label for="email">Email:</label>
       <%String d=st.getALL().get(StudentDAO.v).getEmail();%>
      <input type="email" class="form-control" id="emai"  name="EMAIL" value="<%=d%>">
    </div>
     </div>
       <div class="form-group">
      <label for="ngaysinh">Ngay Sinh:</label>
      <%String e=dd.format(st.getALL().get(StudentDAO.v).getNgaysinh());%>
      <input type="text" class="form-control" id="ema"  name="NGAYSINH" value="<%=e%>">
    </div>
    <button type="submit"  name="action" value="sub">Submit</button>
  </form>
 <%}%><%else{%>
 <%if(StudentDAO.t>=0){%>
  <form action="ListStudentServlet">
    <div class="form-group">
      <label for="ID">ID :</label>
      <%String a1=Integer.toString(st.getALL().get(StudentDAO.t).getId());%>
      <input type="text" class="form-control" id="I"  name="ID" value="<%=a1%>" >
    </div>
    <div class="form-group">
      <label for="NAME">NAME :</label>
       <%String b1=st.getALL().get(StudentDAO.t).getName();%>
      <input type="text" class="form-control" id="nam" name="NAME" value="<%=b1%>">
    </div>
       <div class="form-group">
      <label for="PHONE">PHONE :</label>
       <%String c1=st.getALL().get(StudentDAO.t).getPhone();%>
      <input type="text" class="form-control" id="phon" name="PHONE" value="<%=c1%>">
    </div>
       <div class="form-group">
      <label for="email">Email:</label>
       <%String d1=st.getALL().get(StudentDAO.t).getEmail();%>
      <input type="email" class="form-control" id="emai"  name="EMAIL" value="<%=d1%>">
    </div>
    <div class="form-group">
      <label for="ngaysinh">Ngay Sinh:</label>
      <%String e=dd.format(st.getALL().get(StudentDAO.t).getNgaysinh());%>
      <input type="text" class="form-control" id="ema"  name="NGAYSINH" value="<%=e%>">
    </div>
    <button type="submit"  name="action" value="sub">Submit</button>
  </form>
    <%}else{%>
   
    <%if(1>0){%>
  <form action="StudentServlet">
    <div class="form-group">
      <label for="ID">ID :</label>
      <input type="text" class="form-control" id="e" placeholder="Enter id" name="ID">
    </div>
    <div class="form-group">
      <label for="NAME">NAME :</label>
      <input type="text" class="form-control" id="em" placeholder="Enter name" name="NAME">
    </div>
       <div class="form-group">
      <label for="PHONE">PHONE :</label>
      <input type="text" class="form-control" id="emai" placeholder="Enter phone" name="PHONE">
    </div>
       <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="EMAIL">
    </div>
       <div class="form-group">
      <label for="ngaysinh">NgaySinh:</label>
      <input type="text" class="form-control" id="emais" placeholder="ngay-thang-nam" name="NGAYSINH">
    </div>
    <button type="submit"  name="action" value="sub">Submit</button>
  </form>
  <%}%>
  <%}%>
  <%}%>
</div>
    </body>
</html>
