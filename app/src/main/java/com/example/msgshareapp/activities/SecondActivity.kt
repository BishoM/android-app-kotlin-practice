package com.example.msgshareapp.activities

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.msgshareapp.R


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txtUserMessage = findViewById<TextView>(R.id.txtUserMessage)
        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        txtUserMessage.text = msg
    }
}