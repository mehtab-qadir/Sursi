package com.buzzware.sursi.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.buzzware.sursi.Activities.ConversationActivity;
import com.buzzware.sursi.databinding.ItemsDesignUserListBinding;

import java.util.List;

public class NotificationsList extends RecyclerView.Adapter<NotificationsList.ViewHolder>  {

    private List<String> list;
    private Context context;

    public NotificationsList(Context mContext, List<String> list) {
        this.list = list;
        this.context = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemsDesignUserListBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.binding.nameTV.setText("New Message");
        viewHolder.binding.userTypeTV.setText("You have received a new message");
    }


    @Override
    public int getItemCount() {
    //    return list.size();
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemsDesignUserListBinding binding;

        public ViewHolder(@NonNull ItemsDesignUserListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }

}
