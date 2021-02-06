package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detial)

        // Get the Intent that started this activity and extract the string extra
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)

        // Get a reference of the TextView and set the message as its text
        val tvMessage = findViewById<TextView>(R.id.tv_message)
        tvMessage.text = message
    }
}