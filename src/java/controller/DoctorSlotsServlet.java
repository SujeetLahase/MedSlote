package controller;

import dao.SlotDAO;
import dto.SlotDTO;
import java.io.IOException;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

public class DoctorSlotsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        Integer doctorId =
            (Integer) req.getSession().getAttribute("doctorId");

        if (doctorId == null) {
            res.sendRedirect("doctor-login.jsp");
            return;
        }

        SlotDAO dao = new SlotDAO();
        List<SlotDTO> slots = dao.getDoctorSlots(doctorId);

        req.setAttribute("slots", slots);
        req.getRequestDispatcher("doctor-slots.jsp").forward(req, res);
    }
}
