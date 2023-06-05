package com.example.theapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("CommitTransaction")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain an instance of the FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

// Begin the FragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

// Replace the existing fragment with the new fragment
        Fragment fragment = new Fragment();
        fragmentTransaction.replace(R.id.frame_layout, fragment);

// Commit the transaction
        fragmentTransaction.commit();

    }

}