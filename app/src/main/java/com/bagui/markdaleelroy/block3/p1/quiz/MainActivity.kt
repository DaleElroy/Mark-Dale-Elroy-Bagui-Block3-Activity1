package com.bagui.markdaleelroy.block3.p1.quiz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var firstName: EditText
    private lateinit var middleName: EditText
    private lateinit var lastName: EditText
    private lateinit var btPropper: Button
    private lateinit var btComplete: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btPropper = findViewById(R.id.bt_Propper)
        btComplete = findViewById(R.id.bt_Complete)
        firstName = findViewById(R.id.et_first_name)
        middleName = findViewById(R.id.et_middle_name)
        lastName = findViewById(R.id.et_last_name)

        btPropper.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("last",lastName.text.toString())
            intent.putExtra("first",firstName.text.toString())
            intent.putExtra("middle",middleName.text.toString())
            startActivity(intent)

        }
        btComplete.setOnClickListener{
            val vent = Intent(this,MainActivity3::class.java)
            vent.putExtra("last",lastName.text.toString())
            vent.putExtra("first",firstName.text.toString())
            vent.putExtra("middle",middleName.text.toString())
            startActivity(vent)

        }
    }
}