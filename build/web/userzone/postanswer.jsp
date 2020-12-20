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
        <form action="usercode/postanswercode.jsp" method="post">
        <div id="wrapper">
            <%@include file="userhead.jsp" %>
            <div id="container">
                <h1 style="text-align: center;">Post Answer</h1>
                <br>
                <input type="hidden" value="<%=request.getParameter("qid")%>" name="qid"/>
                       
                <table style="margin: 0px auto;">
                    <tr>
                        <td>Question</td>
                        <td style="font-size: 14pt;font-weight: bold;"><%=request.getParameter("qtext") %></td>
                    </tr>
                    <tr>
                        <td>Enter Answer :</td>
                        <td>
                            <textarea style="width: 240px;height: 50px;resize: none;" name="answer" required="">
                                
                            </textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input  type="submit" value="Post"/>
                        </td>
                    </tr>
                </table>
            </div>
            <%@include file="userfooter.jsp" %>
            
        </div>
        </form>
    </body>
</html>
<% 
} 
%>