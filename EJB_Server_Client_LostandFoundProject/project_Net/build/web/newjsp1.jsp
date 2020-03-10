<%-- 
    Document   : newjsp1
    Created on : 2019-1-5, 10:21:12
    Author     : scarlett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lost & Found</title>
    </head>
    <body>
         <form action="NewServlet1" method="GET">
          
        <div id="container" style="width:500px">
            <div id="header" style="background-color:#ccccff"> 
                <h1 style="margin-bottom: 0">Lost & Found</h1> </div>
                <div id="index" style="background-color: #66ccff;height:200px;width:100px;float:left;">
            <b>Index</b><br>
             <a href="http://www.hkr.se" target="_blank">go to HKR</a><br>
            CSS<br>
            JavaScript</div>
            <div id="content" style="background-color:#9999ff;height:200px;width:400px;float:left;">
               <h1>Sign up/ Login</h1>
                <br><button type="submit" name="button" value="login">login</button> 
                 <br><button type="submit" name="button2" value="sign">sign</button> 
        
  
            </div>
      
        <h2 style="font-family:arial;color:red;font-size:20px;">Welcome!</h2>
        <marquee><p>Thank you so much for vistiting us, if you would like to leave any feedback for improvements,please come and contact us</p></marquee>
        
        <p><a href="mailto:lindazhang16@126com">Contact us!</a></p>
        
             <img src="../../../Desktop/timg.jpg" alt=""/>
        


         
    </body>
    </form>
</html>
