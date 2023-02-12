package com.example.firebaseanalatyics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase

class Screen3 : AppCompatActivity() {
    private lateinit var  firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
    }

    override fun onResume() {
        super.onResume()
        firebaseAnalytics = Firebase.analytics

        firebaseAnalytics.logEvent("ScreenThreeEventOne", bundleOf()) /*{
            param("ScreenThree_param", "eventOne")
            param("ScreenThree_param", "eventTwo")
            param("ScreenThree_param", "eventThree")
        }*/
        firebaseAnalytics.logEvent("ScreenTThreeEventTwo", bundleOf())
        firebaseAnalytics.logEvent("ScreenThreeEventTThree", bundleOf())

        firebaseAnalytics.setUserProperty("screenName", "ScreenThree")
    }
}