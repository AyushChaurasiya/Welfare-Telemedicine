<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.DBManager"%>
<%
     String userid=request.getParameter("userid");
     String password=request.getParameter("password");
     DBManager db=new DBManager();
     String query="select usertype from login where userid ='"+userid+"' and password='"+password+"'";
     ResultSet rs=db.getRecord(query);
     if(rs.next())
     {
         String usertype=rs.getString(1);
         if(usertype.equals("user"))
         {
             //out.println("<script>alert('Welcome to userzone');</script>");
             session.setAttribute("uid",userid );
             
             String q="select patientname from patientinfo  where contactno='"+userid+"'";
             db.getRecord(q);
             ResultSet rsname=db.getRecord(q);
             String name="";
             if(rsname.next())
             {
                 name=rsname.getString(1);
             }
             session.setAttribute("uname",name );
             response.sendRedirect("../userzone/welcomeuser.jsp");
         }
         else if(usertype.equals("admin"))
         {
            // out.println("<script>alert('Welcome to adminzone');</script>");
             session.setAttribute("aid", userid);
             response.sendRedirect("../adminzone/welcomeadmin.jsp");
             
         }
     }
     else
     {
         out.println("<script>alert('Invalid uSer');window.location.href='../login.jsp';</script>");
     }
%>