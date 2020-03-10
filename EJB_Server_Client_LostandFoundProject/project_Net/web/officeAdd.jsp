<%-- 
    Document   : officeAdd
    Created on : 2019-1-8, 14:51:21
    Author     : suxia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <form action="officeServlet" method="Post">
         *stuff_ID: <input type="text" name="item_ID" value="" size="40"/><br>
           name: <input type="text" name="name" value="" size="40"/><br>
           color: <input type="text" name="color" value="" size="40"/><br>
           brand: <input type="text" name="brand" value="" size="40"/><br>
           pattern: <input type="text" name="pattern" value="" size="40"/><br>
           length(cm): <input type="text" name="length" value="" size="40"/><br>
           width(cm): <input type="text" name="width" value="" size="40"/><br>
           address: <input type="text" name="address" value="" size="40"/><br>
           date(yyyy.mm.dd): <input type="text" name="date" value="" size="40"/><br>
           description(64 character):<input type="text" name="description" value="" size="40"/><br>
            <button type="submit" name="button" value="add">add</button>
            <button type="submit" name="button" value="remove">remove</button>
            
          </form>
    </body>
</html>
