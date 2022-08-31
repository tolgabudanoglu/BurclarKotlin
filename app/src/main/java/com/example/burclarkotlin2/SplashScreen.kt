package com.example.burclarkotlin2

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        var logoDondurAnimasyon = AnimationUtils.loadAnimation(this,R.anim.logo_dondur)
        imgLogo.animation = logoDondurAnimasyon


    }

    override fun onResume() {

        object :CountDownTimer(3000,1000){
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                /*var intent = Intent(this@SplashScreen,MainActivity::class.java)
                startActivity(intent)*/

                val openStartingPoint = Intent(
                    this@SplashScreen,
                    MainActivity::class.java
                ) //creating an intent which is basically a reference to the Android Manifest

                startActivity(openStartingPoint)
            }

        }.start()
        super.onResume()
    }
}