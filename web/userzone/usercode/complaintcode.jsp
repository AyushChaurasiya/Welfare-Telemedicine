<%@page import="mypack.DBManager"%>
<%
    String name=session.getAttribute("uname")+"";
    String usid=session.getAttribute("uid")+"";
    String subject=request.getParameter("subject");
    String complaint=request.getParameter("complaint");
    DBManager db=new DBManager();
    String dt=db.getCurrentDate();
    String query="insert into complain(name,userid,subject,ctext,dt) values('"+name+"','"+usid+"','"+subject+"','"+complaint+"','"+dt+"')";
    String msg=(db.executeNonQuery(query)==true)?"Complaint is submitted":"Complaint is not submitted";
    out.print(db.getAlert(msg, "../complaint.jsp"));
%>