package com.example.senzakwenzekeapplication

import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.senzakwenzekeapplication.database.AppDatabase
import com.example.senzakwenzekeapplication.database.DatabaseSeeder
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Seed the database with 10 records per table
        val db = AppDatabase.getDatabase(this)
        lifecycleScope.launch {
            DatabaseSeeder.seedDatabase(db.appDao())
        }

        val container = findViewById<FrameLayout>(R.id.page_container)
        fun show(id: Int){ 
            container.removeAllViews()
            container.addView(layoutInflater.inflate(id, container, false)) 
        }
        
        show(R.layout.activity_home_page)

        findViewById<Button>(R.id.btnHome).setOnClickListener { show(R.layout.activity_home_page) }
        findViewById<Button>(R.id.btnAbout).setOnClickListener { show(R.layout.activity_about) }
        findViewById<Button>(R.id.btnServices).setOnClickListener { show(R.layout.activity_services) }
        findViewById<Button>(R.id.btnBooking).setOnClickListener { show(R.layout.activity_booking) }
        findViewById<Button>(R.id.btnContact).setOnClickListener { show(R.layout.activity_contact) }
    }
}