package com.example.recycleviewtutoial;

import android.icu.lang.UProperty;

public class ModelClass {

    private  int profileimageView;
    private String nameTextView;
    private String timeTextView;
    private String messageTextView;

    ModelClass(int profileimageView,String nameTextView, String timeTextView, String messageTextView){
        this.profileimageView = profileimageView;
        this.nameTextView = nameTextView;
        this.timeTextView = timeTextView;
        this.messageTextView = messageTextView;
    }



    public int getProfileimageView() {
        return profileimageView;
    }

    public String getNameTextView() {
        return nameTextView;
    }

    public String getTimeTextView() {
        return timeTextView;
    }

    public String getMessageTextView() {
        return messageTextView;
    }
}
