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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Using EL Operators</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h2>Using EL Operators</h2>\n");
      out.write("<h3>Arithmetic Expressions</h3>\n");
      out.write("<b>You Score in IELTS is ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1 + 2 * 4 - 6 / 2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".</b><br/>\n");
      out.write("<b>Today temperature of Delhi is ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${-4 - 8}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" degree celsius.</b><br/>\n");
      out.write("<b>Is 3/4 equals to 0.75 ? ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(3/4 == 0.75)? \"Yes\" : \"No\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b><br/>\n");
      out.write("<b>Mathematical Constant PI has value ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${22/7}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </b><br/>\n");
      out.write("<b>GDP of India is ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${20 div 2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".</b><br/>\n");
      out.write("<b>I have ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${2003 mod 8}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" mobiles.</b><br/>\n");
      out.write("<b>I have ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${2003 % 8}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" mobiles.</b><br/>\n");
      out.write("<h3>Logical Operators </h3>\n");
      out.write("<b>This Logical and EL expression ${(1&lt;2) && (4&lt;3)} is\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(1<2) && (4<3)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b><br/>\n");
      out.write("<b>This Logical or EL expression ${(1&lt;2) || (4&lt;3)} is\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(1<2) || (4<3)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b><br/>\n");
      out.write("<b>This Logical not EL expression ${!(1&lt;2)} is ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!(1<2)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("</b><br/>\n");
      out.write("<h3>Comparison Operators </h3>\n");
      out.write("<b>Is 4 > 3 ? ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${4 > 3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b><br/>\n");
      out.write("<b>Is \"a\" > \"b\"? ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"a\" > \"b\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b><br/>\n");
      out.write("<b>Is 4 >= 3 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${4 >= 3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b><br/>\n");
      out.write("<b>Is 4 <= 3 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${4 < 3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b><br/>\n");
      out.write("<b>Is 4 == 4? ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${4 == 4}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b><br/>\n");
      out.write("<h3>empty Operator</h3>\n");
      out.write("<b>empty \"\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b><br/>\n");
      out.write("<b>empty \"string\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty \"string\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b><br/>\n");
      out.write("<b>empty null ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b>\n");
      out.write("</body>\n");
      out.write("</html>");
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
