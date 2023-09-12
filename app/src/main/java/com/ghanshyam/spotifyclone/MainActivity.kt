package com.ghanshyam.spotifyclone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val settingsBtn = findViewById<ImageView>(R.id.settings)
        settingsBtn.setOnClickListener {
            val i = Intent(applicationContext, SettingsActivity::class.java)
            startActivity(i)
        }

        val likedSongs = findViewById<LinearLayout>(R.id.likedSongs)
        likedSongs.setOnClickListener{
            val i = Intent(applicationContext, LikedSongs::class.java)
            startActivity(i)
        }

    }
}