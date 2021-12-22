package com.buzzware.sursi.Activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.buzzware.sursi.databinding.ActivityCreateThreadBinding;

public class EditThread extends AppCompatActivity {

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
        binding.includeView.titleTV.setText("Edit Thread");
        binding.includeView.menuIV.setVisibility(View.GONE);

    }

    private void setListeners() {

        binding.postBt.setText("Save");
        binding.postBt.setOnClickListener(view -> finish());

        binding.includeView.backIV.setOnClickListener(view -> {
           finish();
        });

    }

}