<%
    Integer doctorId = (Integer) session.getAttribute("doctorId");
    if (doctorId == null) {
        response.sendRedirect("doctor-login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Doctor Dashboard | MedSlote</title>
    <style>
        * {
            box-sizing: border-box;
            font-family: 'Segoe UI', Arial, sans-serif;
        }

        body {
            margin: 0;
            min-height: 100vh;
            background: #f4f6f8;
        }

        header {
            background: #2c5364;
            color: #fff;
            padding: 20px 30px;
            text-align: center;
        }

        header h2 {
            margin: 0;
            font-size: 24px;
        }

        nav {
            display: flex;
            justify-content: center;
            gap: 20px;
            margin: 20px 0;
        }

        nav a {
            background: #2c5364;
            color: white;
            text-decoration: none;
            padding: 12px 20px;
            border-radius: 8px;
            font-weight: 600;
            transition: 0.3s;
        }

        nav a:hover {
            background: #203a43;
        }

        .container {
            max-width: 900px;
            margin: 0 auto;
            padding: 0 20px 40px 20px;
        }

        .welcome-box {
            background: #ffffff;
            border-radius: 12px;
            padding: 25px;
            box-shadow: 0 8px 25px rgba(0,0,0,0.1);
            text-align: center;
            margin-bottom: 30px;
        }

        .welcome-box h3 {
            margin: 0;
            font-size: 22px;
            color: #2c5364;
        }

        .cards {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 20px;
        }

        .card {
            background: #fff;
            padding: 20px;
            border-radius: 12px;
            box-shadow: 0 6px 20px rgba(0,0,0,0.08);
            text-align: center;
            transition: 0.3s;
        }

        .card:hover {
            transform: translateY(-5px);
            box-shadow: 0 10px 25px rgba(0,0,0,0.15);
        }

        .card a {
            text-decoration: none;
            color: #2c5364;
            font-weight: 600;
            font-size: 16px;
        }

        .logout {
            text-align: center;
            margin-top: 40px;
        }

        .logout a {
            background: #d9534f;
            color: #fff;
            text-decoration: none;
            padding: 12px 25px;
            border-radius: 8px;
            font-weight: 600;
            transition: 0.3s;
        }

        .logout a:hover {
            background: #c9302c;
        }

        @media (max-width: 480px) {
            nav {
                flex-direction: column;
            }
        }

    </style>
</head>
<body>

<header>
    <h2>Doctor Dashboard</h2>
</header>

<div class="container">

    <div class="welcome-box">
        <h3>Welcome Dr. <%= session.getAttribute("doctorName") %></h3>
    </div>

    <nav>
        <a href="doctor-slots.jsp">Manage Slots</a>
        <a href="ViewDoctorAppointmentsServlet">View Appointments</a>
    </nav>

    <div class="logout">
        <a href="DoctorLogoutServlet">Logout</a>
    </div>

</div>

</body>
</html>
