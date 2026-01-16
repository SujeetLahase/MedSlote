<%@ page import="java.util.*,dto.UserDTO" %>
<%
    if (session.getAttribute("adminId") == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    List<UserDTO> users = (List<UserDTO>) request.getAttribute("users");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registered Users | MedSlote Admin</title>

    <style>
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            margin: 0;
            background: #f4f6f8;
        }

        .container {
            max-width: 1000px;
            margin: 40px auto;
            padding: 20px;
        }

        h2 {
            text-align: center;
            color: #2c5364;
            margin-bottom: 25px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background: #fff;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
            border-radius: 8px;
            overflow: hidden;
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
            background: #f8f8f8;
        }

        tr:hover {
            background: #e0f7fa;
        }

        a.back-btn {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background: #2c5364;
            color: #fff;
            text-decoration: none;
            border-radius: 6px;
            transition: background 0.3s;
        }

        a.back-btn:hover {
            background: #203a43;
        }

        @media (max-width: 600px) {
            th, td {
                padding: 10px;
                font-size: 14px;
            }

            a.back-btn {
                width: 100%;
                text-align: center;
                padding: 12px;
            }
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Registered Users</h2>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
        </tr>

        <% for (UserDTO u : users) { %>
        <tr>
            <td><%= u.getId() %></td>
            <td><%= u.getName() %></td>
            <td><%= u.getEmail() %></td>
        </tr>
        <% } %>
    </table>

    <a href="dashboardAdmin.jsp" class="back-btn">Back to Dashboard</a>
</div>

</body>
</html>
