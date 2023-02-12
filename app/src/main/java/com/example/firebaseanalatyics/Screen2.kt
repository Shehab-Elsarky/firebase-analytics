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

class Screen2 : AppCompatActivity() {
    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val button = findViewById<Button>(R.id.btn3)
        button.setOnClickListener {
            startActivity(Intent(this@Screen2,Screen3::class.java))
        }
    }

    override fun onResume() {
        super.onResume()

        firebaseAnalytics = Firebase.analytics

        firebaseAnalytics.logEvent("ScreenTwoEventOne", bundleOf()) /*{
            param("ScreenTwo_param", "eventOne")
            param("ScreenTwo_param", "eventTwo")
            param("ScreenTwo_param", "eventThree")
        }*/
        firebaseAnalytics.logEvent("ScreenTwoEventTwo", bundleOf())
        firebaseAnalytics.logEvent("ScreenTwoEventTThree", bundleOf())

        firebaseAnalytics.setUserProperty("screenName", "ScreenTwo")
    }
}