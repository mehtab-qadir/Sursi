package com.buzzware.sursi.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.buzzware.sursi.databinding.ActivityEguideDetailBinding;

public class EGuideDetailActivity extends AppCompatActivity {

    ActivityEguideDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityEguideDetailBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        setListener();

    }

    private void setListener() {

        binding.backIV.setOnClickListener(v->finish());

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        finish();

    }
}