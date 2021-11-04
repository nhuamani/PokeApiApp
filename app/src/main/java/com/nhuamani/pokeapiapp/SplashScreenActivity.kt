package com.nhuamani.pokeapiapp

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    private var splashProgressBar: ProgressBar? = null

    @SuppressLint("ObjectAnimatorBinding")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // finding progressbar by id
        splashProgressBar = findViewById<ProgressBar>(R.id.splashProgress) as ProgressBar

        val animation = ObjectAnimator.ofInt(splashProgressBar, "progress", 100)
        animation.start()

        Handler().postDelayed(Runnable {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3500)
    }
}