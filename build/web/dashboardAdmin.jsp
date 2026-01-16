<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
    if (session.getAttribute("adminId") == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard | MedSlote</title>

    <style>
        * { box-sizing: border-box; font-family: 'Segoe UI', Arial, sans-serif; }
        body {
            margin: 0;
            background: #f4f6f8;
            color: #333;
        }
        .header {
            background: #2c5364;
            color: #fff;
            padding: 20px;
            text-align: center;
            font-size: 24px;
            font-weight: bold;
        }
        .container {
            max-width: 900px;
            margin: 40px auto;
            padding: 0 20px;
        }
        .cards {
            display: flex;
            flex-wrap: wrap;
            gap: 20px;
            justify-content: center;
        }
        .card {
            background: #fff;
            padding: 25px 20px;
            width: 220px;
            border-radius: 10px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.15);
            text-align: center;
            transition: transform 0.3s, box-shadow 0.3s;
        }
        .card:hover {
            transform: translateY(-5px);
            box-shadow: 0 12px 25px rgba(0,0,0,0.25);
        }
        .card a {
            text-decoration: none;
            color: #2c5364;
            font-weight: bold;
            display: block;
            margin-top: 15px;
            font-size: 16px;
        }
        .card i {
            font-size: 40px;
            color: #2c5364;
        }
        @media(max-width: 600px) {
            .cards { flex-direction: column; align-items: center; }
        }
    </style>

    <!-- FONT AWESOME ICONS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
</head>

<body>

<div class="header">
    Welcome Admin
</div>

<div class="container">
    <div class="cards">
        <div class="card">
            <i class="fa-solid fa-user-doctor"></i>
            <a href="ViewDoctorsServlet">Add Doctors</a>
        </div>

        <div class="card">
            <i class="fa-solid fa-users"></i>
            <a href="ViewUsersServlet">View Users</a>
        </div>

        <div class="card">
            <i class="fa-solid fa-calendar-check"></i>
            <a href="ViewAllAppointmentsServlet">View Appointments</a>
        </div>

        <div class="card">
            <i class="fa-solid fa-right-from-bracket"></i>
            <a href="AdminLogoutServlet">Logout</a>
        </div>
    </div>
</div>

</body>
</html>
