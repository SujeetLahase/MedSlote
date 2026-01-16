/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;



import dao.AppointmentDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewAllAppointmentsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    AppointmentDAO dao = new AppointmentDAO();
    request.setAttribute("appointments", dao.getAllAppointments());
    request.getRequestDispatcher("appointments.jsp").forward(request, response);
}

}
