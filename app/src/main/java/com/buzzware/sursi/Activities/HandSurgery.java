package com.buzzware.sursi.Activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.buzzware.sursi.Fragments.CalendarFragment;
import com.buzzware.sursi.Fragments.FragmentHandSurgery;
import com.buzzware.sursi.Fragments.HomeFragment;
import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.ActivityHomeBinding;
import com.buzzware.sursi.databinding.FragmentHandSurgeryBinding;

public class HandSurgery extends AppCompatActivity {

    FragmentHandSurgeryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentHandSurgeryBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


    }

}