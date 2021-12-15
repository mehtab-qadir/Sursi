package com.buzzware.sursi.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.buzzware.sursi.Adapters.ConversationListAdapter;
import com.buzzware.sursi.Model.ConversationModel;
import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.ActivityConversationBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConversationActivity extends AppCompatActivity {


    ActivityConversationBinding binding;

    List<ConversationModel> conversationList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityConversationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setView();
        setListener();
        loadList();

    }

    private void setListener() {

        binding.appBarView.backIV.setOnClickListener(v->finish());

    }

    private void setView() {

        binding.appBarView.titleTV.setText("MS. David Malan");
        binding.appBarView.backIV.setImageResource(R.drawable.back_icon);
        binding.appBarView.backIV.setVisibility(View.VISIBLE);
        binding.appBarView.menuIV.setVisibility(View.INVISIBLE);

    }

    private void loadList() {

        conversationList.add(new ConversationModel("Lorem Ipsum is simply dummy text of the printing and typesetting industry.","myMessage"));
        conversationList.add(new ConversationModel("Lorem Ipsum is simply dummy text.","myMessage"));
        conversationList.add(new ConversationModel("Lorem Ipsum is simply dummy text of the printing and typesetting industry.","otherMessage"));
        conversationList.add(new ConversationModel("Lorem Ipsum is simply dummy text.","myMessage"));
        conversationList.add(new ConversationModel("Lorem Ipsum is simply dummy text of the printing and typesetting industry.","otherMessage"));
        conversationList.add(new ConversationModel("Lorem Ipsum is simply dummy text of the printing and typesetting industry.","myMessage"));
        Collections.reverse(conversationList);
        setUserList();

    }

    public void setUserList() {

        binding.conversationRV.setLayoutManager(new LinearLayoutManager(ConversationActivity.this));

        ConversationListAdapter conversationAdapter = new ConversationListAdapter(ConversationActivity.this,conversationList);

        binding.conversationRV.setAdapter(conversationAdapter);

        binding.conversationRV.scrollToPosition(conversationList.size() - 1);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}