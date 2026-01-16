# MedSlote – Doctor Appointment Booking System

## 📌 Project Overview

MedSlote is a web-based **Doctor Appointment Booking System** developed using **Java, JSP, Servlets, JDBC, and MySQL**. The system allows patients to register, log in, view doctors, check available time slots, and book appointments. Doctors can manage their availability and view patient appointments. The project follows the **MVC architecture**.



## 🎯 Objectives

* Provide an easy way for patients to book doctor appointments online
* Allow doctors to manage availability and appointments
* Prevent double booking of time slots
* Maintain secure login using sessions

---

## 🛠️ Technologies Used

* **Frontend:** JSP, HTML, CSS, Js
* **Backend:** Java, Servlets, JDBC
* **Database:** MySQL
* **Server:** Apache Tomcat 9
* **IDE:** Netbean IDEA 

---

## 👥 User Roles

### 1. Patient

* Register & Login
* View doctors
* Book appointments
* View appointment status

### 2. Doctor

* Login
* Set available date & time slots
* View patient appointments
* Update appointment status

### 3. Admin 

* Add doctors
* View all appointments

---

## 🔄 Application Workflow

1. User registers and logs in
2. Doctor adds available time slots
3. Patient selects doctor and available slot
4. Appointment is booked and stored in database
5. Doctor views and manages appointments

---

## 🗄️ Database Tables

* `users` – patient details
* `doctors` – doctor information
* `doctor_schedule` – doctor availability
* `appointments` – appointment records

---


## 🔐 Security Features

* Session-based authentication
* Role-based access control
* Input validation

---

## 🚀 How to Run the Project

1. Clone the repository
2. Import project into IDE
3. Configure MySQL database
4. Update DB credentials in DAO
5. Deploy on Apache Tomcat
6. Access via browser

---

## 📌 Future Enhancements

* Email/SMS notifications
* Online payment integration
* Spring Boot migration
* REST API support

---

## 👨‍💻 Author

**Sujeet Lahase**

---

## 📄 License

This project is for educational purposes only.
