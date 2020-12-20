package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import mypack.DBManager;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/generalmaster/head.jsp");
    _jspx_dependants.add("/generalmaster/left.jsp");
    _jspx_dependants.add("/generalmaster/foot.jsp");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("                   <title>SGPGI TELEMEDICINE</title>\n");
      out.write("                   <link href=\"css/generalstyle.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("                   <script src=\"js/sslider.js\"></script> \n");
      out.write("                   \n");
      out.write("    </head>\n");
      out.write("    <body onload=\"moveSlider()\">\n");
      out.write("      \n");
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
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"left\">\r\n");
      out.write("     \r\n");
      out.write("    <h1 style=\"font-weight: 100;text-align: center;\">Notice Board</h1>\r\n");
      out.write("    <marquee direction=\"up\" height=\"500px\">\r\n");
      out.write("  \r\n");
      out.write("    ");

    DBManager db=new DBManager();
    String q="select * from notice";
    ResultSet rs= db.getRecord(q);
    while(rs.next())
    {
        
      out.write("\r\n");
      out.write("        <p>");
      out.print(rs.getString(2) );
      out.write("</p>\r\n");
      out.write("        <p>Notice Date:");
      out.print(rs.getString(3) );
      out.write("</p>\r\n");
      out.write("        <hr/>\r\n");
      out.write("        \r\n");
      out.write("        ");

    }
    
      out.write("\r\n");
      out.write("    </marquee>\r\n");
      out.write("    \r\n");
      out.write("             <center><h1 style=\"font-family:Open Sans,Helvetica,Arial,sans-serif;font-weight: 200;color:white;    background: #003da5;\">News</h1></center> \r\n");
      out.write("              <br><br>\r\n");
      out.write("              <marquee direction=\"up\" height=\"650px\">               \r\n");
      out.write("                  <div class=\"news\">\r\n");
      out.write("                   <div class=\"pic\">\r\n");
      out.write("                       <img src=\"images/pic.jpg\" width=\"100%\" height=\"150px\"/>\r\n");
      out.write("                   </div>\r\n");
      out.write("                   <div class=\"content\">\r\n");
      out.write("                      \r\n");
      out.write("                       \"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ghj.\"\r\n");
      out.write("                   </div>\r\n");
      out.write("               </div> <br><br><br><br><br><br><br><br>\r\n");
      out.write("               <div class=\"news\">\r\n");
      out.write("                   <div class=\"pic\">\r\n");
      out.write("                       <img src=\"images/pic1.jpg\" width=\"100%\" height=\"150px\"/>\r\n");
      out.write("                   </div>\r\n");
      out.write("                   <div class=\"content\">\r\n");
      out.write("                      \r\n");
      out.write("                       \"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ghj.\"\r\n");
      out.write("                   </div>\r\n");
      out.write("               </div><br><br><br><br><br><br><br><br>\r\n");
      out.write("               <div class=\"news\">\r\n");
      out.write("                   <div class=\"pic\">\r\n");
      out.write("                       <img src=\"images/pic2.jpg\" width=\"100%\" height=\"150px\"/>\r\n");
      out.write("                   </div>\r\n");
      out.write("                   <div class=\"content\">\r\n");
      out.write("                      \r\n");
      out.write("                       \"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ghj.\"\r\n");
      out.write("                   </div>\r\n");
      out.write("               </div><br><br><br><br><br><br><br><br>\r\n");
      out.write("               <div class=\"news\">\r\n");
      out.write("                   <div class=\"pic\">\r\n");
      out.write("                       <img src=\"images/pic3.png\" width=\"100%\" height=\"150px\"/>\r\n");
      out.write("                   </div>\r\n");
      out.write("                   <div class=\"content\">\r\n");
      out.write("                      \r\n");
      out.write("                       \"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ghj.\"\r\n");
      out.write("                   </div>\r\n");
      out.write("               </div><br><br><br><br><br><br><br><br>\r\n");
      out.write("               <div class=\"news\">\r\n");
      out.write("                   <div class=\"pic\">\r\n");
      out.write("                       <img src=\"images/pic4.jpg\" width=\"100%\" height=\"150px\"/>\r\n");
      out.write("                   </div>\r\n");
      out.write("                   <div class=\"content\">\r\n");
      out.write("                      \r\n");
      out.write("                       \"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ghj.\"\r\n");
      out.write("                   </div>\r\n");
      out.write("               </div>\r\n");
      out.write("               </marquee>\r\n");
      out.write("           </div>");
      out.write("\n");
      out.write("               \n");
      out.write("                    <div id=\"main\">\n");
      out.write("              <br><br>\n");
      out.write("               <div id=\"benefits\">\n");
      out.write("                   <div id=\"b1\">\n");
      out.write("                       <h2 style=\"font-size: 35px;text-align: center;\">Why Choose Telemedicine?</h2>\n");
      out.write("                   </div>\n");
      out.write("                   <div id=\"b2\">\n");
      out.write("                      <div class=\"padd\"></div>\n");
      out.write("                       <div id=\"b21\">\n");
      out.write("                           <center><img src=\"images/doc1.png\" width=\"90px\" height=\"90px\"/>\n");
      out.write("                           <h2 style=\"font-weight: 100;\">Best Doctors</h2>\n");
      out.write("                           <p>\n");
      out.write("                               Our highly specialized experts are deeply experienced in treating rare and complex conditions.\n");
      out.write("                           </p>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           </center>\n");
      out.write("\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"padd2\"></div>\n");
      out.write("                       <div id=\"b22\">\n");
      out.write("                           <center><img src=\"images/doc2.png\" width=\"90px\" height=\"90px\"/>\n");
      out.write("                           <h2 style=\"font-weight: 100;\">Right Answer</h2>\n");
      out.write("                           <p>Every aspect of your care is coordinated and teams of experts work together to provide exactly the care you need. What might take months elsewhere can often be done in days here.\n");
      out.write("                           </p>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           </center>\n");
      out.write("\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"padd2\"></div>\n");
      out.write("                       <div id=\"b23\">\n");
      out.write("                           <center><img src=\"images/doc4.png\" width=\"90px\" height=\"90px\"/>\n");
      out.write("                           <h2 style=\"font-weight: 100;\">Unparalleled expertise</h2>\n");
      out.write("                           <p>\n");
      out.write("                               Experts are some of the best in the world.Experts work together to provide exactly the care you need.\n");
      out.write("                           </p>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           </center>\n");
      out.write("\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"padd\"></div>\n");
      out.write("                   </div>\n");
      out.write("                   <div id=\"b3\">\n");
      out.write("                       <center>\n");
      out.write("                          <button >\n");
      out.write("                           Learn More\n");
      out.write("                       </button>\n");
      out.write("                       </center>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("               <br><br>\n");
      out.write("             <div id=\"image\" style=\"width: 99%;height: 300px;background-image: url(images/support.jpg);background-size: cover;margin: 0px auto;\">\n");
      out.write("                <br><br>\n");
      out.write("                 <h1 style=\"color: white;text-align: center;font-family: sans-serif;font-weight: 100;opacity: .6;\">Telemedicine ease of getting medical treatement</h1>\n");
      out.write("                 <br><br>\n");
      out.write("                 <center>\n");
      out.write("                 <button style=\"opacity: .7;\" >Support Us</button>\n");
      out.write("                 </center>\n");
      out.write("             </div>\n");
      out.write("             <br><br>\n");
      out.write("             <h1 style=\"text-align: center;font-family: monospace;font-size: 35px;\">Telemedicine Video</h1>\n");
      out.write("             <div style=\"width: 100%;height: 255px;\">\n");
      out.write("            &nbsp;\n");
      out.write("             <iframe width=\"250\" height=\"141\" src=\"https://www.youtube.com/embed/_-tEmC3Dm-0?rel=0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n");
      out.write("             &nbsp;\n");
      out.write("             <iframe width=\"250\" height=\"141\" src=\"https://www.youtube.com/embed/z0OBf7aOzJc?rel=0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n");
      out.write("             &nbsp;\n");
      out.write("             <iframe width=\"250\" height=\"141\" src=\"https://www.youtube.com/embed/_-tEmC3Dm-0?rel=0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n");
      out.write("             &nbsp;\n");
      out.write("             <iframe width=\"250\" height=\"141\" src=\"https://www.youtube.com/embed/z0OBf7aOzJc?rel=0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n");
      out.write("             </div>\n");
      out.write("             \n");
      out.write("             <div style=\"width: 100%;height:255px;margin-top: -10px;\">\n");
      out.write("             &nbsp;\n");
      out.write("             <iframe width=\"250\" height=\"141\" src=\"https://www.youtube.com/embed/xwTwkWpuYmw?rel=0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n");
      out.write("              &nbsp;\n");
      out.write("              <iframe width=\"250\" height=\"141\" src=\"https://www.youtube.com/embed/M3OOoYHbIJk?rel=0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>   \n");
      out.write("              &nbsp;\n");
      out.write("             <iframe width=\"250\" height=\"141\" src=\"https://www.youtube.com/embed/xwTwkWpuYmw?rel=0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n");
      out.write("              &nbsp;\n");
      out.write("              <iframe width=\"250\" height=\"141\" src=\"https://www.youtube.com/embed/M3OOoYHbIJk?rel=0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>   \n");
      out.write("               </div>\n");
      out.write("               \n");
      out.write("          \n");
      out.write("           \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                ");
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
      out.write("                       <img src=images/google+.png width=\"50px\" height=\"50px\"/><img src=\"images/facebook.png\" width=\"50px\" height=\"50px\" />\n");
      out.write("                       <img src=\"images/twitter.png\" width=\"50px\" height=\"50px\" />\n");
      out.write("                       <img src=\"images/link.png\" width=\"50px\" height=\"50px\" />\n");
      out.write("                       <img src=\"images/instagram.png\" width=\"50px\" height=\"50px\" />\n");
      out.write("                       <img src=\"images/youtube.png\" width=\"50px\" height=\"50px\" />\n");
      out.write("                   </div>\n");
      out.write("                   <div id=\"f2\" style=\"width: 100%;height: 100px;\"></div>\n");
      out.write("                   <div id=\"f3\" style=\"width: 100%;height: 150px;\"></div>\n");
      out.write("               </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"padder\"></div>\n");
      out.write("           </div>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("     \n");
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
