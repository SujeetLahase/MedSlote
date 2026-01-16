<%@ page import="java.util.*,dto.AppointmentDTO" %>
<%
    if (session.getAttribute("adminId") == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    List<AppointmentDTO> list =
        (List<AppointmentDTO>) request.getAttribute("appointments");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Appointments | Admin</title>

    <style>
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            background-color: #f4f6f8;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 90%;
            max-width: 1000px;
            margin: 40px auto;
            background: #fff;
            padding: 25px;
            border-radius: 12px;
            box-shadow: 0 8px 25px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
            color: #2c5364;
            margin-bottom: 25px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            text-align: left;
            font-size: 14px;
        }

        th, td {
            padding: 12px 15px;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #2c5364;
            color: #fff;
            font-weight: 600;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #e0f0ff;
            transition: 0.3s;
        }

        .back-btn {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #2c5364;
            color: white;
            text-decoration: none;
            border-radius: 6px;
            transition: background 0.3s;
        }

        .back-btn:hover {
            background-color: #203a43;
        }

        @media (max-width: 600px) {
            table, th, td {
                font-size: 12px;
            }

            th, td {
                padding: 8px;
            }
        }
    </style>
</head>

<body>

<div class="container">
    <h2>All Appointments</h2>

    <table>
        <tr>
            <th>ID</th>
            <th>Patient</th>
            <th>Doctor</th>
            <th>Slot Time</th>
        </tr>

        <% if (list != null && !list.isEmpty()) {
               for (AppointmentDTO a : list) { %>
        <tr>
            <td><%= a.getId() %></td>
            <td><%= a.getPatientName() %></td>
            <td><%= a.getDoctorName() %></td>
            <td><%= a.getSlotTime() %></td>
        </tr>
        <%   }
           } else { %>
        <tr>
            <td colspan="4" style="text-align:center; color:#888;">No appointments found</td>
        </tr>
        <% } %>

    </table>

    <a href="dashboardAdmin.jsp" class="back-btn">Back to Dashboard</a>
</div>

</body>
</html>
