package com.example.catest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val toastButton = findViewById<Button>(R.id.bt1);
        val edit1 = findViewById<EditText>(R.id.et1)
        val edit2 = findViewById<EditText>(R.id.et2)
        val edit3 = findViewById<EditText>(R.id.et3)
        toastButton.setOnClickListener {
            val marks1 = edit1.text.toString().toFloat()
            val marks2 = edit2.text.toString().toFloat()
            val marks3 = edit3.text.toString().toFloat()

            var cgpa = ((marks1+marks2+marks3)/300f)*10f;
            val finalCGPA = String.format("%.2f",cgpa)
            Toast.makeText(this,"$finalCGPA is the CGPA !",Toast.LENGTH_LONG).show();
        }

    }
}