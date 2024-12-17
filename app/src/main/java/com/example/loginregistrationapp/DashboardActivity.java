package com.example.loginregistrationapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Buttons for navigation
        Button btnLogin = findViewById(R.id.btn_login);
        Button btnRegister = findViewById(R.id.btn_register);

        // Navigate to Login Activity
        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, com.example.loginregistrationapp.LoginActivity.class);
            startActivity(intent);
        });

        // Navigate to Registration Activity
        btnRegister.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, RegistrationActivity.class);
            startActivity(intent);
        });

        // Bottom Navigation Setup
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnItemSelectedListener(this::handleBottomNavigation);
    }

    private boolean handleBottomNavigation(MenuItem menuItem) {
        // TODO: Add handling code for bottom navigation items
        return false; // No action performed yet
    }
}
