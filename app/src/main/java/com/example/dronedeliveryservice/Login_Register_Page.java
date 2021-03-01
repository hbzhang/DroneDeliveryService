package com.example.dronedeliveryservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Register_Page extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__register__page);

        Button actions_intent = (Button) findViewById(R.id.continue_btn);
        actions_intent.setOnClickListener(this);
    }
//
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.continue_btn:
                Intent intent1 = new Intent(Login_Register_Page.this, SelectionPage.class);
                startActivity(intent1);
                break;

            default:
                break;
        }
    }
}