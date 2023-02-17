package com.example.easytolearn

import android.app.Activity
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image= findViewById<View>(R.id.level0Image)
        image.setOnClickListener {
            val intent =Intent(this, category::class.java)
            startActivity(intent)
        }



    }
}