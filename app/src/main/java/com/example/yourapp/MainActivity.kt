package com.example.yourapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tv = TextView(this)
        tv.text = "APK funcionando 👌"
        tv.textSize = 24f
        tv.gravity = android.view.Gravity.CENTER

        setContentView(tv)
    }
}
