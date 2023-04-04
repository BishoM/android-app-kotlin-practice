package com.example.msgshareapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowToast = findViewById<Button>(R.id.btnShowToast)
        val sendToNext = findViewById<Button>(R.id.sendToNext)
        val userMessage = findViewById<EditText>(R.id.userMessage)
        val btnShare = findViewById<Button>(R.id.btnShare)
        val btnRecycleView = findViewById<Button>(R.id.btnRecycleView)

        btnShowToast.setOnClickListener {
            Toast.makeText(this, "Button was clicked!", Toast.LENGTH_SHORT).show()
        }

        sendToNext.setOnClickListener{
            val message: String = userMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

             val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }

        btnShare.setOnClickListener{
            val message: String = userMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to: "))
         }

        btnRecycleView.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }

}