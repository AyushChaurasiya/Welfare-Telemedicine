<%-- 
    Document   : index
    Created on : 16 Jul, 2018, 9:48:41 AM
    Author     : lenovo
--%>

<%@page import="mypack.CaptchaGenerator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/generalstyle.css"/>
        <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    
     <script src="js/sslider.js"></script> 
                   
    <!-- Insert to your webpage before the </head> -->
    
    <link rel="stylesheet" type="text/css" href="css/generalstyle.css"/>
   <style>
        #main
        {
            
            font-family: sans-serif;
        }
        .box
        {
            transform: translate(40%,5%);
            width: 600px;
            height: 1270px;
            margin-top: 5px;
            padding:10px 40px 0px 40px;
            background-color: black;
            opacity: .8;
            box-sizing: border-box;
            box-shadow: 0 15px 25px rgba(0,0,0,.5);
            border-radius: 10px;
        }
        .box span
        {
            margin: 0 0 20px;
            padding: 0;
            color:#fff;
            text-align: center;
            font-size: 27px;
            font-weight: bold;
            
        }
        .box .inputbox
        {
          position: relative;  
        }
        .all
        {
           width:100%;
           padding: 5px 0;
           font-size: 20px;
           letter-spacing: 1px;
           color:#fff;
           border:none;
           margin-bottom: 40px;
           border-bottom:1px solid #fff;
           outline:none;
           background: transparent;  
        }
        .box .inputbox label
        {
            position: absolute;
            top:0px;
            left: 0;
            padding: 4px 0;
            font-size: 20px;
            color:#fff;
            pointer-events: none;
            transition: .5s;
        }
        .box .inputbox input:focus ~ label,
        .box .inputbox input:valid ~ label,
        .box .inputbox textArea:focus ~ label,
        .box .inputbox textArea:valid ~ label
        {
            top:-20px;
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
            margin-top: 12px;
            background:#03a9f4;
            padding: 14px 30px;
            cursor: pointer;
            border-radius: 5px;
            font-size: 20px;
        }
     .al
     {
         color:white;
         margin-left: -1px;
         font-size: 20px;
     }
     textArea
     {
         height: 20px;
     }
    </style>
    </head>
    <body onload="moveSlider()">
        
            <div id="wrapper" style="border-radius: 0 0 0 0;">
                <%@include file="generalmaster/head.jsp" %>
                <div id="container">
                    <%@include file="generalmaster/left.jsp" %>
                   
                     <div id="main" style="background-color: white;">
                        <div class="box">
                        //FORM FOR REGISTERATION
                            <form action="generalcode/registerationcode.jsp" method="post">
                                <center> <h1 style="color:white;">Register Here</h1>  </center><br>
                                
                                <div class="inputbox">
                                  <input class="all" type="text" name="patientname" required/>
                                  <label>Patient name</label>
                                </div>
                                
                                <div class="inputbox" style="color:white;font-size: 13px;">
                                  <input class="al" type="radio" name="gender" value="male" required/><span style="font-size:20px;">Male</span>
                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                  <input class="al" type="radio" name="gender" value="female" required/><span style="font-size:20px;">Female</span>
                                </div>
                                <br>
                         
                                <div class="inputbox" >
                                  <input class="all" type="text" name="fathername" required/>
                                  <label>Father name</label>
                                </div>
                        
                                <div class="inputbox">
                                 <textarea class="all" name="address1" style="resize:none;" required></textarea>
                                 <label>Address 1</label>
                                </div>
                        
                                <div class="inputbox">
                                  <textarea class="all" name="address2" required style="resize:none;"></textarea>
                                  <label>Address 2</label>
                                </div>
                        
                                <div class="inputbox">
                                 <input class="all" type="text" name="disease" required/>
                                 <label>Disease</label>
                                 </div>
                        
                                <div class="inputbox">
                                 <input class="all" type="text" name="referedby" required=""/>
                                 <label>Refered By</label>
                                </div>
                        
                                <div class="inputbox">
                                 <input class="all" type="text" name="hospitalname" required/>
                                 <label>Hospital name</label>
                                </div>
                        
                                <div class="inputbox">
                                 <input class="all" type="number" name="contactno" required/>
                                 <label>contactno</label>
                                </div>
                        
                                <div class="inputbox">
                                 <input class="all" type="email" name="emailaddress" required=""/>
                                 <label>Email</label>
                                </div>
                        
                                <div class="inputbox">
                                 <input class="all" type="number" name="adharno" required/>
                                 <label>adhar no</label>
                                </div>
                        
                                <div class="inputbox">
                                 <input class="all" type="password" name="password" required/>
                                 <label>Password</label>
                                </div>
                         
                                <div class="inputbox">
                                 <input class="all" type="password" name="cpassword" required/>
                                 <label>Confirm Password</label>
                                </div>
                         
                                <div class="inputbox">
                                 <p style="color:yellow;margin-top:-10px;font-size: 13px;">Captcha Code</p>
                                 <%
                                            CaptchaGenerator cg=new CaptchaGenerator();
                                            String capcode=cg.getCode();
                                 %>
                                           
                                 <input style="color:orange;margin-top:-100px;font-size: 13px;"  class="all" type="text" readonly value="<%=capcode%>"/>
                                 <input type="hidden" name="capcode" value="<%=capcode%>"/>
                                </div>
                        
                                <div class="inputbox">
                                 <input class="all" type="text" name="captchacode" required/>
                                 <label>Enter Captcha code</label>
                                </div>
                        
                                <center>  <input type="submit" value="Submit"/> </center>
                            </form>
                        </div>  
                    </div>
                </div>
                    <%@include file="generalmaster/foot.jsp"  %>    
            </div> 
    </body>
</html>
