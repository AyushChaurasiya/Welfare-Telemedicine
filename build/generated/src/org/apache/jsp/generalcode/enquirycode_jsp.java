package org.apache.jsp.generalcode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypack.SmsSender;
import mypack.DBManager;

public final class enquirycode_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    String name=request.getParameter("name");
    String gender=request.getParameter("gender");
    String contactno=request.getParameter("contactno");
    String email=request.getParameter("email");
    String enquiry=request.getParameter("enquiry");
    DBManager db=new DBManager();
    String enquirydt=db.getCurrentDate();
    String query="insert into enquiry(name,gender,contactno,email,enquiry_text,enquiry_date) values('"+name+"','"+gender+"','"+contactno+"','"+email+"','"+enquiry+"','"+enquirydt+"')";
    boolean res=db.executeNonQuery(query);
    if(res==true)
    {
        String msg="Thanks for enquiry we will contact you soon. Team HR ";
        SmsSender ss=new SmsSender();
        ss.SendSms(contactno, msg);
        out.println("<script>alert('Your Enquiry is saved');window.location.href='../enquiry.jsp';</script>");
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
