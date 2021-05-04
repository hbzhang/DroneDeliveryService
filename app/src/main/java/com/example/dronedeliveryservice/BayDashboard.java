package com.example.dronedeliveryservice;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.RenderScript;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.*;
import java.net.*;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class BayDashboard extends AppCompatActivity implements View.OnClickListener {

    //public static int baySel;
    //int baySel=0;
    /*public static void client () {

        try {
            Socket s=new Socket("172.16.33.86",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeInt(3);
            dout.flush();
            dout.writeInt(2);
            dout.close();
            s.close();

        }
        catch (Exception e){System.out.println(e);}
        try {
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            baySel=dis.readInt();
            System.out.println("baySel = "+baySel+1);
            ss.close();
        }catch(Exception e){System.out.println(e);}

    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bay_dashboard);
        Button dashboard_bay1 = (Button) findViewById(R.id.dashboard_bay1);
        //client();
        PriorityAlgorithm prio = new PriorityAlgorithm();
        prio.main();
        String BaySel = "Bay: "+prio.getBaySel();
        setContentView(R.layout.bay_dashboard);
        TextView textView = (TextView) findViewById(R.id.bay_rec);
        textView.setText(BaySel);
        dashboard_bay1.setOnClickListener(this);

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