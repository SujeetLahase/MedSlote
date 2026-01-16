<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Verify OTP | MedSlote</title>
    <style>
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }

        .otp-container {
            background: #fff;
            padding: 30px 25px;
            border-radius: 12px;
            box-shadow: 0 15px 35px rgba(0,0,0,0.25);
            width: 100%;
            max-width: 350px;
            text-align: center;
        }

        .otp-container h2 {
            margin-bottom: 15px;
            color: #2c5364;
        }

        input[type="text"] {
            width: 100%;
            padding: 12px;
            margin-top: 10px;
            margin-bottom: 20px;
            border-radius: 8px;
            border: 1px solid #ccc;
            font-size: 16px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background: #2c5364;
            color: #fff;
            font-size: 16px;
            font-weight: 600;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            transition: 0.3s;
        }

        input[type="submit"]:hover {
            background: #203a43;
        }

        .error {
            color: #d10000;
            margin-bottom: 15px;
            font-size: 14px;
        }

        .server-msg {
            color: #2c5364;
            margin-top: 10px;
            font-size: 14px;
        }

    </style>

   
</head>
<body>

<div class="otp-container">
    <h2>Verify OTP</h2>

    <form action="VerifyOTPServlet" method="post" >
        <input type="text" id="otp" name="otp" placeholder="Enter OTP" required>
        <div id="otpError" class="error"></div>
        <input type="submit" value="Verify">
    </form>
    

    <!-- Server-side message -->
    <c:if test="${not empty msg}">
        <div class="server-msg">${msg}</div>
    </c:if>

</div>

</body>
</html>
