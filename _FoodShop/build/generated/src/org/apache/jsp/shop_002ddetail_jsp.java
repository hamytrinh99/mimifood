package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop_002ddetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<!-- Basic -->\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("    <!-- Mobile Metas -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Site Metas -->\n");
      out.write("        <title>MiMi - Vietnamese Cuisine</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <!-- Site Icons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/icon.png\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <!-- Site CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <!-- Responsive CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <!-- Start All Title Box -->\n");
      out.write("    <div class=\"all-title-box\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h2>Shop Detail</h2>\n");
      out.write("                    <ul class=\"breadcrumb\">\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"#\">Shop</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item active\">Shop Detail </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End All Title Box -->\n");
      out.write("\n");
      out.write("    <!-- Start Shop Detail  -->\n");
      out.write("    <div class=\"shop-detail-box-main\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xl-5 col-lg-5 col-md-6\">\n");
      out.write("                    <div id=\"carousel-example-1\" class=\"single-product-slider carousel slide\" data-ride=\"carousel\">\n");
      out.write("                        <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                            <div class=\"carousel-item active\"> <img class=\"d-block w-100\" src=\"images/big-img-01.jpg\" alt=\"First slide\"> </div>\n");
      out.write("                            <div class=\"carousel-item\"> <img class=\"d-block w-100\" src=\"images/big-img-02.jpg\" alt=\"Second slide\"> </div>\n");
      out.write("                            <div class=\"carousel-item\"> <img class=\"d-block w-100\" src=\"images/big-img-03.jpg\" alt=\"Third slide\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a class=\"carousel-control-prev\" href=\"#carousel-example-1\" role=\"button\" data-slide=\"prev\"> \n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-angle-left\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Previous</span> \n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("                        <a class=\"carousel-control-next\" href=\"#carousel-example-1\" role=\"button\" data-slide=\"next\"> \n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i> \n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Next</span> \n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("                        <ol class=\"carousel-indicators\">\n");
      out.write("                            <li data-target=\"#carousel-example-1\" data-slide-to=\"0\" class=\"active\">\n");
      out.write("                                <img class=\"d-block w-100 img-fluid\" src=\"images/smp-img-01.jpg\" alt=\"\" />\n");
      out.write("                            </li>\n");
      out.write("                            <li data-target=\"#carousel-example-1\" data-slide-to=\"1\">\n");
      out.write("                                <img class=\"d-block w-100 img-fluid\" src=\"images/smp-img-02.jpg\" alt=\"\" />\n");
      out.write("                            </li>\n");
      out.write("                            <li data-target=\"#carousel-example-1\" data-slide-to=\"2\">\n");
      out.write("                                <img class=\"d-block w-100 img-fluid\" src=\"images/smp-img-03.jpg\" alt=\"\" />\n");
      out.write("                            </li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-7 col-lg-7 col-md-6\">\n");
      out.write("                    <div class=\"single-product-details\">\n");
      out.write("                        <h2>Fachion Lorem ipsum dolor sit amet</h2>\n");
      out.write("                        <h5> <del>$ 60.00</del> $40.79</h5>\n");
      out.write("                        <p class=\"available-stock\"><span> More than 20 available / <a href=\"#\">8 sold </a></span><p>\n");
      out.write("\t\t\t\t\t\t<h4>Short Description:</h4>\n");
      out.write("\t\t\t\t\t\t<p>Nam sagittis a augue eget scelerisque. Nullam lacinia consectetur sagittis. Nam sed neque id eros fermentum dignissim quis at tortor. Nullam ultricies urna quis sem sagittis pharetra. Nam erat turpis, cursus in ipsum at,\n");
      out.write("\t\t\t\t\t\t\ttempor imperdiet metus. In interdum id nulla tristique accumsan. Ut semper in quam nec pretium. Donec egestas finibus suscipit. Curabitur tincidunt convallis arcu. </p>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group quantity-box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">Quantity</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control\" value=\"0\" min=\"0\" max=\"20\" type=\"number\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"price-box-bar\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cart-and-bay-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" data-fancybox-close=\"\" href=\"#\">Buy New</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" data-fancybox-close=\"\" href=\"#\">Add to cart</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"add-to-btn\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"add-comp\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" href=\"#\"><i class=\"fas fa-heart\"></i> Add to wishlist</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" href=\"#\"><i class=\"fas fa-sync-alt\"></i> Add to Compare</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"share-bar\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" href=\"#\"><i class=\"fab fa-facebook\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" href=\"#\"><i class=\"fab fa-google-plus\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" href=\"#\"><i class=\"fab fa-twitter\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" href=\"#\"><i class=\"fab fa-pinterest-p\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" href=\"#\"><i class=\"fab fa-whatsapp\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"row my-5\">\n");
      out.write("\t\t\t\t<div class=\"card card-outline-secondary my-4\">\n");
      out.write("\t\t\t\t\t<div class=\"card-header\">\n");
      out.write("\t\t\t\t\t\t<h2>Product Reviews</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"media mb-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mr-2\"> \n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"rounded-circle border p-1\" src=\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2264%22%20height%3D%2264%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2064%2064%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_160c142c97c%20text%20%7B%20fill%3Argba(255%2C255%2C255%2C.75)%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A10pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_160c142c97c%22%3E%3Crect%20width%3D%2264%22%20height%3D%2264%22%20fill%3D%22%23777%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2213.5546875%22%20y%3D%2236.5%22%3E64x64%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E\" alt=\"Generic placeholder image\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"media-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>\n");
      out.write("\t\t\t\t\t\t\t\t<small class=\"text-muted\">Posted by Anonymous on 3/1/18</small>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t<div class=\"media mb-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mr-2\"> \n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"rounded-circle border p-1\" src=\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2264%22%20height%3D%2264%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2064%2064%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_160c142c97c%20text%20%7B%20fill%3Argba(255%2C255%2C255%2C.75)%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A10pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_160c142c97c%22%3E%3Crect%20width%3D%2264%22%20height%3D%2264%22%20fill%3D%22%23777%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2213.5546875%22%20y%3D%2236.5%22%3E64x64%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E\" alt=\"Generic placeholder image\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"media-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>\n");
      out.write("\t\t\t\t\t\t\t\t<small class=\"text-muted\">Posted by Anonymous on 3/1/18</small>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t<div class=\"media mb-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mr-2\"> \n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"rounded-circle border p-1\" src=\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2264%22%20height%3D%2264%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2064%2064%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_160c142c97c%20text%20%7B%20fill%3Argba(255%2C255%2C255%2C.75)%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A10pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_160c142c97c%22%3E%3Crect%20width%3D%2264%22%20height%3D%2264%22%20fill%3D%22%23777%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2213.5546875%22%20y%3D%2236.5%22%3E64x64%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E\" alt=\"Generic placeholder image\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"media-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>\n");
      out.write("\t\t\t\t\t\t\t\t<small class=\"text-muted\">Posted by Anonymous on 3/1/18</small>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"btn hvr-hover\">Leave a Review</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("            <div class=\"row my-5\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"title-all text-center\">\n");
      out.write("                        <h1>Featured Products</h1>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sit amet lacus enim.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"featured-products-box owl-carousel owl-theme\">\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <div class=\"products-single fix\">\n");
      out.write("                                <div class=\"box-img-hover\">\n");
      out.write("                                    <img src=\"images/img-pro-01.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                    <div class=\"mask-icon\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"why-text\">\n");
      out.write("                                    <h4>Lorem ipsum dolor sit amet</h4>\n");
      out.write("                                    <h5> $9.79</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <div class=\"products-single fix\">\n");
      out.write("                                <div class=\"box-img-hover\">\n");
      out.write("                                    <img src=\"images/img-pro-02.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                    <div class=\"mask-icon\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"why-text\">\n");
      out.write("                                    <h4>Lorem ipsum dolor sit amet</h4>\n");
      out.write("                                    <h5> $9.79</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <div class=\"products-single fix\">\n");
      out.write("                                <div class=\"box-img-hover\">\n");
      out.write("                                    <img src=\"images/img-pro-03.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                    <div class=\"mask-icon\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"why-text\">\n");
      out.write("                                    <h4>Lorem ipsum dolor sit amet</h4>\n");
      out.write("                                    <h5> $9.79</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <div class=\"products-single fix\">\n");
      out.write("                                <div class=\"box-img-hover\">\n");
      out.write("                                    <img src=\"images/img-pro-04.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                    <div class=\"mask-icon\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"why-text\">\n");
      out.write("                                    <h4>Lorem ipsum dolor sit amet</h4>\n");
      out.write("                                    <h5> $9.79</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <div class=\"products-single fix\">\n");
      out.write("                                <div class=\"box-img-hover\">\n");
      out.write("                                    <img src=\"images/img-pro-01.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                    <div class=\"mask-icon\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"why-text\">\n");
      out.write("                                    <h4>Lorem ipsum dolor sit amet</h4>\n");
      out.write("                                    <h5> $9.79</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <div class=\"products-single fix\">\n");
      out.write("                                <div class=\"box-img-hover\">\n");
      out.write("                                    <img src=\"images/img-pro-02.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                    <div class=\"mask-icon\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"why-text\">\n");
      out.write("                                    <h4>Lorem ipsum dolor sit amet</h4>\n");
      out.write("                                    <h5> $9.79</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <div class=\"products-single fix\">\n");
      out.write("                                <div class=\"box-img-hover\">\n");
      out.write("                                    <img src=\"images/img-pro-03.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                    <div class=\"mask-icon\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"why-text\">\n");
      out.write("                                    <h4>Lorem ipsum dolor sit amet</h4>\n");
      out.write("                                    <h5> $9.79</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <div class=\"products-single fix\">\n");
      out.write("                                <div class=\"box-img-hover\">\n");
      out.write("                                    <img src=\"images/img-pro-04.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                    <div class=\"mask-icon\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"why-text\">\n");
      out.write("                                    <h4>Lorem ipsum dolor sit amet</h4>\n");
      out.write("                                    <h5> $9.79</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Cart -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\">&uarr;</a>\n");
      out.write("\n");
      out.write("    <!-- ALL JS FILES -->\n");
      out.write("    <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- ALL PLUGINS -->\n");
      out.write("    <script src=\"js/jquery.superslides.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap-select.js\"></script>\n");
      out.write("    <script src=\"js/inewsticker.js\"></script>\n");
      out.write("    <script src=\"js/bootsnav.js.\"></script>\n");
      out.write("    <script src=\"js/images-loded.min.js\"></script>\n");
      out.write("    <script src=\"js/isotope.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/baguetteBox.min.js\"></script>\n");
      out.write("    <script src=\"js/form-validator.min.js\"></script>\n");
      out.write("    <script src=\"js/contact-form-script.js\"></script>\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}