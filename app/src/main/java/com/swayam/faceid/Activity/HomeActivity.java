package com.swayam.faceid.Activity;

/*
Created By SwayamInfotech
*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.swayam.faceid.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    //Binding View
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}