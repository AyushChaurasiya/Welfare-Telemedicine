<%@page import="mypack.DBManager"%>
<div id="header" style="margin-top: -8px;">
           <div id="menu1">
               <ul>
                   <li><a href="welcomeuser.jsp">Home</a></li>
                   <li><a href="#">Careers</a></li>
                   <li><a href="#">Pay a bill</a></li>
                   <li><a href="#">Financial Assist</a></li>
                   <li><a href="#">For Physicians</a></li>
                   <li><a href="#">News</a></li>
                   <li><a href="#">Services</a></li>
               </ul>
           </div>
           <div id="middle">
               
            <div id="logo"><img src="../images/logo.png" width="240px" height="240px" style="margin-top: -70px;"/></div>  
            <div id="search">
                <input type="text" placeholder="How may we help you?" style="color:#fff;" />
            </div>
           </div>
           <div id="menu2">
               <ul>
                    
                   <li><a href="feedback.jsp">Feedback</a></li>
                   <li><a href="complaint.jsp">Complaint</a></li>
                   <li><a href="blooddisplay.jsp">Blood Display</a></li>
                   <li><a href="changepassword.jsp">Change Password</a></li>
                   <li><a href="postquestion.jsp">Discussion Forum</a></li>
                   <li><a href="logout.jsp">Logout</a></li>
                     
               </ul>
           </div>
    
       </div>

<div  style="width: 100%;height: 100px;color:white;margin-left: -10px;margin-right: -5px;" >
                <div  style="float: left;width: 50%;    background:mediumseagreen ;">
                    <%
                    DBManager db=new DBManager();
                    %>
                    <h1 style="text-align: center;font-family: Helvetica,Arial,sans-serif;font-weight: 200">   <%=db.getCurrentDate() %></h1>
                    
                    
                </div>
                <div  style="float: left;width: 50%;background: coral;">
                    <h1 style="text-align: center;font-family: Helvetica,Arial,sans-serif;font-weight: 200">     <%=session.getAttribute("uname") %></h1>
                </div>
            </div>