package com.example.myapplication

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.firebase.auth.FirebaseAuth

class googleSignOut : AppCompatActivity() {
    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.google_activity)
        supportActionBar?.hide()
        auth= FirebaseAuth.getInstance()

        val email=intent.getStringExtra("email")
        val displayname=intent.getStringExtra("name")
        findViewById<TextView>(R.id.textView3).text=email+"\n"+displayname
        findViewById<Button>(R.id.button).setOnClickListener{
            auth.signOut()
            // FirebaseAuth.getInstance().signOut()
            // googleSignInClient.signOut()
            startActivity(Intent(this,phoneActivity::class.java))
        }

        val intent = Intent()
        intent.component = ComponentName("com.codespacepro.moviecompose", "com.codespacepro.moviecompose.MainActivity")
        startActivity(intent)
    }


}