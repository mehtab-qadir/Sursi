package com.buzzware.sursi.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.buzzware.sursi.Adapters.ConversationListAdapter;
import com.buzzware.sursi.Model.ConversationModel;
import com.buzzware.sursi.R;
import com.buzzware.sursi.databinding.ActivityThreadDetailBinding;
import com.buzzware.sursi.databinding.UploadBottomDialogBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadDetailActivity extends AppCompatActivity {

    ActivityThreadDetailBinding binding;

    List<ConversationModel> conversationList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityThreadDetailBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        loadList();

    }

    private void loadList() {

        conversationList.add(new ConversationModel("Lorem Ipsum is simply dummy text of the printing and typesetting industry.","myMessage"));
        conversationList.add(new ConversationModel("Lorem Ipsum is simply dummy text.","myMessage"));
        conversationList.add(new ConversationModel("Lorem Ipsum is simply dummy text of the printing and typesetting industry.","otherMessage"));
        conversationList.add(new ConversationModel("Lorem Ipsum is simply dummy text.","myMessage"));
        conversationList.add(new ConversationModel("Lorem Ipsum is simply dummy text of the printing and typesetting industry.","otherMessage"));
        Collections.reverse(conversationList);
        setUserList();

    }

    public void setUserList() {

        binding.conversationRV.setLayoutManager(new LinearLayoutManager(ThreadDetailActivity.this));

        ConversationListAdapter conversationAdapter = new ConversationListAdapter(ThreadDetailActivity.this,conversationList);

        binding.conversationRV.setAdapter(conversationAdapter);

        binding.conversationRV.scrollToPosition(conversationList.size() - 1);

    }


//    private void showUploadDialog() {
//
//        UploadBottomDialogBinding dBinding;
//
//        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getContext(), R.style.SheetDialog);
//
//        dBinding = UploadBottomDialogBinding.inflate(LayoutInflater.from(getContext()));
//
//        bottomSheetDialog.setContentView(dBinding.getRoot());
//
//        dBinding.uploadBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                bottomSheetDialog.dismiss();
//            }
//        });
//
//        dBinding.image1IV.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                bottomSheetDialog.dismiss();
//            }
//        });
//
//        dBinding.image2IV.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                bottomSheetDialog.dismiss();
//            }
//        });
//
//        bottomSheetDialog.show();
//    }


}