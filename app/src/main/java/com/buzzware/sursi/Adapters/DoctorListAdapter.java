package com.buzzware.sursi.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.buzzware.sursi.Activities.ConversationActivity;
import com.buzzware.sursi.databinding.ItemsDesignDoctorListBinding;
import com.buzzware.sursi.databinding.ItemsDesignUserListBinding;

import java.util.List;

public class DoctorListAdapter extends RecyclerView.Adapter<DoctorListAdapter.ViewHolder> {

    private List<String> list;
    private Context context;

    public DoctorListAdapter(Context mContext, List<String> list) {
        this.list = list;
        this.context = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemsDesignDoctorListBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.binding.mainLayout.setOnClickListener(v ->
                context.startActivity(new Intent(context, ConversationActivity.class)));

        viewHolder.binding.userTypeTV.setVisibility(View.GONE);

        if (i == 0||i==3) {
            viewHolder.binding.userTypeTV.setVisibility(View.VISIBLE);
            viewHolder.binding.nameTV.setText("Mati");

        }

    }


    @Override
    public int getItemCount() {
        //    return list.size();
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemsDesignDoctorListBinding binding;

        public ViewHolder(@NonNull ItemsDesignDoctorListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }

}
