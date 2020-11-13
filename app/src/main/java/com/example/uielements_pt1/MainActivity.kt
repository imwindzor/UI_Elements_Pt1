package com.example.uielements_pt1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.SeekBar.OnSeekBarChangeListener as OnSeekBarChangeListener

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val firstName = findViewById<EditText>(R.id.firstName)
        val lastName  = findViewById<EditText>(R.id.lastName)
        val emailAdd  = findViewById<EditText>(R.id.emailAdd)
        val nextPageBtn = findViewById<Button>(R.id.nextPageBtn)
        val phone = findViewById<EditText>(R.id.phoneNum)
        val ageNum = findViewById<TextView>(R.id.ageText)

        nextPageBtn.setOnClickListener {
            val fname = firstName.text.toString()
            val lname = lastName.text.toString()
            val email = emailAdd.text.toString()
            val phoneNum = phone.text.toString()
            val ageText = ageNum.text.toString()

            val intent1 = Intent(this@MainActivity, SecondActivity::class.java)
            intent1.putExtra("First Name", fname)
            intent1.putExtra("Last Name", lname)
            intent1.putExtra("Email Address", email)
            intent1.putExtra("Phone Number", phoneNum)
            intent1.putExtra("", ageText)

            startActivity(intent1)

        } // end of naming

            // seekbar
            // Set a SeekBar change listener
            val seekBar = findViewById<SeekBar>(R.id.seekBar)
            val ageText = findViewById<TextView>(R.id.ageText)
            seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                // Display the current progress of SeekBar
                if (i < 18)
                    ageText.text = "Age: 18"
                else
                    ageText.text = "Age: $i"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {}

            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        }) // end of seekbar

        // start of switch
        val phoneNum = findViewById<EditText>(R.id.phoneNum)
        val switch = findViewById<Switch>(R.id.switch1)
        phoneNum.setVisibility(View.INVISIBLE)
        switch.setOnCheckedChangeListener(object: CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged( buttonview: CompoundButton, isChecked: Boolean)
            {
                if (isChecked) {
                    phoneNum.setVisibility(View.VISIBLE);
                } else {
                    phoneNum.setVisibility(View.INVISIBLE)
                }
            }
        })

    }


}