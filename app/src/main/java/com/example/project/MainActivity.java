package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button open = findViewById(R.id.open2nd);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Get a reference to the shared preference
        // POSTNORD_OBJEKT är ett objekt som håller nyckeln "username"
        SharedPreferences myPreferenceRef = getSharedPreferences("POSTNORD_OBJEKT", MODE_PRIVATE);

        // Display preferences.
        // Texten från nyckeln "username" kopplas med "mytextview"
        TextView prefTextRef;
        prefTextRef= findViewById(R.id.mytextview);
        prefTextRef.setText(myPreferenceRef.getString("username", "No username found."));

    }
}
