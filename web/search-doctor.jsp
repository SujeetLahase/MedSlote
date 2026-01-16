<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*, dto.DoctorDTO" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Doctor Search Results</title>
    <style>
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            background-color: #f4f6f8;
            margin: 0;
            padding: 0;
        }
        h2 {
            text-align: center;
            color: #2c5364;
            margin: 30px 0 20px;
        }
        .container {
            width: 90%;
            max-width: 1000px;
            margin: auto;
        }
        .doctor-card {
            background: #fff;
            border-radius: 10px;
            padding: 20px;
            margin-bottom: 20px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
            transition: transform 0.2s, box-shadow 0.2s;
        }
        .doctor-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 12px 25px rgba(0,0,0,0.15);
        }
        .doctor-card h3 {
            margin: 0 0 10px;
            color: #203a43;
        }
        .doctor-card p {
            margin: 5px 0;
            color: #555;
        }
        .doctor-card a {
            display: inline-block;
            margin-top: 10px;
            text-decoration: none;
            background: #2c5364;
            color: #fff;
            padding: 8px 15px;
            border-radius: 6px;
            transition: background 0.3s;
        }
        .doctor-card a:hover {
            background: #203a43;
        }
        .back-link {
            display: block;
            text-align: center;
            margin: 30px 0;
            font-weight: 600;
            color: #2c5364;
            text-decoration: none;
        }
        .back-link:hover {
            text-decoration: underline;
        }
        .no-results {
            text-align: center;
            color: #d10000;
            font-size: 18px;
            margin-top: 50px;
        }
        @media (max-width: 600px) {
            .doctor-card {
                padding: 15px;
            }
            .doctor-card a {
                padding: 6px 12px;
            }
        }
    </style>
</head>
<body>

<h2>Doctor Search Results</h2>
<div class="container">
<%
    List<DoctorDTO> doctors = (List<DoctorDTO>) request.getAttribute("doctors");

    if (doctors == null || doctors.isEmpty()) {
%>
    <div class="no-results">No doctors found</div>
<%
    } else {
        for (DoctorDTO d : doctors) {
%>
    <div class="doctor-card">
        <h3><%= d.getName() %></h3>
        <p><strong>Specialization:</strong> <%= d.getSpecialization() %></p>
        <p><strong>Address:</strong> <%= d.getAddress() %></p>
        <p><strong>ID:</strong> <%= d.getId() %></p>
        <a href="ViewSlotsServlet?doctorId=<%= d.getId() %>">View Slots</a>
    </div>
<%
        } 
    } 
%>
</div>

<a href="dashboard.jsp" class="back-link">← Back to Dashboard</a>

</body>
</html>
