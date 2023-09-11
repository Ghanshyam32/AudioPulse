package com.ghanshyam.spotifyclone

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.tasks.Task

class SettingsActivity : AppCompatActivity() {
    var googleSignInOptions: GoogleSignInOptions? = null
    var googleSignInClient: GoogleSignInClient? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        WindowCompat.setDecorFitsSystemWindows(
            window, false
        )
        val email = findViewById<TextView>(R.id.email)
        val name = findViewById<TextView>(R.id.name)
        val signOut = findViewById<Button>(R.id.signOut)
        googleSignInOptions =
            GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build()
        googleSignInClient = GoogleSignIn.getClient(this, googleSignInOptions!!)
        val googleSignInAccount = GoogleSignIn.getLastSignedInAccount(this)
        if (googleSignInAccount != null) {
            val pName = googleSignInAccount.displayName
            val pEmail = googleSignInAccount.email
            name.text = pName
            email.text = pEmail
        }
        signOut.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                signOut()
            }

            private fun signOut() {
                googleSignInClient!!.signOut().addOnCompleteListener { task: Task<Void?>? ->
                    finish()
                    startActivity(Intent(this@SettingsActivity, LoginActivity::class.java))
                }
            }
        })
    }
}