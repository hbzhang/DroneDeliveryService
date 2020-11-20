package com.example.dronedeliveryservice;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class ProductWeight extends AppCompatActivity {

    String product_weight;
    EditText enter_weight;
    Button next_order_form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_weight);

        enter_weight = (EditText) findViewById(R.id.enter_weight);

        next_order_form = (Button) findViewById(R.id.next_order_form);
        next_order_form.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                product_weight = enter_weight.getText().toString();
                Intent intent = new Intent(ProductWeight.this, OrderForm.class);
                startActivity(intent);
            }

        });

    }
}