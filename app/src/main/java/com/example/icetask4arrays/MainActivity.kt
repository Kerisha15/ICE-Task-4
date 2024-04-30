package com.example.icetask4arrays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cars = arrayOf("Audi", "BMW", "Ferrari", "Mercedes-Benz", "Porsche", "Toyota")

        val textView: TextView = findViewById(R.id.textView)

        var carsText = ""

        for (car in cars) {
            carsText += "$car\n"
        }
        textView.text = carsText
    }
}