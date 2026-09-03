# AppSenzakwenzekele app SENZAKWENZEKE - 5 PAGES WEBSITE + MOBILE APP
Home, About, Services, Booking, ContactWhat is this project?
Senzakwenzeke is a catering and events company. This project has two platforms. The Website is mainly for Admin and Staff to manage the business. The Mobile App is mainly for Clients to book and view services. Both are connected and sync data.The 5 Pages Explaineda) Home Page - Purpose:
Website Home: Admin dashboard overview, shows total bookings, pending quotations, low stock alerts. Quick access to Manage Bookings and View Reports.
App Home: For clients, shows beautiful food and decor, special offers, View Services and Book Now buttons. Attracts the client.b) About Page - Purpose:
Website About: Admin can edit company info, mission, team details that appear in the app.
App About: For clients to build trust, read company history and team before booking.c) Services Page - Purpose:
Website Services: Admin side - Manage Services, add or edit Decor, Catering Tiers Basic, Standard, Premium, Event Planning, Equipment Hire, set prices and images.
App Services: Client side - View Services Online, and View Services Offline in App using cached data when no internet.d) Booking Page - Purpose:
Website Booking: Admin and Staff side - Manage Bookings, view all bookings from website and app, confirm or cancel, check availability, generate quotation PDF, send notifications.
App Booking: Client side - Book via Mobile App, client fills BookingActivity form with date, guests, service, app validates and sends API POST, System checks availability automatically, shows price, confirms booking.e) Contact Page - Purpose:
Website Contact: Admin side - View all client enquiries and contact form messages, reply via email, view WhatsApp messages.
App Contact: Client side - Contact via WhatsApp, client taps WhatsApp Us button, Intent triggers WhatsApp directly to chat with Admin, plus contact form for enquiries.Who Can Do What? ActorsCustomer Web User plus Mobile App User: Main user of the App, can make bookings via app, register, login, request quotations, view services offline in app, contact via WhatsApp.
Staff: Uses App on-site during events and Website in office, manages bookings, generates quotations, views bookings and inventory.
Admin: Main user of the Website, manages inventory, oversees all bookings from both channels, views reports, manages users, edits services.
System: Automatically sends notifications, checks availability, generates low-stock alerts, syncs web and app data.Website vs Mobile App - DifferenceWebsite: Mainly for Admin and Staff, access via browser Chrome, used for management - Manage Inventory, Manage Bookings, View Reports, Generate Quotation, best for office work.Mobile App: Mainly for Clients, access via Android phone, used for booking and browsing - Make Booking, View Services Offline, Contact via WhatsApp Intent, Register Account, Login, best for clients on the go and staff at events.How It Works - Simple FlowClient opens App Home, views Services Offline even without data, reads About.Client likes service, goes to Booking Page in App, Book via Mobile App, enters details, System Check Availability Automatic, Generate Quotation, Confirm.Booking syncs to Website, Admin sees new booking on Website, checks Manage Bookings, confirms booking.System sends notifications, email to client, app notification to Admin, triggers WhatsApp confirmation.Admin on Website manages inventory, views reports, generates final quotation.Staff at event uses App to view bookings and inventory on mobile, sends updates.Client needs help, uses App Contact via WhatsApp to message Admin directly.Folder Structurewebsite folder - Admin focused:
index.html Admin Dashboard Home
about.html Manage About content
services.html Manage Services and pricing
booking.html Manage Bookings - confirm, cancel, view all
contact.html View enquiries
css, js, images folders
php folder Booking.php, Database.php, EmailService.phpmobile-app folder - Client focused:
MainActivity.java Home for clients
ServicesActivity.java View Services Offline
BookingActivity.java Book via Mobile App with validation and API POST
ContactActivity.java WhatsApp IntentHow to RunWebsite - Admin: Put website folder in htdocs XAMPP, import database.sql, open index.html, login as Admin to manage.Mobile App - Client: Open mobile-app folder in Android Studio, run on phone, test as client - view services, make booking offline, tap WhatsApp Us.Both sync via API so bookings from app show on website admin panel.Why This Split?Website for Admin because Admin needs big screen to view reports, manage inventory, edit many bookings, generate PDF quotations.
Mobile App for Clients because clients always have phones, need fast booking, offline viewing, and direct WhatsApp contact. Staff also use app at events for quick access.
