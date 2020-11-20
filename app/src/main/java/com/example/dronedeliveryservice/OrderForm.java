package com.example.dronedeliveryservice;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class OrderForm extends AppCompatActivity {

    TextView receiver_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_form);

    receiver_msg = (TextView)findViewById(R.id.get_product_name);

    Intent intent = getIntent();

    String str = intent.getStringExtra("message_key");

    receiver_msg.setText(str);

    }
}