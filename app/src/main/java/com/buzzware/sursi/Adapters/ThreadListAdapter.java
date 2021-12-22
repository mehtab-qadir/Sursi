package com.buzzware.sursi.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.buzzware.sursi.Activities.CreateThreadActivity;
import com.buzzware.sursi.Activities.EditThread;
import com.buzzware.sursi.Activities.ThreadDetailActivity;
import com.buzzware.sursi.databinding.ItemsDesignThreadListBinding;

import java.util.List;

public class ThreadListAdapter extends RecyclerView.Adapter<ThreadListAdapter.ViewHolder>  {

    private List<String> list;
    private Context context;
    Boolean fromHome;

    public ThreadListAdapter(Context mContext, List<String> list, boolean fromHome) {
        this.list = list;
        this.context = mContext;
        this.fromHome = fromHome;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemsDesignThreadListBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        if(!fromHome) {
            viewHolder.binding.mainLayout.setOnClickListener(v ->
                    context.startActivity(new Intent(context, ThreadDetailActivity.class)));
        }
        else {

            viewHolder.binding.mainLayout.setOnClickListener(v ->
                    context.startActivity(new Intent(context, EditThread.class)));

        }
    }


    @Override
    public int getItemCount() {
    //    return list.size();
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemsDesignThreadListBinding binding;

        public ViewHolder(@NonNull ItemsDesignThreadListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }

}
