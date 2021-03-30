package com.example.dronedeliveryservice;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class OrderForm extends AppCompatActivity {

    TextView product_name_output;
    TextView product_number_output;
    TextView product_weight_output;
    TextView product_dimensions_output;
    TextView product_weight_class_output;
    TextView bay_sel_output;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_form);

    product_name_output = (TextView)findViewById(R.id.get_product_name);
    product_number_output = (TextView)findViewById(R.id.get_product_number);
    product_weight_output = (TextView)findViewById(R.id.get_product_weight);
    product_dimensions_output = (TextView)findViewById(R.id.get_product_dimensions);
    product_weight_class_output = (TextView)findViewById(R.id.get_product_weight_class);
    //bay_sel_output = (TextView)findViewById(R.id.get_bay_sel);
    Intent intent = getIntent();

    String product_name_key = intent.getStringExtra("product_name_key");
    String product_number_key = intent.getStringExtra("product_number_key");
    String product_weight_key = intent.getStringExtra("product_weight_key");
    String product_dimensions_key = intent.getStringExtra("product_dimensions_key");
    String product_weight_class_key = intent.getStringExtra("product_weight_class_key");
    String bay_sel_key = intent.getStringExtra("bay_sel_key");


    product_name_output.setText(product_name_key);
    product_number_output.setText(product_number_key);
    product_weight_output.setText(product_weight_key);
    product_dimensions_output.setText(product_dimensions_key);
    product_weight_class_output.setText(product_weight_class_key);


    Button choose_bay_btn = (Button)findViewById(R.id.choose_bay_btn);
    choose_bay_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),BayDashboard.class);
            startActivity(i);
        }
    });

    }

}