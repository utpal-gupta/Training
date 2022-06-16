package com.example.training
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.*


class HomeActivity : AppCompatActivity() {
    lateinit var txtHello : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        txtHello = findViewById(R.id.txtHello)

        val username = intent.getStringExtra(MY_MESSAGE)
        txtHello.text = "Hi $username"
    }
}