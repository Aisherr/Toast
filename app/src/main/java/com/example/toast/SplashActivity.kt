package com.example.toast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SplashActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val btnTst:Button = findViewById(R.id.btnTst)
        val btnInt:Button = findViewById(R.id.btnInt)

        btnTst.setOnClickListener {
            Toast.makeText(this,"This is my first Toast Message", Toast.LENGTH_LONG).show()

            //val toast =Toast.makeText("My other Toast Message", Toast.LENGTH_LONG)
            //toast.show()


            //Button for Explicit intent
            btnInt.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}