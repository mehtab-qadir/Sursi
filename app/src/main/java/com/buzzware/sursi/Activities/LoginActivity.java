package com.buzzware.sursi.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.ActivityLoginBinding;
import com.buzzware.sursi.databinding.ActivityStartUpBinding;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setListeners();

    }

    private void setListeners() {

        binding.loginBT.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, CreateThreadActivity.class));
        });

        binding.newUserTV.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
        });

    }

}