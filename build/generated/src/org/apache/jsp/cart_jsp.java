package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Topbar Start -->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row bg-secondary py-2 px-xl-5\">\n");
      out.write("                    <div class=\"col-lg-6 d-none d-lg-block\">\n");
      out.write("                        <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                            <a class=\"text-dark\" href=\"\">FAQs</a>\n");
      out.write("                            <span class=\"text-muted px-2\">|</span>\n");
      out.write("                            <a class=\"text-dark\" href=\"\">Help</a>\n");
      out.write("                            <span class=\"text-muted px-2\">|</span>\n");
      out.write("                            <a class=\"text-dark\" href=\"\">Support</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 text-center text-lg-right\">\n");
      out.write("                        <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                            <a class=\"text-dark px-2\" href=\"\">\n");
      out.write("                                <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"text-dark px-2\" href=\"\">\n");
      out.write("                                <i class=\"fab fa-twitter\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"text-dark px-2\" href=\"\">\n");
      out.write("                                <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"text-dark px-2\" href=\"\">\n");
      out.write("                                <i class=\"fab fa-instagram\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"text-dark pl-2\" href=\"\">\n");
      out.write("                                <i class=\"fab fa-youtube\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row align-items-center py-3 px-xl-5\">\n");
      out.write("                    <div class=\"col-lg-3 d-none d-lg-block\">\n");
      out.write("                        <a href=\"home\" class=\"text-decoration-none\">\n");
      out.write("                            <h1 class=\"m-0 display-5 font-weight-semi-bold\"><span class=\"text-primary font-weight-bold border px-3 mr-1\">P</span>etshop</h1>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-6 text-left\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-6 text-right\">\n");
      out.write("                        <a href=\"\" class=\"btn border\">\n");
      out.write("                            <i class=\"fas fa-heart text-primary\"></i>\n");
      out.write("                            <span class=\"badge\">0</span>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"\" class=\"btn border\">\n");
      out.write("                            <i class=\"fas fa-shopping-cart text-primary\"></i>\n");
      out.write("                            <span class=\"badge\">0</span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("<!-- Topbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Navbar Start -->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row border-top px-xl-5\">\n");
      out.write("                    <div class=\"col-lg-3 d-none d-lg-block\">\n");
      out.write("                        <a class=\"btn shadow-none d-flex align-items-center justify-content-between bg-primary text-white w-100\" data-toggle=\"collapse\" href=\"#navbar-vertical\" style=\"height: 65px; margin-top: -1px; padding: 0 30px;\">\n");
      out.write("                            <h6 class=\"m-0\">Categories</h6>\n");
      out.write("                            <i class=\"fa fa-angle-down text-dark\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <nav class=\"collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 border border-top-0 border-bottom-0 bg-light\" id=\"navbar-vertical\" style=\"width: calc(100% - 30px); z-index: 1;\">\n");
      out.write("                            <div class=\"navbar-nav w-100 overflow-hidden\" style=\"height: 410px\">\n");
      out.write("            <!-- LIST CATEGORY -->\n");
      out.write("                                    \n");
      out.write("                                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"col-lg-9\">\n");
      out.write("                            <nav class=\"navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0\">\n");
      out.write("                                <a href=\"\" class=\"text-decoration-none d-block d-lg-none\">\n");
      out.write("                                    <h1 class=\"m-0 display-5 font-weight-semi-bold\"><span class=\"text-primary font-weight-bold border px-3 mr-1\">P</span>etshop</h1>\n");
      out.write("                                </a>\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n");
      out.write("                                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                                </button>\n");
      out.write("                                <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\n");
      out.write("                                    <div class=\"navbar-nav mr-auto py-0\">\n");
      out.write("                                        <a href=\"home\" class=\"nav-item nav-link\">Home</a>\n");
      out.write("                                        <a href=\"shop\" class=\"nav-item nav-link active\">Shop</a>\n");
      out.write("                                        <!--                                <a href=\"detail.html\" class=\"nav-item nav-link\">Shop Detail</a>-->\n");
      out.write("                                        <div class=\"nav-item dropdown\">\n");
      out.write("                                            <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Pages</a>\n");
      out.write("                                            <div class=\"dropdown-menu rounded-0 m-0\">\n");
      out.write("                                                <a href=\"cart.html\" class=\"dropdown-item\">Shopping Cart</a>\n");
      out.write("                                                <a href=\"checkout.html\" class=\"dropdown-item\">Checkout</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("            <!-- Hiển thị người dùng đăng nhập -->       \n");
      out.write("                                    <div class=\"navbar-nav ml-auto py-0\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("<!-- Navbar End -->\n");
      out.write("\n");
      out.write("<!-- Page Header Start -->\n");
      out.write("    <div class=\"container-fluid bg-secondary mb-5\">\n");
      out.write("        <div class=\"d-flex flex-column align-items-center justify-content-center\" style=\"min-height: 300px\">\n");
      out.write("            <h1 class=\"font-weight-semi-bold text-uppercase mb-3\">Shopping Cart</h1>\n");
      out.write("            <div class=\"d-inline-flex\">\n");
      out.write("                <p class=\"m-0\"><a href=\"home\">Home</a></p>\n");
      out.write("                <p class=\"m-0 px-2\">-</p>\n");
      out.write("                <p class=\"m-0\">Shopping Cart</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<!-- Page Header End -->\n");
      out.write("\n");
      out.write("<!-- Cart Start -->\n");
      out.write("    <div class=\"container-fluid pt-5\">\n");
      out.write("        <div class=\"row px-xl-5\">\n");
      out.write("            <div class=\"col-lg-8 table-responsive mb-5\">\n");
      out.write("                <table class=\"table table-bordered text-center mb-0\">\n");
      out.write("                    <thead class=\"bg-secondary text-dark\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>No</th>\n");
      out.write("                            <th>Products</th>\n");
      out.write("                            <th>Price</th>\n");
      out.write("                            <th>Quantity</th>\n");
      out.write("                            <th>Total</th>\n");
      out.write("                            <th>Remove</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("                <form class=\"mb-5\" action=\"\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control p-4\" placeholder=\"Coupon Code\">\n");
      out.write("                        <div class=\"input-group-append\">\n");
      out.write("                            <button class=\"btn btn-primary\">Apply Coupon</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"card border-secondary mb-5\">\n");
      out.write("                    <div class=\"card-header bg-secondary border-0\">\n");
      out.write("                        <h4 class=\"font-weight-semi-bold m-0\">Cart Summary</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"d-flex justify-content-between mb-3 pt-1\">\n");
      out.write("                            <h6 class=\"font-weight-medium\">Subtotal</h6>\n");
      out.write("                            <h6 class=\"font-weight-medium\">$150</h6>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"d-flex justify-content-between\">\n");
      out.write("                            <h6 class=\"font-weight-medium\">Shipping</h6>\n");
      out.write("                            <h6 class=\"font-weight-medium\">$10</h6>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-footer border-secondary bg-transparent\">\n");
      out.write("                        <div class=\"d-flex justify-content-between mt-2\">\n");
      out.write("                            <h5 class=\"font-weight-bold\">Total</h5>\n");
      out.write("                            <h5 class=\"font-weight-bold\">$160</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"btn btn-block btn-primary my-3 py-3\">Proceed To Checkout</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<!-- Cart End -->\n");
      out.write("\n");
      out.write("<!-- Footer Start -->\n");
      out.write("                <div class=\"container-fluid bg-secondary text-dark mt-5 pt-5\">\n");
      out.write("                    <div class=\"row px-xl-5 pt-5\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5\">\n");
      out.write("                            <a href=\"\" class=\"text-decoration-none\">\n");
      out.write("                                <h1 class=\"mb-4 display-5 font-weight-semi-bold\"><span class=\"text-primary font-weight-bold border border-white px-3 mr-1\">P</span>etshop</h1>\n");
      out.write("                            </a>\n");
      out.write("                            <p>Hãy cùng Petshop chọn lựa người bạn nhiều lông đáng yêu cho bạn!</p>\n");
      out.write("                            <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt text-primary mr-3\"></i>Kim Động, Hưng Yên, Việt Nam</p>\n");
      out.write("                            <p class=\"mb-2\"><i class=\"fa fa-envelope text-primary mr-3\"></i>thinhndhe150050@fpt.edu.vn</p>\n");
      out.write("                            <p class=\"mb-0\"><i class=\"fa fa-phone-alt text-primary mr-3\"></i>0976755323</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-8 col-md-12\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-4 mb-5\">\n");
      out.write("                                    <h5 class=\"font-weight-bold text-dark mb-4\">Quick Links</h5>\n");
      out.write("                                    <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                                        <a class=\"text-dark mb-2\" href=\"index.html\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                                        <a class=\"text-dark mb-2\" href=\"shop.html\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\n");
      out.write("                                        <a class=\"text-dark mb-2\" href=\"detail.html\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\n");
      out.write("                                        <a class=\"text-dark mb-2\" href=\"cart.html\"><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a>\n");
      out.write("                                        <a class=\"text-dark mb-2\" href=\"checkout.html\"><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a>\n");
      out.write("                                        <a class=\"text-dark\" href=\"contact.html\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-4 mb-5\">\n");
      out.write("                                    <h5 class=\"font-weight-bold text-dark mb-4\">Quick Links</h5>\n");
      out.write("                                    <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                                        <a class=\"text-dark mb-2\" href=\"index.html\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                                        <a class=\"text-dark mb-2\" href=\"shop.html\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\n");
      out.write("                                        <a class=\"text-dark mb-2\" href=\"detail.html\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\n");
      out.write("                                        <a class=\"text-dark mb-2\" href=\"cart.html\"><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a>\n");
      out.write("                                        <a class=\"text-dark mb-2\" href=\"checkout.html\"><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a>\n");
      out.write("                                        <a class=\"text-dark\" href=\"contact.html\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-4 mb-5\">\n");
      out.write("                                    <h5 class=\"font-weight-bold text-dark mb-4\">Newsletter</h5>\n");
      out.write("                                    <form action=\"\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control border-0 py-4\" placeholder=\"Your Name\" required=\"required\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"email\" class=\"form-control border-0 py-4\" placeholder=\"Your Email\"\n");
      out.write("                                                   required=\"required\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <button class=\"btn btn-primary btn-block border-0 py-3\" type=\"submit\">Subscribe Now</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row border-top border-light mx-xl-5 py-4\">\n");
      out.write("                        <div class=\"col-md-6 px-xl-0\">\n");
      out.write("                            <p class=\"mb-md-0 text-center text-md-left text-dark\">\n");
      out.write("                                &copy; <a class=\"text-dark font-weight-semi-bold\" href=\"#\">Your Site Name</a>. All Rights Reserved. Designed\n");
      out.write("                                by\n");
      out.write("                                <a class=\"text-dark font-weight-semi-bold\" href=\"https://htmlcodex.com\">HTML Codex</a><br>\n");
      out.write("                                Distributed By <a href=\"https://themewagon.com\" target=\"_blank\">ThemeWagon</a>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 px-xl-0 text-center text-md-right\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"img/payments.png\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("<!-- Footer End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Back to Top -->\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary back-to-top\"><i class=\"fa fa-angle-double-up\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- JavaScript Libraries -->\n");
      out.write("                <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("                <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("                <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("                <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("                <!-- Contact Javascript File -->\n");
      out.write("                <script src=\"mail/jqBootstrapValidation.min.js\"></script>\n");
      out.write("                <script src=\"mail/contact.js\"></script>\n");
      out.write("\n");
      out.write("                <!-- Template Javascript -->\n");
      out.write("                <script src=\"js/main.js\"></script>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("cid");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
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
          out.write("                                        <a href=\"tab?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"nav-item nav-link\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                    ");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                        ");
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

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("o");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("t");
    _jspx_th_c_set_2.setValue(new String("0"));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.listItem}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            ");
          if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                    <tbody class=\"align-middle\">\n");
          out.write("                        <tr>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td class=\"align-middle\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.pet.pet_img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 50px;\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.pet.pet_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td class=\"align-middle\">\n");
          out.write("                                <div class=\"input-group quantity mx-auto\" style=\"width: 100px;\">\n");
          out.write("                                    <div class=\"input-group-btn\">\n");
          out.write("                                        <button class=\"btn btn-sm btn-primary btn-minus\" >\n");
          out.write("                                        <i class=\"fa fa-minus\"></i>\n");
          out.write("                                        </button>\n");
          out.write("                                    </div>\n");
          out.write("                                    <input type=\"text\" class=\"form-control form-control-sm bg-secondary text-center\" value=\"1\">\n");
          out.write("                                    <div class=\"input-group-btn\">\n");
          out.write("                                        <button class=\"btn btn-sm btn-primary btn-plus\">\n");
          out.write("                                            <i class=\"fa fa-plus\"></i>\n");
          out.write("                                        </button>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </td>\n");
          out.write("                            <td class=\"align-middle\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price*i.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td class=\"align-middle\"><button class=\"btn btn-sm btn-primary\"><i class=\"fa fa-times\"></i></button></td>\n");
          out.write("                        </tr>\n");
          out.write("                    ");
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

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_set_3.setVar("t");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t+1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }
}
