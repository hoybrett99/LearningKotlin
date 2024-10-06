package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication2.databinding.ActivityMainBinding

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person


        val tvPerson = findViewById<TextView>(R.id.tvPerson)
        tvPerson.text = "${person.name} is ${person.age} years old living in ${person.country}"
    }
}


