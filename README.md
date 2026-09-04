# Senzakwenzeke Catering Website and Mobile App

Student Name: Enkosi Mdingi
Student Number: ST10456604
Module: XISD6329 PART1
Campus: Durban
Date: 03 September 2026
GitHub Repository: https://github.com/Enkosi04/AppSenzakwenzeke

Group Members and Roles
1. Enkosi Mdingi ST10456604 - Project Manager - 10/10 - Completed all project work
2. Awande Mdingi ST10399698 - Secretary / Business Analyst - 0/10
3. Mnqobi Ngwane ST10325299 - Software Developer - 0/10
4. Bandile Mgaga ST10279634 - UI/UX Designer - 0/10
5. Phumlani Msibi ST10409047 - Tester - 0/10

Project Background and Client
Senzakwenzeke is a decor and catering company based in Bothas Hill, Durban, KwaZulu-Natal. The company provides services for weddings, lobola, corporate events, private parties and children's birthdays. Before this project, the business was operating manually through WhatsApp messages, phone calls, paper diaries and Excel sheets. This caused many problems such as double bookings where two clients were booked on the same date, slow quotations that took two days to calculate manually, loss of equipment like chairs, tables and decor, poor communication, and no professional online presence to show previous work.

Project Purpose
The purpose of this project is to build a complete digital transformation system that modernizes the business operations. The system consists of two integrated platforms that work together.

1. Website Description
The website is a responsive professional website built to give the business an online presence and allow customers to view services and make bookings online.

The website has five main pages:
- Home Page: Shows tagline Elegant Decor and Catering - Making Every Occasion Unforgettable in Durban, hero image, call to action buttons
- About Page: Contains Our Story, Mission, Vision, Values (Ubuntu, Respect, Creativity), team information
- Services Page: Lists all services including Decor services (Weddings, Lobola, Birthdays), Catering services (Basic package 3 courses, Standard package 4 courses, Premium package 5 courses), and Event Planning (Full Planning, Equipment Hire, Tables and Chairs, Sound and Lighting)
- Booking Page: Online form where clients enter Full Name, Email, Phone, Event Date with date picker, Service Type with spinner, Number of Guests, Message. Form has validation for email format, South African phone number and future date. On submit it saves to MySQL database and generates automatic quotation
- Contact Page: Shows address Bothas Hill Durban KZN 3610, phone 081 234 5678, email info@senzakwenzeke.co.za, Google Maps, and one-tap WhatsApp Us link using wa.me which is the preferred communication method

The website solves previous problems by providing instant quotations in under 5 minutes instead of 2 days, centralized MySQL database that prevents double bookings with real-time calendar, professional portfolio for trust, and financial tracking.

Technologies for website: HTML5, CSS3, Bootstrap 5, JavaScript, PHP PDO, MySQL, hosted on XAMPP.

2. Mobile Application Description
The mobile application is a native Android application built in Android Studio using Kotlin and Java. It was built because research showed 90 percent of Senzakwenzeke customers access internet via Android smartphones and prefer an app installed on their phone rather than typing a URL on browser which uses more data.

The mobile app has six screens:
- Splash Screen: Shows logo with navy colour #0A1931 and gold #FFC72C, 2 second loading
- Home Screen: Welcome message and BOOK NOW button
- About Screen: Same as website with Our Story, Mission, Vision, Values
- Services Screen: All services listed with images and prices
- Booking Screen: Same booking form as website with Full Name, Email, Phone, Event Date using Android DatePicker, Service Type using Spinner, Guests, Message, Submit Booking button. Includes validation
- Contact Screen: Address, phone, email and WhatsApp Us Intent that opens WhatsApp directly

Both website and mobile app share the same central MySQL database through PHP REST API (api/book.php, api/services.php). This means a booking made on website appears instantly on mobile app and vice versa. This prevents double bookings and ensures single source of truth. The app also works with local caching to view services when offline which helps in Bothas Hill where network is sometimes poor.

Technologies for mobile app: Android Studio, Kotlin/Java, MVVM architecture, PHP REST API, MySQL, WhatsApp Intent API.

Folder Structure on GitHub
Senzakwenzeke_Website/
- index.html
- about.html
- services.html
- booking.html
- contact.html
- css/style.css
- js/validation.js
- php/Booking.php and api/book.php
- bookings.json

SenzakwenzekeApplication/
- app/src/main/java/com/senzakwenzeke/
- SplashActivity.kt
- MainActivity.kt
- AboutActivity.kt
- ServicesActivity.kt
- BookingActivity.kt
- ContactActivity.kt
- res/layout/ XML files for 6 screens

Direct Links to HTML Files
https://github.com/Enkosi04/AppSenzakwenzeke/blob/main/Senzakwenzeke_Website/index.html
https://github.com/Enkosi04/AppSenzakwenzeke/blob/main/Senzakwenzeke_Website/about.html
https://github.com/Enkosi04/AppSenzakwenzeke/blob/main/Senzakwenzeke_Website/services.html
https://github.com/Enkosi04/AppSenzakwenzeke/blob/main/Senzakwenzeke_Website/booking.html
https://github.com/Enkosi04/AppSenzakwenzeke/blob/main/Senzakwenzeke_Website/contact.html

How to Run the Project
1. Clone repository: git clone https://github.com/Enkosi04/AppSenzakwenzeke.git
2. Website: Open Senzakwenzeke_Website/index.html in any browser or put folder in XAMPP htdocs and run localhost
3. Mobile App: Open SenzakwenzekeApplication folder in Android Studio and run on emulator
4. Database: Import script.sql file into phpMyAdmin

This project was completed by Enkosi Mdingi ST10456604 as all team members did not contribute despite attempts to contact via WhatsApp group and adding lecturer to group as proof.
