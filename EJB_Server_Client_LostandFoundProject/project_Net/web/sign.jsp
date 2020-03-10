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
        <title>Sign Page</title>
    </head>
    <body>
        <form action="signServlet" method="GET">
          

            sign：Pleajjjjse Enter your name and ID number<br><br>
            <b> Name: <input type="text" name="username"value="username"/></b><br><br>
            <b>Password:  <input type="password" name="password"/> </b><br><br>
             <b>Email:  <input type="text" name="email"/> </b><br><br>
           <br><button type="submit" name="button4" value="sign">sign</button> 
          
        </form>
         <%
           if (null != request.getAttribute("errorMessage")) {
               out.println(request.getAttribute("errorMessage"));
           } 
        %>
        <%
String username=request.getParameter("username");
session.setAttribute("username", username);
String password=request.getParameter("password");
session.setAttribute("password", password);

%>
        
    </body>
</html>
