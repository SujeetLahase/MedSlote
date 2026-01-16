<%@ page import="java.util.*, dto.SlotDTO" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Manage Slots | Doctor Dashboard</title>
    <style>
        * { box-sizing: border-box; font-family: 'Segoe UI', Arial, sans-serif; }
        body { margin: 0; background: #f4f6f8; padding: 20px; }
        
        h2, h3 { color: #2c5364; text-align: center; }
        form {
            max-width: 400px;
            margin: 0 auto 20px auto;
            background: #fff;
            padding: 25px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
        }
        label { display: block; margin-bottom: 8px; font-weight: 600; }
        input[type="datetime-local"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border-radius: 8px;
            border: 1px solid #ccc;
            outline: none;
        }
        input[type="datetime-local"]:focus { border-color: #2c5364; }

        button {
            width: 100%;
            padding: 12px;
            border: none;
            background: #2c5364;
            color: #fff;
            font-weight: bold;
            border-radius: 8px;
            cursor: pointer;
            transition: background 0.3s;
        }
        button:hover { background: #203a43; }

        .back-link {
            display: block;
            text-align: center;
            margin: 15px auto;
            color: #2c5364;
            text-decoration: none;
            font-weight: bold;
        }
        .back-link:hover { text-decoration: underline; }

        .slots {
            max-width: 500px;
            margin: 20px auto;
            background: #fff;
            padding: 20px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
        }
        .slot-item {
            display: flex;
            justify-content: space-between;
            padding: 10px 0;
            border-bottom: 1px solid #eee;
            align-items: center;
        }
        .slot-item:last-child { border-bottom: none; }
        .delete-link {
            color: #d10000;
            text-decoration: none;
            font-weight: bold;
        }
        .delete-link:hover { text-decoration: underline; }

        @media (max-width: 480px) {
            form, .slots { margin: 15px; padding: 20px; }
        }
    </style>
</head>
<body>

<h2>Manage Slots</h2>

<form method="post" action="<%=request.getContextPath()%>/AddSlotServlet">
    <label>Select Slot</label>
    <input type="datetime-local" name="slotTime" required>
    <button type="submit">Add Slot</button>
</form>

<a href="doctor-dashboard.jsp" class="back-link">&larr; Back to Dashboard</a>

<h3>Your Slots</h3>

<div class="slots">
<%
List<SlotDTO> slots = (List<SlotDTO>) request.getAttribute("slots");

if (slots == null || slots.isEmpty()) {
%>
    <p style="text-align:center; color:#666;">No slots added yet.</p>
<%
} else {
    for (SlotDTO s : slots) {
%>
    <div class="slot-item">
        <span><i class="fa-solid fa-clock"></i> <%= s.getSlotTime() %></span>
        <a href="DeleteSlotServlet?slotId=<%= s.getId() %>" class="delete-link">Delete</a>
    </div>
<%
    }
}
%>
</div>

<!-- Font Awesome for icon -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/js/all.min.js"></script>

</body>
</html>
