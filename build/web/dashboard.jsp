<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>MedSlote Dashboard</title>
    
    <link rel="stylesheet" href="style.css">

    <style>
        * {
            box-sizing: border-box;
            font-family: 'Segoe UI', Arial, sans-serif;
        }

        body {
            margin: 0;
            background: #f4f6f8;
        }

        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background: #2c5364;
            color: #fff;
            padding: 12px 25px;
            box-shadow: 0 4px 6px rgba(0,0,0,0.1);
        }

        .navbar strong {
            font-size: 20px;
        }

        .navbar a {
            color: #fff;
            text-decoration: none;
            margin-left: 20px;
            font-weight: 500;
            transition: color 0.3s;
        }

        .navbar a:hover {
            color: #ffb347;
        }

        .container {
            max-width: 900px;
            margin: 50px auto;
            padding: 20px;
            background: #fff;
            border-radius: 12px;
            box-shadow: 0 10px 20px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
            color: #2c5364;
            margin-bottom: 20px;
        }

        hr {
            border: none;
            border-top: 2px solid #2c5364;
            margin: 20px 0;
        }

        .search-box {
            display: flex;
            justify-content: center;
            margin: 20px 0;
        }

        .search-box input[type="text"] {
            width: 70%;
            padding: 12px 15px;
            border-radius: 8px 0 0 8px;
            border: 1px solid #ccc;
            font-size: 14px;
            outline: none;
        }

        .search-box input[type="text"]:focus {
            border-color: #2c5364;
        }

        .search-box button {
            padding: 12px 20px;
            border-radius: 0 8px 8px 0;
            border: none;
            background: #2c5364;
            color: #fff;
            cursor: pointer;
            font-weight: 600;
            transition: background 0.3s;
        }

        .search-box button:hover {
            background: #203a43;
        }

        .msg {
            text-align: center;
            color: #d10000;
            font-weight: 500;
            margin-top: 15px;
        }

        @media (max-width: 600px) {
            .search-box {
                flex-direction: column;
            }

            .search-box input[type="text"] {
                width: 100%;
                border-radius: 8px;
                margin-bottom: 10px;
            }

            .search-box button {
                width: 100%;
                border-radius: 8px;
            }
        }
    </style>
</head>

<body>

<div class="navbar">
    <div><strong>MedSlote 🏥</strong></div>
    <div>
        <a href="MyAppointmentsServlet"><i class="fa-solid fa-calendar-check"></i> My Appointments</a>
        <a href="LogoutServlet"><i class="fa-solid fa-right-from-bracket"></i> Logout</a>
    </div>
</div>

<div class="container">
    <h2>Welcome to MedSlote</h2>

    <hr>

    <form action="SearchDoctorServlet" method="get" class="search-box">
        <input type="text" name="q"
               placeholder="Search doctor by name, specialization or address"
               required>
        <button type="submit"><i class="fa-solid fa-magnifying-glass"></i> Search</button>
    </form>

    <p class="msg">${msg}</p>
</div>

<!-- ================= SPECIALTIES ================= -->
<section class="specialties-section">
    <div class="section-header">
        <span class="section-badge">Our Specialties</span>
        <h2>Medical Specialties We Cover</h2>
        <p>Access expert doctors across a wide range of medical specialties</p>
    </div>

    <div class="specialties-grid">

        <div class="specialty-card"><span><i class="fa-solid fa-heart-pulse"></i></span><div><h4>Cardiology</h4><p>Heart & vascular care</p></div></div>
        <div class="specialty-card"><span><i class="fa-solid fa-brain"></i></span><div><h4>Neurology</h4><p>Brain & nervous system</p></div></div>
        <div class="specialty-card"><span><i class="fa-solid fa-bone"></i></span><div><h4>Orthopedics</h4><p>Bone & joint specialists</p></div></div>
        <div class="specialty-card"><span><i class="fa-solid fa-baby"></i></span><div><h4>Pediatrics</h4><p>Children's healthcare</p></div></div>
        <div class="specialty-card"><span><i class="fa-solid fa-lungs"></i></span><div><h4>Pulmonology</h4><p>Respiratory care</p></div></div>
        <div class="specialty-card"><span><i class="fa-solid fa-eye"></i></span><div><h4>Ophthalmology</h4><p>Eye care specialists</p></div></div>
        <div class="specialty-card"><span><i class="fa-solid fa-tooth"></i></span><div><h4>Dentistry</h4><p>Dental care services</p></div></div>
        <div class="specialty-card"><span><i class="fa-solid fa-stethoscope"></i></span><div><h4>General Practice</h4><p>Primary healthcare</p></div></div>
        <div class="specialty-card"><span><i class="fa-solid fa-hand-sparkles"></i></span><div><h4>Dermatology</h4><p>Skin care experts</p></div></div>

    </div>
</section>

</body>
</html>
