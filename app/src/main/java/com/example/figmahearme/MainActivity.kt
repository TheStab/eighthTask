package com.example.figmahearme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStartBtn = findViewById<Button>(R.id.getStartedBtn)

        getStartBtn.setOnClickListener{
            val intent = Intent(this, authorization::class.java)
            startActivity(intent)
            finish()
        }

    }
}