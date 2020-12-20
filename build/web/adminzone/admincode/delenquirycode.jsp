
<%@page import="mypack.DBManager"%>
<%
String id=request.getParameter("id");
String q="delete from enquiry where eqid='"+id+"'";
String code=(new DBManager().executeNonQuery(q)==true)?"Enquiry is delted":"Enquiry is not deleted";
out.print(new DBManager().getAlert(code, "../enquirymgmt.jsp"));
%>