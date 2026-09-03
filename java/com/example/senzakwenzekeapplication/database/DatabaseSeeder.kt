package com.example.senzakwenzekeapplication.database

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object DatabaseSeeder {
    suspend fun seedDatabase(dao: AppDao) {
        withContext(Dispatchers.IO) {
            // Clear existing data
            dao.deleteAllUsers()
            dao.deleteAllProviders()
            dao.deleteAllServices()
            dao.deleteAllBookings()
            dao.deleteAllReviews()
            dao.deleteAllContactMessages()
            dao.deleteAllFavorites()

            // 1. Users
            val users = listOf(
                User(1, "Thando Nkosi", "thando@gmail.com", "0821234567", "Umlazi", "123456"),
                User(2, "Sarah Smith", "sarah@gmail.com", "0821234568", "Durban North", "123456"),
                User(3, "Mandla Zulu", "mandla@gmail.com", "0821234569", "Chatsworth", "123456"),
                User(4, "Noluthando Dlamini", "nolu@gmail.com", "0821234570", "Pinetown", "123456"),
                User(5, "John Peters", "john@gmail.com", "0821234571", "Berea", "123456"),
                User(6, "Precious Mkhize", "precious@gmail.com", "0821234572", "Isipingo", "123456"),
                User(7, "Sipho Ngcobo", "sipho@gmail.com", "0821234573", "Kloof", "123456"),
                User(8, "Ayesha Patel", "ayesha@gmail.com", "0821234574", "Overport", "123456"),
                User(9, "Linda Khumalo", "linda@gmail.com", "0821234575", "Morningside", "123456"),
                User(10, "Chris Brown", "chris@gmail.com", "0821234576", "Westville", "123456")
            )
            users.forEach { dao.insertUser(it) }

            // 2. Providers
            val providers = listOf(
                ServiceProvider(1, "Bheki Plumbing", "Plumbing", "0831110001", "Umlazi", 4.8, 250.0),
                ServiceProvider(2, "Eskom Electrical", "Electrical", "0831110002", "Durban Central", 4.9, 300.0),
                ServiceProvider(3, "Sparkle Cleaners", "Cleaning", "0831110003", "Morningside", 4.5, 150.0),
                ServiceProvider(4, "Green Thumb Gardens", "Gardening", "0831110004", "Hillcrest", 4.7, 180.0),
                ServiceProvider(5, "Quick Fix Plumbing", "Plumbing", "0831110005", "Chatsworth", 4.6, 220.0),
                ServiceProvider(6, "Bright Light Electrical", "Electrical", "0831110006", "Pinetown", 4.8, 280.0),
                ServiceProvider(7, "Shine Cleaning Co", "Cleaning", "0831110007", "Berea", 4.4, 140.0),
                ServiceProvider(8, "Garden Masters", "Gardening", "0831110008", "Westville", 4.9, 200.0),
                ServiceProvider(9, "Pipe Dreams", "Plumbing", "0831110009", "Isipingo", 4.3, 200.0),
                ServiceProvider(10, "Power Fix", "Electrical", "0831110010", "Umlazi", 4.6, 260.0)
            )
            providers.forEach { dao.insertProvider(it) }

            // 3. Services
            val services = listOf(
                Service(1, 1, "Leaking Tap Repair", "Fix leaking taps and pipes", "R250", "Plumbing"),
                Service(2, 2, "House Wiring", "Full house electrical wiring", "R3000", "Electrical"),
                Service(3, 3, "Deep House Cleaning", "3-bedroom deep clean", "R800", "Cleaning"),
                Service(4, 4, "Lawn Mowing", "Garden and lawn maintenance", "R400", "Gardening"),
                Service(5, 5, "Toilet Unblock", "Unblock toilets and drains", "R350", "Plumbing"),
                Service(6, 6, "Light Installation", "Install ceiling lights", "R450", "Electrical"),
                Service(7, 7, "Window Cleaning", "Inside and outside windows", "R300", "Cleaning"),
                Service(8, 8, "Tree Cutting", "Tree felling and trimming", "R1200", "Gardening"),
                Service(9, 9, "Geyser Installation", "Install new geyser", "R2500", "Plumbing"),
                Service(10, 10, "Fault Finding", "Electrical fault finding", "R500", "Electrical")
            )
            services.forEach { dao.insertService(it) }

            // 4. Bookings
            val bookings = listOf(
                Booking(1, 1, 1, 1, "Leaking Tap Repair", "2025-11-01", "09:00", "Thando Nkosi", "Completed"),
                Booking(2, 2, 2, 2, "House Wiring", "2025-11-02", "10:00", "Sarah Smith", "Pending"),
                Booking(3, 3, 3, 3, "Deep House Cleaning", "2025-11-03", "11:00", "Mandla Zulu", "Confirmed"),
                Booking(4, 4, 4, 4, "Lawn Mowing", "2025-11-04", "08:00", "Noluthando Dlamini", "Completed"),
                Booking(5, 5, 5, 5, "Toilet Unblock", "2025-11-05", "14:00", "John Peters", "Pending"),
                Booking(6, 6, 6, 6, "Light Installation", "2025-11-06", "15:00", "Precious Mkhize", "Confirmed"),
                Booking(7, 7, 7, 7, "Window Cleaning", "2025-11-07", "09:30", "Sipho Ngcobo", "Completed"),
                Booking(8, 8, 8, 8, "Tree Cutting", "2025-11-08", "07:00", "Ayesha Patel", "Pending"),
                Booking(9, 9, 9, 9, "Geyser Installation", "2025-11-09", "10:30", "Linda Khumalo", "Confirmed"),
                Booking(10, 10, 10, 10, "Fault Finding", "2025-11-10", "13:00", "Chris Brown", "Completed")
            )
            bookings.forEach { dao.insertBooking(it) }

            // 5. Reviews
            val reviews = listOf(
                Review(1, 1, 1, 5.0, "Excellent service, fast!", "2025-10-20"),
                Review(2, 2, 2, 5.0, "Very professional electrician", "2025-10-21"),
                Review(3, 3, 3, 4.0, "House is sparkling clean", "2025-10-22"),
                Review(4, 4, 4, 5.0, "My garden looks amazing", "2025-10-23"),
                Review(5, 5, 5, 4.0, "Good plumbing work", "2025-10-24"),
                Review(6, 6, 6, 5.0, "Fixed lights quickly", "2025-10-25"),
                Review(7, 7, 7, 3.0, "Okay cleaning, could be better", "2025-10-26"),
                Review(8, 8, 8, 5.0, "Best garden service in Durban", "2025-10-27"),
                Review(9, 9, 9, 4.0, "Geyser working well", "2025-10-28"),
                Review(10, 10, 10, 5.0, "Found fault in 10 minutes!", "2025-10-29")
            )
            reviews.forEach { dao.insertReview(it) }

            // 6. Contact Messages
            val messages = listOf(
                ContactMessage(1, "Thabo", "thabo@test.com", "Need plumber urgently", "2025-11-01"),
                ContactMessage(2, "Zanele", "zanele@test.com", "How much for cleaning?", "2025-11-02"),
                ContactMessage(3, "Mike", "mike@test.com", "Do you work on weekends?", "2025-11-03"),
                ContactMessage(4, "Nandi", "nandi@test.com", "Great app!", "2025-11-04"),
                ContactMessage(5, "Paul", "paul@test.com", "Provider was late", "2025-11-05"),
                ContactMessage(6, "Grace", "grace@test.com", "Want to register as provider", "2025-11-06"),
                ContactMessage(7, "David", "david@test.com", "App crashed on booking", "2025-11-07"),
                ContactMessage(8, "Fatima", "fatima@test.com", "Need gardener in Umlazi", "2025-11-08"),
                ContactMessage(9, "Sbu", "sbu@test.com", "Payment options?", "2025-11-09"),
                ContactMessage(10, "Lisa", "lisa@test.com", "Thank you for service", "2025-11-10")
            )
            messages.forEach { dao.insertContactMessage(it) }

            // 7. Favorites
            val favorites = listOf(
                Favorite(1, 1, 1),
                Favorite(2, 1, 2),
                Favorite(3, 2, 3),
                Favorite(4, 2, 4),
                Favorite(5, 3, 5),
                Favorite(6, 3, 6),
                Favorite(7, 4, 7),
                Favorite(8, 4, 8),
                Favorite(9, 5, 9),
                Favorite(10, 5, 10)
            )
            favorites.forEach { dao.insertFavorite(it) }
        }
    }
}