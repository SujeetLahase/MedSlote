package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reset_002dpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Reset Password | MedSlote</title>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Segoe UI', Arial, sans-serif;\n");
      out.write("            background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .reset-container {\n");
      out.write("            background: #fff;\n");
      out.write("            padding: 30px 25px;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 400px;\n");
      out.write("            box-shadow: 0 15px 35px rgba(0,0,0,0.25);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #2c5364;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        p {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #666;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        label {\n");
      out.write("            font-weight: 600;\n");
      out.write("            color: #333;\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"password\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 12px;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            outline: none;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"password\"]:focus {\n");
      out.write("            border-color: #2c5364;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .toggle-password {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            font-size: 14px;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .toggle-password input {\n");
      out.write("            margin-right: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 12px;\n");
      out.write("            background: #2c5364;\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            font-size: 15px;\n");
      out.write("            font-weight: 600;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover {\n");
      out.write("            background: #203a43;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .error {\n");
      out.write("            background: #ffe5e5;\n");
      out.write("            color: #d10000;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 6px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media (max-width: 480px) {\n");
      out.write("            .reset-container {\n");
      out.write("                margin: 15px;\n");
      out.write("                padding: 25px 20px;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"reset-container\">\n");
      out.write("    <h2>Reset Password</h2>\n");
      out.write("    <p>Enter your new password</p>\n");
      out.write("\n");
      out.write("    <!-- Error Message -->\n");
      out.write("    <div id=\"clientError\" class=\"error\" style=\"display:none;\"></div>\n");
      out.write("\n");
      out.write("    <form action=\"ResetPasswordServlet\" method=\"post\" onsubmit=\"return validatePassword()\">\n");
      out.write("\n");
      out.write("        <label for=\"password\">New Password</label>\n");
      out.write("        <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Enter new password\" required>\n");
      out.write("\n");
      out.write("        <div class=\"toggle-password\">\n");
      out.write("            <input type=\"checkbox\" id=\"showPassword\" onclick=\"togglePassword()\">\n");
      out.write("            <label for=\"showPassword\">Show Password</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <button type=\"submit\">Reset Password</button>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function togglePassword() {\n");
      out.write("        const pass = document.getElementById('password');\n");
      out.write("        pass.type = pass.type === 'password' ? 'text' : 'password';\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function validatePassword() {\n");
      out.write("        const password = document.getElementById('password').value.trim();\n");
      out.write("        const errorBox = document.getElementById('clientError');\n");
      out.write("\n");
      out.write("        errorBox.style.display = 'none';\n");
      out.write("        errorBox.innerHTML = '';\n");
      out.write("\n");
      out.write("        if(password === '') {\n");
      out.write("            errorBox.style.display = 'block';\n");
      out.write("            errorBox.innerHTML = 'Password is required';\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        if(password.length < 6) {\n");
      out.write("            errorBox.style.display = 'block';\n");
      out.write("            errorBox.innerHTML = 'Password must be at least 6 characters';\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Optional: Strong password check\n");
      out.write("        const strongPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{6,}$/;\n");
      out.write("        if(!strongPattern.test(password)) {\n");
      out.write("            errorBox.style.display = 'block';\n");
      out.write("            errorBox.innerHTML = 'Password must contain uppercase, lowercase & number';\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("</script>\n");
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
