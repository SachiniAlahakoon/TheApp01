package com.example.theapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AppPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_payment);

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(v -> OpenWelcomePage());
    }

    private void OpenWelcomePage() {
    }
}