package com.example.myapplication

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity3 : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var signOutBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2) // assuming your layout file is activity_main.xml

        auth = FirebaseAuth.getInstance()
        signOutBtn = findViewById(R.id.signOutBtn)

        signOutBtn.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this, phoneActivity::class.java))
        }

        val intent = Intent()
        intent.component = ComponentName("com.codespacepro.moviecompose", "com.codespacepro.moviecompose.MainActivity")
        startActivity(intent)
    }


}

