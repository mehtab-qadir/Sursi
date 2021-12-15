package com.buzzware.sursi.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.ActivityCreateThreadBinding;
import com.buzzware.sursi.databinding.ActivityLoginBinding;
import com.buzzware.sursi.databinding.ActivityStartUpBinding;

public class CreateThreadActivity extends AppCompatActivity {

    private ActivityCreateThreadBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateThreadBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setViews();
        setListeners();

    }

    private void setViews() {
        binding.includeView.titleTV.setText("Create Thread");
        binding.includeView.menuIV.setVisibility(View.GONE);

    }

    private void setListeners() {

        binding.postBt.setOnClickListener(view -> finish());

        binding.includeView.backIV.setOnClickListener(view -> {
           finish();
        });

    }

}