package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Emplyoee;

public final class list_002demployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Danh Sach Sinh Vien</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    ");

        List<Emplyoee> ls = (List<Emplyoee>) request.getAttribute("EMPLOYEES");
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Danh Sách Nhan  Viên</h2>\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>NAME</th>\n");
      out.write("                        <th>GIOI TINH</th>\n");
      out.write("                        <th>ACTION</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
for (Emplyoee st : ls) {
      out.write("\n");
      out.write("                    <!--   viet được  html-->\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(st.getId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(st.getName());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(st.isGender() ? "Nam" : "Nu");
      out.write("</td>\n");
      out.write("                        <td><a class=\"btn btn-primary\" href=\"EmployeeServlet?action=edit\">EDIT</a> | <a class=\"btn btn-danger\" href=\"#\">DEL</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>John</td>\n");
      out.write("                        <td>Doe</td>\n");
      out.write("                        <td>Nam</td>\n");
      out.write("                        <td><a class=\"btn btn-primary\" href=\"#\">EDIT</a> | <a class=\"btn btn-danger\" href=\"#\">DEL</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>John</td>\n");
      out.write("                        <td>Doe</td>\n");
      out.write("                        <td>Nu</td>\n");
      out.write("                        <td><a class=\"btn btn-primary\" href=\"#\">EDIT</a> | <a class=\"btn btn-danger\" href=\"#\">DEL</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>John</td>\n");
      out.write("                        <td>Doe</td>\n");
      out.write("                        <td>Nam</td>\n");
      out.write("                        <td><a class=\"btn btn-primary\" href=\"#\">EDIT</a> | <a class=\"btn btn-danger\" href=\"#\">DEL</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>John</td>\n");
      out.write("                        <td>Doe</td>\n");
      out.write("                        <td>Nu</td>\n");
      out.write("                        <td><a class=\"btn btn-primary\" href=\"#\">EDIT</a> | <a class=\"btn btn-danger\" href=\"#\">DEL</a></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
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
