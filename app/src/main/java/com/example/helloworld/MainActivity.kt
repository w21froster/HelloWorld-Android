package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

// activities are screens in a app
class MainActivity : AppCompatActivity() {
    // when activity is first created, it will run onCreate (like a constructor for activity)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton) // Resource.ID.NameOfButton
        button.setOnClickListener {
            Log.v("Hello world", "Button clicked!")
            Toast.makeText(this,getString(R.string.hello_world_reply), Toast.LENGTH_SHORT).show()
        }
    }
}