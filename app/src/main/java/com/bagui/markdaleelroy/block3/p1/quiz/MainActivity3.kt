package com.bagui.markdaleelroy.block3.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    private lateinit var tvTitle: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvTitle = findViewById(R.id.tv_title)
        val getFirst = intent.getStringExtra("first")
        val getSecond = intent.getStringExtra("middle")
        val getThird = intent.getStringExtra("last")

        tvTitle.text= "$getFirst$getSecond$getThird"

    }

}