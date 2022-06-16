package com.example.training
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var loginbtn: Button
    lateinit var login: TextView
    lateinit var username : EditText
    lateinit var password : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginbtn= findViewById(R.id.loginbtn)
        login=findViewById(R.id.login)
        username=findViewById(R.id.username)
        password=findViewById(R.id.password)
        loginbtn.setOnClickListener{
            val username1=username.text.toString()
            val pass=password.text.toString()
            if (username1 == "Utpal" && pass == "pass") {
                //Toast.makeText(this, "Login success!", Toast.LENGTH_SHORT).show()
                val i = Intent(this, HomeActivity::class.java).apply {
                    putExtra(MY_MESSAGE, username1)
                }
                startActivity(i)
            } else {
                Toast.makeText(this, "Login failed!", Toast.LENGTH_SHORT).show()
            }
        }

    }

//    EditText
}


