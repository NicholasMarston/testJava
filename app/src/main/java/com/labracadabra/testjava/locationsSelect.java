package com.labracadabra.testjava;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class locationsSelect extends AppCompatActivity {

    private Button backButton;

    private ImageButton hardware;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations_select);

        backButton = (Button) findViewById(R.id.backtoprofile);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });
        //
        hardware = (ImageButton) findViewById(R.id.hardwareButton);

        hardware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity2();
            }
        });
    }






    private void launchActivity() {

        Intent intent = new Intent(this, profiles.class);
        startActivity(intent);
    }
    private void launchActivity2() {

        Intent intent = new Intent(this, HardwareStore.class);
        startActivity(intent);
    }
}
