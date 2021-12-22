package com.buzzware.sursi.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.buzzware.sursi.Adapters.ThreadListAdapter;
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

        binding.includeView.menuIV.setVisibility(View.VISIBLE);
        binding.includeView.menuIV.setOnClickListener(view -> {

            startActivity(new Intent(getActivity(), NotificationsFragment.class));

        });

        binding.homeRV.setLayoutManager(new LinearLayoutManager(getContext()));

        ThreadListAdapter threadListAdapter = new ThreadListAdapter(getContext(), null, true);

        binding.homeRV.setAdapter(threadListAdapter);


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