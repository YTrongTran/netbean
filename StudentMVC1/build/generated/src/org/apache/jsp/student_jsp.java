package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import controllers.StudentServlet;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.SQLException;
import model.StudentDAO;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
SimpleDateFormat dd=new SimpleDateFormat("dd-MM-yyyy");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("                <div class=\"container\">\n");
      out.write("              <h2>  add student</h2>\n");
      out.write("  ");
StudentDAO st=new StudentDAO();
      out.write("\n");
      out.write("  ");
if(StudentDAO.v>=0){
      out.write("\n");
      out.write("       <form action=\"ListStudentServlet\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"ID\">ID :</label>\n");
      out.write("    ");
String a=Integer.toString(st.getALL().get(StudentDAO.v).getId());
      out.write("\n");
      out.write("           <input type=\"text\" class=\"form-control\" id=\"I\"  name=\"ID\" value=\"");
      out.print(a);
      out.write("\" >\n");
      out.write("           </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"NAME\">NAME :</label>\n");
      out.write("       ");
String b=st.getALL().get(StudentDAO.v).getName();
      out.write("\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"nam\" name=\"NAME\" value=\"");
      out.print(b);
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("      <label for=\"PHONE\">PHONE :</label>\n");
      out.write("       ");
String c=st.getALL().get(StudentDAO.v).getPhone();
      out.write("\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"phon\" name=\"PHONE\" value=\"");
      out.print(c);
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("      <label for=\"email\">Email:</label>\n");
      out.write("       ");
String d=st.getALL().get(StudentDAO.v).getEmail();
      out.write("\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"emai\"  name=\"EMAIL\" value=\"");
      out.print(d);
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("     </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("      <label for=\"ngaysinh\">Ngay Sinh:</label>\n");
      out.write("      ");
String e=dd.format(st.getALL().get(StudentDAO.v).getNgaysinh());
      out.write("\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"ema\"  name=\"NGAYSINH\" value=\"");
      out.print(e);
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\"  name=\"action\" value=\"sub\">Submit</button>\n");
      out.write("  </form>\n");
      out.write(" ");
}
else{
      out.write('\n');
      out.write(' ');
if(StudentDAO.t>=0){
      out.write("\n");
      out.write("  <form action=\"ListStudentServlet\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"ID\">ID :</label>\n");
      out.write("      ");
String a1=Integer.toString(st.getALL().get(StudentDAO.t).getId());
      out.write("\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"I\"  name=\"ID\" value=\"");
      out.print(a1);
      out.write("\" >\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"NAME\">NAME :</label>\n");
      out.write("       ");
String b1=st.getALL().get(StudentDAO.t).getName();
      out.write("\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"nam\" name=\"NAME\" value=\"");
      out.print(b1);
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("      <label for=\"PHONE\">PHONE :</label>\n");
      out.write("       ");
String c1=st.getALL().get(StudentDAO.t).getPhone();
      out.write("\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"phon\" name=\"PHONE\" value=\"");
      out.print(c1);
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("      <label for=\"email\">Email:</label>\n");
      out.write("       ");
String d1=st.getALL().get(StudentDAO.t).getEmail();
      out.write("\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"emai\"  name=\"EMAIL\" value=\"");
      out.print(d1);
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"ngaysinh\">Ngay Sinh:</label>\n");
      out.write("      ");
String e=dd.format(st.getALL().get(StudentDAO.t).getNgaysinh());
      out.write("\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"ema\"  name=\"NGAYSINH\" value=\"");
      out.print(e);
      out.write("\">\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\"  name=\"action\" value=\"sub\">Submit</button>\n");
      out.write("  </form>\n");
      out.write("    ");
}else{
      out.write("\n");
      out.write("   \n");
      out.write("    ");
if(1>0){
      out.write("\n");
      out.write("  <form action=\"StudentServlet\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"ID\">ID :</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"e\" placeholder=\"Enter id\" name=\"ID\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"NAME\">NAME :</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"em\" placeholder=\"Enter name\" name=\"NAME\">\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("      <label for=\"PHONE\">PHONE :</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"emai\" placeholder=\"Enter phone\" name=\"PHONE\">\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("      <label for=\"email\">Email:</label>\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"EMAIL\">\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("      <label for=\"ngaysinh\">NgaySinh:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"emais\" placeholder=\"ngay-thang-nam\" name=\"NGAYSINH\">\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\"  name=\"action\" value=\"sub\">Submit</button>\n");
      out.write("  </form>\n");
      out.write("  ");
}
      out.write("\n");
      out.write("  ");
}
      out.write("\n");
      out.write("  ");
}
      out.write("\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
