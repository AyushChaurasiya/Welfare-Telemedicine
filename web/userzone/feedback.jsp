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
                <form action="usercode/feedbackcode.jsp" method="post">
                <table style="margin: 0px auto;border:1px solid black;border-radius: 10px;" cellpadding="10" >
                    <tr>
                        <td colspan="2" style="font-size: 16px;font-weight: bold;color: navy;text-align: center;">
                            <h1 style="font-size: 45px;">Feedback Form</h1>
                        </td>
                    </tr>
                    <tr>
                        <td style="font-size: 20px;font-weight: 550;">Enter Feedback</td>
                        <td>
                            <textarea name="feedback" required="" style="width: 200px;height: 80px;resize: none;"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align: center;">
                            <input type="submit" value="Post Feedback"/>
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