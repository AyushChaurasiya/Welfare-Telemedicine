
<%@page import="mypack.DBManager"%>
<%
String id=request.getParameter("id");
String q="delete from feedback where id='"+id+"'";
String code=(new DBManager().executeNonQuery(q)==true)?"Feedback is delted":"Feedback is not deleted";
out.print(new DBManager().getAlert(code, "../feedbackmgmt.jsp"));
%>