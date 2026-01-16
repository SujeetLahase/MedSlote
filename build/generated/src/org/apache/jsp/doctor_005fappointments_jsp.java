package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import dto.AppointmentDTO;

public final class doctor_005fappointments_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h2>My Appointments</h2>\n");
      out.write("\n");
      out.write("<table border=\"1\">\n");
      out.write("<tr>\n");
      out.write("    <th>ID</th>\n");
      out.write("    <th>Patient Name</th>\n");
      out.write("    <th>Slot Time</th>\n");
      out.write("</tr>\n");
      out.write("\n");

List<AppointmentDTO> list =
    (List<AppointmentDTO>) request.getAttribute("appointments");

if (list != null && !list.isEmpty()) {
    for (AppointmentDTO a : list) {

      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print( a.getId() );
      out.write("</td>\n");
      out.write("    <td>");
      out.print( a.getPatientName() );
      out.write("</td>\n");
      out.write("    <td>");
      out.print( a.getSlotTime() );
      out.write("</td>\n");
      out.write("</tr>\n");

    }
} else {

      out.write("\n");
      out.write("<tr><td colspan=\"3\">No appointments found</td></tr>\n");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<a href=\"doctor_dashboard.jsp\">Back</a>\n");
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
