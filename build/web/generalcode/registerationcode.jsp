<%@page import="mypack.DBManager"%>
<%
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
     


%>