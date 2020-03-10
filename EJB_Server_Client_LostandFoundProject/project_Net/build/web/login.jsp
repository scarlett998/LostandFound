<%-- 
    Document   : newjsp
    Created on : 2018-12-14, 15:07:05
    Author     : scarlett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="loginServlet" method="GET" >
          

            Please Enter your name and ID number<br><br>
            <b> Name: <input type="text" name="username"value="username"/></b><br><br>
            <b>Password:  <input type="password" name="password"/> </b><br><br>

           <br><button type="submit" name="button" value="login">login</button> 
        </form>
         <%
           if (null != request.getAttribute("errorMessage")) {
               out.println(request.getAttribute("errorMessage"));
           } 
        %>
        
        
        
    </body>
</html>
