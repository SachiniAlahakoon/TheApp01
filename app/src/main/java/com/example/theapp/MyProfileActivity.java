package com.example.theapp;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        EditText editTextFullName = findViewById(R.id.editTextTextPersonName);
        EditText editTextExpairDate = findViewById(R.id.editTextDate);
        EditText editTextDOB = findViewById(R.id.editTextDate2);
        EditText editTextAge = findViewById(R.id.editTextNumber);
        EditText editTextDestination = findViewById(R.id.editTextTextPersonName4);

        // Retrieve and display the profile information from your data source
        String fullName = "Sachini Alahakoon";
        String expairDate = "2023-06-01";
        String dob = "2000-03-27";
        int age = 23;
        String destination = "Kandy";

        editTextFullName.setText(fullName);
        editTextExpairDate.setText(expairDate);
        editTextDOB.setText(dob);
        editTextAge.setText(String.valueOf(age));
        editTextDestination.setText(destination);
    }
}
