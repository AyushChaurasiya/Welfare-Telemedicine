<%@page import="mypack.DBManager"%>
<%
String bg=request.getParameter("bloodgroup");
int au=Integer.parseInt(request.getParameter("units"));
String bank=request.getParameter("bank");
String q="insert into bloodavailability(bloodgroup,availableunits,bloodbankname) values('"+bg+"','"+au+"','"+bank+"')";
DBManager db=new DBManager();
boolean msg=db.executeNonQuery(q);String mes="";
if(msg==true)
{
 mes="record is inserted";   
}
else
{
   mes="record is not inserted"; 
}
out.print(db.getAlert(mes,"../welcomeadmin.jsp"));
%>