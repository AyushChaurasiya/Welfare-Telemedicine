<%@page import="mypack.DBManager"%>
<%
String qid=request.getParameter("qid");
String answer=request.getParameter("answer");
String name=session.getAttribute("uname")+"";
String userid=session.getAttribute("uid")+"";
DBManager db=new DBManager();
String dt=db.getCurrentDate();
String q="insert into answer(qid,name,userid,atext,dt) values('"+qid+"','"+name+"','"+userid+"','"+answer+"','"+dt+"')";
String msg=(db.executeNonQuery(q)==true)?"Answer is posted":"Answer is not posted";
out.print(db.getAlert(msg,"../postquestion.jsp"));
%>