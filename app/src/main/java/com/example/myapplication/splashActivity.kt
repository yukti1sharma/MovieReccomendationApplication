package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.os.Handler

class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        supportActionBar?.hide()
        Handler().postDelayed(
            {
                val intent = Intent(this, phoneActivity::class.java)
                startActivity(intent)
                finish()
            },
            3000,
        )
    }
}