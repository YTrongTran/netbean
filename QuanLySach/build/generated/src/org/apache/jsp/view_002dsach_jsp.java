package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.Sach;
import java.util.List;
import Models.SachDAO;

public final class view_002dsach_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    SachDAO dao = new SachDAO();
    List<Sach> ls = dao.getAll();

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>List Users 4</h2>\n");
      out.write("            <a href=\"SachController?action=AddOrEdit\" class=\"btn btn-primary\">Add Sach</a>\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>MaSach</th>\n");
      out.write("                        <th>TenSach</th>\n");
      out.write("                        <th>NgayNhap</th>\n");
      out.write("                        <th>GiaTien</th>\n");
      out.write("                        <th>SoLuong</th>\n");
      out.write("                        <th>MaLoaiSach</th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        for (int i = 0; i < ls.size(); i++) {
                            Sach s = ls.get(i);
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(s.getMasach() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(s.getTensach());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(s.getNgaynhap());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(s.getGiatien());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(s.getSoluong());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(s.getLoaiSach().getMaLoaiSach());
      out.write("</td>\n");
      out.write("                        <td><a class=\"btn btn-primary btn-sm\" href=\"SachController?action=AddOrEdit&username=");
      out.print(s.getMasach() );
      out.write("\">Edit</a> |\n");
      out.write("                            <a class=\"btn btn-danger btn-sm\" href=\"SachController?action=Delete&username=");
      out.print(s.getMasach() );
      out.write("\">Del</a></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");

                        }

                    
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
