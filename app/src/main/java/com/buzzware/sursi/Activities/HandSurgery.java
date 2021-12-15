package com.buzzware.sursi.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.buzzware.sursi.Fragments.CalendarFragment;
import com.buzzware.sursi.Fragments.FragmentHandSurgery;
import com.buzzware.sursi.Fragments.HomeFragment;
import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.ActivityHomeBinding;
import com.buzzware.sursi.databinding.FragmentHandSurgeryBinding;
import com.buzzware.sursi.databinding.UploadBottomDialogBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class HandSurgery extends AppCompatActivity {

    FragmentHandSurgeryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentHandSurgeryBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.addBt.setOnClickListener(view -> showUploadDialog());

    }



    private void showUploadDialog() {

        UploadBottomDialogBinding dBinding;

        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this, R.style.SheetDialog);

        dBinding = UploadBottomDialogBinding.inflate(LayoutInflater.from(this));

        bottomSheetDialog.setContentView(dBinding.getRoot());

        dBinding.uploadBtn.setOnClickListener(v -> {

            bottomSheetDialog.dismiss();

            startActivity(new Intent(HandSurgery.this, HomeActivity.class)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));

            finish();
        });

        dBinding.image1IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog.dismiss();
            }
        });

        dBinding.image2IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog.dismiss();
            }
        });

        bottomSheetDialog.show();
    }

}