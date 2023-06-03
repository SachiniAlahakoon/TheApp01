package com.example.theapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class ProfileActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPhone = findViewById(R.id.editTextPhone);
        Button buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(v -> {
            // Get the entered email and phone
            String email = editTextEmail.getText().toString();
            String phone = editTextPhone.getText().toString();

            // Validate the inputs
            if (email.isEmpty() || phone.isEmpty()) {
                Toast.makeText(ProfileActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            } else {
                // Save the profile information
                saveProfile();
            }
        });
    }

    private void saveProfile() {
        // Implement your logic to save the profile information
        // This is just a placeholder method
        Toast.makeText(this, "Profile information saved successfully", Toast.LENGTH_SHORT).show();
    }
}
