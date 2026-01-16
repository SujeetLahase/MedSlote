package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import dto.AppointmentDTO;

public final class my_002dappointments_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    Integer userId = (Integer) session.getAttribute("userId");
    if (userId == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    List<AppointmentDTO> list =
        (List<AppointmentDTO>) request.getAttribute("appointments");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>My Appointments | MedSlote</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Segoe UI', Arial, sans-serif;\n");
      out.write("            background: #f4f6f8;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            color: #2c5364;\n");
      out.write("            margin-top: 40px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .table-container {\n");
      out.write("            width: 90%;\n");
      out.write("            max-width: 900px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            overflow-x: auto;\n");
      out.write("            background: #fff;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 10px 25px rgba(0,0,0,0.1);\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 100%;\n");
      out.write("            min-width: 600px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            padding: 12px 15px;\n");
      out.write("            border-bottom: 1px solid #ddd;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background: #2c5364;\n");
      out.write("            color: #fff;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            letter-spacing: 0.05em;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:hover {\n");
      out.write("            background: #f1f5f9;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .no-appointments {\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            color: #666;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .back-btn {\n");
      out.write("            display: inline-block;\n");
      out.write("            margin: 25px 0;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background: #2c5364;\n");
      out.write("            color: #fff;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-weight: 600;\n");
      out.write("            transition: background 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .back-btn:hover {\n");
      out.write("            background: #203a43;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media(max-width: 600px) {\n");
      out.write("            th, td {\n");
      out.write("                font-size: 14px;\n");
      out.write("                padding: 10px 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h2 {\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .back-btn {\n");
      out.write("                padding: 8px 16px;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>My Appointments</h2>\n");
      out.write("\n");
      out.write("<div class=\"table-container\">\n");

    if (list == null || list.isEmpty()) {

      out.write("\n");
      out.write("    <div class=\"no-appointments\">No appointments found.</div>\n");

    } else {

      out.write("\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>#</th>\n");
      out.write("            <th>Doctor</th>\n");
      out.write("            <th>Specialization</th>\n");
      out.write("            <th>Slot Time</th>\n");
      out.write("        </tr>\n");

    int i = 1;
    for (AppointmentDTO a : list) {

      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( i++ );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( a.getDoctorName() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( a.getSpecialization() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( a.getSlotTime() );
      out.write("</td>\n");
      out.write("        </tr>\n");

    }

      out.write("\n");
      out.write("    </table>\n");

    }

      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<a href=\"dashboard.jsp\" class=\"back-btn\">⬅ Back to Dashboard</a>\n");
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
