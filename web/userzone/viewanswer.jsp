<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<%
if(session.getAttribute("uid")==null)
{
    response.sendRedirect("../login.jsp");
}
else
{
%>
<html>
    <head>
        <link href="../css/uuserstyle.css" rel="stylesheet" type="text/css"/>
 
    </head>
    <body>
        <div id="wrapper">
            <%@include file="userhead.jsp" %>
            <div id="container">
                <h1 style="text-align: center">View Answer</h1>
                <br>
                <table border="1px solid" style="width: 90%;margin: 0px auto;">
                    <tr>
                        <td colspan="4" align="center" style="font-size: 15pt;font-weight: bold;color: black;">
                            <span style="color: red;"> Question:</span><%=request.getParameter("qtext")%>
                        </td>
                    </tr>
                    <tr>
                        <th>SNo</th>
                        <th>Answer</th>
                        <th>Posted By</th>
                        <th>Posted Date</th>
                    </tr>
                    <%
                    String q="select * from answer where qid='"+request.getParameter("qid")+"'";
                    /*DBManager db=new DBManager();*/
                    ResultSet rs=db.getRecord(q);
                    int n=1;
                    while(rs.next())
                    {
                     %>   
                     <tr>
                         <td><%=n%></td>
                         <td><%=rs.getString(5)%></td>
                         <td><%=rs.getString(3)+"("+rs.getString(4)+")"%></td>
                         <td><%=rs.getString(6)%></td>
                     </tr>
                     <%
                     n++;
                    }
                     %>
                     
                </table>
            </div>
            <%@include file="userfooter.jsp" %>
            
        </div>
    </body>
</html>
<% 
} 
%>