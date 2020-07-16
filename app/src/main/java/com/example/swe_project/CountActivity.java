package com.example.swe_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {
    TimerHandler timerHandler= null;
    private static final int TIMER_START = 100;
    TextView count_board;
    Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        count_board = (TextView) findViewById(R.id.count_board);
        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);

        timerHandler = new TimerHandler();

        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                timerHandler.sendEmptyMessage(TIMER_START);
            }
        });

        stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                timerHandler.removeMessages(TIMER_START);
            }
        });
    }

    private class TimerHandler extends Handler{
        int count = 0;

        @Override
        public void handleMessage(@NonNull Message msg) {
            //super.handleMessage(msg);

            switch(msg.what){
                case TIMER_START:
                    //Log.d("dd","dd" + count++);
                    count_board.setText(String.valueOf(count++));
                    this.sendEmptyMessageDelayed(TIMER_START,1000);
                    break;
            }

        }
    }
}