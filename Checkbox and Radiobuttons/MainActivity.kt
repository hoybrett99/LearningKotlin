package com.example.myapplication2

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOrder.setOnClickListener {
            val checkedMeatRadioButtonID = binding.rgMeat.checkedRadioButtonId // this chooses item that is checked
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonID) // stores the meat information in variable
            val cheese = binding.cbCheese.isChecked // getting the information through check or not
            val onions = binding.cbOnions.isChecked
            val salad = binding.cbSalad.isChecked
            val orderString = "You ordered a burger with:\n" +
                    "${meat.text} burger" +
                    (if (cheese) "\nCheese" else "") + // Adding if/else statement to display whether the ingredients are checked or not
                    (if (onions) "\nOnions" else "") +
                    (if (salad) "\nSalad" else "")
            binding.tvOrder.text = orderString
        }

    }
}
