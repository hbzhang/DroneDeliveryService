package com.example.dronedeliveryservice;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class ProductName extends AppCompatActivity {

    EditText enter_product_name;
    Button next_dimensions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_name);

        enter_product_name = (EditText) findViewById(R.id.enter_product_name);

        next_dimensions = (Button) findViewById(R.id.next_dimensions);
        next_dimensions.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String str = enter_product_name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), OrderForm.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
                Intent intent1 = new Intent(ProductName.this, ProductDimensions.class);
                startActivity(intent1);


            }



        });

    }
}