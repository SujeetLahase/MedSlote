package controller;

import dao.AppointmentDAO;
import java.io.IOException;
import java.sql.Timestamp;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BookAppointmentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        Integer userId = (Integer) req.getSession().getAttribute("userId");
        if (userId == null) {
            res.sendRedirect("login.jsp");
            return;
        }

        int doctorId = Integer.parseInt(req.getParameter("doctorId"));
        Timestamp slotTime = Timestamp.valueOf(req.getParameter("slotTime"));

        AppointmentDAO dao = new AppointmentDAO();

        if (dao.bookAppointment(userId, doctorId, slotTime)) {
            req.setAttribute("msg", "✅ Appointment booked successfully");
        } else {
            req.setAttribute("msg", "❌ Slot already booked");
        }

        req.getRequestDispatcher("dashboard.jsp").forward(req, res);
    }
}

