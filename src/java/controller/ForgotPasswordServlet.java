/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utill.EmailUtil;
import utill.OTPUtil;


public class ForgotPasswordServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        UserDAO dao = new UserDAO();

        if (!dao.isEmailExists(email)) {
            request.setAttribute("msg", "Email not registered");
            request.getRequestDispatcher("forgot.jsp").forward(request, response);
            return;
        }

        String otp = OTPUtil.generateOTP();
        dao.saveOTP(email, otp);
        EmailUtil.sendOTP(email, otp);

        request.getSession().setAttribute("email", email);
        response.sendRedirect("verify-otp.jsp");
    }
}
