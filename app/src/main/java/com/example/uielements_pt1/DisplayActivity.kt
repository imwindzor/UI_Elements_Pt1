package com.example.uielements_pt1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_acitivity)

        val intent1 = intent
        val fname = intent.getStringExtra("First Name")
        val lname = intent.getStringExtra("Last Name")
        val email = intent.getStringExtra("Email Address")
        val phoneNum = intent.getStringExtra("Phone Number")
        val ageText = intent.getStringExtra("")
        val birthDate = intent.getStringExtra("Birth Date")

        val displayedResult = findViewById<TextView>(R.id.displayedResult)
        displayedResult.text = "Name: $fname\nLastName: $lname \nEmail Address: $email \nPhone Number: $phoneNum \n$ageText \nBirthday: $birthDate"
    }
}