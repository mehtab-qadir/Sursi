package com.buzzware.sursi.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.buzzware.sursi.Fragments.CalendarFragment;
import com.buzzware.sursi.Fragments.HomeFragment;
import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.ActivityHomeBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.bottomNav.setOnNavigationItemSelectedListener(item -> onNavItemSelected(item));

    }

    protected void setFragment(Fragment fragment) {
        FragmentTransaction t = getSupportFragmentManager().beginTransaction();
        t.replace(binding.fragmentContainer.getId(), fragment);
        t.commit();
    }
    private boolean onNavItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.homeItem:

                setFragment(new HomeFragment());

                break;

            case R.id.bookItem:

                setFragment(new HomeFragment());

                break;

            case R.id.diamondItem:

                break;

            case R.id.calendarItem:

                setFragment(new CalendarFragment());


                break;

            case R.id.profileItem:

                break;


        }

        return true;

    }
}