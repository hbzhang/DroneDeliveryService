package com.example.dronedeliveryservice;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class ProductDimensions extends AppCompatActivity {

    String product_dimensions;
    EditText enter_product_dimensions;
    Button next_weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_dimensions);

        enter_product_dimensions = (EditText) findViewById(R.id.enter_product_dimensions);

        next_weight = (Button) findViewById(R.id.next_weight);
        next_weight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                product_dimensions = enter_product_dimensions.getText().toString();
                Intent intent = new Intent(ProductDimensions.this, ProductWeight.class);
                startActivity(intent);
            }

        });

    }
}