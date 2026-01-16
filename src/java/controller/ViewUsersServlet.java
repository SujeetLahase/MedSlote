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


public class ViewUsersServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    UserDAO dao = new UserDAO();
    request.setAttribute("users", dao.getAllUsers());
    request.getRequestDispatcher("users.jsp").forward(request, response);
}

}
