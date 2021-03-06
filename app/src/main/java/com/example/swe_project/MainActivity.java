package com.example.swe_project;
import Lecture3.*;
import Week1.CalcActivity;
import Week1.CountActivity;
import Week1.ImgChangeActivity;
import Week1.ImgChangeActivity2;
import Week1.LinearActivity_1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

    public void ImgChange2(View view){
        Intent intent = new Intent(getApplicationContext(), ImgChangeActivity2.class);
        startActivity(intent);
    }

    public void Counter(View view){
        Intent intent = new Intent(getApplicationContext(), CountActivity.class);
        startActivity(intent);
    }

    public void Calculator(View view){
        Intent intent = new Intent(getApplicationContext(), CalcActivity.class);
        startActivity(intent);
    }

    public void Login(View view){
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
    }

    public void ListView(View view){
        Intent intent = new Intent(getApplicationContext(), ListViewActivity.class);
        startActivity(intent);
    }

    public void LifeCycle(View view){
        Intent intent = new Intent(getApplicationContext(), LifeCycleActivity.class);
        startActivity(intent);
    }

    public void ListView2(View view){
        Intent intent = new Intent(getApplicationContext(), ListViewActivity_2.class);
        startActivity(intent);
    }

    public void Address(View view){
        Intent intent = new Intent(getApplicationContext(), AddressActivity.class);
        startActivity(intent);
    }





}