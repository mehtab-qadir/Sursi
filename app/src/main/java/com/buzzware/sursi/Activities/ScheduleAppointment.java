package com.buzzware.sursi.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.buzzware.sursi.databinding.ActivityScheduleAppointmentBinding;
import com.buzzware.sursi.databinding.FragmentHandSurgeryBinding;

public class ScheduleAppointment extends AppCompatActivity {

    ActivityScheduleAppointmentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityScheduleAppointmentBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.addBt.setOnClickListener(view -> moveToHandsOn());

    }

    private void moveToHandsOn() {

        startActivity(new Intent(this, HandSurgery.class));

        finish();

    }

}