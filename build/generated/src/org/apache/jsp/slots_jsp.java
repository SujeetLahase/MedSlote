package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import dto.SlotDTO;

public final class slots_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    // Check if user is logged in
    Integer userId = (Integer) session.getAttribute("userId");
    if (userId == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    // Get slots and doctorId from request attributes
    List<SlotDTO> slots = (List<SlotDTO>) request.getAttribute("slots");
    Integer doctorId = (Integer) request.getAttribute("doctorId");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Available Slots</title>\n");
      out.write("    <style>\n");
      out.write("        body { font-family: Arial, sans-serif; margin: 20px; }\n");
      out.write("        .slot { border: 1px solid #ccc; padding: 10px; margin-bottom: 10px; }\n");
      out.write("        .btn { padding: 6px 12px; background-color: #2d89ef; color: white; border: none; cursor: pointer; }\n");
      out.write("        .btn:hover { background-color: #1b5dbf; }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>Available Slots</h2>\n");
      out.write("\n");

    if (slots == null || slots.isEmpty()) {

      out.write("\n");
      out.write("    <p>No available slots for this doctor.</p>\n");

    } else {
        for (SlotDTO s : slots) {

      out.write("\n");
      out.write("    <div class=\"slot\">\n");
      out.write("        <form action=\"BookAppointmentServlet\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"doctorId\" value=\"");
      out.print( doctorId );
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"slotTime\" value=\"");
      out.print( s.getSlotTime() );
      out.write("\">\n");
      out.write("            <strong>Slot Time:</strong> ");
      out.print( s.getSlotTime() );
      out.write(" <br><br>\n");
      out.write("            <button type=\"submit\" class=\"btn\">Book Appointment</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");

        }
    }

      out.write("\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<a href=\"dashboard.jsp\">Back to Dashboard</a>\n");
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
