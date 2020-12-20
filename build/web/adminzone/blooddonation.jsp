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
        <form action="admincode/bloodcode.jsp" method="post">
        <div id="wrapper">
        <%@include file="adminhead.jsp" %>
        <div id="container">
            <center>       <h1 style="font-size:45px;color:#63599e;">Blood Display Insertion</h1></center>
            
            <table style="margin: 0px auto;border:1px solid;border-radius: 10px;font-size: 25px;" cellpadding="20">
                <tr>
                    <th>
                     Blood Group   
                    </th>
                    <td>
                        <select name="bloodgroup">
                            <option>Select blood group</option>
                            <option>AB+</option>
                            <option>A+</option>
                            <option>B+</option>
                            <option>O+</option>
                            <option>AB-</option>
                            <option>A-</option>
                            <option>B-</option>
                            <option>O-</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>
                        Available Units
                    </th>
                    <td>
                        <input type="number" name="units"/>
                    </td>
                </tr>
                <tr>
                    <th>
                      BloodBank Name   
                    </th>
                    <td>
                        <input type="text" name="bank"/>
                    </td>
                </tr>
                <tr>
                    
                    <td colspan="2">
                <center>     <input type="submit" /> </center>
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