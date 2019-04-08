package com.anna.cafemeow

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment

@Suppress("NAME_SHADOWING")
class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    override fun onMapReady(map: GoogleMap?) {
        Log.i("CafeMeow", "Map is ready")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.my_button)
        myButton.setOnClickListener {
            val intent = Intent(this, ScenicActivity::class.java)
            startActivity(intent)

            val myButton2: Button = findViewById(R.id.my_button2)
            myButton2.setOnClickListener {
                val intent = Intent(this, AdoptActivity::class.java)
                startActivity(intent)
            }

        }

    }
}
