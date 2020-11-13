package com.example.uielements_pt1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var calendarView: CalendarView
    lateinit var dateView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.submitBtn).setOnClickListener { calendarView() }

        calendarView = findViewById(R.id.calendarView)
        dateView = findViewById(R.id.dateView)

        calendarView.setOnDateChangeListener{view, year, month, dayOfMonth ->
            val date = dayOfMonth.toString() + "-" + (month + 1) + "-" + year
            dateView.text = date
        }
    }

    private fun calendarView() {

        val dateView = findViewById<TextView>(R.id.dateView)
        val birthDate = dateView.text.toString()

        val ints= intent.extras
        val fname = ints!!.getString("First Name")
        val lname = ints!!.getString("Last Name")
        val email = ints!!.getString("Email Address")
        val phoneNum = ints!!.getString("Phone Number")
        val ageText = ints!!.getString("")


        val intent1 = Intent(this@SecondActivity, DisplayActivity::class.java)
        intent1.putExtra("First Name", fname)
        intent1.putExtra("Last Name", lname)
        intent1.putExtra("Email Address", email)
        intent1.putExtra("Phone Number", phoneNum)
        intent1.putExtra("", ageText)
        intent1.putExtra("Birth Date", birthDate)
        startActivity(intent1)

    }
}