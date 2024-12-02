package com.example.lesson3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val addStudentButton = findViewById<Button>(R.id.btnMainAddStudent)
        val addStudentButton: Button = findViewById(R.id.btnMainAddStudent)

        //option 1
//        class ButtonOnClickListener : View.OnClickListener {
//            override fun onClick(v: View?) {
//                val intent = Intent(this@MainActivity, AddStudentActivity::class.java)
//            }
//
//        }

        //option 2
        //val listener = ButtonOnClickListener()
        //addStudentButton.setOnClickListener(ButtonOnClickListener())

        //option 3
        //addStudentButton.setOnClickListener(View.OnClickListener { })

        //lambda expression
        //addStudentButton.setOnClickListener {}

        addStudentButton.setOnClickListener(::onAddStudentButtonClicked)
    }
    fun onAddStudentButtonClicked(view: View) {
        val intent = Intent(this, AddStudentActivity::class.java)
        startActivity(intent)
    }
}