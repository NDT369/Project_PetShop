package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Petshop</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Web Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Topbar Start -->\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row bg-secondary py-2 px-xl-5\">\n");
      out.write("                <div class=\"col-lg-6 d-none d-lg-block\">\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                        <a class=\"text-dark\" href=\"\">FAQs</a>\n");
      out.write("                        <span class=\"text-muted px-2\">|</span>\n");
      out.write("                        <a class=\"text-dark\" href=\"\">Help</a>\n");
      out.write("                        <span class=\"text-muted px-2\">|</span>\n");
      out.write("                        <a class=\"text-dark\" href=\"\">Support</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 text-center text-lg-right\">\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                        <a class=\"text-dark px-2\" href=\"\">\n");
      out.write("                            <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"text-dark px-2\" href=\"\">\n");
      out.write("                            <i class=\"fab fa-twitter\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"text-dark px-2\" href=\"\">\n");
      out.write("                            <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"text-dark px-2\" href=\"\">\n");
      out.write("                            <i class=\"fab fa-instagram\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"text-dark pl-2\" href=\"\">\n");
      out.write("                            <i class=\"fab fa-youtube\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row align-items-center py-3 px-xl-5\">\n");
      out.write("                <div class=\"col-lg-3 d-none d-lg-block\">\n");
      out.write("                    <a href=\"\" class=\"text-decoration-none\">\n");
      out.write("                        <h1 class=\"m-0 display-5 font-weight-semi-bold\"><span class=\"text-primary font-weight-bold border px-3 mr-1\">P</span>etshop</h1>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 col-6 text-left\">\n");
      out.write("                    <form action=\"\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search for products\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <span class=\"input-group-text bg-transparent text-primary\">\n");
      out.write("                                    <i class=\"fa fa-search\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-6 text-right\">\n");
      out.write("                    <a href=\"\" class=\"btn border\">\n");
      out.write("                        <i class=\"fas fa-heart text-primary\"></i>\n");
      out.write("                        <span class=\"badge\">0</span>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"\" class=\"btn border\">\n");
      out.write("                        <i class=\"fas fa-shopping-cart text-primary\"></i>\n");
      out.write("                        <span class=\"badge\">0</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Topbar End -->\n");
      out.write("\n");
      out.write("        <!-- Navbar Start -->\n");
      out.write("        <div class=\"container-fluid mb-5\">\n");
      out.write("            <div class=\"row border-top px-xl-5\">\n");
      out.write("                <div class=\"col-lg-3 d-none d-lg-block\">\n");
      out.write("                    <a class=\"btn shadow-none d-flex align-items-center justify-content-between bg-primary text-white w-100\" data-toggle=\"collapse\" href=\"#navbar-vertical\" style=\"height: 65px; margin-top: -1px; padding: 0 30px;\">\n");
      out.write("                        <h6 class=\"m-0\">Categories</h6>\n");
      out.write("                        <i class=\"fa fa-angle-down text-dark\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <nav class=\"collapse show navbar navbar-vertical navbar-light align-items-start p-0 border border-top-0 border-bottom-0\" id=\"navbar-vertical\">\n");
      out.write("                        <div class=\"navbar-nav w-100 overflow-hidden\" style=\"height: 410px\">\n");
      out.write("                            <!--                            <div class=\"nav-item dropdown\">\n");
      out.write("                                                            <a href=\"#\" class=\"nav-link\" data-toggle=\"dropdown\">Dresses <i class=\"fa fa-angle-down float-right mt-1\"></i></a>\n");
      out.write("                                                            <div class=\"dropdown-menu position-absolute bg-secondary border-0 rounded-0 w-100 m-0\">\n");
      out.write("                                                                <a href=\"\" class=\"dropdown-item\">Men's Dresses</a>\n");
      out.write("                                                                <a href=\"\" class=\"dropdown-item\">Women's Dresses</a>\n");
      out.write("                                                                <a href=\"\" class=\"dropdown-item\">Baby's Dresses</a>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>-->\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <!--                            <a href=\"\" class=\"nav-item nav-link\">Dog</a>\n");
      out.write("                                                        <a href=\"\" class=\"nav-item nav-link\">Cat</a>\n");
      out.write("                                                        <a href=\"\" class=\"nav-item nav-link\">Bird</a>\n");
      out.write("                                                        <a href=\"\" class=\"nav-item nav-link\">Turtle</a>\n");
      out.write("                                                        <a href=\"\" class=\"nav-item nav-link\">Rabbit</a>-->\n");
      out.write("                            <!--                            <a href=\"\" class=\"nav-item nav-link\">Jumpsuits</a>\n");
      out.write("                                                        <a href=\"\" class=\"nav-item nav-link\">Blazers</a>\n");
      out.write("                                                        <a href=\"\" class=\"nav-item nav-link\">Jackets</a>\n");
      out.write("                                                        <a href=\"\" class=\"nav-item nav-link\">Shoes</a>-->\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-9\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0\">\n");
      out.write("                        <a href=\"\" class=\"text-decoration-none d-block d-lg-none\">\n");
      out.write("                            <h1 class=\"m-0 display-5 font-weight-semi-bold\"><span class=\"text-primary font-weight-bold border px-3 mr-1\">E</span>Shopper</h1>\n");
      out.write("                        </a>\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\n");
      out.write("                            <div class=\"navbar-nav mr-auto py-0\">\n");
      out.write("                                <a href=\"home\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                                <a href=\"shop\" class=\"nav-item nav-link\">Shop</a>\n");
      out.write("                                <!--                                <a href=\"detail.html\" class=\"nav-item nav-link\">Shop Detail</a>-->\n");
      out.write("                                <div class=\"nav-item dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Pages</a>\n");
      out.write("                                    <div class=\"dropdown-menu rounded-0 m-0\">\n");
      out.write("                                        <a href=\"cart.html\" class=\"dropdown-item\">Shopping Cart</a>\n");
      out.write("                                        <a href=\"checkout.html\" class=\"dropdown-item\">Checkout</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"navbar-nav ml-auto py-0\">\n");
      out.write("                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                   <!-- <a href=\"\" class=\"nav-item nav-link\">Register</a> -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                    <div id=\"header-carousel\" class=\"carousel slide\" data-ride=\"petbanner1\">\n");
      out.write("                        <div class=\"carousel-inner\">\n");
      out.write("                            <div class=\"carousel-item active\" style=\"height: 410px;\">\n");
      out.write("                                <img class=\"img-fluid\" src=\"img/petbanner1.jpg\" alt=\"Image\">\n");
      out.write("                                <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                                    <div class=\"p-3\" style=\"max-width: 700px;\">\n");
      out.write("                                        <!--                                        <h4 class=\"text-light text-uppercase font-weight-medium mb-3\">10% Off Your First Order</h4>-->\n");
      out.write("                                        <h3 class=\"display-4 text-white font-weight-semi-bold mb-4\">Pet Kingdom</h3>\n");
      out.write("                                        <a href=\"\" class=\"btn btn-light py-2 px-3\">Shop Now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"carousel-item\" style=\"height: 410px;\">\n");
      out.write("                                <img class=\"img-fluid\" src=\"img/petbanner1.jpg\" alt=\"Image\">\n");
      out.write("                                <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                                    <div class=\"p-3\" style=\"max-width: 700px;\">\n");
      out.write("<!--                                        <h4 class=\"text-light text-uppercase font-weight-medium mb-3\">10% Off Your First Order</h4>\n");
      out.write("                                        <h3 class=\"display-4 text-white font-weight-semi-bold mb-4\">Reasonable Price</h3>\n");
      out.write("                                        <a href=\"\" class=\"btn btn-light py-2 px-3\"></a>-->\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a class=\"carousel-control-prev\" href=\"#header-carousel\" data-slide=\"prev\">\n");
      out.write("                            <div class=\"btn btn-dark\" style=\"width: 45px; height: 45px;\">\n");
      out.write("                                <span class=\"carousel-control-prev-icon mb-n2\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"carousel-control-next\" href=\"#header-carousel\" data-slide=\"next\">\n");
      out.write("                            <div class=\"btn btn-dark\" style=\"width: 45px; height: 45px;\">\n");
      out.write("                                <span class=\"carousel-control-next-icon mb-n2\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Navbar End -->\n");
      out.write("         <!-- Featured Start -->\n");
      out.write("    <div class=\"container-fluid pt-5\">\n");
      out.write("        <div class=\"row px-xl-5 pb-3\">\n");
      out.write("            <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
      out.write("                <div class=\"d-flex align-items-center border mb-4\" style=\"padding: 30px;\">\n");
      out.write("                    <h1 class=\"fa fa-check text-primary m-0 mr-3\"></h1>\n");
      out.write("                    <h5 class=\"font-weight-semi-bold m-0\">Quality Pet</h5>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
      out.write("                <div class=\"d-flex align-items-center border mb-4\" style=\"padding: 30px;\">\n");
      out.write("                    <h1 class=\"fa fa-shipping-fast text-primary m-0 mr-2\"></h1>\n");
      out.write("                    <h5 class=\"font-weight-semi-bold m-0\">Free Shipping</h5>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
      out.write("                <div class=\"d-flex align-items-center border mb-4\" style=\"padding: 30px;\">\n");
      out.write("                    <h1 class=\"fas fa-exchange-alt text-primary m-0 mr-3\"></h1>\n");
      out.write("                    <h5 class=\"font-weight-semi-bold m-0\">14-Day Return</h5>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
      out.write("                <div class=\"d-flex align-items-center border mb-4\" style=\"padding: 30px;\">\n");
      out.write("                    <h1 class=\"fa fa-phone-volume text-primary m-0 mr-3\"></h1>\n");
      out.write("                    <h5 class=\"font-weight-semi-bold m-0\">24/7 Support</h5>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Featured End -->\n");
      out.write("        <!-- Products Start -->\n");
      out.write("    <div class=\"container-fluid pt-5\">\n");
      out.write("        <div class=\"text-center mb-4\">\n");
      out.write("            <h2 class=\"section-title px-5\"><span class=\"px-2\">New Dogs</span></h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row px-xl-5 pb-3\">\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Products End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Footer Start -->\n");
      out.write("        <div class=\"container-fluid bg-secondary text-dark mt-5 pt-5\">\n");
      out.write("            <div class=\"row px-xl-5 pt-5\">\n");
      out.write("                <div class=\"col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5\">\n");
      out.write("                    <a href=\"\" class=\"text-decoration-none\">\n");
      out.write("                        <h1 class=\"mb-4 display-5 font-weight-semi-bold\"><span class=\"text-primary font-weight-bold border border-white px-3 mr-1\">P</span>etShop</h1>\n");
      out.write("                    </a>\n");
      out.write("                    <p>Hãy cùng Petshop chọn lựa người bạn nhiều lông đáng yêu cho bạn!</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt text-primary mr-3\"></i>Kim Động, Hưng Yên, Việt Nam</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-envelope text-primary mr-3\"></i>thinhndhe150050@fpt.edu.vn</p>\n");
      out.write("                    <p class=\"mb-0\"><i class=\"fa fa-phone-alt text-primary mr-3\"></i>0976755323</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-8 col-md-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"font-weight-bold text-dark mb-4\">Quick Links</h5>\n");
      out.write("                            <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"index.html\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"shop.html\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"detail.html\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"cart.html\"><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"checkout.html\"><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a>\n");
      out.write("                                <a class=\"text-dark\" href=\"contact.html\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"font-weight-bold text-dark mb-4\">Quick Links</h5>\n");
      out.write("                            <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"index.html\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"shop.html\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"detail.html\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"cart.html\"><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a>\n");
      out.write("                                <a class=\"text-dark mb-2\" href=\"checkout.html\"><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a>\n");
      out.write("                                <a class=\"text-dark\" href=\"contact.html\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"font-weight-bold text-dark mb-4\">Newsletter</h5>\n");
      out.write("                            <form action=\"\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control border-0 py-4\" placeholder=\"Your Name\" required=\"required\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"email\" class=\"form-control border-0 py-4\" placeholder=\"Your Email\"\n");
      out.write("                                           required=\"required\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <button class=\"btn btn-primary btn-block border-0 py-3\" type=\"submit\">Subscribe Now</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row border-top border-light mx-xl-5 py-4\">\n");
      out.write("                <div class=\"col-md-6 px-xl-0\">\n");
      out.write("                    <p class=\"mb-md-0 text-center text-md-left text-dark\">\n");
      out.write("                        &copy; <a class=\"text-dark font-weight-semi-bold\" href=\"#\">Petshop</a>. \n");
      out.write("<!--                        All Rights Reserved. Designed-->\n");
      out.write("<!--                        by\n");
      out.write("                        <a class=\"text-dark font-weight-semi-bold\" href=\"https://htmlcodex.com\">HTML Codex</a><br>\n");
      out.write("                        Distributed By <a href=\"https://themewagon.com\" target=\"_blank\">ThemeWagon</a>-->\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 px-xl-0 text-center text-md-right\">\n");
      out.write("                    <img class=\"img-fluid\" src=\"img/payments.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer End -->\n");
      out.write("        <!-- JavaScript Libraries -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Contact Javascript File -->\n");
      out.write("        <script src=\"mail/jqBootstrapValidation.min.js\"></script>\n");
      out.write("        <script src=\"mail/contact.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template Javascript -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <a href=\"\" class=\"nav-item nav-link\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.admin.role == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <a href=\"manage\" class=\"nav-item nav-link\">Manage</a>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.admin==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <a href=\"login\" class=\"nav-item nav-link\">Login</a>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.admin!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.admin.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                    | <a href=\"logout\">Log out</a>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listnewpet}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("p");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
          out.write("                <div class=\"card product-item border-0 mb-4\">\n");
          out.write("                    <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
          out.write("                        <img class=\"img-fluid w-100\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pet_img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
          out.write("                        <h6 class=\"text-truncate mb-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pet_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("                        <div class=\"d-flex justify-content-center\">\n");
          out.write("                            <h6>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pet_price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("<!--                            <h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>-->\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
          out.write("                        <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View Detail</a>\n");
          out.write("                        <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
