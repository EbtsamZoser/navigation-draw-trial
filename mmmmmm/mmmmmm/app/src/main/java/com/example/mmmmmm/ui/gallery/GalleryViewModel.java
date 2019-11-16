package com.example.mmmmmm.ui.gallery;

import android.graphics.drawable.AnimationDrawable;
import android.widget.RelativeLayout;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mmmmmm.R;

public class GalleryViewModel extends ViewModel {


    private MutableLiveData<String> mText;


    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");

    }


    public LiveData<String> getText() {
        return mText;
    }
}