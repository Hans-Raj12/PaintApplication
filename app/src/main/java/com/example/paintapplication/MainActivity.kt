package com.example.paintapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redColor = findViewById<ImageButton>(R.id.redColor)
        val yellowColor = findViewById<ImageButton>(R.id.yellowColor)
        val blackColor = findViewById<ImageButton>(R.id.blackColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)

        redColor.setOnClickListener{

        }
        yellowColor.setOnClickListener{

        }
        blackColor.setOnClickListener{

        }
        eraser.setOnClickListener{

        }

    }
}