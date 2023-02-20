package com.example.febtestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Finding the resource ID's
        setContentView(R.layout.activity_main)
        val AgeInput: EditText = findViewById(R.id.editText)
        val ConvertButton: Button = findViewById(R.id.button)
        val Result: TextView = findViewById(R.id.convertedAge)

        //Whenever the button is clicked upon we then convert the age!
        ConvertButton.setOnClickListener {
            var AgeInYears = AgeInput.text.toString().toInt()
            var ConvertedAge : Int = AgeInYears * 365
            Result.text = ConvertedAge.toString()
        }

    }

}