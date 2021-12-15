package com.buzzware.sursi.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.buzzware.sursi.Activities.HomeActivity;
import com.buzzware.sursi.Activities.ScheduleAppointment;
import com.buzzware.sursi.Adapters.DoctorListAdapter;
import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.FragmentHomeBinding;
import com.buzzware.sursi.databinding.FragmentPopupCalendarBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;

    public HomeFragment() {


    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @org.jetbrains.annotations.NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        binding.includeAppBar.titleTV.setText("Sursi");

        binding.scheduleBt.setOnClickListener(view -> showUploadDialog());

        binding.homeRV.setLayoutManager(new LinearLayoutManager(getActivity()));

        binding.homeRV.setAdapter(new DoctorListAdapter(getActivity(), null));

        return  binding.getRoot();
    }


    private void showUploadDialog() {

        FragmentPopupCalendarBinding dBinding;

        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getContext(), R.style.SheetDialog);

        dBinding = FragmentPopupCalendarBinding.inflate(LayoutInflater.from(getContext()));

        bottomSheetDialog.setContentView(dBinding.getRoot());

        dBinding.setDateBt
                .setOnClickListener(view -> {

                    startActivity(new Intent(getActivity(), ScheduleAppointment.class));

                });

        bottomSheetDialog.show();
    }
}
