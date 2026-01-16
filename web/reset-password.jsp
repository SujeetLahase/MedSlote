<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Reset Password | MedSlote</title>

    <style>
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        .reset-container {
            background: #fff;
            padding: 30px 25px;
            border-radius: 12px;
            width: 100%;
            max-width: 400px;
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
            font-weight: 600;
            color: #333;
            display: block;
            margin-bottom: 5px;
        }

        input[type="password"] {
            width: 100%;
            padding: 12px;
            margin-bottom: 15px;
            border-radius: 8px;
            border: 1px solid #ccc;
            outline: none;
            font-size: 14px;
        }

        input[type="password"]:focus {
            border-color: #2c5364;
        }

        .toggle-password {
            display: flex;
            align-items: center;
            font-size: 14px;
            margin-bottom: 15px;
        }

        .toggle-password input {
            margin-right: 5px;
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
            margin-bottom: 10px;
            text-align: center;
            font-size: 14px;
        }

        @media (max-width: 480px) {
            .reset-container {
                margin: 15px;
                padding: 25px 20px;
            }
        }
    </style>
</head>
<body>

<div class="reset-container">
    <h2>Reset Password</h2>
    <p>Enter your new password</p>

    <!-- Error Message -->
    <div id="clientError" class="error" style="display:none;"></div>

    <form action="ResetPasswordServlet" method="post" onsubmit="return validatePassword()">

        <label for="password">New Password</label>
        <input type="password" id="password" name="password" placeholder="Enter new password" required>

        <div class="toggle-password">
            <input type="checkbox" id="showPassword" onclick="togglePassword()">
            <label for="showPassword">Show Password</label>
        </div>

        <button type="submit">Reset Password</button>
    </form>
</div>

<script>
    function togglePassword() {
        const pass = document.getElementById('password');
        pass.type = pass.type === 'password' ? 'text' : 'password';
    }

    function validatePassword() {
        const password = document.getElementById('password').value.trim();
        const errorBox = document.getElementById('clientError');

        errorBox.style.display = 'none';
        errorBox.innerHTML = '';

        if(password === '') {
            errorBox.style.display = 'block';
            errorBox.innerHTML = 'Password is required';
            return false;
        }

        if(password.length < 6) {
            errorBox.style.display = 'block';
            errorBox.innerHTML = 'Password must be at least 6 characters';
            return false;
        }

        // Optional: Strong password check
        const strongPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d).{6,}$/;
        if(!strongPattern.test(password)) {
            errorBox.style.display = 'block';
            errorBox.innerHTML = 'Password must contain uppercase, lowercase & number';
            return false;
        }

        return true;
    }
</script>

</body>
</html>
