package com.example.paintapplication

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.paintapplication.PaintView.Companion.colorList
import com.example.paintapplication.PaintView.Companion.currentBrush
import com.example.paintapplication.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        val redColor = findViewById<ImageButton>(R.id.redColor)
        val yellowColor = findViewById<ImageButton>(R.id.yellowColor)
        val blackColor = findViewById<ImageButton>(R.id.blackColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)

        redColor.setOnClickListener{
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)

        }
        yellowColor.setOnClickListener{
            paintBrush.color = Color.YELLOW
            currentColor(paintBrush.color)

        }
        blackColor.setOnClickListener{
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)

        }
        eraser.setOnClickListener{
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }
    private fun currentColor(color:Int){
        currentBrush = color
        path = Path()
    }
}