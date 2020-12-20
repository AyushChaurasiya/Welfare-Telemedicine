<%-- 
    Document   : welcomeadmin
    Created on : 22 Jul, 2018, 10:11:44 AM
    Author     : lenovo
--%>
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
            table
            {
                font-family: "Open Sans",Helvetica,Arial,sans-serif;
            }
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
        th{
            text-align: left;
        }
        </style>
    </head>
    <body>
        <form action="admincode/changepasswordcode.jsp" method="post">
        <div id="wrapper">
        <%@include file="adminhead.jsp" %>
        <div id="container">
            <center> <h1 style="font-size:45px;color:#63599e;">Change Password</h1></center>
            <br>
            <table style="margin: 0px auto;border:1px solid;border-radius: 10px;font-size: 25px;" cellpadding="20">
                <tr>
                    <th>
                        Enter Old Password:
                    </th>
                    <td>
                        <input type="password" name="oldpass" required=""/>
                    </td>
                    
                </tr>
                <tr>
                    <th>
                        Enter New Password
                    </th>
                    <td>
                        <input type="password" name="newpass" required=""/>
                    </td>
                </tr>
                <tr>
                    <th>
                        Enter Confirm Password
                    </th>
                    <td>
                        <input type="password" name="cpass" required=""/>
                    </td>
                </tr>
                <tr>
                    
                    <td colspan="2">
                <center>    <input type="submit" value="Change Password" style="margin: 0px auto;"/></center>
                    </td>
                </tr>
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