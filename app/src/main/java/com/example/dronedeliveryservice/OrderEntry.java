package com.example.dronedeliveryservice;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class OrderEntry extends AppCompatActivity {

    EditText enter_product_name;
    EditText enter_product_number;
    EditText enter_product_weight;
    EditText enter_dimensions;
    EditText enter_weight_class;

    Button submit_btn_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_entry);

    Button submit_btn_id = (Button)findViewById(R.id.submit_btn);
    enter_product_name = (EditText)findViewById(R.id.enter_product_name);
    enter_product_number = (EditText)findViewById(R.id.enter_product_number);
    enter_product_weight = (EditText)findViewById(R.id.enter_weight);
    enter_dimensions = (EditText)findViewById(R.id.enter_dimensions);
    enter_weight_class = (EditText)findViewById(R.id.enter_weight_class);



        submit_btn_id.setOnClickListener(new OnClickListener() {
        @Override
            public void onClick(View v)
            {

                String product_name_str = enter_product_name.getText().toString();
                String product_number_str = enter_product_number.getText().toString();
                String product_weight_str = enter_product_weight.getText().toString();
                String product_dimensions_str = enter_dimensions.getText().toString();
                String product_weight_class_str = enter_weight_class.getText().toString();


                Intent intent = new Intent(getApplicationContext(), OrderForm.class);

                intent.putExtra("product_name_key", product_name_str);
                intent.putExtra("product_number_key", product_number_str);
                intent.putExtra("product_weight_key", product_weight_str);
                intent.putExtra("product_dimensions_key", product_dimensions_str);
                intent.putExtra("product_weight_class_key", product_weight_class_str);

                // start the Intent
                startActivity(intent);
            }
        });
    }
    }
