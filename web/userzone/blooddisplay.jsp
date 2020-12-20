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
               <h1 style="text-align: center;color:navy;font-size: 50px;">Blood Availbility</h1><br>
                    <table style="margin: 0px auto;width:90%;font-size: 25px;" border="1" cellpadding="15">
                        <tr style="font-size: 40px;font-weight: 600;">
                            <td>SNo.</td>
                            <td>Blood group</td>
                            <td>Available units</td>
                            <td>Blood bank name</td>
                            
                            
                        </tr>
                        <%
                        String q="select * from bloodavailability";
                        /*DBManager db=new DBManager();*/
                        ResultSet rs=db.getRecord(q);
                        int n=1;
                        while(rs.next())
                        {
                        %>
                        <tr>
                            <td><%=n %></td>
                            <td><%=rs.getString(2)%></td>
                            <td><%=rs.getString(3)%> </td>
                            <td><%=rs.getString(4)%></td>
                           
                            
                        </tr>
                        
                        
                        
                        
                        <%
                            n++;                        }
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