package com.example.rummikub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmestede
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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