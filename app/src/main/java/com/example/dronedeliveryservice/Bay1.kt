package com.example.dronedeliveryservice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bay1.*


class Bay1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bay1)
    // TODO: hello there
        dashboard.setOnClickListener{
            val intent1 = Intent(this, BayDashboard::class.java)
            startActivity(intent1)
        }

        actions.setOnClickListener{
            val intent1 = Intent(this, ActionsPage::class.java)
            startActivity(intent1)
        }

        order_info.setOnClickListener{
            val intent1 = Intent(this, OrderInfo::class.java)
            startActivity(intent1)
        }

        dashboard_nav_button.setOnClickListener {
            val intent = Intent(this, BayDashboard::class.java)
            startActivity(intent)
        }

    }
}

