package com.example.msgshareapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowToast = findViewById<Button>(R.id.btnShowToast)
        btnShowToast.setOnClickListener {
            Toast.makeText(this, "Button was clicked!", Toast.LENGTH_SHORT).show()
        }
    }

}