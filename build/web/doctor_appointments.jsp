<%@ page import="java.util.*, dto.AppointmentDTO" %>

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
        }

        h2 {
            text-align: center;
            color: #2c5364;
            margin-top: 30px;
        }

        .table-container {
            width: 90%;
            max-width: 800px;
            margin: 30px auto;
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.1);
            overflow-x: auto;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 12px 15px;
            text-align: left;
        }

        th {
            background: #2c5364;
            color: #fff;
            font-weight: 600;
        }

        tr:nth-child(even) {
            background: #f2f2f2;
        }

        tr:hover {
            background: #e0f7fa;
        }

        .no-data {
            text-align: center;
            padding: 20px;
            font-style: italic;
            color: #777;
        }

        .back-btn {
            display: block;
            width: 150px;
            margin: 20px auto;
            text-align: center;
            padding: 10px;
            background: #2c5364;
            color: #fff;
            text-decoration: none;
            border-radius: 8px;
            transition: background 0.3s;
        }

        .back-btn:hover {
            background: #203a43;
        }

        @media (max-width: 600px) {
            th, td {
                padding: 10px 8px;
                font-size: 14px;
            }
        }
    </style>
</head>

<body>

<h2>My Appointments</h2>

<div class="table-container">
    <table>
        <tr>
            <th>ID</th>
            <th>Patient Name</th>
            <th>Slot Time</th>
        </tr>

        <%
            List<AppointmentDTO> list =
                (List<AppointmentDTO>) request.getAttribute("appointments");

            if (list != null && !list.isEmpty()) {
                for (AppointmentDTO a : list) {
        %>
        <tr>
            <td><%= a.getId() %></td>
            <td><%= a.getPatientName() %></td>
            <td><%= a.getSlotTime() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="3" class="no-data">No appointments found</td>
        </tr>
        <% } %>
    </table>
</div>

<a href="doctor-dashboard.jsp" class="back-btn">Back to Dashboard</a>

</body>
</html>
