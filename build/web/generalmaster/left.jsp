<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.DBManager"%>
<div id="left">
     
    <h1 style="font-weight: 100;text-align: center;">Notice Board</h1>
    <marquee direction="up" height="500px">
  
    <%
    DBManager db=new DBManager();
    String q="select * from notice";
    ResultSet rs= db.getRecord(q);
    while(rs.next())
    {
        %>
        <p><%=rs.getString(2) %></p>
        <p>Notice Date:<%=rs.getString(3) %></p>
        <hr/>
        
        <%
    }
    %>
    </marquee>
    
             <center><h1 style="font-family:Open Sans,Helvetica,Arial,sans-serif;font-weight: 200;color:white;    background: #003da5;">News</h1></center> 
              <br><br>
              <marquee direction="up" height="650px">               
                  <div class="news">
                   <div class="pic">
                       <img src="images/pic.jpg" width="100%" height="150px"/>
                   </div>
                   <div class="content">
                      
                       "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ghj."
                   </div>
               </div> <br><br><br><br><br><br><br><br>
               <div class="news">
                   <div class="pic">
                       <img src="images/pic1.jpg" width="100%" height="150px"/>
                   </div>
                   <div class="content">
                      
                       "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ghj."
                   </div>
               </div><br><br><br><br><br><br><br><br>
               <div class="news">
                   <div class="pic">
                       <img src="images/pic2.jpg" width="100%" height="150px"/>
                   </div>
                   <div class="content">
                      
                       "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ghj."
                   </div>
               </div><br><br><br><br><br><br><br><br>
               <div class="news">
                   <div class="pic">
                       <img src="images/pic3.png" width="100%" height="150px"/>
                   </div>
                   <div class="content">
                      
                       "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ghj."
                   </div>
               </div><br><br><br><br><br><br><br><br>
               <div class="news">
                   <div class="pic">
                       <img src="images/pic4.jpg" width="100%" height="150px"/>
                   </div>
                   <div class="content">
                      
                       "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ghj."
                   </div>
               </div>
               </marquee>
           </div>