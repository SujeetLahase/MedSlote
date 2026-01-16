<%@ page language="java" contentType="text/html; charset=UTF-8"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration | MedSlote</title>

    <style>
        * {
            box-sizing: border-box;
            font-family: 'Segoe UI', Arial, sans-serif;
        }

        body {
            margin: 0;
            min-height: 100vh;
            background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .register-container {
            background: #ffffff;
            width: 100%;
            max-width: 420px;
            padding: 30px 25px;
            border-radius: 12px;
            box-shadow: 0 15px 35px rgba(0,0,0,0.25);
        }

        .brand {
            text-align: center;
            font-size: 18px;
            font-weight: bold;
            color: #2c5364;
            margin-bottom: 5px;
        }

        h2 {
            text-align: center;
            color: #2c5364;
            margin-bottom: 10px;
        }

        .subtitle {
            text-align: center;
            color: #666;
            font-size: 14px;
            margin-bottom: 25px;
        }

        label {
            font-size: 14px;
            font-weight: 600;
            color: #333;
        }

        input {
            width: 100%;
            padding: 12px;
            margin-top: 6px;
            margin-bottom: 15px;
            border-radius: 8px;
            border: 1px solid #ccc;
            font-size: 14px;
            outline: none;
        }

        input:focus {
            border-color: #2c5364;
        }

        button {
            width: 100%;
            padding: 12px;
            background: #2c5364;
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 15px;
            font-weight: 600;
            cursor: pointer;
            transition: background 0.3s;
        }

        button:hover {
            background: #203a43;
        }

        .error {
            background: #ffe5e5;
            color: #c40000;
            padding: 10px;
            border-radius: 6px;
            text-align: center;
            margin-top: 10px;
            font-size: 14px;
        }

        .msg {
            background: #e6fffa;
            color: #0a7a63;
            padding: 10px;
            border-radius: 6px;
            text-align: center;
            margin-top: 10px;
            font-size: 14px;
        }

        .links {
            text-align: center;
            margin-top: 20px;
            font-size: 14px;
        }

        .links a {
            color: #2c5364;
            text-decoration: none;
            font-weight: 600;
        }

        .links a:hover {
            text-decoration: underline;
        }

        @media (max-width: 480px) {
            .register-container {
                margin: 15px;
                padding: 25px 20px;
            }
        }
    </style>
</head>

<body>

<div class="register-container">

    <div class="brand">MedSlote</div>
    <h2>User Registration</h2>
    <div class="subtitle">Create your account to book appointments</div>

    <form action="RegisterServlet" method="post" >

        <label>Full Name</label>
        <input type="text" id="name" name="name" placeholder="Enter full name">

        <label>Email Address</label>
        <input type="email" id="email" name="email" placeholder="Enter email">

        <label>Password</label>
        <input type="password" id="password" name="password" placeholder="Create password">

        <label>Pincode</label>
        <input type="text" id="pincode" name="pincode" placeholder="Enter pincode">

        <button type="submit">Register</button>
    </form>


    <!-- Server message -->
    <c:if test="${not empty msg}">
        <div class="msg">${msg}</div>
    </c:if>

    <div class="links">
        <a href="login.jsp">Already Registered? Login</a>
    </div>

</div>



</body>
</html>
