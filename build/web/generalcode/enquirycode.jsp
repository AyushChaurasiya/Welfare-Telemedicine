<%@page import="mypack.SmsSender"%>
<%@page import="mypack.DBManager"%>
<%
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

%>