# Senzakwenzeke - 5 Pages Website (Admin) + Mobile App (Clients)

> **Website = Admin & Staff Management | Mobile App = Client Booking**
> Home | About | Services | Booking | Contact

## 📌 1. What is this project?
Senzakwenzeke is a catering and events company. This project has **two platforms** that sync together:

*   **Website:** Mainly for **Admin and Staff** to manage the business.
*   **Mobile App:** Mainly for **Clients** to view services and book events.
*   Both platforms share the same database via API.

## 📄 2. The 5 Pages Explained

#### a) Home Page
*   **Website (Admin):** Admin dashboard overview - shows total bookings, pending quotations, low stock alerts. Quick access to Manage Bookings and View Reports.
*   **App (Client):** Shows beautiful food and decor, special offers, `View Services` and `Book Now` buttons.

#### b) About Page
*   **Website (Admin):** Admin can edit company info, mission, team details.
*   **App (Client):** Clients read company history to build trust before booking.

#### c) Services Page
*   **Website (Admin):** `Manage Services` - Add/edit Decor, Catering Tiers (Basic, Standard, Premium), Event Planning, Equipment Hire.
*   **App (Client):** `View Services Online` + `View Services Offline (in App)` using cached data.

#### d) Booking Page
*   **Website (Admin):** `Manage Bookings` - View all bookings from web and app, confirm/cancel, check availability, generate quotation PDF.
*   **App (Client):** `Book via Mobile App` - Client fills `BookingActivity` form, app validates and sends `API POST`, system checks availability automatically.

#### e) Contact Page
*   **Website (Admin):** View all client enquiries and contact form messages.
*   **App (Client):** `Contact via WhatsApp` - Taps `WhatsApp Us` button -> `Intent.ACTION_VIEW` triggers WhatsApp directly.

## 👥 3. Actors (Use Case)

*   **Customer (Web User + Mobile App User):** Main App user - makes bookings via app, register, login, view services offline, contact via WhatsApp.
*   **Staff:** Uses App on-site and Website in office - manages bookings, generates quotations.
*   **Admin:** Main Website user - manages inventory, oversees bookings, views reports, manages users.
*   **System:** Automatically sends notifications, checks availability, generates low-stock alerts, syncs data.

## ⚖️ 4. Website vs Mobile App Difference

| Feature | Website (Admin) | Mobile App (Client) |
| :--- | :--- | :--- |
| **Main User** | Admin & Staff | Clients |
| **Access** | Browser (Chrome) | Android Phone |
| **Key Function** | Management | Booking & Browsing |
| **Offline** | No | Yes - View Services Offline |
| **Booking** | Manage Bookings + PHP | BookingActivity + API POST |
| **WhatsApp** | View Messages | WhatsApp Intent |

## 🔄 5. How It Works - Simple Flow

1.  Client opens App Home -> Views Services Offline even without data.
2.  Client -> Booking Page -> Book via Mobile App -> System: Check Availability (Automatic) -> Generate Quotation.
3.  Booking syncs to Website -> Admin sees it on Website -> Manage Bookings -> Confirm.
4.  System: Send Notifications (Email to client + AdminNotif).
5.  Admin on Website manages inventory and generates final quotation PDF.
6.  Client needs help -> App Contact -> WhatsApp Us.

## 📁 6. Folder Structure

```bash
/senzakwenzeke-5pages/
├── website/ (Admin Focused)
│   ├── index.html (Admin Dashboard)
│   ├── about.html
│   ├── services.html (Manage Services)
│   ├── booking.html (Manage Bookings)
│   ├── contact.html (View Enquiries)
│   └── php/ (Booking.php, Database.php, EmailService.php)
├── mobile-app/ (Client Focused)
│   ├── MainActivity.java
│   ├── ServicesActivity.java (Offline cache)
│   ├── BookingActivity.java (API POST)
│   └── ContactActivity.java (WhatsApp Intent)
└── docs/
    ├── use-case-diagram.png
    └── wireframes.png
