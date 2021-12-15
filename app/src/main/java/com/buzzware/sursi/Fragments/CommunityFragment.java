package com.buzzware.sursi.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.buzzware.sursi.Activities.CreateThreadActivity;
import com.buzzware.sursi.Adapters.ThreadListAdapter;
import com.buzzware.sursi.Adapters.UserListAdapter;
import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.FragmentCommunityBinding;

public class CommunityFragment extends Fragment {

    FragmentCommunityBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentCommunityBinding.inflate(inflater);

        setView();
        setListener();
        setUserList();

        return binding.getRoot();
    }

    private void setListener() {

        binding.inboxBtn.setOnClickListener(v -> {

            binding.inboxBtn.setTextColor(getResources().getColor(R.color.blue));
            binding.threadBtn.setTextColor(getResources().getColor(R.color.black));
            binding.inboxLine.setVisibility(View.VISIBLE);
            binding.threadLine.setVisibility(View.INVISIBLE);
            binding.createThreadBtn.setVisibility(View.INVISIBLE);
            setUserList();

        });

        binding.threadBtn.setOnClickListener(v -> {

            binding.inboxBtn.setTextColor(getResources().getColor(R.color.black));
            binding.threadBtn.setTextColor(getResources().getColor(R.color.blue));
            binding.inboxLine.setVisibility(View.INVISIBLE);
            binding.threadLine.setVisibility(View.VISIBLE);
            binding.createThreadBtn.setVisibility(View.VISIBLE);
            setThreadList();

        });

        binding.createThreadBtn.setOnClickListener(v -> {

          startActivity(new Intent(getActivity(), CreateThreadActivity.class));

        });

    }

    private void setView() {

        binding.appBarView.titleTV.setText("Community");
        binding.appBarView.backIV.setImageResource(R.drawable.back_icon);
        binding.appBarView.backIV.setVisibility(View.INVISIBLE);
        binding.appBarView.menuIV.setVisibility(View.INVISIBLE);

    }


    public void setUserList() {

        binding.mainRV.setLayoutManager(new LinearLayoutManager(getContext()));

        UserListAdapter conversationAdapter = new UserListAdapter(getContext(), null);

        binding.mainRV.setAdapter(conversationAdapter);

    }

    public void setThreadList() {

        binding.mainRV.setLayoutManager(new LinearLayoutManager(getContext()));

        ThreadListAdapter threadListAdapter = new ThreadListAdapter(getContext(), null);

        binding.mainRV.setAdapter(threadListAdapter);

    }

}