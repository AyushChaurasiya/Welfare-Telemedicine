
<%@page import="java.sql.ResultSet"%>
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
        a
        {
            text-decoration: none;
        }
        </style>
    </head>
    <body>
        <form action="usercode/postquestioncode.jsp" method="post">
        <div id="wrapper">
            <%@include file="userhead.jsp" %>
            <div id="container">
                <h1 style="color: navy;text-align: center;font-size: 60px;">Discussion Forum</h1>
                <table border="1" style="text-align: center;margin: 0px auto;font-size: 25px;" cellpadding="10">
                    <tr>
                        <td>Enter Question</td>
                        <td><textarea name="question" required="" style="width:500px;height: 40px ;resize: none;border:none;font-size: 20px;" ></textarea></td>
                        <td><input type="submit" value="Post" /></td>
                    </tr>
                    <br><br>
                    <tr>
                        <th>SNo</th>
                        <th>Question</th>
                        <th>Posted by</th>
                        <th>Posted Date</th>
                        <th>Post Answer</th>
                        <th>View Answer</th>
                    </tr>
                    <%
                    /*DBManager db=new DBManager();*/
                    String qq="select * from question order by qid desc";
                    ResultSet rs= db.getRecord(qq);
                    int n=1;
                    while(rs.next())
                    {
                        %>
                        <tr>
                            <td><%=n %></td>
                           <td>
                                <%=rs.getString(4)%>
                            </td>
                            <td><%=rs.getString(2)+"("+(rs.getString(3))+")" %></td>
                            <td>
                                <%=rs.getString(5)%>
                            </td>
                            <td><a href="postanswer.jsp?qid=<%=rs.getString(1)%>&qtext=<%=rs.getString(4)%>">Post Answer</a></td>
                            <td><a href="viewanswer.jsp?qid=<%=rs.getString(1)%>&qtext=<%=rs.getString(4)%>">View Answer</a></td>
                        </tr>
                        <%
                        n++;
                    }
                    
                    
                    %>
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