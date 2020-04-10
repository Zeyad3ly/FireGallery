package com.example.firegallery.Model;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mKey;


    public Upload() {
    }

    public Upload(String name, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No name";
        }
        this.mName = name;
        this.mImageUrl = imageUrl;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    @Exclude
    public String getmKey() {
        return mKey;
    }
    @Exclude
    public void setmKey(String mKey) {
        this.mKey = mKey;
    }
}
