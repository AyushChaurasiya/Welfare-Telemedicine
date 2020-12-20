
<%@page import="mypack.DBManager"%>
<%
String id=request.getParameter("id");
String q="delete from complain where id='"+id+"'";
String code=(new DBManager().executeNonQuery(q)==true)?"Complain is delted":"Complain is not deleted";
out.print(new DBManager().getAlert(code, "../complaintmgmt.jsp"));
%>