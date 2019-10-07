package com.reciclapp

import android.content.Context
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

        but_centros.setOnClickListener {
            val intent = Intent(this, Activity_Mapa::class.java)
            // start your next activity
            startActivity(intent)
        }
    }

    companion object {
        fun getLaunchIntent(from: Context) = Intent(from, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }
}
