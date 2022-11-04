package com.example.slideshow_simpleandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var prevButton: Button
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        //stuff to leave be
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //let's link our Button variables up to the real Button Views
        this.prevButton = this.findViewById(R.id.button_previous)
        this.nextButton = this.findViewById(R.id.button_next)

        //Setup action listeners for our buttons!
        this.prevButton.setOnClickListener { view: View ->
            println("Previous button clicked!")
        }

        this.nextButton.setOnClickListener { view: View ->
            println("Next button clicked!")
        }
    }
}