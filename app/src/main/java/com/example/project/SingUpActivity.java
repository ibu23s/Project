package com.example.project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project.databinding.ActivitySingUpBinding;

public class SingUpActivity extends AppCompatActivity {

    private ActivitySingUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySingUpBinding.inflate(getLayoutInflater());
        setContentView(com.example.project.R.layout.activity_sing_up);
        setListener();
    }
    private void setListener(){
        binding.textSingIn.setOnClickListener(v -> onBackPressed());
    }

}