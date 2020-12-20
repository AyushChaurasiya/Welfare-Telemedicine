<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="../css/uuserstyle.css" rel="stylesheet" type="text/css"/>
        <script src="../js/sslider.js"/></script>
        
    </head>
    <body>
       
        <div id="wrapper">
            <%@include file="userhead.jsp" %>
            <div id="container">
            </div>
            <%@include file="userfooter.jsp" %>
        </div>
        
    </body>
    
</html>
<%
}
%>