package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <!-- Start All Title Box -->\n");
      out.write("        <div class=\"all-title-box\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h2>Checkout</h2>\n");
      out.write("                        <ul class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"#\">Shop</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\">Checkout</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End All Title Box -->\n");
      out.write("\n");
      out.write("        <!-- Start Cart  -->\n");
      out.write("        <div class=\"cart-box-main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row new-account-login\">\n");
      out.write("                    <div class=\"col-sm-6 col-lg-6 mb-3\">\n");
      out.write("                        <div class=\"title-left\">\n");
      out.write("                            <h3>Account Login</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <h5><a data-toggle=\"collapse\" href=\"#formLogin\" role=\"button\" aria-expanded=\"false\">Click here to Login</a></h5>\n");
      out.write("                        <form class=\"mt-3 collapse review-form-box\" id=\"formLogin\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"InputEmail\" class=\"mb-0\">Email Address</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"InputEmail\" placeholder=\"Enter Email\"> </div>\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"InputPassword\" class=\"mb-0\">Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"InputPassword\" placeholder=\"Password\"> </div>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn hvr-hover\">Login</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 col-lg-6 mb-3\">\n");
      out.write("                        <div class=\"title-left\">\n");
      out.write("                            <h3>Create New Account</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <h5><a data-toggle=\"collapse\" href=\"#formRegister\" role=\"button\" aria-expanded=\"false\">Click here to Register</a></h5>\n");
      out.write("                        <form class=\"mt-3 collapse review-form-box\" id=\"formRegister\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"InputName\" class=\"mb-0\">First Name</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"InputName\" placeholder=\"First Name\"> </div>\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"InputLastname\" class=\"mb-0\">Last Name</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"InputLastname\" placeholder=\"Last Name\"> </div>\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"InputEmail1\" class=\"mb-0\">Email Address</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"InputEmail1\" placeholder=\"Enter Email\"> </div>\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"InputPassword1\" class=\"mb-0\">Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"InputPassword1\" placeholder=\"Password\"> </div>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn hvr-hover\">Register</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6 col-lg-6 mb-3\">\n");
      out.write("                        <div class=\"checkout-address\">\n");
      out.write("                            <div class=\"title-left\">\n");
      out.write("                                <h3>Billing address</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <form class=\"needs-validation\" novalidate>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6 mb-3\">\n");
      out.write("                                        <label for=\"firstName\">First name *</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"firstName\" placeholder=\"\" value=\"\" required>\n");
      out.write("                                        <div class=\"invalid-feedback\"> Valid first name is required. </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6 mb-3\">\n");
      out.write("                                        <label for=\"lastName\">Last name *</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"lastName\" placeholder=\"\" value=\"\" required>\n");
      out.write("                                        <div class=\"invalid-feedback\"> Valid last name is required. </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"username\">Username *</label>\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"username\" placeholder=\"\" required>\n");
      out.write("                                        <div class=\"invalid-feedback\" style=\"width: 100%;\"> Your username is required. </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"email\">Email Address *</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"\">\n");
      out.write("                                    <div class=\"invalid-feedback\"> Please enter a valid email address for shipping updates. </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"address\">Address *</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"\" required>\n");
      out.write("                                    <div class=\"invalid-feedback\"> Please enter your shipping address. </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"address2\">Address 2 *</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"address2\" placeholder=\"\"> </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-5 mb-3\">\n");
      out.write("                                        <label for=\"country\">Country *</label>\n");
      out.write("                                        <select class=\"wide w-100\" id=\"country\">\n");
      out.write("                                            <option value=\"Choose...\" data-display=\"Select\">Choose...</option>\n");
      out.write("                                            <option value=\"United States\">United States</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <div class=\"invalid-feedback\"> Please select a valid country. </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-4 mb-3\">\n");
      out.write("                                        <label for=\"state\">State *</label>\n");
      out.write("                                        <select class=\"wide w-100\" id=\"state\">\n");
      out.write("                                            <option data-display=\"Select\">Choose...</option>\n");
      out.write("                                            <option>California</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <div class=\"invalid-feedback\"> Please provide a valid state. </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-3 mb-3\">\n");
      out.write("                                        <label for=\"zip\">Zip *</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"zip\" placeholder=\"\" required>\n");
      out.write("                                        <div class=\"invalid-feedback\"> Zip code required. </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"mb-4\">\n");
      out.write("                                <div class=\"custom-control custom-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"same-address\">\n");
      out.write("                                    <label class=\"custom-control-label\" for=\"same-address\">Shipping address is the same as my billing address</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"custom-control custom-checkbox\">\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"save-info\">\n");
      out.write("                                    <label class=\"custom-control-label\" for=\"save-info\">Save this information for next time</label>\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"mb-4\">\n");
      out.write("                                <div class=\"title\"> <span>Payment</span> </div>\n");
      out.write("                                <div class=\"d-block my-3\">\n");
      out.write("                                    <div class=\"custom-control custom-radio\">\n");
      out.write("                                        <input id=\"credit\" name=\"paymentMethod\" type=\"radio\" class=\"custom-control-input\" checked required>\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"credit\">Credit card</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"custom-control custom-radio\">\n");
      out.write("                                        <input id=\"debit\" name=\"paymentMethod\" type=\"radio\" class=\"custom-control-input\" required>\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"debit\">Debit card</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"custom-control custom-radio\">\n");
      out.write("                                        <input id=\"paypal\" name=\"paymentMethod\" type=\"radio\" class=\"custom-control-input\" required>\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"paypal\">Paypal</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6 mb-3\">\n");
      out.write("                                        <label for=\"cc-name\">Name on card</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"cc-name\" placeholder=\"\" required> <small class=\"text-muted\">Full name as displayed on card</small>\n");
      out.write("                                        <div class=\"invalid-feedback\"> Name on card is required </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6 mb-3\">\n");
      out.write("                                        <label for=\"cc-number\">Credit card number</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"cc-number\" placeholder=\"\" required>\n");
      out.write("                                        <div class=\"invalid-feedback\"> Credit card number is required </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-3 mb-3\">\n");
      out.write("                                        <label for=\"cc-expiration\">Expiration</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"cc-expiration\" placeholder=\"\" required>\n");
      out.write("                                        <div class=\"invalid-feedback\"> Expiration date required </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-3 mb-3\">\n");
      out.write("                                        <label for=\"cc-expiration\">CVV</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"cc-cvv\" placeholder=\"\" required>\n");
      out.write("                                        <div class=\"invalid-feedback\"> Security code required </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6 mb-3\">\n");
      out.write("                                        <div class=\"payment-icon\">\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li><img class=\"img-fluid\" src=\"images/payment-icon/1.png\" alt=\"\"></li>\n");
      out.write("                                                <li><img class=\"img-fluid\" src=\"images/payment-icon/2.png\" alt=\"\"></li>\n");
      out.write("                                                <li><img class=\"img-fluid\" src=\"images/payment-icon/3.png\" alt=\"\"></li>\n");
      out.write("                                                <li><img class=\"img-fluid\" src=\"images/payment-icon/5.png\" alt=\"\"></li>\n");
      out.write("                                                <li><img class=\"img-fluid\" src=\"images/payment-icon/7.png\" alt=\"\"></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"mb-1\"> </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 col-lg-6 mb-3\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12 col-lg-12\">\n");
      out.write("                                <div class=\"shipping-method-box\">\n");
      out.write("                                    <div class=\"title-left\">\n");
      out.write("                                        <h3>Shipping Method</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mb-4\">\n");
      out.write("                                        <div class=\"custom-control custom-radio\">\n");
      out.write("                                            <input id=\"shippingOption1\" name=\"shipping-option\" class=\"custom-control-input\" checked=\"checked\" type=\"radio\">\n");
      out.write("                                            <label class=\"custom-control-label\" for=\"shippingOption1\">Standard Delivery</label> <span class=\"float-right font-weight-bold\">FREE</span> </div>\n");
      out.write("                                        <div class=\"ml-4 mb-2 small\">(3-7 business days)</div>\n");
      out.write("                                        <div class=\"custom-control custom-radio\">\n");
      out.write("                                            <input id=\"shippingOption2\" name=\"shipping-option\" class=\"custom-control-input\" type=\"radio\">\n");
      out.write("                                            <label class=\"custom-control-label\" for=\"shippingOption2\">Express Delivery</label> <span class=\"float-right font-weight-bold\">$10.00</span> </div>\n");
      out.write("                                        <div class=\"ml-4 mb-2 small\">(2-4 business days)</div>\n");
      out.write("                                        <div class=\"custom-control custom-radio\">\n");
      out.write("                                            <input id=\"shippingOption3\" name=\"shipping-option\" class=\"custom-control-input\" type=\"radio\">\n");
      out.write("                                            <label class=\"custom-control-label\" for=\"shippingOption3\">Next Business day</label> <span class=\"float-right font-weight-bold\">$20.00</span> </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-12 col-lg-12\">\n");
      out.write("                                <div class=\"odr-box\">\n");
      out.write("                                    <div class=\"title-left\">\n");
      out.write("                                        <h3>Shopping cart</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"rounded p-2 bg-light\">\n");
      out.write("                                        <div class=\"media mb-2 border-bottom\">\n");
      out.write("                                            <div class=\"media-body\"> <a href=\"detail.jsp\"> Lorem ipsum dolor sit amet</a>\n");
      out.write("                                                <div class=\"small text-muted\">Price: $80.00 <span class=\"mx-2\">|</span> Qty: 1 <span class=\"mx-2\">|</span> Subtotal: $80.00</div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"media mb-2 border-bottom\">\n");
      out.write("                                            <div class=\"media-body\"> <a href=\"detail.jsp\"> Lorem ipsum dolor sit amet</a>\n");
      out.write("                                                <div class=\"small text-muted\">Price: $60.00 <span class=\"mx-2\">|</span> Qty: 1 <span class=\"mx-2\">|</span> Subtotal: $60.00</div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"media mb-2\">\n");
      out.write("                                            <div class=\"media-body\"> <a href=\"detail.jsp\"> Lorem ipsum dolor sit amet</a>\n");
      out.write("                                                <div class=\"small text-muted\">Price: $40.00 <span class=\"mx-2\">|</span> Qty: 1 <span class=\"mx-2\">|</span> Subtotal: $40.00</div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-12 col-lg-12\">\n");
      out.write("                                <div class=\"order-box\">\n");
      out.write("                                    <div class=\"title-left\">\n");
      out.write("                                        <h3>Your order</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex\">\n");
      out.write("                                        <div class=\"font-weight-bold\">Product</div>\n");
      out.write("                                        <div class=\"ml-auto font-weight-bold\">Total</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr class=\"my-1\">\n");
      out.write("                                    <div class=\"d-flex\">\n");
      out.write("                                        <h4>Sub Total</h4>\n");
      out.write("                                        <div class=\"ml-auto font-weight-bold\"> $ 440 </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex\">\n");
      out.write("                                        <h4>Discount</h4>\n");
      out.write("                                        <div class=\"ml-auto font-weight-bold\"> $ 40 </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr class=\"my-1\">\n");
      out.write("                                    <div class=\"d-flex\">\n");
      out.write("                                        <h4>Coupon Discount</h4>\n");
      out.write("                                        <div class=\"ml-auto font-weight-bold\"> $ 10 </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex\">\n");
      out.write("                                        <h4>Tax</h4>\n");
      out.write("                                        <div class=\"ml-auto font-weight-bold\"> $ 2 </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex\">\n");
      out.write("                                        <h4>Shipping Cost</h4>\n");
      out.write("                                        <div class=\"ml-auto font-weight-bold\"> Free </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("                                    <div class=\"d-flex gr-total\">\n");
      out.write("                                        <h5>Grand Total</h5>\n");
      out.write("                                        <div class=\"ml-auto h5\"> $ 388 </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr> </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12 d-flex shopping-box\"> <a href=\"checkout.jsp\" class=\"ml-auto btn hvr-hover\">Place Order</a> </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Cart -->\n");
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