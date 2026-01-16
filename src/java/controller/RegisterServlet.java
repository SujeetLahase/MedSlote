/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import dto.UserDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import utill.PasswordUtil;


public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String pincode = request.getParameter("pincode");

        UserDAO dao = new UserDAO();

        // Check email already exists
        if (dao.isEmailExists(email)) {
            request.setAttribute("msg", "Email already registered!");
            request.getRequestDispatcher("register.jsp").forward(request, response);
            return;
        }

        // Hash password
        String hashedPassword = PasswordUtil.hashPassword(password);

        UserDTO user = new UserDTO();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(hashedPassword);
        user.setPincode(pincode);

        boolean result = dao.registerUser(user);

        if (result) {
            request.setAttribute("msg", "Registration successful!");
        } else {
            request.setAttribute("msg", "Registration failed!");
        }

        request.getRequestDispatcher("register.jsp").forward(request, response);
    }
}
