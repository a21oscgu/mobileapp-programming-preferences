package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button close;
    private TextView mytextview;
    private EditText myedittext;
    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myPreferenceRef = getPreferences(MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();

        String pref = myPreferenceRef.getString("TheReferenceKey", "No data.");

        //mytextview = findViewById(R.id.mytextview);
        //mytextview.setText(pref);
        myedittext = findViewById(R.id.myedittext);

        close = findViewById(R.id.close2nd);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("SECONDSURFACE","Activity ends.");


                // Sätter ny text i TextView
                myPreferenceEditor.putString("TheReferenceKey", myedittext.getText().toString());
                myPreferenceEditor.apply();
                //mytextview.setText(myedittext.getText());
                finish();
            }
        });
    }
}