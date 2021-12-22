package com.buzzware.sursi.Fragments;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.buzzware.sursi.Activities.CreateThreadActivity;
import com.buzzware.sursi.Adapters.NotificationsList;
import com.buzzware.sursi.Adapters.ThreadListAdapter;
import com.buzzware.sursi.Adapters.UserListAdapter;
import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.ActivityLoginBinding;
import com.buzzware.sursi.databinding.FragmentCommunityBinding;
import com.buzzware.sursi.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Activity {

    FragmentNotificationsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentNotificationsBinding.inflate(getLayoutInflater());

        setView();
        setListener();
        setUserList();

        binding.appBarView.titleTV.setText("Notifications");
        setContentView(binding.getRoot());
    }

    private void setListener() {

        binding.createThreadBtn.setOnClickListener(v -> {

            startActivity(new Intent(NotificationsFragment.this, CreateThreadActivity.class));

        });
        binding.appBarView.backIV.setVisibility(View.VISIBLE);
        binding.appBarView.backIV.setOnClickListener(v -> {

            startActivity(new Intent(NotificationsFragment.this, CreateThreadActivity.class));

        });

    }

    private void setView() {

        binding.appBarView.titleTV.setText("Community");
        binding.appBarView.backIV.setImageResource(R.drawable.back_icon);
        binding.appBarView.backIV.setVisibility(View.INVISIBLE);
        binding.appBarView.menuIV.setVisibility(View.INVISIBLE);

    }


    public void setUserList() {

        binding.mainRV.setLayoutManager(new LinearLayoutManager(this));

        NotificationsList conversationAdapter = new NotificationsList(this, null);

        binding.mainRV.setAdapter(conversationAdapter);

    }

}