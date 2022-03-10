package com.example.rummikub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmstede
 * */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //lower two not working, fix later
        RummiView rkID = findViewById(R.id.boardView);
        RummiController ctrID = new RummiController(rkID);

        //reference to Quit button
        Button bQuit = findViewById(R.id.button);
        bQuit.setOnClickListener(ctrID);
    }

    public void quit_game(View view) {
        finish();
        System.exit(0);
    }
}