

<%-- 
    Document   : newjsp2
    Created on : 2019-1-13, 1:53:56
    Author     : scarlett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>page</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        * {
            box-sizing: border-box;
        }

        /* body ?? */
        body {
            font-family: Arial;
            margin: 0;
        }

        /* ?? */
        .header {
            padding: 80px;
            text-align: center;
            background: #1abc9c;
            color: white;
        }

        /* ?????? */
        .header h1 {
            font-size: 40px;
        }

        /* ?? */
        .navbar {
            overflow: hidden;
            background-color: #333;
        }

        /* ????? */
        .navbar a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
        }

        /* ????*/
        .navbar a.right {
            float: right;
        }

        /* ?????????? */
        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }

        /* ??? */
        .row {
            display: -ms-flexbox; /* IE10 */
            display: flex;
            -ms-flex-wrap: wrap; /* IE10 */
            flex-wrap: wrap;
        }

        /* ????? */
        /* ?? */
        .side {
            -ms-flex: 30%; /* IE10 */
            flex: 30%;
            background-color: #f1f1f1;
            padding: 20px;
        }

        /* ??????? */
        .main {
            -ms-flex: 70%; /* IE10 */
            flex: 70%;
            background-color: white;
            padding: 20px;
        }

        /* ???? */
        .fakeimg {
            background-color: #aaa;
            width: 100%;
            padding: 20px;
        }

        /* ?? */
        .footer {
            padding: 20px;
            text-align: center;
            background: #ddd;
        }

        /* ????? - ??????????? 700px ?, ????????? */
        @media screen and (max-width: 700px) {
            .row {
                flex-direction: column;
            }
        }

        /* ????? - ??????????? 400px ?, ??????????? */
        @media screen and (max-width: 400px) {
            .navbar a {
                float: none;
                width: 100%;
            }
        }
    </style>
</head>
<body>

<div class="header">
    <h1>Lost and Found department </h1>
    <p>Thank you for visiting our page, we will do our best to providing you great services!</p >
</div>

<div class="navbar">
   <a href="https://www.hkr.se/">hkr</a>
<!--    < a href="/login.jsp">login</ a>-->
<a href="/project_Net/login.jsp"
target="_top">Login！</a>
    <a href="/project_Net/sign.jsp">Sign!</a>
    <a href="mailto:suxiao20152015@gmail.com">Contact us!</a>
</div>



<div class="footer">
     <marquee><p>Thank you so much for vistiting us, if you would like to leave any feedback for improvements,please come and contact us</p ></marquee>
</div>

</body>
</html>