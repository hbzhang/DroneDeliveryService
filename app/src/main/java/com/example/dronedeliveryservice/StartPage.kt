package com.example.dronedeliveryservice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.start_page.*

class StartPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_page)

        enter_btn.setOnClickListener {
            val intent = Intent(this, Login_Register_Page::class.java)
            startActivity(intent)
            }
        }
    }
