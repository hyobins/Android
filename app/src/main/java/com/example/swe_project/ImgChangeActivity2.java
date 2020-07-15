package com.example.swe_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImgChangeActivity2 extends AppCompatActivity {
    Button btn1;
    ImageView img_1, img_2;
    boolean flag = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_change2);

        img_1 = (ImageView) findViewById(R.id.img_1);
        img_2 = (ImageView) findViewById(R.id.img_2);

        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(flag){
                    img_1.setVisibility(View.INVISIBLE);
                    img_2.setVisibility(View.VISIBLE);
                    flag = false;
                }
                else{
                    img_1.setVisibility(View.VISIBLE);
                    img_2.setVisibility(View.INVISIBLE);
                    flag = true;
                }
            }
        });

    }
}