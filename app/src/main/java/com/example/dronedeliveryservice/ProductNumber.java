package com.example.dronedeliveryservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class ProductNumber extends AppCompatActivity {

    String name;
    EditText nameInput;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_number);

        nameInput = (EditText) findViewById(R.id.product_number);
        submitButton = (Button) findViewById(R.id.next_name);
        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                Intent intent = new Intent(ProductNumber.this, ProductName.class);
                startActivity(intent);
            }

        });

    }
}