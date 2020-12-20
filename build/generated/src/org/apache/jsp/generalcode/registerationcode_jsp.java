package org.apache.jsp.generalcode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypack.DBManager;

public final class registerationcode_jsp extends org.apache.jasper.runtime.HttpJspBase
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

     String password=request.getParameter("password");
     String confirmpassword=request.getParameter("cpassword");
     if(password.equals(confirmpassword))
     {
         String capcode=request.getParameter("capcode");
         String captchacode=request.getParameter("captchacode");
         if(capcode.equals(captchacode))
         {
             String patientname=request.getParameter("patientname");
             String gender=request.getParameter("gender");
             String fathername=request.getParameter("fathername");
             String address1=request.getParameter("address1");
             String address2=request.getParameter("address2");
             String disease=request.getParameter("disease");
             String referedby=request.getParameter("referedby");
             String hospitalname=request.getParameter("hospitalname");
             String contactno=request.getParameter("contactno");
             String email=request.getParameter("emailaddress");
             String adharno=request.getParameter("adharno");
             String pass=request.getParameter("password");
             String status="false";
             DBManager db=new DBManager();
             String connectdt=db.getCurrentDate();
             String query1="insert into patientinfo values('"+patientname+"','"+gender+"','"+fathername+"','"+address1+"','"+address2+"','"+disease+"','"+referedby+"','"+hospitalname+"','"+contactno+"','"+email+"','"+adharno+"','"+pass+"','"+status+"','"+connectdt+"')";
             String query2="insert into login values('"+contactno+"','"+pass+"','user')";
             if(db.executeNonQuery(query1)==true)
             {
                 if(db.executeNonQuery(query2)==true)
                 {
                     out.print("<script>alert('Registeration successful');window.location.href='../index.jsp';</script>");
                 }
                 else
                 {
                     out.print("<script>alert('Login details are not saved');window.location.href='../registeration.jsp';</script>");
                 }
             }
             else
             {
                 out.print("<script>alert('Registeration is not successful');window.location.href='../index.jsp';</script>");
             }
         }
         else
     {
         out.println("<script>alert('Invalid Captcha Code');window.location.href='../registeration.jsp';</script>");
     }
     
     }
     else
     {
         out.println("<script>alert('Password is not matched');window.location.href='../registeration.jsp';</script>");
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
