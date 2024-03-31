package com.example.interactiveapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonDark=findViewById<Button>(R.id.btnDark)
        val ButtonLight=findViewById<Button>(R.id.btnLight)
        val Layout=findViewById<LinearLayout>(R.id.main)

        ButtonDark.setOnClickListener {
            //Change the light theme
            Layout.setBackgroundResource(R.color.black)
        }
        ButtonLight.setOnClickListener {
           //Change the light theme
           Layout.setBackgroundResource(R.color.light_blue)
       }


    }
}

