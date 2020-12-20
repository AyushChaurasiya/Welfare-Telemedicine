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
        </style>
    </head>
    <body>
        <div id="wrapper">
            <%@include file="userhead.jsp" %>
            <div id="container">
               
                    <h1 style="text-align: center;color:navy;font-size: 50px;">Change Password</h1><br>
                    
                    <form action="usercode/changepasswordcode.jsp" method="post">
                    <table style="margin: 0px auto;width:35%;font-size: 25px;border:1px solid black;border-radius: 10px;"  cellpadding="10" >
                        <tr>
                            <td>Enter Old Password :</td>
                            <td><input type="password" name="oldpass" required=""/></td>
                        </tr>
                        <tr>
                            <td>Enter New Password :</td>
                            <td><input type="password" name="newpass" required=""/></td>
                        </tr>
                        <tr>
                            <td>Confirm Password:</td>
                            <td><input type="password" name="cpass" required=""/></td>
                        </tr>
                        
                        <tr>
                            <td colspan="2" style="text-align: center">
                                <input type="submit" value="Change Password"/>
                            </td>
                            
                        </tr>
                    </table>
                    </form>
            </div>
            <%@include file="userfooter.jsp" %>
            
        </div>
    </body>
</html>
<% 
} 
%>