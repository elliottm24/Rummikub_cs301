package com.example.rummikub;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 *@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmstede
 *
 * This class is designed to draw our Rummikub tiles.
 *
 * Bugs:
 *
 * */

public class DrawTile extends SurfaceView {

    //setting up paints and DrawTileData reference
    public Paint tilePaint = new Paint();
    public Paint numberPaint = new Paint();
    public Tile info;

    //
    public DrawTile(Context context, AttributeSet attrs) {
        super(context, attrs);

        info = new Tile();

        setWillNotDraw(false);

        //initialize colors
        //NOTE TO EVERYONE: These colors are placeholders, please change later.
        tilePaint.setColor(Color.GREEN);
        tilePaint.setStyle(Paint.Style.FILL);
        numberPaint.setColor(Color.GREEN);
        numberPaint.setStyle(Paint.Style.FILL);
    }

    @Override
    public void onDraw(Canvas c) {

    }

    public void createTile(Canvas c){
        //Draws the tile
    }

    public void addNum(Canvas c){
        //Draws number to be added to tile
    }
}
