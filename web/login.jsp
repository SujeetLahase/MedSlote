<%@ page language="java" contentType="text/html; charset=UTF-8"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Login | MedSlote</title>

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

        .error {
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
    <h2>User Login</h2>
    <p>Secure access to your account</p>

    <form action="LoginServlet" method="post" onsubmit="return validateLoginForm()">


        <label>Email Address</label>
        <input type="email" name="email" placeholder="Enter your email" required>

        <label>Password</label>
        <input type="password" name="password" placeholder="Enter your password" required>

        <button type="submit">Login</button>
    </form>

    <!-- Error Message -->
    <c:if test="${not empty msg}">
        <div class="error">${msg}</div>
    </c:if>

    <div class="links">
        <a href="forgot.jsp">Forgot Password?</a><br><br>
        <a href="register.jsp">New User? Register Here</a>
    </div>

</div>
    
    <script>
    function validateLoginForm() {

        const email = document.getElementById("email").value.trim();
        const password = document.getElementById("password").value.trim();
        const errorBox = document.getElementById("clientError");

        // Clear old error
        errorBox.innerHTML = "";

        // Email empty
        if (email === "") {
            errorBox.innerHTML = "Email is required";
            return false;
        }

        // Email format
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailPattern.test(email)) {
            errorBox.innerHTML = "Enter a valid email address";
            return false;
        }

        // Password empty
        if (password === "") {
            errorBox.innerHTML = "Password is required";
            return false;
        }

        // Password length
        if (password.length < 6) {
            errorBox.innerHTML = "Password must be at least 6 characters";
            return false;
        }

        return true; // submit form
    }
</script>


</body>
</html>
