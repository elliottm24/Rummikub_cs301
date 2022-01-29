package com.example.rummikub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView timer = (TextView)findViewById(R.id.textView);

        new CountDownTimer(3000,1000) {

            @Override
            public void onTick(long l) {
                textTimer.setText("0:" + checkNum(time));
                time--;
            }

            @Override
            public void onFinish() {
                textTimer.setText("Time's up");
            }
        }.start();

        //public String checkNum(int num) {
        //    return num <= 9 ? "0" + num : String.valueOf(num);
        //}

        //Cite later: https://www.youtube.com/watch?v=Yx63M4k-EeE
        Button qButton = (Button) findViewById(R.id.button);
        qButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

    }
}