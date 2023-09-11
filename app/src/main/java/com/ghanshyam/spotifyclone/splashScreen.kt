package com.ghanshyam.spotifyclone

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        WindowCompat.setDecorFitsSystemWindows(
            window, false
        )
        Handler().postDelayed({
            val intent = Intent(this@splashScreen, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}