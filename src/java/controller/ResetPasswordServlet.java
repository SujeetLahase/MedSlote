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
import utill.PasswordUtil;


public class ResetPasswordServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String newPassword = request.getParameter("password");
        String email = (String) request.getSession().getAttribute("email");

        String hashedPassword = PasswordUtil.hashPassword(newPassword);
        UserDAO dao = new UserDAO();

        dao.updatePassword(email, hashedPassword);
        dao.deleteOTP(email);

        request.getSession().invalidate();
        response.sendRedirect("login.jsp");
    }
}
