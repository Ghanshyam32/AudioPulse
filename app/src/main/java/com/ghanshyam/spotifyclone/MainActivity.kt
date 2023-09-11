package com.ghanshyam.spotifyclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val settingsBtn = findViewById<ImageView>(R.id.settings)
        settingsBtn.setOnClickListener {
            val i = Intent(applicationContext, SettingsActivity::class.java)
            startActivity(i)
        }
    }
}