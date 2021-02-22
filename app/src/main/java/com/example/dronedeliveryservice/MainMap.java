package com.example.dronedeliveryservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
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


public class MainMap extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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