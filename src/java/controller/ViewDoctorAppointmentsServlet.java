package controller;

import dao.DoctorAppointmentDAO;
import dto.AppointmentDTO;


import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ViewDoctorAppointmentsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("doctorId") == null) {
            response.sendRedirect("doctor_login.jsp");
            return;
        }

        int doctorId = (int) session.getAttribute("doctorId");

        DoctorAppointmentDAO dao = new DoctorAppointmentDAO();
        List<AppointmentDTO> list = dao.getAppointmentsByDoctor(doctorId);

        request.setAttribute("appointments", list);
        RequestDispatcher rd =
                request.getRequestDispatcher("doctor_appointments.jsp");
        rd.forward(request, response);
    }
}
