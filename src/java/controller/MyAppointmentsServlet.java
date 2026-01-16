package controller;

import dao.AppointmentDAO;
import dto.AppointmentDTO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyAppointmentsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        Integer userId = (Integer) req.getSession().getAttribute("userId");
        if (userId == null) {
            res.sendRedirect("login.jsp");
            return;
        }

        AppointmentDAO dao = new AppointmentDAO();
        List<AppointmentDTO> list = dao.getUserAppointments(userId);

        req.setAttribute("appointments", list);
        req.getRequestDispatcher("my-appointments.jsp").forward(req, res);
    }
}
