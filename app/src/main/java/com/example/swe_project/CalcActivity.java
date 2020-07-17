package com.example.swe_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CalcActivity extends AppCompatActivity{
    @BindView(R.id.result_board) EditText result_board = null;
    String temp="";
    @BindView(R.id.Clear) Button clear;

    int count = 0;
    int value;
    int ADD = 0;
    int SUB = 1;
    int MUL = 2;
    int DIV = 3;


    @OnClick({R.id.one, R.id.two,R.id.three,R.id.four, R.id.five, R.id.six, R.id.seven, R.id.eight, R.id.nine, R.id.zero,})
    void number(View view){
        switch (view.getId()){
            case R.id.one:
                result_board.setText(result_board.getText().toString()+1); break;
            case R.id.two:
                result_board.setText(result_board.getText().toString()+2); break;
            case R.id.three:
                result_board.setText(result_board.getText().toString()+3); break;
            case R.id.four:
                result_board.setText(result_board.getText().toString()+4); break;
            case R.id.five:
                result_board.setText(result_board.getText().toString()+5); break;
            case R.id.six:
                result_board.setText(result_board.getText().toString()+6); break;
            case R.id.seven:
                result_board.setText(result_board.getText().toString()+7); break;
            case R.id.eight:
                result_board.setText(result_board.getText().toString()+8); break;
            case R.id.nine:
                result_board.setText(result_board.getText().toString()+9); break;
            case R.id.zero:
                result_board.setText(result_board.getText().toString()+0); break;
        }
    }

    @OnClick({R.id.plus, R.id.minus,R.id.multiply,R.id.Divide,R.id.Percent,R.id.PlusMinus,R.id.result})
    void calculator(View view){
        switch (view.getId()){
            case R.id.plus:
                temp = result_board.getText().toString(); //첫번째로 입력했던 녀석들 저장해둠. result_board 가 ""될거니까.
                result_board.setText(""); //내용물 비워주기
                value = ADD;
                break;
            case R.id.minus:
                temp = result_board.getText().toString();
                result_board.setText("");
                value = SUB;
                break;
            case R.id.multiply:
                temp = result_board.getText().toString();
                result_board.setText("");
                value = MUL;
                break;
            case R.id.Divide:
                temp = result_board.getText().toString();
                result_board.setText("");
                value = DIV;
                break;
            case R.id.PlusMinus:
                temp = result_board.getText().toString();
                if(count%2==0) {
                    result_board.setText("-"+Double.parseDouble(temp));
                    count++;
                }
                else {
                    result_board.setText("" + Double.parseDouble(temp));
                    count++;
                }
                break;
            case R.id.dot:
                temp = result_board.getText().toString();
                result_board.setText(Integer.parseInt(temp)+".");
                break;

            case R.id.result:
                switch(value){
                    case 0:
                        result_board.setText("" + (Double.parseDouble(temp) + Double.parseDouble(result_board.getText().toString())));
                        break;
                    case 1:
                        result_board.setText("" + (Double.parseDouble(temp) - Double.parseDouble(result_board.getText().toString())));
                        break;
                    case 2:
                        result_board.setText("" + (Double.parseDouble(temp) * Double.parseDouble(result_board.getText().toString())));
                        break;
                    case 3:
                        result_board.setText("" + (Double.parseDouble(temp) / Double.parseDouble(result_board.getText().toString())));
                        break;
                }
                temp = result_board.getText().toString();

        }

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        ButterKnife.bind(this);

        clear.setOnClickListener(view -> {
            temp = "";
            result_board.setText("");
        });

    }




    }
