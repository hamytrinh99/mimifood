package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!-- Basic -->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("        <!-- Mobile Metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- Site Metas -->\n");
      out.write("        <title>MiMi - Vietnamese Cuisine</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <!-- Site Icons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/icon.png\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <!-- Site CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- Responsive CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("   \n");
      out.write("   <body>\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Start Slider -->\n");
      out.write("        <div id=\"slides-shop\" class=\"cover-slides\">\n");
      out.write("            <ul class=\"slides-container\">\n");
      out.write("                <li class=\"text-center\">\n");
      out.write("                    <img src=\"images/vn/bg7.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h1 class=\"m-b-20\"><strong>Welcome To <br> VIETNAMESE CUISINE</strong></h1>\n");
      out.write("                                <p class=\"m-b-40\">One of the most effective ways to discover a culture is to start with its cuisine. <br> My restaurant will help customers explore Vietnamese Food. <br> The nation with thousand years of history promises plenty of unique and interesting things on the dining table. </p>\n");
      out.write("                                <p><a class=\"btn hvr-hover\" href=\"#\">Let's go</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"text-center\">\n");
      out.write("                    <img src=\"images/vn/bg3.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h1 class=\"m-b-20\"><strong>Welcome To <br> VIETNAMESE CUISINE</strong></h1>\n");
      out.write("                                <p class=\"m-b-40\">One of the most effective ways to discover a culture is to start with its cuisine. <br> My restaurant will help customers explore Vietnamese Food. <br> The nation with thousand years of history promises plenty of unique and interesting things on the dining table. </p>\n");
      out.write("                                <p><a class=\"btn hvr-hover\" href=\"#\">Let's go</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"text-center\">\n");
      out.write("                    <img src=\"images/vn/bg6.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h1 class=\"m-b-20\"><strong>Welcome To <br> VIETNAMESE CUISINE</strong></h1>\n");
      out.write("                                <p class=\"m-b-40\">One of the most effective ways to discover a culture is to start with its cuisine. <br> My restaurant will help customers explore Vietnamese Food. <br> The nation with thousand years of history promises plenty of unique and interesting things on the dining table. </p>\n");
      out.write("                                <p><a class=\"btn hvr-hover\" href=\"#\">Let's go</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"slides-navigation\">\n");
      out.write("                <a href=\"#\" class=\"next\"><i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i></a>\n");
      out.write("                <a href=\"#\" class=\"prev\"><i class=\"fa fa-angle-left\" aria-hidden=\"true\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Slider -->\n");
      out.write("\n");
      out.write("        <!-- Start Categories  -->\n");
      out.write("        <div class=\"categories-shop\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"shop-cat-box\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"images/vn/banhchung.jpg\" alt=\"\" />\n");
      out.write("                            <a class=\"btn hvr-hover\" href=\"#\">Banh Chung</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"shop-cat-box\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"images/vn/phobo.jpg\" alt=\"\" />\n");
      out.write("                            <a class=\"btn hvr-hover\" href=\"#\">Pho Bo</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"shop-cat-box\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"images/vn/bun ca.jpg\" alt=\"\" />\n");
      out.write("                            <a class=\"btn hvr-hover\" href=\"#\">Bun Ca</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Categories -->\n");
      out.write("\n");
      out.write("        <div class=\"box-add-products\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("                        <div class=\"offer-box-products\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"images/voucher1.png\" alt=\"\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("                        <div class=\"offer-box-products\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"images/voucher2.png\" alt=\"\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Start Products  -->\n");
      out.write("        <div class=\"products-box\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"title-all text-center\">\n");
      out.write("                            <h1>Vietnamese Food of Mimi Restaurant</h1>\n");
      out.write("                            <p>Culinary culture is naturally formed from the process of living. To Vietnamese, not only does it bring flavors like others, but also conveys traditions and cultural values..</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"special-menu text-center\">\n");
      out.write("                            <div class=\"button-group filter-button-group\">\n");
      out.write("                                <button class=\"active\" data-filter=\"*\">All</button>\n");
      out.write("                                <button data-filter=\".top-featured\">Top featured</button>\n");
      out.write("                                <button data-filter=\".best-seller\">Best seller</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row special-list\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid best-seller\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">\n");
      out.write("                                <div class=\"type-lb\">\n");
      out.write("                                    <p class=\"sale\">Sale</p>\n");
      out.write("                                </div>\n");
      out.write("                                <img src=\"images/vn/buncha.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>                                    \n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"why-text\">\n");
      out.write("                                <h4>Bun Cha Obama</h4>\n");
      out.write("                                <h5> $7.79</h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid top-featured\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">\n");
      out.write("                                <div class=\"type-lb\">\n");
      out.write("                                    <p class=\"new\">New</p>\n");
      out.write("                                </div>\n");
      out.write("                                <img src=\"images/snack/snackcua.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                       \n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"why-text\">\n");
      out.write("                                <h4>Snack Bim Bim Cua</h4>\n");
      out.write("                                <h5> $9.79</h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid top-featured\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">\n");
      out.write("                                <div class=\"type-lb\">\n");
      out.write("                                    <p class=\"sale\">Sale</p>\n");
      out.write("                                </div>\n");
      out.write("                                <img src=\"images/vn/chacalavong.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                      \n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"why-text\">\n");
      out.write("                                <h4>Cha Ca La Vong</h4>\n");
      out.write("                                <h5> $10.79</h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid best-seller\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">\n");
      out.write("                                <div class=\"type-lb\">\n");
      out.write("                                    <p class=\"sale\">Sale</p>\n");
      out.write("                                </div>\n");
      out.write("                                <img src=\"images/vn/miquangechdanang.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"why-text\">\n");
      out.write("                                <h4>Mi Quang Ech Da Nang</h4>\n");
      out.write("                                <h5> $15.79</h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Products  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- ALL JS FILES -->\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- ALL PLUGINS -->\n");
      out.write("        <script src=\"js/jquery.superslides.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-select.js\"></script>\n");
      out.write("        <script src=\"js/inewsticker.js\"></script>\n");
      out.write("        <script src=\"js/bootsnav.js.\"></script>\n");
      out.write("        <script src=\"js/images-loded.min.js\"></script>\n");
      out.write("        <script src=\"js/isotope.min.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/baguetteBox.min.js\"></script>\n");
      out.write("        <script src=\"js/form-validator.min.js\"></script>\n");
      out.write("        <script src=\"js/contact-form-script.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("    </body>\n");
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
