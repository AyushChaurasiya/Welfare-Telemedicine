<%@page import="mypack.DBManager"%>
<%
    String oldpass = request.getParameter("oldpass");
    String newpass = request.getParameter("newpass");
    String cpass = request.getParameter("cpass");
    String msg = "";
    if (newpass.equals(cpass)) {
        DBManager db = new DBManager();
        String q = "update login set password='"+newpass+"' where password='"+oldpass+"' and userid='"+session.getAttribute("aid")+"'";
        msg = (db.executeNonQuery(q) == true) ? "Password is updated" : "Pssword is not updated";
    } 
    else 
    {
        msg = "New password is not confirmed";
    }
 out.print(new DBManager().getAlert(msg,"../welcomeadmin.jsp"));
%>