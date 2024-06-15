package com.app.idzdigital

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.getStringExtra("name")
        val nameTextView: TextView = findViewById(R.id.nameTextView)

        val age=intent.getStringExtra("age")
        val nameTextViewage:TextView=findViewById(R.id.nameTextViewage)

        val salary=intent.getStringExtra("salary")
        val nameTextViewSalary:TextView=findViewById(R.id.nameTextViewSalary)

        nameTextView.text = name
        nameTextViewage.text=age
        nameTextViewSalary.text=salary
    }
}