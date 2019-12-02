<%-- 
    Document   : header
    Created on : Dec 2, 2019, 11:30:43 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Site Metas -->
        <title>MiMi - Vietnamese Cuisine</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Site Icons -->
        <link rel="shortcut icon" href="images/icon.png" type="image/x-icon">
        <link rel="apple-touch-icon" href="images/apple-touch-icon.png">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Site CSS -->
        <link rel="stylesheet" href="css/style.css">
        <!-- Responsive CSS -->
        <link rel="stylesheet" href="css/responsive.css">
        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/custom.css">

        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>
        <!-- Start Main Top -->
        <div class="main-top">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                        
                        <div class="right-phone-box">
                            <p>Hotline : <a href="#"> +84 384 631 607</a></p>
                        </div>
                        <div class="our-link">
                            <ul>
                                <li><a href="my-account.jsp"><i class="fa fa-user s_color"></i> My Account</a></li>
                                <li><a href="#"><i class="fas fa-location-arrow"></i> Our location</a></li>
                                <li><a href="#"><i class="fas fa-headset"></i> Contact Us</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                        <div class="login-box">
                            <select id="basic" class="selectpicker show-tick form-control" data-placeholder="Sign In">
                                <option>Register Here</option>
                                <option>Sign In</option>
                            </select>
                        </div>
                        <div class="text-slid-box">
                            <div id="offer-box">
                                <ul class="offer-box">
                                    <li>
                                        <i class="fab fa-opencart"></i> 20% off Entire Purchase Promo code: PRJ321
                                    </li>
                                    <li>
                                        <i class="fab fa-opencart"></i> 50% - 80% off on Pho Bo
                                    </li>
                                    <li>
                                        <i class="fab fa-opencart"></i> Off 10%! code: PRJ321
                                    </li>
                                    <li>
                                        <i class="fab fa-opencart"></i> Off 50%! code: PASS
                                    </li>
                                    <li>
                                        <i class="fab fa-opencart"></i> Off 10%! code: HaMy
                                    </li>
                                    <li>
                                        <i class="fab fa-opencart"></i> 50% - 80% off on Snack! code: HaMyTrinh
                                    </li>
                                    <li>
                                        <i class="fab fa-opencart"></i> 20% off Entire Purchase Promo code: hamy
                                    </li>
                                    <li>
                                        <i class="fab fa-opencart"></i> Off 50%! Order MiMi now!
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Main Top -->

        <!-- Start Main Top -->
        <header class="main-header">
            <!-- Start Navigation -->
            <nav class="navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav">
                <div class="container">
                    <!-- Start Header Navigation -->
                    <div class="navbar-header">
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-menu" aria-controls="navbars-rs-food" aria-expanded="false" aria-label="Toggle navigation">
                            <i class="fa fa-bars"></i>
                        </button>
                        <a class="navbar-brand" href="index.jsp"><img src="images/logo.png" class="logo" alt=""></a>
                    </div>
                    <!-- End Header Navigation -->

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="navbar-menu">
                        <ul class="nav navbar-nav ml-auto" data-in="fadeInDown" data-out="fadeOutUp">
                            <li class="nav-item active"><a class="nav-link" href="index.jsp">Home</a></li>
                            <li class="nav-item"><a class="nav-link" href="about.jsp">About Us</a></li>
                            <li class="dropdown">
                                <a href="#" class="nav-link dropdown-toggle arrow" data-toggle="dropdown">SHOP</a>
                                <ul class="dropdown-menu">
                                    <li><a href="shop.jsp">All Foods</a></li>
                                    <li><a href="shop-detail.jsp">Food Detail</a></li>
                                    <li><a href="cart.jsp">My Cart</a></li>
                                    <li><a href="checkout.jsp">Checkout</a></li>
                                    <li><a href="my-account.jsp">My Account</a></li>
                                     </ul>
                            </li>
                        
                        </ul>
                    </div>
                    <!-- /.navbar-collapse -->

                    <!-- Start Atribute Navigation -->
                    <div class="attr-nav">
                        <ul>
                            <li class="search"><a href="#"><i class="fa fa-search"></i></a></li>
                            <li class="side-menu">
                                <a href="cart.jsp">
                                    <i class="fa fa-shopping-bag"></i>
                                    <span class="badge">3</span>
                                    <p> My Cart </p>
                                </a>
                            </li>
                        </ul>
                    </div>
                    <!-- End Atribute Navigation -->
                </div>
               
                <!-- End Side Menu -->
            </nav>
            <!-- End Navigation -->
        </header>
        <!-- End Main Top -->

        <!-- Start Top Search -->
        <div class="top-search">
            <div class="container">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-search"></i></span>
                    <input type="text" class="form-control" placeholder="Search">
                    <span class="input-group-addon close-search"><i class="fa fa-times"></i></span>
                </div>
            </div>
        </div>
        <!-- End Top Search -->
    </body>
</html>
