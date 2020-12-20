package org.apache.jsp.userzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcomeuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/userzone/userhead.jsp");
    _jspx_dependants.add("/userzone/userfooter.jsp");
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../css/userstyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"../js/sslider.js\"/></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            ");
      out.write("<div id=\"header\" style=\"margin-top: -8px;\">\n");
      out.write("           <div id=\"menu1\">\n");
      out.write("               <ul>\n");
      out.write("                   <li><a href=\"../index.jsp\">Home</a></li>\n");
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
      out.write("            <div id=\"logo\"><img src=\"images/logo.png\" width=\"240px\" height=\"240px\" style=\"margin-top: -70px;\"/></div>  \n");
      out.write("            <div id=\"search\">\n");
      out.write("                <input type=\"text\" placeholder=\"How may we help you?\" style=\"color:#fff;\" />\n");
      out.write("            </div>\n");
      out.write("           </div>\n");
      out.write("           <div id=\"menu2\">\n");
      out.write("               <ul>\n");
      out.write("                   <li><a href=\"#\">Doctors</a></li>\n");
      out.write("                   <li><a href=\"#\">About Us</a></li>\n");
      out.write("                   <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                   <li><a href=\"registeration.jsp\">Registeration</a></li>\n");
      out.write("                   <li><a href=\"enquiry.jsp\">Enquiry</a></li>\n");
      out.write("                   \n");
      out.write("               </ul>\n");
      out.write("           </div>\n");
      out.write("    \n");
      out.write("       </div>\n");
      out.write("<div id=\"slider\" style=\"width: 1525px;height: 700px;\">\n");
      out.write("    <img id=\"img1\" src=\"images/s1.jpg\" style=\"borer:4px solid red\" height=\"700px\" width=\"1525px\"/>\n");
      out.write("</div>");
      out.write("\n");
      out.write("            <div id=\"container\">\n");
      out.write("            </div>\n");
      out.write("            ");
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
      out.write("                       <img src=images/google.png /><img src=\"images/facebook.png\" width=\"50px\" height=\"50px\" />\n");
      out.write("                   </div>\n");
      out.write("                   <div id=\"f2\" style=\"width: 100%;height: 100px;\"></div>\n");
      out.write("                   <div id=\"f3\" style=\"width: 100%;height: 150px;\"></div>\n");
      out.write("               </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"padder\"></div>\n");
      out.write("           </div>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>");
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
