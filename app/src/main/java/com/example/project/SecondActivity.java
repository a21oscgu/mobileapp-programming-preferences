package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button close = findViewById(R.id.close2nd);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Shared preferences (initieras)
                SharedPreferences myPreferenceRef = getSharedPreferences("POSTNORD_OBJEKT",MODE_PRIVATE);
                SharedPreferences.Editor myPreferenceEditor = myPreferenceRef.edit();

                // Read a preference
                EditText prefTextRef;
                prefTextRef= findViewById(R.id.myedittext);

                // Sätter in text i nyckeln "username"
                myPreferenceEditor.putString("username", prefTextRef.getText().toString());
                myPreferenceEditor.apply();

                finish();
            }
        });
    }
}