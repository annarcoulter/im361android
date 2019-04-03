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

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    override fun onMapReady(map: GoogleMap?) {
        Log.i("CafeMeow", "Map is ready")
    }

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myText: TextView = findViewById(R.id.my_text_view)
        val myButton: Button = findViewById(R.id.my_button)
        myButton.setOnClickListener {
            val intent = Intent ( this, ScenicActivity::class.java)

            val options = ActivityOptions.makeSceneTransitionAnimation(this, myText, "my_text_view")
            startActivity(intent, options.toBundle())
        }

    }
}
