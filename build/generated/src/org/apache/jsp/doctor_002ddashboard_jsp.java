package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class doctor_002ddashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Doctor Dashboard</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial;\n");
      out.write("            background: #f4f6f8;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            width: 80%;\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("            background: #2c7be5;\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px;\n");
      out.write("        }\n");
      out.write("        .card {\n");
      out.write("            background: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: white;\n");
      out.write("            background: #2c7be5;\n");
      out.write("            padding: 8px 15px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <h2>Welcome Dr. ");
      out.print( session.getAttribute("doctorName") );
      out.write("</h2>\n");
      out.write("        <a href=\"DoctorLogoutServlet\">Logout</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <h3>Doctor Actions</h3>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"ViewDoctorAppointmentsServlet\">View Appointments</a></li><br>\n");
      out.write("            <li><a href=\"add_slots.jsp\">Add Available Slots</a></li><br>\n");
      out.write("            <li><a href=\"doctor_profile.jsp\">View Profile</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
