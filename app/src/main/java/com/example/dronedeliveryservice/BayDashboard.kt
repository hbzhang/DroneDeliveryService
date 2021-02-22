package com.example.dronedeliveryservice
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.bay_dashboard.*

class BayDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bay_dashboard)

        dashboard_bay1.setOnClickListener {
            val intent = Intent(this, OrderInfo::class.java)
            startActivity(intent)
        }

        dashboard_bay2.setOnClickListener {
            val intent = Intent(this, OrderInfo::class.java)
            startActivity(intent)
        }

        dashboard_bay3.setOnClickListener {
            val intent = Intent(this, OrderInfo::class.java)
            startActivity(intent)
        }

        dashboard_nav_button.setOnClickListener {
            val intent = Intent(this, BayDashboard::class.java)
            startActivity(intent)
        }
        orders_nav_button.setOnClickListener {
            val intent = Intent(this, OrderInfo::class.java)
            startActivity(intent)
        }
        maps_nav_button.setOnClickListener {
            val intent3 = Intent(this, MainMap::class.java)
            startActivity(intent3)
        }

    }
}