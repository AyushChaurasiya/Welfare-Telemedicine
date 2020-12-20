<%@page import="mypack.DBManager"%>
<div id="header" style="margin-top: -8px;">
           <div id="menu1">
               <ul>
                   <li><a href="welcomeadmin.jsp">Home</a></li>
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
                    
                   <li><a href="feedbackmgmt.jsp">Feedback Mgmt</a></li>
                   <li><a href="complaintmgmt.jsp">Complaint Mgmt</a></li>
                   <li><a href="blooddonation.jsp">Blood Display Mgmt</a></li>
                   <li><a href="enquirymgmt.jsp">Enquiry Mgmt</a></li>
                   <li><a href="changepassword.jsp">Change Password</a></li>
                   <li><a href="logout.jsp">Logout</a></li>
                     
               </ul>
           </div>
    
       </div>

<div style="margin-left: -10px;margin-right: -5px;width: 100%;height:100px;;font-size: 50px;line-height:2;;background:tomato ;font-weight: 200;color: white;text-align: center;font-family: Helvetica,Arial,sans-serif;">
   Welcome!<%=session.getAttribute("aid") %>
    
</div>