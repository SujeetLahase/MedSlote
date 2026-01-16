<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*, dto.SlotDTO" %>

<%
    Integer userId = (Integer) session.getAttribute("userId");
    if (userId == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    List<SlotDTO> slots = (List<SlotDTO>) request.getAttribute("slots");
    Integer doctorId = (Integer) request.getAttribute("doctorId");
    String msg = (String) request.getAttribute("msg");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Available Slots | MedSlote</title>
    <style>
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            margin: 0;
            background: #f4f6f8;
            padding: 20px;
        }

        h2 {
            text-align: center;
            color: #2c5364;
            margin-bottom: 20px;
        }

        .message {
            text-align: center;
            color: #d10000;
            font-weight: bold;
            margin-bottom: 15px;
        }

        .slots-container {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 20px;
            max-width: 900px;
            margin: 0 auto;
        }

        .slot-card {
            background: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.15);
            transition: transform 0.3s, box-shadow 0.3s;
        }

        .slot-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 12px 25px rgba(0,0,0,0.2);
        }

        .slot-time {
            font-weight: bold;
            color: #203a43;
            margin-bottom: 15px;
            font-size: 16px;
        }

        .slot-card button {
            width: 100%;
            padding: 10px;
            background: #2c5364;
            color: #fff;
            border: none;
            border-radius: 6px;
            font-weight: 600;
            cursor: pointer;
            transition: background 0.3s;
        }

        .slot-card button:hover {
            background: #203a43;
        }

        .no-slots {
            text-align: center;
            font-size: 16px;
            color: #555;
        }

        .back-link {
            display: block;
            text-align: center;
            margin-top: 30px;
            color: #2c5364;
            text-decoration: none;
            font-weight: 600;
        }

        .back-link:hover {
            text-decoration: underline;
        }

        @media (max-width: 480px) {
            body {
                padding: 10px;
            }

            .slot-card {
                padding: 15px;
            }
        }
    </style>
</head>
<body>

<h2>Available Slots</h2>

<% if (msg != null) { %>
    <div class="message"><%= msg %></div>
<% } %>

<% if (slots == null || slots.isEmpty()) { %>
    <div class="no-slots">No available slots for this doctor.</div>
<% } else { %>
    <div class="slots-container">
        <% for (SlotDTO s : slots) { %>
            <form action="BookAppointmentServlet" method="post" class="slot-card">
                <input type="hidden" name="doctorId" value="<%= doctorId %>">
                <input type="hidden" name="slotTime" value="<%= s.getSlotTime() %>">

                <div class="slot-time">Slot: <%= s.getSlotTime().toString().replace('T', ' ') %></div>
                <button type="submit">Book Appointment</button>
            </form>
        <% } %>
    </div>
<% } %>

<a href="dashboard.jsp" class="back-link">← Back to Dashboard</a>

</body>
</html>
