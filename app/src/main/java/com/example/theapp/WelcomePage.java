package com.example.theapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(WelcomePage.this,MainActivity.class);
            startActivity(intent);
            finish();
        },3000);

    }
}