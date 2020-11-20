package com.example.dronedeliveryservice

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_order_info.*

class OrderInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_info)

        dashboard_btn1.setOnClickListener{
            val intent1 = Intent(this, BayDashboard::class.java)
            startActivity(intent1)
        }

        droneinfo_btn.setOnClickListener{
            val intent1 = Intent(this, Bay1::class.java)
            startActivity(intent1)
        }

        //Dimensions Drop Down Menu

        val spinner: Spinner = findViewById(R.id.dimensions_spinner)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
                this,
                R.array.dimensions,
                android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

//Weight Class Drop Down Menu

        val spinner1: Spinner = findViewById(R.id.weight_class_spinner)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.weight_class,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner1.adapter = adapter
        }

        dashboard_nav_button.setOnClickListener {
            val intent = Intent(this, BayDashboard::class.java)
            startActivity(intent)
        }

    }




}
