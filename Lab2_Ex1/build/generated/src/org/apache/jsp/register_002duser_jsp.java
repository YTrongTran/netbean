package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;

public final class register_002duser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String action = (String) request.getAttribute("ACTION");
Users users = (Users)request.getAttribute("USERS");
if (action == null) {
        action ="SaverOrUpdate";
    }
if (users == null) {
        users = new Users("", "", "", true);
    }


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" style=\"margin-top: 10px;\">\n");
      out.write("            <div class=\"row\" style=\"border: 1px darkgrey solid; border-radius: 10px;width: 50%; margin: 0 auto; padding: 20px;\" >\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <h2>Register</h2>\n");
      out.write("                    <form action=\"UserServlet\">\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"action\" value=\"");
      out.print(action );
      out.write("\" >\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>UserName</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"username\" value=\"");
      out.print(users.getUsername() );
      out.write("\" placeholder=\"Enter UserName\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Password:</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"password\" value=\"");
      out.print(users.getPassword());
      out.write("\" placeholder=\"Enter password\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"name\" value=\"");
      out.print(users.getName());
      out.write("\" placeholder=\"Enter name\">\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Gender</label>\n");
      out.write("                            <div class=\"radio\"><!--value = 1 => Nam| 0 =>Nu -->\n");
      out.write("                                <label class=\"checkbox-inline\"><input type=\"radio\" name=\"gender\"  value=\"1\"");
if(users.isGender()){out.println("checked");}
      out.write(">Male</label>\n");
      out.write("                                <label class=\"checkbox-inline\"><input type=\"radio\" name=\"gender\"  value=\"0\"");
if(!users.isGender()) {out.println("checked");} 
      out.write(" > Female</label>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-primary\">Cancel</button>\n");
      out.write("                        <a href=\"UserServlet?action=List\" class=\"btn btn-primary\">Display Users</a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
