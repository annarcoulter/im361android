package com.anna.cafemeow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myText: TextView = findViewById(R.id.my_text_view)
        var myButton: Button = findViewById(R.id.my_button)
        myButton.setOnClickListener {
            myText.text = "I've been clicked!"
        }
    }
}
