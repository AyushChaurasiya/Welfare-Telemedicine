package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.DBManager;

public final class blooddonation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/adminstyle.css\" type=\"text/css\"/>\n");
      out.write("         <style>\n");
      out.write("            table\n");
      out.write("            {\n");
      out.write("                font-family: \"Open Sans\",Helvetica,Arial,sans-serif;\n");
      out.write("            }\n");
      out.write("        input[type='submit']\n");
      out.write("        {\n");
      out.write("            background: transparent;\n");
      out.write("            border: none;\n");
      out.write("            outline: none;\n");
      out.write("            color:#fff;\n");
      out.write("            margin-top: 12px;\n");
      out.write("            background:#03a9f4;\n");
      out.write("            padding: 14px 30px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        th{\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"admincode/bloodcode.jsp\" method=\"post\">\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("        ");
      out.write("\n");
      out.write("<div id=\"header\" style=\"margin-top: -8px;\">\n");
      out.write("           <div id=\"menu1\">\n");
      out.write("               <ul>\n");
      out.write("                   <li><a href=\"welcomeadmin.jsp\">Home</a></li>\n");
      out.write("                   <li><a href=\"#\">Careers</a></li>\n");
      out.write("                   <li><a href=\"#\">Pay a bill</a></li>\n");
      out.write("                   <li><a href=\"#\">Financial Assist</a></li>\n");
      out.write("                   <li><a href=\"#\">For Physicians</a></li>\n");
      out.write("                   <li><a href=\"#\">News</a></li>\n");
      out.write("                   <li><a href=\"#\">Services</a></li>\n");
      out.write("               </ul>\n");
      out.write("           </div>\n");
      out.write("           <div id=\"middle\">\n");
      out.write("               \n");
      out.write("            <div id=\"logo\"><img src=\"../images/logo.png\" width=\"240px\" height=\"240px\" style=\"margin-top: -70px;\"/></div>  \n");
      out.write("            <div id=\"search\">\n");
      out.write("                <input type=\"text\" placeholder=\"How may we help you?\" style=\"color:#fff;\" />\n");
      out.write("            </div>\n");
      out.write("           </div>\n");
      out.write("           <div id=\"menu2\">\n");
      out.write("               <ul>\n");
      out.write("                    \n");
      out.write("                   <li><a href=\"feedbackmgmt.jsp\">Feedback Mgmt</a></li>\n");
      out.write("                   <li><a href=\"complaintmgmt.jsp\">Complaint Mgmt</a></li>\n");
      out.write("                   <li><a href=\"blooddonation.jsp\">Blood Display Mgmt</a></li>\n");
      out.write("                   <li><a href=\"enquirymgmt.jsp\">Enquiry Mgmt</a></li>\n");
      out.write("                   <li><a href=\"changepassword.jsp\">Change Password</a></li>\n");
      out.write("                   <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("                     \n");
      out.write("               </ul>\n");
      out.write("           </div>\n");
      out.write("    \n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("<div style=\"margin-left: -10px;margin-right: -5px;width: 100%;height:100px;;font-size: 50px;line-height:2;;background:tomato ;font-weight: 200;color: white;text-align: center;font-family: Helvetica,Arial,sans-serif;\">\n");
      out.write("   Welcome!");
      out.print(session.getAttribute("aid") );
      out.write("\n");
      out.write("    \n");
      out.write("</div>");
      out.write("\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <center>       <h1 style=\"font-size:45px;color:#63599e;\">Blood Display Insertion</h1></center>\n");
      out.write("            \n");
      out.write("            <table style=\"margin: 0px auto;border:1px solid;border-radius: 10px;font-size: 25px;\" cellpadding=\"20\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                     Blood Group   \n");
      out.write("                    </th>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"bloodgroup\">\n");
      out.write("                            <option>Select blood group</option>\n");
      out.write("                            <option>AB</option>\n");
      out.write("                            <option>A</option>\n");
      out.write("                            <option>B</option>\n");
      out.write("                            <option>O</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        Available Units\n");
      out.write("                    </th>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"number\" name=\"units\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                      BloodBank Name   \n");
      out.write("                    </th>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"bank\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                <center>     <input type=\"submit\" /> </center>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("<div id=\"footer\" style=\"margin-top: -45px;\">\n");
      out.write("               <div class=\"padder\"></div>\n");
      out.write("               <div id=\"fcont\">\n");
      out.write("               <div class=\"f\">\n");
      out.write("                   <h2 style=\"font-weight: 100;font-size: 20px;\">&nbsp;&nbsp;&nbsp;&nbsp;For Medical professional</h2>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Find a doctor</p>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Refer a patient</p>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View clinical trials</p>\n");
      out.write("                   <br><br>\n");
      out.write("                   <h2 style=\"font-weight: 100;font-size: 20px;\">&nbsp;&nbsp;&nbsp;&nbsp;For Students</h2>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View Degree programs</p>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View Admission requirements</p>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Login to student portal </p>\n");
      out.write("               </div>  \n");
      out.write("               <div class=\"f\">\n");
      out.write("                   <h2 style=\"font-weight: 100;font-size: 20px;\">&nbsp;&nbsp;&nbsp;&nbsp;For Researchers</h2>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Find an expert in research area</p>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View open positions</p>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View clinical trials</p>\n");
      out.write("                   <br><br>\n");
      out.write("                   <h2 style=\"font-weight: 100;font-size: 20px;\">&nbsp;&nbsp;&nbsp;&nbsp;For Job seekers</h2>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View open positions</p>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View clinical trials</p>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Working at sgpgi<p>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"f\">\n");
      out.write("                <h2 style=\"font-weight: 100;font-size: 20px;\">&nbsp;&nbsp;&nbsp;&nbsp;For Media</h2>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Media Requests</p>\n");
      out.write("                   <p style=\"opacity: 0;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Refer a patient</p>\n");
      out.write("                   <p style=\"opacity: 0;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View clinical trials</p>\n");
      out.write("                   <br><br>\n");
      out.write("                   <h2 style=\"font-weight: 100;font-size: 20px;\">&nbsp;&nbsp;&nbsp;&nbsp;For Medical professional</h2>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Find a doctor</p>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Refer a patient</p>\n");
      out.write("                   <p style=\"opacity: .5;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View clinical trials</p>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"f\" style=>\n");
      out.write("                   <div id=\"f1\" style=\"width: 90%;height: 50px;margin-top: 5px;background: white;border-radius: 10px;\">\n");
      out.write("                      <div id=\"f1\" style=\"width: 90%;height: 50px;margin-top: 5px;background: white;border-radius: 10px;\">\n");
      out.write("                       <img src=../images/google+.png width=\"50px\" height=\"50px\"/><img src=\"../images/facebook.png\" width=\"50px\" height=\"50px\" />\n");
      out.write("                       <img src=\"../images/twitter.png\" width=\"50px\" height=\"50px\" />\n");
      out.write("                       <img src=\"../images/link.png\" width=\"50px\" height=\"50px\" />\n");
      out.write("                       <img src=\"../images/instagram.png\" width=\"50px\" height=\"50px\" />\n");
      out.write("                       <img src=\"../images/youtube.png\" width=\"40px\" height=\"40px\" />\n");
      out.write("                   </div>\n");
      out.write("                   <div id=\"f2\" style=\"width: 100%;height: 100px;\"></div>\n");
      out.write("                   <div id=\"f3\" style=\"width: 100%;height: 150px;\"></div>\n");
      out.write("               </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"padder\"></div>\n");
      out.write("           </div>");
      out.write("\n");
      out.write("        \n");
      out.write("        </div> \n");
      out.write("        </form>\n");
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
