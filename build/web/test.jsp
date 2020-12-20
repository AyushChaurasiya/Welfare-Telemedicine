a<%-- 
    Document   : test
    Created on : 17 Jul, 2018, 10:47:54 AM
    Author     : lenovo
--%>

<%@page import="mypack.DBManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
        <%
        
        DBManager db=new DBManager();
        out.print(db.getAlert("Hello JSP","index.jsp"));
        
        
        
        
        %>
        
        
        
        
        
        </h1>
    </body>
</html>
