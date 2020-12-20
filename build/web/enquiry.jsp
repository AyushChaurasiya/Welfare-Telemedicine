<%-- 
    Document   : index
    Created on : 16 Jul, 2018, 9:48:41 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
        <link rel="stylesheet" type="text/css" href="css/generalstyle.css"/>
        <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    
     <script src="js/sslider.js"></script> 
                   
    <!-- Insert to your webpage before the </head> -->
    
    <link rel="stylesheet" type="text/css" href="css/generalstyle.css"/>
   <style>
        #main
        {
            margin: 0px;
            padding:0px;
            font-family: sans-serif;
        }
        .box
        {
            transform: translate(80%,5%);
            width: 400px;
            height: 40px;
            padding:40px 40px 500px 40px;
            background-color: black;
            opacity: .8;
            box-sizing: border-box;
            box-shadow: 0 15px 25px rgba(0,0,0,.5);
            border-radius: 10px;
        }
        .box h1
        {
            margin: 0 0 20px;
            padding: 0;
            color:#fff;
            text-align: center;
        }
        .box .inputbox
        {
          position: relative;  
        }
        .all
        {
           width:100%;
           padding: 10px 0;
           font-size: 16px;
           letter-spacing: 1px;
           color:#fff;
           border:none;
           margin-bottom: 30px;
           border-bottom:1px solid #fff;
           outline:none;
           background: transparent;  
        }
        .box .inputbox label
        {
            position: absolute;
            top:0px;
            left: 0;
            padding: 10px 0;
            font-size: 16px;
            color:#fff;
            pointer-events: none;
            transition: .5s;
        }
        .box .inputbox input:focus ~ label,
        .box .inputbox input:valid ~ label,
        .box .inputbox textArea:focus ~ label,
        .box .inputbox textArea:valid ~ label
        {
            top:-18px;
            left:0;
            color:#03a9f4;
            font-size: 12px;
        }
        .box input[type='submit']
        {
            background: transparent;
            border: none;
            outline: none;
            color:#fff;
            background:#03a9f4;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 5px;
        }
     .al
     {
         color:white;
         margin-left: -1px;
     }
    </style>
    </head>
    <body>
        
            <div id="wrapper" style="border-radius: 0 0 0 0;">
                <%@include file="generalmaster/head.jsp" %>
                <div id="container">
                    <%@include file="generalmaster/left.jsp" %>
                   
                          <div id="main" style="background-color: white;">
                              <center>     <h1>Enquiry Form</h1></center>
                        <div class="box">
                            <form action="generalcode/enquirycode.jsp" method="post">
                        <h1>Enquiry</h1>
                        <div class="inputbox">
                       <input class="all" type="text" name="name" required/>
                       <label>User Name</label>
                        </div>
                        <div class="inputbox" style="color:white;">
                            <input class="al" type="radio" name="gender" value="male" required/>Male
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input class="al" type="radio" name="gender" value="female" required/>Female
                        </div>
                        <br>
                        <div class="inputbox">
                       <input class="all" type="number" name="contactno" required/>
                       <label>Contact no</label>
                        </div>
                        <div class="inputbox">
                        <input class="all" type="email" name="email" required/>
                       <label>Email Address</label>
                        </div>
                        <div class="inputbox">
                       <textarea class="all" name="enquiry" required style="resize:none;"></textarea>
                       <label>Enquiry</label>
                        </div>
                        <center>  <input type="submit" value="Submit"/></center>
                         </form>
                            
                        </div>
                              <br>
                   <br><br><br><br><br><br>
             <div id="image" style="width: 99%;height: 300px;background-image: url(images/support.jpg);background-size: cover;margin: 0px auto;">
                <br><br>
                 <h1 style="color: white;text-align: center;font-family: sans-serif;font-weight: 100;opacity: .6;">Telemedicine ease of getting medical treatement</h1>
                 <br><br>
                 <center>
                 <button style="opacity: .7;" >Support Us</button>
                 </center>
             </div>
                </div>
                   
                </div>
                    <%@include file="generalmaster/foot.jsp"  %>    
            </div> 
       
    </body>
</html>
