<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Forgot Password | MedSlote</title>

    <style>
        * { box-sizing: border-box; font-family: 'Segoe UI', Arial, sans-serif; }
        body {
            margin: 0;
            min-height: 100vh;
            background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .forgot-container {
            background: #fff;
            max-width: 400px;
            width: 90%;
            padding: 30px 25px;
            border-radius: 12px;
            box-shadow: 0 15px 35px rgba(0,0,0,0.25);
        }

        h2 {
            text-align: center;
            color: #2c5364;
            margin-bottom: 10px;
        }

        p {
            text-align: center;
            color: #666;
            margin-bottom: 20px;
            font-size: 14px;
        }

        label {
            font-size: 14px;
            font-weight: 600;
            color: #333;
        }

        input[type="email"] {
            width: 100%;
            padding: 12px;
            margin-top: 6px;
            margin-bottom: 15px;
            border-radius: 8px;
            border: 1px solid #ccc;
            outline: none;
            font-size: 14px;
        }

        input[type="email"]:focus {
            border-color: #2c5364;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background: #2c5364;
            color: #fff;
            border: none;
            border-radius: 8px;
            font-size: 15px;
            font-weight: 600;
            cursor: pointer;
            transition: background 0.3s;
        }

        input[type="submit"]:hover {
            background: #203a43;
        }

        .error, .server-msg {
            text-align: center;
            margin-top: 15px;
            font-size: 14px;
            border-radius: 6px;
            padding: 10px;
        }

        .error {
            background: #ffe5e5;
            color: #d10000;
        }

        .server-msg {
            background: #e5f7ff;
            color: #007bff;
        }

        .links {
            text-align: center;
            margin-top: 20px;
        }

        .links a {
            text-decoration: none;
            color: #2c5364;
            font-weight: 600;
        }

        .links a:hover {
            text-decoration: underline;
        }

        @media (max-width: 480px) {
            .forgot-container { padding: 25px 20px; }
        }
    </style>
</head>

<body>
    <div class="forgot-container">
        <h2>Forgot Password</h2>
        <p>Enter your registered email to receive OTP</p>



        <form action="ForgotPasswordServlet" method="post" >
            <label>Email Address</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>
            <input type="submit" value="Send OTP">
        </form>
        
        <!-- Server-side message -->
        <c:if test="${not empty msg}">
            <div class="server-msg">${msg}</div>
        </c:if>

        <div class="links">
            <a href="login.jsp">Back to Login</a>
        </div>
    </div>

   
</body>
</html>
