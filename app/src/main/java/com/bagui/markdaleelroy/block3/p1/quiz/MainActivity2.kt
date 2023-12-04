package com.bagui.markdaleelroy.block3.p1.quiz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var tvTitle: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvTitle = findViewById(R.id.tv_title)
        val getFirst = intent.getStringExtra("last")
        val getSecond = intent.getStringExtra("first")
        val getThird = intent.getStringExtra("middle")

        tvTitle.text= "$getFirst$getSecond$getThird"

    }

}