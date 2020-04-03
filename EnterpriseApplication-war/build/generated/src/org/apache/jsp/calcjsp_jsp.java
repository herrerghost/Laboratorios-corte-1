package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calcjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"calcservlet\" method=\"POST\">\n");
      out.write("            <h1>Segundo laboratorio, Calculadora </h1> \n");
      out.write("         <input type=\"text\" name=\"dato\" value=\"\" >\n");
      out.write("         <h1></h1>\n");
      out.write("         <br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("           <input type=\"button\" value=\"1\" OnClick=\"dato.value += '1'\">\n");
      out.write("           <input type=\"button\" value=\"2\" OnClick=\"dato.value += '2'\">\n");
      out.write("           <input type=\"button\" value=\"3\" OnClick=\"dato.value += '3'\">\n");
      out.write("           <input type=\"button\" value=\"+\" OnClick=\"dato.value += '+'\">\n");
      out.write("           <br>\n");
      out.write("           <h1></h1>\n");
      out.write("               \n");
      out.write("           <input type=\"button\" value=\"4\" OnClick=\"dato.value += '4'\">\n");
      out.write("           <input type=\"button\" value=\"5\" OnClick=\"dato.value += '5'\">\n");
      out.write("           <input type=\"button\" value=\"6\" OnClick=\"dato.value += '6'\">\n");
      out.write("           <input type=\"button\" value=\"-\" OnClick=\"dato.value += '-'\">\n");
      out.write("           <br>\n");
      out.write("            <h1></h1>\n");
      out.write("               \n");
      out.write("           <input type=\"button\" value=\"7\" OnClick=\"dato.value += '7'\">\n");
      out.write("           <input type=\"button\" value=\"8\" OnClick=\"dato.value += '8'\">\n");
      out.write("           <input type=\"button\" value=\"9\" OnClick=\"dato.value += '9'\">\n");
      out.write("           <input type=\"button\" value=\"/\" OnClick=\"dato.value += '/'\">\n");
      out.write("           <br>\n");
      out.write("            <h1></h1>\n");
      out.write("               \n");
      out.write("           <input type=\"button\" value=\"0\" OnClick=\"dato.value += '0'\">\n");
      out.write("           <input type=\"button\" value=\".\" OnClick=\"dato.value += '.'\">\n");
      out.write("           <input type=\"button\" value=\"=\" OnClick=\"dato.value = eval(dato.value)\">\n");
      out.write("           <input type=\"button\" value=\"*\" OnClick=\"dato.value += '*' \">\n");
      out.write("           \n");
      out.write("        </form>\n");
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
