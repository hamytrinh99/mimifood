package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Start All Title Box -->\n");
      out.write("        <div class=\"all-title-box\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h2>Services</h2>\n");
      out.write("                        <ul class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\">Services</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End All Title Box -->\n");
      out.write("\n");
      out.write("        <!-- Start Gallery  -->\n");
      out.write("        <div class=\"products-box\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"title-all text-center\">\n");
      out.write("                            <h1>Our Gallery</h1>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sit amet lacus enim.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"special-menu text-center\">\n");
      out.write("                            <div class=\"button-group filter-button-group\">\n");
      out.write("                                <button class=\"active\" data-filter=\"*\">All</button>\n");
      out.write("                                <button data-filter=\".bulbs\">Bulbs</button>\n");
      out.write("                                <button data-filter=\".fruits\">Fruits</button>\n");
      out.write("                                <button data-filter=\".podded-vegetables\">Podded vegetables</button>\n");
      out.write("                                <button data-filter=\".root-and-tuberous\">Root and tuberous</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row special-list\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid bulbs\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">\n");
      out.write("                                <div class=\"type-lb\">\n");
      out.write("                                    <p class=\"sale\">Sale</p>\n");
      out.write("                                </div>\n");
      out.write("                                <img src=\"images/gallery-img-01.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <a class=\"cart\" href=\"#\">Add to Cart</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid fruits\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">\n");
      out.write("                                <img src=\"images/gallery-img-02.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid bulbs\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">\n");
      out.write("                                <img src=\"images/gallery-img-03.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>                                \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid fruits\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">                            \n");
      out.write("                                <img src=\"images/gallery-img-04.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>                                \n");
      out.write("                                </div>\n");
      out.write("                            </div>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid bulbs\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">\n");
      out.write("                                <img src=\"images/gallery-img-05.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid fruits\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">                            \n");
      out.write("                                <img src=\"images/gallery-img-06.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid podded-vegetables\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">\n");
      out.write("                                <img src=\"images/gallery-img-07.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid root-and-tuberous\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">                            \n");
      out.write("                                <img src=\"images/gallery-img-08.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid root-and-tuberous\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">                            \n");
      out.write("                                <img src=\"images/gallery-img-09.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid podded-vegetables\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">\n");
      out.write("                                <img src=\"images/gallery-img-10.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid root-and-tuberous\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">                           \n");
      out.write("                                <img src=\"images/gallery-img-11.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>                                \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 special-grid podded-vegetables\">\n");
      out.write("                        <div class=\"products-single fix\">\n");
      out.write("                            <div class=\"box-img-hover\">\n");
      out.write("                                <img src=\"images/gallery-img-12.jpg\" class=\"img-fluid\" alt=\"Image\">\n");
      out.write("                                <div class=\"mask-icon\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Compare\"><i class=\"fas fa-sync-alt\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Gallery  -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\">&uarr;</a>\n");
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
