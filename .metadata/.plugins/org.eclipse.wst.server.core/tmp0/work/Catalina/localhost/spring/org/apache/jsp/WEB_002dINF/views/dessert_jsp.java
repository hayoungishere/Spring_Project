/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2019-08-08 05:15:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dessert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

public void setMenus(HttpSession session){	
	session.setAttribute("dessert1", "dessert1");	
	return;
	}


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/springProject/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/coffee_Project/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/springProject/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/coffee_Project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/springProject/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/coffee_Project/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1564304807005L));
    _jspx_dependants.put("/WEB-INF/views/include/header.jsp", Long.valueOf(1565155990243L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>메인화면</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function selectItem(idx){\r\n");
      out.write("\tvar itemName=\"dessert\"+idx;\r\n");
      out.write("\t\r\n");
      out.write("\tvar formId=document.getElementById(\"selectMenu\");\r\n");
      out.write("\tdocument.getElementsByName('menuName')[0].value=itemName;\r\n");
      out.write("\tdocument.getElementsByName('redirName')[0].value=\"dessert\";\r\n");
      out.write("\t\r\n");
      out.write("\tformId.action=\"setCartElement.do\";\r\n");
      out.write("\tformId.submit()\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"\"/> -->\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.3.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write(" <!-- Bootstrap core CSS -->\r\n");
      out.write("  <link href=\"resources/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom fonts for this template -->\r\n");
      out.write("  <link href=\"resources/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>\r\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom styles for this template -->\r\n");
      out.write("  <link href=\"resources/css/agency.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("<!-- Java Script Section -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Navigation -->\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark fixed-top\" id=\"mainNav\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">spring coffee</a>\r\n");
      out.write("      <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    \t <br><br>   Menu\r\n");
      out.write("        <i class=\"fas fa-bars\"></i>\r\n");
      out.write("      </button>\r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("        <ul class=\"navbar-nav text-uppercase ml-auto\">\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link js-scroll-trigger\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Coffee</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link js-scroll-trigger\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/adeNtea\">Ade & Tea</a>\r\n");
      out.write("          </li>\r\n");
      out.write("<!--           <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link js-scroll-trigger\" href=\"#Juice\">Juice</a>\r\n");
      out.write("          </li> -->\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link js-scroll-trigger\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/dessert\">Dessert</a>\r\n");
      out.write("          </li>\r\n");
      out.write("\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link js-scroll-trigger\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/getCartElement.do\">Cart</a>\r\n");
      out.write("          </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link js-scroll-trigger\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\">Settings</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("</body>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Portfolio Grid -->\r\n");
      out.write("  <section class=\"bg-light page-section\" id=\"portfolio\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-12 text-center\">\r\n");
      out.write("          <h2 class=\"section-heading text-uppercase\">Menu</h2>\r\n");
      out.write("          <h3 class=\"section-subheading text-muted\">원하는 메뉴를 선택해주세요.</h3>\r\n");
      out.write("             \r\n");
      out.write("         <form name=\"selectMenu\" id=\"selectMenu\" method=\"post\">\r\n");
      out.write("         <input type=\"hidden\" name=\"menuName\"/>\r\n");
      out.write("         <input type=\"hidden\" name=\"redirName\"/>\r\n");
      out.write("         \r\n");
      out.write("         </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-4 col-sm-6 portfolio-item\" onclick=\"javascript:selectItem(1);\">\r\n");
      out.write("          <a class=\"portfolio-link\" data-toggle=\"modal\" href=\"#portfolioModal1\">\r\n");
      out.write("            <div class=\"portfolio-hover\">\r\n");
      out.write("              <div class=\"portfolio-hover-content\">\r\n");
      out.write("                <i class=\"fas fa-plus fa-3x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"img-fluid\" src=\"resources/img/portfolio/macaron.jpg\" alt=\"\">\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"portfolio-caption\">\r\n");
      out.write("            <h4>마카롱</h4>\r\n");
      out.write("            <p class=\"text-muted\">&#8361;&nbsp;2,500</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("         <div class=\"col-md-4 col-sm-6 portfolio-item\" onclick=\"javascript:selectItem(2);\">\r\n");
      out.write("          <a class=\"portfolio-link\" data-toggle=\"modal\" href=\"#portfolioModal2\">\r\n");
      out.write("            <div class=\"portfolio-hover\">\r\n");
      out.write("              <div class=\"portfolio-hover-content\">\r\n");
      out.write("                <i class=\"fas fa-plus fa-3x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"img-fluid\" src=\"resources/img/portfolio/tiramisu.jpg\" alt=\"\">\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"portfolio-caption\">\r\n");
      out.write("            <h4>티라미수</h4>\r\n");
      out.write("            <p class=\"text-muted\">&#8361;&nbsp;6,500</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       <div class=\"col-md-4 col-sm-6 portfolio-item\" onclick=\"javascript:selectItem(3);\">\r\n");
      out.write("          <a class=\"portfolio-link\" data-toggle=\"modal\" href=\"#portfolioModal3\">\r\n");
      out.write("            <div class=\"portfolio-hover\">\r\n");
      out.write("              <div class=\"portfolio-hover-content\">\r\n");
      out.write("                <i class=\"fas fa-plus fa-3x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"img-fluid\" src=\"resources/img/portfolio/pancake.jpg\" alt=\"\">\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"portfolio-caption\">\r\n");
      out.write("            <h4>팬 케이크</h4>\r\n");
      out.write("            <p class=\"text-muted\">&#8361;&nbsp;6,500</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("         <div class=\"col-md-4 col-sm-6 portfolio-item\" onclick=\"javascript:selectItem(4);\">\r\n");
      out.write("          <a class=\"portfolio-link\" data-toggle=\"modal\" href=\"#portfolioModal4\">\r\n");
      out.write("            <div class=\"portfolio-hover\">\r\n");
      out.write("              <div class=\"portfolio-hover-content\">\r\n");
      out.write("                <i class=\"fas fa-plus fa-3x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"img-fluid\" src=\"resources/img/portfolio/cake2.jpg\" alt=\"\">\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"portfolio-caption\">\r\n");
      out.write("            <h4>롤 케이크</h4>\r\n");
      out.write("            <p class=\"text-muted\">&#8361;&nbsp;5,500</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       <div class=\"col-md-4 col-sm-6 portfolio-item\" onclick=\"javascript:selectItem(5);\">\r\n");
      out.write("          <a class=\"portfolio-link\" data-toggle=\"modal\" href=\"#portfolioModal5\">\r\n");
      out.write("            <div class=\"portfolio-hover\">\r\n");
      out.write("              <div class=\"portfolio-hover-content\">\r\n");
      out.write("                <i class=\"fas fa-plus fa-3x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"img-fluid\" src=\"resources/img/portfolio/cupcake.jpg\" alt=\"\">\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"portfolio-caption\">\r\n");
      out.write("            <h4>머핀</h4>\r\n");
      out.write("            <p class=\"text-muted\">&#8361;&nbsp;3,000</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       <div class=\"col-md-4 col-sm-6 portfolio-item\" onclick=\"javascript:selectItem(6);\">\r\n");
      out.write("          <a class=\"portfolio-link\" data-toggle=\"modal\" href=\"#portfolioModal6\">\r\n");
      out.write("            <div class=\"portfolio-hover\">\r\n");
      out.write("              <div class=\"portfolio-hover-content\">\r\n");
      out.write("                <i class=\"fas fa-plus fa-3x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <img class=\"img-fluid\" src=\"resources/img/portfolio/tarate.jpg\" alt=\"\">\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"portfolio-caption\">\r\n");
      out.write("            <h4>타르트</h4>\r\n");
      out.write("            <p class=\"text-muted\">&#8361;&nbsp;3,000</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core JavaScript -->\r\n");
      out.write("  <script src=\"resources/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"resources/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Plugin JavaScript -->\r\n");
      out.write("  <script src=\"resources/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Contact form JavaScript -->\r\n");
      out.write("  <script src=\"resources/js/jqBootstrapValidation.js\"></script>\r\n");
      out.write("  <script src=\"resources/js/contact_me.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom scripts for this template -->\r\n");
      out.write("  <script src=\"resources/js/agency.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/include/header.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("path");
      // /WEB-INF/views/include/header.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/include/header.jsp(6,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
