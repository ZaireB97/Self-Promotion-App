package com.zairebryant.selfpromo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.sax.StartElementListener
//import android.view.View
//import android.widget.Button
//import android.widget.CheckBox
//import android.widget.Spinner
//import android.widget.Toast
//import android.window.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.material.textfield.TextInputEditText
import com.zairebryant.selfpromo.databinding.ActivityMainBinding

import java.time.Duration

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        Thread.sleep(2000)
        setContentView(view)



        binding.newProfileTextView.setOnClickListener {

            onStartNewProfile()
        }

        binding.textViewViewMessages.setOnClickListener {

            viewMessages()


        }

    }

    private fun onStartNewProfile() {

        val intent = Intent(this, InfoActivity::class.java)
        startActivity(intent)


    }


    private fun viewMessages() {

        val intent = Intent(this, ViewMessagesActivity::class.java)


        startActivity(intent)
    }
}