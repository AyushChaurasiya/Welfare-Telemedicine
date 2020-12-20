package org.apache.jsp.generalmaster;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div id=\"header\">\n");
      out.write("           <div id=\"menu1\">\n");
      out.write("               <ul>\n");
      out.write("                   <li><a href=\"#\">Home</a></li>\n");
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
      out.write("            <div id=\"logo\"><img src=\"logo.png\" width=\"80px\" height=\"800px\" style=\"margin-top: 10px;\"/></div>  \n");
      out.write("            <div id=\"search\">\n");
      out.write("                <input type=\"text\" placeholder=\"How may we help you?\" style=\"color:#fff;\" />\n");
      out.write("            </div>\n");
      out.write("           </div>\n");
      out.write("           <div id=\"menu2\">\n");
      out.write("               <ul>\n");
      out.write("                   <li><a href=\"#\">Doctors</a></li>\n");
      out.write("                   <li><a href=\"#\">About Us</a></li>\n");
      out.write("                   <li><a href=\"#\">Login</a></li>\n");
      out.write("                   <li><a href=\"#\">Registeration</a></li>\n");
      out.write("                   <li><a href=\"#\">Enquiry</a></li>\n");
      out.write("                   \n");
      out.write("               </ul>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("      \n");
      out.write("      <div id=\"amazingslider-wrapper-1\" style=\"display:block;position:relative;max-width:1525px;margin:0px auto 6px;top: -13;\">\n");
      out.write("        <div id=\"amazingslider-1\" style=\"display:block;position:relative;margin:0 auto;\">\n");
      out.write("            <ul class=\"amazingslider-slides\" style=\"display:none;\">\n");
      out.write("                <li><img src=\"images/s1.jpg\" alt=\"s1\" />\n");
      out.write("                </li>\n");
      out.write("                <li><img src=\"images/s2.jpg\" alt=\"s2\" />\n");
      out.write("                </li>\n");
      out.write("                <li><img src=\"images/s3.jpg\" alt=\"s3\" />\n");
      out.write("                </li>\n");
      out.write("                <li><img src=\"images/s4.jpg\" alt=\"Slider\" />\n");
      out.write("                </li>\n");
      out.write("                <li><img src=\"images/s5.jpg\" alt=\"s5\" />\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"amazingslider-thumbnails\" style=\"display:none;\">\n");
      out.write("                <li><img src=\"images/s1-tn.jpg\" alt=\"s1\" /></li>\n");
      out.write("                <li><img src=\"images/s2-tn.jpg\" alt=\"s2\" /></li>\n");
      out.write("                <li><img src=\"images/s3-tn.jpg\" alt=\"s3\" /></li>\n");
      out.write("                <li><img src=\"images/s4-tn.jpg\" alt=\"Slider\" /></li>\n");
      out.write("                <li><img src=\"images/s5-tn.jpg\" alt=\"s5\" /></li>\n");
      out.write("            </ul>\n");
      out.write("        <div class=\"amazingslider-engine\"><a href=\"http://amazingslider.com\" title=\"JavaScript Image Slideshow\">JavaScript Image Slideshow</a></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      ");
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
