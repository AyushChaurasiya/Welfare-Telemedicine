<%
  session.invalidate();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script>
            function logout()
            {
                window.history.forward();
                alert("Successfully logged out");
                window.setTimeout("window.location.href='../login.jsp'",100);
                
            }
        </script>
    </head>
    <body bgcolor="aqua" onload="logout()">
        
    </body>
</html>
