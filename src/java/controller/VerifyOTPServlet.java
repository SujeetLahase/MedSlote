package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import dao.UserDAO;

public class VerifyOTPServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Verify OTP Servlet HIT");

        String otp = request.getParameter("otp");
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("email") == null) {
            response.sendRedirect("forgot.jsp");
            return;
        }

        String email = (String) session.getAttribute("email");

        UserDAO dao = new UserDAO();
        boolean valid = dao.verifyOTP(email, otp);

        if (valid) {
            response.sendRedirect("reset-password.jsp");
        } else {
            request.setAttribute("msg", "Invalid or Expired OTP");
            request.getRequestDispatcher("verify-otp.jsp").forward(request, response);
        }
    }
}
