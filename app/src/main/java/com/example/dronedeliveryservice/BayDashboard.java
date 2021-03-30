package com.example.dronedeliveryservice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class BayDashboard extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bay_dashboard);

        Button dashboard_bay1 = (Button) findViewById(R.id.dashboard_bay1);
        dashboard_bay1.setOnClickListener(this);

        setContentView(R.layout.bay_dashboard);
        TextView textView = (TextView) findViewById(R.id.bay_rec);
        textView.setText("text you want to display");

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.dashboard_bay1:
                Intent bay_1 = new Intent(getApplicationContext(), Bay1.class);
                startActivity(bay_1);
                break;


        }
    }
}