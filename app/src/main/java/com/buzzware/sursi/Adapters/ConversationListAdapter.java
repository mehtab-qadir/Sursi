package com.buzzware.sursi.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.buzzware.sursi.Model.ConversationModel;
import com.buzzware.sursi.databinding.ItemDesignConversationBinding;

import java.util.List;

public class ConversationListAdapter extends RecyclerView.Adapter<ConversationListAdapter.ViewHolder> {

    private List<ConversationModel> list;
    private Context context;

    public ConversationListAdapter(Context mContext, List<ConversationModel> list) {
        this.list = list;
        this.context = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemDesignConversationBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        ConversationModel conversationModel=list.get(i);

        if(conversationModel.getType().equals("myMessage")){

            viewHolder.binding.myMessageLayout.mainLayout.setVisibility(View.VISIBLE);
            viewHolder.binding.otherMessageLayout.mainLayout.setVisibility(View.GONE);
            viewHolder.binding.myMessageLayout.messageTV.setText(conversationModel.getMessage());

        }else{

            viewHolder.binding.myMessageLayout.mainLayout.setVisibility(View.GONE);
            viewHolder.binding.otherMessageLayout.mainLayout.setVisibility(View.VISIBLE);
            viewHolder.binding.otherMessageLayout.messageTV.setText(conversationModel.getMessage());

        }

    }


    @Override
    public int getItemCount() {
        return list.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemDesignConversationBinding binding;

        public ViewHolder(@NonNull ItemDesignConversationBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }

}
