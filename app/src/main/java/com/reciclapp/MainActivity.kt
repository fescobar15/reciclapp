package com.reciclapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        but_puntos.setOnClickListener {
            val intent = Intent(this, Activity_Puntos::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
