package controller;

import dao.DoctorDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddDoctorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String specialization = request.getParameter("specialization");
        String address = request.getParameter("address");
        String password = request.getParameter("password");

        DoctorDAO dao = new DoctorDAO();
        dao.addDoctor(name, email, specialization, address, password);

        response.sendRedirect("ViewDoctorsServlet");
    }
}
