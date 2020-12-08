package com.example.dronedeliveryservice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_selection_page.*

class NewOrderForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_order_form)

        create_new_order.setOnClickListener {


            

            val intent = Intent(this, ProductNumber::class.java)
            startActivity(intent)
        }
    }
}