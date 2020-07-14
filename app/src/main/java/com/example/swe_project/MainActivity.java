package com.example.swe_project;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.swe_project.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(this);
    }

    public void To_Linear_1(View view){
        Intent intent = new Intent(getApplicationContext(), LinearActivity_1.class);
        startActivity(intent);
    }

    public void ImgChange(View view){
        Intent intent = new Intent(getApplicationContext(), ImgChangeActivity.class);
        startActivity(intent);
    }





}