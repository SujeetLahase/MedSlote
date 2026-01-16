/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import utill.PasswordUtil;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Hash entered password
        String hashedPassword = PasswordUtil.hashPassword(password);

        UserDAO dao = new UserDAO();
        int userId = dao.login(email, hashedPassword);

        if (userId > 0) {
            // Store ONLY user ID in session
            HttpSession session = request.getSession();
            session.setAttribute("userId", userId);

            response.sendRedirect("dashboard.jsp");
        } else {
            request.setAttribute("msg", "Invalid email or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
