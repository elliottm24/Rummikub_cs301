package com.example.rummikub;

import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;

public class RummiController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, View.OnTouchListener {

    private final RummiView rkView;
    private final GameState rkModel;

    public RummiController(RummiView q) {
        this.rkView = q;
        this.rkModel = rkView.getGameState();
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }


}
