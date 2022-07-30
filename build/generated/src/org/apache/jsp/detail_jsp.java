package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                                    <c:set var=\"cid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"c\">\n");
      out.write("                                        <a href=\"tab?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"nav-item nav-link\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                                    </c:forEach>\n");
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
      out.write("                                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            Hello ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                        </c:if>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("<!-- Navbar End -->\n");
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
}
