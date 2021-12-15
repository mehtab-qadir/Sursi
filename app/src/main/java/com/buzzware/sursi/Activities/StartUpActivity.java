package com.buzzware.sursi.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.ActivityStartUpBinding;

public class StartUpActivity extends AppCompatActivity {
    private ActivityStartUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStartUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        setListeners();
    }

    private void setListeners() {

        binding.signInBT.setOnClickListener(view -> {
            startActivity(new Intent(StartUpActivity.this, LoginActivity.class));
        });

        binding.signUpBT.setOnClickListener(view -> {
            startActivity(new Intent(StartUpActivity.this, RegistrationActivity.class));
        });

    }
}