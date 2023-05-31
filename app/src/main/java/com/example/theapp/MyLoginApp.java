package com.example.theapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login_app);

        TextView username = findViewById(R.id.username);
        findViewById(R.id.password);


        //admin

        View loginbtn = null;
        assert false;
        loginbtn.setOnClickListener(v -> {
            if(username.getText().toString().equals("admin")){
                Toast.makeText(LoginActivity.this,"LOGIN SUCCESSFULLY",Toast.LENGTH_SHORT).show();
            }else
                Toast.makeText(LoginActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();

        });
    }
}