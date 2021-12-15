package com.buzzware.sursi.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);

        setViews();
        setListeners();
        
        return binding.getRoot();
    }

    private void setViews() {
        binding.includeView.titleTV.setText("Profile");
        binding.includeView.menuIV.setVisibility(View.GONE);
        binding.includeView.backIV.setVisibility(View.GONE);
    }

    private void setListeners() {
    }
}