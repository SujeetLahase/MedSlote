package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>MedSlote Dashboard</title>\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            font-family: 'Segoe UI', Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            margin: 0;\n");
      out.write("            background: #f4f6f8;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            background: #2c5364;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 12px 25px;\n");
      out.write("            box-shadow: 0 4px 6px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar strong {\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar a {\n");
      out.write("            color: #fff;\n");
      out.write("            text-decoration: none;\n");
      out.write("            margin-left: 20px;\n");
      out.write("            font-weight: 500;\n");
      out.write("            transition: color 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar a:hover {\n");
      out.write("            color: #ffb347;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            max-width: 900px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background: #fff;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            box-shadow: 0 10px 20px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #2c5364;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        hr {\n");
      out.write("            border: none;\n");
      out.write("            border-top: 2px solid #2c5364;\n");
      out.write("            margin: 20px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .search-box {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            margin: 20px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .search-box input[type=\"text\"] {\n");
      out.write("            width: 70%;\n");
      out.write("            padding: 12px 15px;\n");
      out.write("            border-radius: 8px 0 0 8px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            font-size: 14px;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .search-box input[type=\"text\"]:focus {\n");
      out.write("            border-color: #2c5364;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .search-box button {\n");
      out.write("            padding: 12px 20px;\n");
      out.write("            border-radius: 0 8px 8px 0;\n");
      out.write("            border: none;\n");
      out.write("            background: #2c5364;\n");
      out.write("            color: #fff;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-weight: 600;\n");
      out.write("            transition: background 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .search-box button:hover {\n");
      out.write("            background: #203a43;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .msg {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #d10000;\n");
      out.write("            font-weight: 500;\n");
      out.write("            margin-top: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media (max-width: 600px) {\n");
      out.write("            .search-box {\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .search-box input[type=\"text\"] {\n");
      out.write("                width: 100%;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .search-box button {\n");
      out.write("                width: 100%;\n");
      out.write("                border-radius: 8px;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"navbar\">\n");
      out.write("    <div><strong>MedSlote 🏥</strong></div>\n");
      out.write("    <div>\n");
      out.write("        <a href=\"MyAppointmentsServlet\"><i class=\"fa-solid fa-calendar-check\"></i> My Appointments</a>\n");
      out.write("        <a href=\"LogoutServlet\"><i class=\"fa-solid fa-right-from-bracket\"></i> Logout</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h2>Welcome to MedSlote</h2>\n");
      out.write("\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("    <form action=\"SearchDoctorServlet\" method=\"get\" class=\"search-box\">\n");
      out.write("        <input type=\"text\" name=\"q\"\n");
      out.write("               placeholder=\"Search doctor by name, specialization or address\"\n");
      out.write("               required>\n");
      out.write("        <button type=\"submit\"><i class=\"fa-solid fa-magnifying-glass\"></i> Search</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <p class=\"msg\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- ================= SPECIALTIES ================= -->\n");
      out.write("<section class=\"specialties-section\">\n");
      out.write("    <div class=\"section-header\">\n");
      out.write("        <span class=\"section-badge\">Our Specialties</span>\n");
      out.write("        <h2>Medical Specialties We Cover</h2>\n");
      out.write("        <p>Access expert doctors across a wide range of medical specialties</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"specialties-grid\">\n");
      out.write("\n");
      out.write("        <div class=\"specialty-card\"><span><i class=\"fa-solid fa-heart-pulse\"></i></span><div><h4>Cardiology</h4><p>Heart & vascular care</p></div></div>\n");
      out.write("        <div class=\"specialty-card\"><span><i class=\"fa-solid fa-brain\"></i></span><div><h4>Neurology</h4><p>Brain & nervous system</p></div></div>\n");
      out.write("        <div class=\"specialty-card\"><span><i class=\"fa-solid fa-bone\"></i></span><div><h4>Orthopedics</h4><p>Bone & joint specialists</p></div></div>\n");
      out.write("        <div class=\"specialty-card\"><span><i class=\"fa-solid fa-baby\"></i></span><div><h4>Pediatrics</h4><p>Children's healthcare</p></div></div>\n");
      out.write("        <div class=\"specialty-card\"><span><i class=\"fa-solid fa-lungs\"></i></span><div><h4>Pulmonology</h4><p>Respiratory care</p></div></div>\n");
      out.write("        <div class=\"specialty-card\"><span><i class=\"fa-solid fa-eye\"></i></span><div><h4>Ophthalmology</h4><p>Eye care specialists</p></div></div>\n");
      out.write("        <div class=\"specialty-card\"><span><i class=\"fa-solid fa-tooth\"></i></span><div><h4>Dentistry</h4><p>Dental care services</p></div></div>\n");
      out.write("        <div class=\"specialty-card\"><span><i class=\"fa-solid fa-stethoscope\"></i></span><div><h4>General Practice</h4><p>Primary healthcare</p></div></div>\n");
      out.write("        <div class=\"specialty-card\"><span><i class=\"fa-solid fa-hand-sparkles\"></i></span><div><h4>Dermatology</h4><p>Skin care experts</p></div></div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
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
