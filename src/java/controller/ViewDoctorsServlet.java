/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DoctorDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ViewDoctorsServlet extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    DoctorDAO dao = new DoctorDAO();
    request.setAttribute("list", dao.getAllDoctors());
    request.getRequestDispatcher("doctors.jsp").forward(request, response);
}

}
