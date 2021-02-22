package com.example.dronedeliveryservice;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View.OnClickListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


import androidx.appcompat.app.AppCompatActivity;
public class OrderInfo extends AppCompatActivity implements OnMapReadyCallback,View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_info);

        Button drone_info_btn1 = (Button) findViewById(R.id.drone_info_btn);
        drone_info_btn1.setOnClickListener(this);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }


            @Override
            public void onClick(View v) {
                switch(v.getId()) {

                    case R.id.drone_info_btn:
                      Intent drone_info_start = new Intent(getApplicationContext(), Bay1.class);
                      startActivity(drone_info_start);
                      break;



            }
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        GoogleMap map_satellite = googleMap;
        map_satellite.setMapType(map_satellite.MAP_TYPE_SATELLITE);
        LatLng lexington = new LatLng(37.789426336756414, -79.43785182364378);
        map_satellite.animateCamera(CameraUpdateFactory.newLatLngZoom(lexington, 15f));
        googleMap.addMarker(new MarkerOptions()
                .position(lexington)
                .title("Marker at Mallory"))
                .setIcon(BitmapDescriptorFactory.fromResource(R.drawable.airplane_marker));
    }
}