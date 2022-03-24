package ru.gb.a2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import ru.gb.a2kotlin.R

class MainActivity : AppCompatActivity() {

    lateinit var closeMe: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        closeMe = findViewById(R.id.close_me)

        closeMe.setOnClickListener {
            Log.i("MainActivity", "Hello World")
        }
    }
}