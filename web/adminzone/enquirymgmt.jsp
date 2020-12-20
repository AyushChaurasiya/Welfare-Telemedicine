<%

if(session.getAttribute("aid")==null)
{
    response.sendRedirect("../login.jsp");
}
else
{
%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/adminstyle.css" type="text/css"/>
        <style>
            a{
                text-decoration: none;
            }
            a:hover{
                color:black;
            }
        </style>
    </head>
    <body>
        
            <div id="wrapper">
                <%@include file="adminhead.jsp" %>
                <div id="container">
                    <h1 style="text-align: center;color:navy;">Enquiry Management</h1><br>
                    <table style="margin: 0px auto;width:90%;" border="1" cellpadding='10'>
                        <tr style='font-size: 25px;'>
                            <th>SNo.</th>
                            <th>Name</th>
                            <th>Gender</th>
                            <th>Contact</th>
                            <th>Email Address</th>
                            <th>Enquiry Text</th>
                            <th>Enquiry Date</th>
                            <th>Delete</th>
                            
                        </tr>
                        <%
                        String q="select * from enquiry";
                        DBManager db=new DBManager();
                        ResultSet rs=db.getRecord(q);
                        int n=1;
                        while(rs.next())
                        {
                        %>
                        <tr style='font-size: 20px;'>
                            <td><%=n %></td>
                            <td><%=rs.getString(2)%></td>
                            <td><%=rs.getString(3)%> </td>
                            <td><%=rs.getString(4)%></td>
                            <td><%=rs.getString(5)%></td>
                             <td><%=rs.getString(6)%></td>
                            <td><%=rs.getString(7)%></td>
                            <td><a href="admincode/delenquirycode.jsp?id=<%=rs.getInt(1)%>">Delete</a></td>
                        </tr>
                        
                        
                        
                        
                        <%
                            n++;                        }
                        %>
                    </table>
                </div>
                <%@include file="adminfooter.jsp" %>
               
            </div> 
        
    </body>
</html>
<%
}
%>