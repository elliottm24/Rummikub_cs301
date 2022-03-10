package com.example.rummikub;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

/* probably the single greatest name for a class of all time */
public class RummiView extends SurfaceView {

    private GameState newState;

    /* Just instantiating some paints for assets - kinda sus 0_o */
    Paint bgPaint = new Paint();

    Paint tilePaint         = new Paint();
    Paint tilePaint_black   = new Paint();
    Paint tilePaint_blue    = new Paint();
    Paint tilePaint_red     = new Paint();
    Paint tilePaint_orange  = new Paint();

    public RummiView(Context context, AttributeSet attrs) {
        super(context);
        newState = new GameState();

        setWillNotDraw(false);

        setBackgroundColor(Color.BLUE); //to be changed later
    }

    //add drawTile eventually here

    /*
    public void drawTile(Canvas canvas) {

    }
    */

    @Override
    public void onDraw(Canvas canvas) {

    }

    public GameState getGameState() { return newState; }
}
