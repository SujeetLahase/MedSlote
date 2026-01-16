<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*, dto.AppointmentDTO" %>

<%
    Integer userId = (Integer) session.getAttribute("userId");
    if (userId == null) {
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
    <title>My Appointments | MedSlote</title>
    <style>
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            background: #f4f6f8;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        h2 {
            color: #2c5364;
            margin-top: 40px;
        }

        .table-container {
            width: 90%;
            max-width: 900px;
            margin-top: 20px;
            overflow-x: auto;
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.1);
            padding: 20px;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            min-width: 600px;
        }

        th, td {
            padding: 12px 15px;
            border-bottom: 1px solid #ddd;
            text-align: center;
        }

        th {
            background: #2c5364;
            color: #fff;
            text-transform: uppercase;
            letter-spacing: 0.05em;
        }

        tr:hover {
            background: #f1f5f9;
        }

        .no-appointments {
            text-align: center;
            padding: 20px;
            color: #666;
            font-size: 16px;
        }

        .back-btn {
            display: inline-block;
            margin: 25px 0;
            padding: 10px 20px;
            background: #2c5364;
            color: #fff;
            border-radius: 8px;
            text-decoration: none;
            font-weight: 600;
            transition: background 0.3s;
        }

        .back-btn:hover {
            background: #203a43;
        }

        @media(max-width: 600px) {
            th, td {
                font-size: 14px;
                padding: 10px 8px;
            }

            h2 {
                font-size: 20px;
            }

            .back-btn {
                padding: 8px 16px;
            }
        }
    </style>
</head>
<body>

<h2>My Appointments</h2>

<div class="table-container">
<%
    if (list == null || list.isEmpty()) {
%>
    <div class="no-appointments">No appointments found.</div>
<%
    } else {
%>
    <table>
        <tr>
            <th>#</th>
            <th>Doctor</th>
            <th>Specialization</th>
            <th>Slot Time</th>
        </tr>
<%
    int i = 1;
    for (AppointmentDTO a : list) {
%>
        <tr>
            <td><%= i++ %></td>
            <td><%= a.getDoctorName() %></td>
            <td><%= a.getSpecialization() %></td>
            <td><%= a.getSlotTime() %></td>
        </tr>
<%
    }
%>
    </table>
<%
    }
%>
</div>

<a href="dashboard.jsp" class="back-btn">⬅ Back to Dashboard</a>

</body>
</html>
