package controller;

import dao.DoctorDAO;
import dto.SlotDTO;
import java.io.IOException;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

public class ViewSlotsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int doctorId = Integer.parseInt(req.getParameter("doctorId"));

        DoctorDAO dao = new DoctorDAO();
        List<SlotDTO> slots = dao.getAvailableSlots(doctorId);

        // DEBUG (VERY IMPORTANT)
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Slots found: " + slots.size());

        req.setAttribute("slots", slots);
        req.setAttribute("doctorId", doctorId);

        req.getRequestDispatcher("slots.jsp").forward(req, res);
    }
}
