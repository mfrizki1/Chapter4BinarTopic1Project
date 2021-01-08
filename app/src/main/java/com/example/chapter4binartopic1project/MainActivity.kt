package com.example.chapter4binartopic1project

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtFont = findViewById<TextView>(R.id.txt_custom_font)
        txtFont.typeface = Typeface.createFromAsset(assets, "font/EastSeaDokdoReg.ttf")
        txtFont.textSize = 28f
    }
}