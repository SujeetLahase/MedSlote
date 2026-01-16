package controller;

import dao.SlotDAO;
import java.io.IOException;
import java.sql.Timestamp;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddSlotServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("doctorId") == null) {
            response.sendRedirect("doctor/login.jsp");
            return;
        }

        int doctorId = (int) session.getAttribute("doctorId");

        String slotTimeStr = request.getParameter("slotTime");
        // from: 2026-01-14T20:30
        // to:   2026-01-14 20:30:00
        slotTimeStr = slotTimeStr.replace("T", " ") + ":00";

        Timestamp slotTime = Timestamp.valueOf(slotTimeStr);

        SlotDAO dao = new SlotDAO();
        dao.addSlot(doctorId, slotTime);

        response.sendRedirect("DoctorSlotsServlet");
    }
}
