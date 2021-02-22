package com.example.dronedeliveryservice;

import android.content.Intent;
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


    public class Bay1 extends AppCompatActivity implements OnMapReadyCallback, View.OnClickListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bay1);
            {


                Button actions_intent = (Button) findViewById(R.id.actionsBtn_1);
                actions_intent.setOnClickListener(this);


                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(this);


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

        @Override
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.actionsBtn_1:
                    Intent intent1 = new Intent(Bay1.this, ActionsPage.class);
                    startActivity(intent1);
                    break;

                default:
                    break;
            }
        }
    }



