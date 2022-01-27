package com.example.rummikub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        class quitGame implements View.OnClickListener{
            Button quitButton = findViewByID(R.id.button);

            @Override
            public void onClick(View button) {
                finish();
                System.exit(0);
            }
        }
    }
}