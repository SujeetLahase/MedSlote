<%@ page language="java" contentType="text/html; charset=UTF-8"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Doctor Login | MedSlote</title>

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

        .login-container {
            background: #ffffff;
            width: 100%;
            max-width: 380px;
            padding: 30px 25px;
            border-radius: 12px;
            box-shadow: 0 15px 35px rgba(0,0,0,0.25);
        }

        .login-container h2 {
            text-align: center;
            margin-bottom: 10px;
            color: #2c5364;
        }

        .login-container p {
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
            outline: none;
            font-size: 14px;
        }

        input:focus {
            border-color: #2c5364;
        }

        button {
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

        button:hover {
            background: #203a43;
        }

        .error, .server-error {
            background: #ffe5e5;
            color: #d10000;
            padding: 10px;
            border-radius: 6px;
            margin-top: 15px;
            text-align: center;
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

        .brand {
            text-align: center;
            font-weight: bold;
            font-size: 18px;
            margin-bottom: 5px;
            color: #2c5364;
        }

        @media (max-width: 480px) {
            .login-container {
                margin: 15px;
                padding: 25px 20px;
            }
        }
    </style>
</head>
<body>

<div class="login-container">

    <div class="brand">MedSlote</div>
    <h2>Doctor Login</h2>
    <p>Secure access to your doctor account</p>


    <form action="DoctorLoginServlet" method="post" >

        <label>Email Address</label>
        <input type="email" id="email" name="email" placeholder="Enter your email" required>

        <label>Password</label>
        <input type="password" id="password" name="password" placeholder="Enter your password" required>

        <button type="submit">Login</button>
    </form>

    <!-- Server-side error -->
    <c:if test="${not empty error}">
        <div class="server-error">${error}</div>
    </c:if>



</div>


</body>
</html>
