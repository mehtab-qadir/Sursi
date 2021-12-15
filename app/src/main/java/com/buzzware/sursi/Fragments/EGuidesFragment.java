package com.buzzware.sursi.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.buzzware.sursi.Activities.EGuideDetailActivity;
import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.FragmentEGuidesBinding;

public class EGuidesFragment extends Fragment {

    FragmentEGuidesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding=FragmentEGuidesBinding.inflate(inflater);

        setView();
        setListener();

        return binding.getRoot();
    }

    private void setListener() {

        binding.image1IV.setOnClickListener(v->
                startActivity(new Intent(getContext(), EGuideDetailActivity.class)));

        binding.image2IV.setOnClickListener(v->
                startActivity(new Intent(getContext(), EGuideDetailActivity.class)));

        binding.image3IV.setOnClickListener(v->
                startActivity(new Intent(getContext(), EGuideDetailActivity.class)));

        binding.image4IV.setOnClickListener(v->
                startActivity(new Intent(getContext(), EGuideDetailActivity.class)));

    }

    private void setView() {

        binding.appBarView.titleTV.setText("E-Guides");
        binding.appBarView.backIV.setImageResource(R.drawable.back_icon);
        binding.appBarView.backIV.setVisibility(View.VISIBLE);
        binding.appBarView.menuIV.setVisibility(View.INVISIBLE);

    }

}