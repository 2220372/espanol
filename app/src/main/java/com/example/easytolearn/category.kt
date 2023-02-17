package com.example.easytolearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class category : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val greetBtn = findViewById<Button>(R.id.greets)
        val numberBtn = findViewById<Button>(R.id.numbers)
        val fruitsBtn = findViewById<Button>(R.id.fruits)


        greetBtn.setOnClickListener {
            val intent = Intent(this,course::class.java)
            startActivity(intent)
        }
       /* numberBtn.setOnClickListener {
            val intent = Intent(this,course::class.java)
            startActivity(intent)
        }
        fruitsBtn.setOnClickListener {
            val intent = Intent(this,course::class.java)
            startActivity(intent)
        }

        */



    }
}