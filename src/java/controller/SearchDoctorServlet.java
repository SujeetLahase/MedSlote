/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.DoctorDAO;
import dto.DoctorDTO;
import java.io.IOException;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

public class SearchDoctorServlet extends HttpServlet {

   protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {

    String keyword = req.getParameter("q");
    if (keyword != null) keyword = keyword.trim();

    DoctorDAO dao = new DoctorDAO();
    List<DoctorDTO> doctors = dao.searchDoctor(keyword);

    // store the list in request attribute
    req.setAttribute("doctors", doctors);

    // forward to JSP
    req.getRequestDispatcher("search-doctor.jsp").forward(req, res);
}


    }

