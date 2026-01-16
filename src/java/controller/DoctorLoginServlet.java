package controller;

import dao.DoctorLoginDAO;
import dto.DoctorDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DoctorLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        
        //System.out.println("DoctorLoginServlet HIT1");


        DoctorLoginDAO dao = new DoctorLoginDAO();
        DoctorDTO doctor = dao.login(email, password);
        
        //System.out.println("DoctorLoginServlet HIT2");


        if (doctor != null) {
            HttpSession session = req.getSession();
            session.setAttribute("doctorId", doctor.getId());
            session.setAttribute("doctorName", doctor.getName());

            res.sendRedirect("doctor-dashboard.jsp");
        } else {
            req.setAttribute("error", "Invalid email or password");
            req.getRequestDispatcher("doctor-login.jsp").forward(req, res);
        }
    }
}
