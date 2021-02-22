package com.example.dronedeliveryservice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_selection_page.*

class SelectionPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection_page)

        dashboard_goto.setOnClickListener {
            val intent = Intent(this, BayDashboard::class.java)
            startActivity(intent)
        }

        create_new_order.setOnClickListener {
            val intent1 = Intent(this, OrderEntry::class.java)
            startActivity(intent1)
        }



    }
}