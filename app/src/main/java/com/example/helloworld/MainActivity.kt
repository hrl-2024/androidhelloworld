package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myname = "Ruihang"
        val textView = findViewById<TextView>(R.id.name_text_view)
        textView.text = "Hi, my name is $myname"
    }
}