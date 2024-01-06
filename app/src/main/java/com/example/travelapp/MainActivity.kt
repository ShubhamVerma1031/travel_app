package com.example.travelapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
   private var currentImage = 0
    lateinit var image : ImageView

    var placeName = arrayOf("Taj Mahal","Red Fort","India Gate","Akshardham Temple","Banaras","Bhool Bhulaiya Lucknow")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)
        var places = findViewById<TextView>(R.id.tVName)


        next.setOnClickListener {
            // i want to see the next image
            var idCurrentImageString = "pic$currentImage"
            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (6+currentImage+1)%6
            var idImageToShowString = "pic$currentImage"
            var idImageToShowSInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image = findViewById(idImageToShowSInt)
            image.alpha = 1f
            places.text = placeName[currentImage]

        }

        prev.setOnClickListener {
            //  i want to see the previous image
            var idCurrentImageString = "pic$currentImage"
            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (6+currentImage-1)%6
            var idImageToShowString = "pic$currentImage"
            var idImageToShowSInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image = findViewById(idImageToShowSInt)
            image.alpha = 1f


        }

    }
}