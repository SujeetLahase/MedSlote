package controller;

import dao.AdminDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AdminLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
          
        System.out.println(username);
        
        AdminDAO dao = new AdminDAO();
        int adminId = dao.login(username, password);

        if (adminId > 0) {
            HttpSession session = request.getSession();
            session.setAttribute("adminId", adminId);
            response.sendRedirect("dashboardAdmin.jsp");
        } else {
            response.sendRedirect("loginAdmin.jsp?error=invalid");
        }
    }
}
