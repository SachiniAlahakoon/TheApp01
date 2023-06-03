package com.example.theapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LogOutScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out_screen);

        TextView textViewLogout = findViewById(R.id.textView8);

        textViewLogout.setOnClickListener(view -> {
            // Perform logout action here
            // Add your code to handle the logout functionality
        });
    }
}