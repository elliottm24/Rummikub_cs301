package com.example.rummikub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 *@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmestede
 * */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         External Citation
         Date: 28 January 2022
         Problem: Getting my quit button to exit the program
         Resource:
         https://www.youtube.com/watch?v=Yx63M4k-EeE
         Solution: I overcomplicated the code and needed to delete several lines and just make it implementing the button and cleaning up the onClick function
         */
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