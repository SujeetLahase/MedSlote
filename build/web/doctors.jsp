<%@ page import="java.util.*,dto.DoctorDTO" %>
<%
    if (session.getAttribute("adminId") == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    List<DoctorDTO> list = (List<DoctorDTO>) request.getAttribute("list");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Manage Doctors | MedSlote</title>

    <style>
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            background-color: #f4f6f8;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 95%;
            max-width: 1200px;
            margin: 40px auto;
        }

        h2 {
            color: #2c5364;
            text-align: center;
            margin-bottom: 20px;
        }

        /* Add Doctor Form */
        .doctor-form {
            background: #fff;
            padding: 25px 20px;
            border-radius: 12px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.1);
            max-width: 500px;
            margin: 0 auto 40px;
        }

        .doctor-form label {
            display: block;
            margin-top: 15px;
            font-weight: 600;
            color: #333;
        }

        .doctor-form input {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border-radius: 8px;
            border: 1px solid #ccc;
            outline: none;
        }

        .doctor-form input:focus {
            border-color: #2c5364;
        }

        .doctor-form button {
            width: 100%;
            padding: 12px;
            margin-top: 20px;
            background-color: #2c5364;
            color: #fff;
            border: none;
            border-radius: 8px;
            font-weight: 600;
            cursor: pointer;
            transition: background 0.3s;
        }

        .doctor-form button:hover {
            background-color: #203a43;
        }

        /* Table */
        table {
            width: 100%;
            border-collapse: collapse;
            background: #fff;
            border-radius: 12px;
            overflow: hidden;
            box-shadow: 0 10px 25px rgba(0,0,0,0.05);
        }

        table th, table td {
            padding: 12px 15px;
            text-align: left;
        }

        table th {
            background-color: #2c5364;
            color: #fff;
        }

        table tr:nth-child(even) {
            background-color: #f4f6f8;
        }

        table tr:hover {
            background-color: #e0ebf0;
        }

        /* Back Button */
        .back-btn {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #2c5364;
            color: #fff;
            text-decoration: none;
            border-radius: 8px;
            transition: background 0.3s;
        }

        .back-btn:hover {
            background-color: #203a43;
        }

        /* Responsive */
        @media (max-width: 600px) {
            .doctor-form, table {
                width: 100%;
            }
            table th, table td {
                font-size: 14px;
                padding: 10px;
            }
        }

    </style>
</head>

<body>

<div class="container">

    <h2>Add Doctor</h2>
    <div class="doctor-form">
        <form action="AddDoctorServlet" method="post">
            <label>Name</label>
            <input type="text" name="name" placeholder="Enter doctor's name" required>

            <label>Email</label>
            <input type="email" name="email" placeholder="Enter email" required>

            <label>Specialization</label>
            <input type="text" name="specialization" placeholder="Enter specialization" required>

            <label>Address</label>
            <input type="text" name="address" placeholder="Enter address" required>

            <label>Password</label>
            <input type="password" name="password" placeholder="Set password" required>

            <button type="submit">Add Doctor</button>
        </form>
    </div>

    <h2>Doctor List</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Specialization</th>
            <th>Address</th>
        </tr>

        <% if(list != null) { 
            for (DoctorDTO d : list) { %>
        <tr>
            <td><%= d.getId() %></td>
            <td><%= d.getName() %></td>
            <td><%= d.getEmail() %></td>
            <td><%= d.getSpecialization() %></td>
            <td><%= d.getAddress() %></td>
        </tr>
        <%  } 
        } %>
    </table>

    <a href="dashboardAdmin.jsp" class="back-btn">Back to Dashboard</a>

</div>

</body>
</html>
