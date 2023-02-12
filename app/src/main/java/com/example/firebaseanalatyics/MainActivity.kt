package com.example.firebaseanalatyics

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this@MainActivity, Screen1::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        firebaseAnalytics = Firebase.analytics

        firebaseAnalytics.logEvent("MainActivityEventOne", bundleOf())
        firebaseAnalytics.logEvent("MainActivityEventTwo", bundleOf())
        firebaseAnalytics.logEvent("MainActivityEventThree", bundleOf())

        firebaseAnalytics.setUserProperty("screenName", "Mainscreen")
    }
}