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
             input[type='submit']
        {
            background: transparent;
            border: none;
            outline: none;
            color:#fff;
            margin-top: 12px;
            background:#03a9f4;
            padding: 14px 30px;
            cursor: pointer;
            border-radius: 5px;
            font-size: 20px;
        }
        a{
            text-decoration: none;
            
        }
        a:hover
        {
            color:black;
        }
        </style>
    </head>
    <body>
        <form action="admincode/notificationcode.jsp" method="post">
        <div id="wrapper">
        <%@include file="adminhead.jsp" %>
        <div id="container">
            <h1 style="text-align: center;font-size: 40px;">Notification Form</h1>
            <table style="margin: 0px auto;" cellpadding="" >
                <tr>
                    <td style="font-weight: 200;font-size: 20px;">Enter Notification Text</td>
                <td>
                    <textarea name="notice" required="" style="height: 100px;width: 300px;resize: none;font-size: 20px;">
                        
                    </textarea>
                </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <input type="submit" value="Add Notifiaction"/>
                    </td>
                </tr>
               
            </table>
             <br><br><br>
            <table style="margin: 0px auto;font-size: 20px;" border="1" cellpadding="10">
                <tr style="font-size: 30px;">
                    <th>S.no</th>
                    <th>Notification</th>
                    <th>Notification Date</th>
                    <th>Delete</th>
                    
                </tr>
                <%
                DBManager db=new DBManager();
                String q="select * from notice";
                ResultSet rs=db.getRecord(q);
                int n=1;
                while(rs.next())
                {
                    %>
                    <tr>
                        <td><%=n%></td>
                        <td><%=rs.getString(2) %></td>
                        <td><%=rs.getString(3) %></td>
                        <td><a href="admincode/delnotice.jsp?id=<%=rs.getInt(1)%>">Delete</a></td>
                    </tr>
                    <%    
                n++;
                    }
                %>
            </table>
        </div>
        <%@include file="adminfooter.jsp" %>
        
        </div> 
        </form>
    </body>
</html>
<%
}
%>