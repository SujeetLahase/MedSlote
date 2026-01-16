<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MedSlote</title>

    <!-- MAIN CSS -->
    <link rel="stylesheet" href="style.css">

    <!-- FONT AWESOME ICONS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
</head>
<body>

<!-- ================= NAVBAR ================= -->
<div class="navbar">
    <div class="logo">
        <i class="fa-solid fa-heart-pulse"></i> MedSlote
    </div>

    <div class="menu-toggle" onclick="toggleMenu()">
        <i class="fa-solid fa-bars"></i>
    </div>

    <div class="nav-links" id="navLinks">
        <a href="loginAdmin.jsp"><i class="fa-solid fa-user-shield"></i> Admin</a>
        <a href="login.jsp"><i class="fa-solid fa-user"></i> User</a>
        <a href="doctor-login.jsp"><i class="fa-solid fa-user-doctor"></i> Doctor</a>
        <a href="register.jsp" class="btn-primary">Register</a>
    </div>
</div>

<!-- ================= HERO ================= -->
<section class="hero">
    <div class="hero-text">

        <div class="badge">
            <i class="fa-solid fa-shield-heart"></i>
            Secure & Reliable Healthcare Platform
        </div>

        <h1>
            Book Doctor Appointments <br>
            <span>Easily</span> & <span>Securely</span>
        </h1>

        <p>
            Find the right doctor, check availability, and book appointments
            online in minutes. No waiting, no hassle?just quality healthcare
            at your fingertips.
        </p>

        <div class="hero-buttons">
            <a href="login.jsp" class="btn-primary">
                Book Appointment <i class="fa-solid fa-arrow-right"></i>
            </a>
            <a href="doctor-login.jsp" class="btn-outline">
                Doctor Login
            </a>
        </div>

        <div class="features">
            <div><i class="fa-solid fa-credit-card"></i> No Credit Card Required</div>
            <div><i class="fa-solid fa-lock"></i> 100% Secure Platform</div>
            <div><i class="fa-solid fa-circle-check"></i> Instant Confirmation</div>
        </div>
    </div>

    <div class="hero-image">
        <img src="image3.png" alt="Doctor">
    </div>
</section>

<!-- ================= WHY CHOOSE MEDSLOTE ================= -->
<section class="why-section">
    <div class="section-header">
        <span class="section-badge">Why Choose MedSlote</span>
        <h2>Healthcare Made Simple</h2>
        <p>
            Experience seamless appointment booking with our advanced platform
            designed for both patients and healthcare providers.
        </p>
    </div>

    <div class="feature-grid">

        <div class="feature-card">
            <div class="icon blue">
                <i class="fa-solid fa-calendar-check"></i>
            </div>
            <h4>Easy Appointment Booking</h4>
            <p>Schedule appointments in just a few clicks without hassle.</p>
        </div>

        <div class="feature-card">
            <div class="icon teal">
                <i class="fa-solid fa-user-doctor"></i>
            </div>
            <h4>Doctor Availability</h4>
            <p>Real-time schedule updates ensure accurate availability.</p>
        </div>

        <div class="feature-card">
            <div class="icon green">
                <i class="fa-solid fa-lock"></i>
            </div>
            <h4>Secure Login & Sessions</h4>
            <p>Encrypted and secure authentication for all users.</p>
        </div>

        <div class="feature-card">
            <div class="icon orange">
                <i class="fa-solid fa-ban"></i>
            </div>
            <h4>No Double Booking</h4>
            <p>Smart system prevents duplicate appointment bookings.</p>
        </div>

    </div>

    <div class="feature-bottom">
        <div><i class="fa-solid fa-bell"></i> Instant Notifications</div>
        <div><i class="fa-solid fa-clock-rotate-left"></i> Appointment History</div>
        <div><i class="fa-solid fa-mobile-screen"></i> Mobile Friendly</div>
    </div>
</section>

<!-- ================= HOW IT WORKS ================= -->
<section class="steps-section">
    <div class="section-header">
        <span class="section-badge">Simple Process</span>
        <h2>How It Works</h2>
        <p>Book your appointment in four simple steps</p>
    </div>

    <div class="steps-grid">

        <div class="step-card">
            <span class="step-number blue">1</span>
            <div class="step-icon"><i class="fa-solid fa-user"></i></div>
            <h4>Register / Login</h4>
            <p>Create account or login securely.</p>
        </div>

        <div class="step-card">
            <span class="step-number teal">2</span>
            <div class="step-icon"><i class="fa-solid fa-magnifying-glass"></i></div>
            <h4>Choose Doctor</h4>
            <p>Select a doctor based on specialization.</p>
        </div>

        <div class="step-card">
            <span class="step-number green">3</span>
            <div class="step-icon"><i class="fa-solid fa-clock"></i></div>
            <h4>Select Time Slot</h4>
            <p>Choose an available appointment slot.</p>
        </div>

        <div class="step-card">
            <span class="step-number orange">4</span>
            <div class="step-icon"><i class="fa-solid fa-circle-check"></i></div>
            <h4>Confirm Appointment</h4>
            <p>Get instant booking confirmation.</p>
        </div>

    </div>

    <div class="steps-btn">
        <a href="login.jsp" class="btn-primary">
            Start Booking Now <i class="fa-solid fa-arrow-right"></i>
        </a>
    </div>
</section>

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

<!-- ================= CTA ================= -->
<section class="cta-section">
    <div class="cta-box">
        <div class="cta-icon">
            <i class="fa-solid fa-calendar-days"></i>
        </div>

        <h2>Ready to Book Your Appointment?</h2>
        <p>
            Join thousands of patients who trust MedSlote for their healthcare needs.
            Get started in minutes and experience hassle-free booking.
        </p>

        <div class="cta-buttons">
            <a href="register.jsp" class="btn-white">
                Book Your First Appointment <i class="fa-solid fa-arrow-right"></i>
            </a>
            <a href="login.jsp" class="btn-outline-white">Patient Login</a>
        </div>
    </div>
</section>

<!-- ================= FOOTER ================= -->
<footer class="footer">
    <div class="footer-grid">

        <div class="footer-brand">
            <h3><i class="fa-solid fa-heart-pulse"></i> MedSlote</h3>
            <p>MedSlote is a personalized health and wellness site for enhanced well-being.</p>
        </div>

        <div>
            <h4>For Patients</h4>
            <a href="login.jsp">Book Appointment</a>
            <a href="login.jsp">Patient Login</a>
            <a href="doctor-login.jsp">Doctor Login</a>
        </div>

        <div>
            <h4>Contact Us</h4>
            <p><i class="fa-solid fa-phone"></i> +91 123-456-7890</p>
            <p><i class="fa-solid fa-envelope"></i> info@medslote.com</p>
            <p><i class="fa-solid fa-clock"></i> 24/7 Online Booking</p>
        </div>

    </div>

    <div class="footer-bottom">
        © 2026 MedSlote. All Rights Reserved.
    </div>
</footer>

<!-- ================= JS ================= -->
<script src="script.js"></script>
</body>
</html>
