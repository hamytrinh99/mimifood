<%-- 
    Document   : register
    Created on : Oct 17, 2019, 2:43:04 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <!-- Site Metas -->
        <title>MiMi - Vietnamese Cuisine</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Site Icons -->
        <link rel="shortcut icon" href="images/icon.png" type="image/x-icon">
        <link rel="apple-touch-icon" href="images/apple-touch-icon.png">

        <!-- LINEARICONS -->
        <link rel="stylesheet" href="fonts/linearicons/style.css">

        <!-- STYLE CSS -->
        <link rel="stylesheet" href="css/register.css">
        <style>
            body {
                background-image:  url("images/vn/bg9.jpg");
                background-size: cover;
                position: relative;
            }
        </style>
    </head>

    <body>
        <div class="wrapper">
            <div class="inner">
                
                <form action="">                 
                        <h3> <a href="index.jsp">Back to Home</a> </h3>
                    <h3>Login Form</h3>
                    <div class="form-holder">
                        <span class="lnr lnr-user"></span>
                        <input type="text" name="username" class="form-control" placeholder="Username" pattern="^[^0-9]+$" required>
                    </div>       
                    <div class="form-holder">
                        <span class="lnr lnr-lock"></span>
                        <input type="password" name="password" class="form-control" placeholder="Password"  required="">
                    </div>
                    <p>You do not have account. Please do <a href="register.jsp">register.</a></p><br>   
                    <button>
                        <span>Login</span>
                    </button>

                </form>
<!--                <img src="images/vn/bo.png" alt="" class="image-2">-->

            </div>
        </div>
        
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>