package controller;

import dao.SlotDAO;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class DeleteSlotServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        Integer doctorId =
            (Integer) req.getSession().getAttribute("doctorId");

        if (doctorId == null) {
            res.sendRedirect("doctor-login.jsp");
            return;
        }

        int slotId = Integer.parseInt(req.getParameter("slotId"));

        SlotDAO dao = new SlotDAO();
        dao.deleteSlot(slotId);

        res.sendRedirect("DoctorSlotsServlet");
    }
}
