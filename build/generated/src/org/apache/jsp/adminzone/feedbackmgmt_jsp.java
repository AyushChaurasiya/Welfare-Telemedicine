package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.DBManager;

public final class feedbackmgmt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/adminzone/adminhead.jsp");
    _jspx_dependants.add("/adminzone/adminfooter.jsp");
  }

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



if(session.getAttribute("aid")==null)
{
    response.sendRedirect("../login.jsp");
}
else
{

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/adminstyle.css\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("            <div id=\"outer\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("            \n");
      out.write("       \n");
      out.write("<div id=\"uhead\">\n");
      out.write("                <div id=\"ulogo\"></div>\n");
      out.write("                <div id=\"utitle\"></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                <div id=\"menu\">\n");
      out.write("                     <ul >\n");
      out.write("         \n");
      out.write("        <li ><a href=\"feedback.jsp\">FEEDBACK Mgmt</a>\n");
      out.write("            \n");
      out.write("        </li> \n");
      out.write("        <li><a href=\"complaint.jsp\">COMPLIANT Mgmt</a>\n");
      out.write("            \n");
      out.write("        </li> \n");
      out.write("        <li ><a href=\"enquirymgmt.jsp\">ENQUIRY Mgmt</a>\n");
      out.write("            \n");
      out.write("        </li>\n");
      out.write("        <li ><a href=\"feedback.jsp\">Notification</a>\n");
      out.write("            \n");
      out.write("        </li>\n");
      out.write("        <li ><a href=\"blooddonation.jsp\">Blood availability</a>\n");
      out.write("            \n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"changepassword.jsp\">CHANGE PWD</a></li> \n");
      out.write("        <li><a href=\"logout.jsp\">LOGOUT</a>\n");
      out.write("            \n");
      out.write("        </li> \n");
      out.write("       \n");
      out.write("    </ul>\n");
      out.write(" \n");
      out.write("                </div>\n");
      out.write("       ");
      out.write("\n");
      out.write("                <div id=\"container\">\n");
      out.write("                    <h1 style=\"text-align: center;color:navy;\">Feedback Management</h1><br>\n");
      out.write("                    <table style=\"margin: 0px auto;width:90%;\" border=\"1\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>SNo.</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>ftext</th>\n");
      out.write("                            <th>Feedback date</th>\n");
      out.write("                            \n");
      out.write("                            <th>Delete</th>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        ");

                        String q="select * from feedback";
                        DBManager db=new DBManager();
                        ResultSet rs=db.getRecord(q);
                        int n=1;
                        while(rs.next())
                        {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(n );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(3));
      out.write(" </td>\n");
      out.write("                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                            \n");
      out.write("                             \n");
      out.write("                            \n");
      out.write("                             <td><a href=\"admincode/delfeedback.jsp?id=");
      out.print(rs.getInt(1));
      out.write("\">Delete</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        ");

                            n++;                        }
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write(" <div id=\"ufooter\">\n");
      out.write("                <div id=\"ulfooter\"></div>\n");
      out.write("                <div id=\"urfooter\"></div>\n");
      out.write("            </div>");
      out.write("\n");
      out.write("                <h1>Welcome!");
      out.print(session.getAttribute("aid"));
      out.write("</h1>\n");
      out.write("            </div> \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");

}

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
