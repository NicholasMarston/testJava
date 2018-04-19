package com.labracadabra.testjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class profiles extends AppCompatActivity {

    private Button beginButton;
    private Button guestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiles);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        beginButton = (Button) findViewById(R.id.continueLAB);
        // Once clicked, the app advances to the Locations pages.
        beginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity2();
            }
        });

        guestButton = (Button) findViewById(R.id.Guest);
        // Once clicked, the app advances to the Locations pages.
        guestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity3();
            }
        });

    }
    // launchActivity2 handles the Begin button click.
    // Once clicked, the app advances to the Locations pages.
    private void launchActivity2() {

        Intent intent = new Intent(this, locationsSelect.class);
        startActivity(intent);
    }

    // launchActivity3 handles the Guest button click.
    // Once clicked, the app advances to the Locations page.
    private void launchActivity3() {

        Intent intent = new Intent(this, locationsSelect.class);
        startActivity(intent);
    }
}
