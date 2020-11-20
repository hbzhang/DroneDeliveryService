package com.example.dronedeliveryservice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_actions_page.*

class ActionsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actions_page)

        order_infoBtn.setOnClickListener{
            val intent1 = Intent(this, OrderInfo::class.java)
            startActivity(intent1)
        }
        bay1_btn.setOnClickListener{
            val intent2 = Intent(this, Bay1::class.java)
            startActivity(intent2)
        }
        dashboard_btn2.setOnClickListener{
            val intent3 = Intent(this, BayDashboard::class.java)
            startActivity(intent3)
        }

        dashboard_nav_button.setOnClickListener {
            val intent = Intent(this, BayDashboard::class.java)
            startActivity(intent)
        }

    }
}