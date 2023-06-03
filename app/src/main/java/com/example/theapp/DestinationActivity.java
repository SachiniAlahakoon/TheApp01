package com.example.theapp;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DestinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        EditText editTextFrom = findViewById(R.id.editTextTextPersonName3);
        EditText editTextTo = findViewById(R.id.editTextTextPersonName5);

        // Retrieve and display the destination information from your data source
        String from = "New York";
        String to = "London";

        editTextFrom.setText(from);
        editTextTo.setText(to);
    }
}
