package com.example.rummikub;

import android.graphics.Color;

/**
 *@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmestede
 * */

//Default constructor for Tile
public class Tile {
    public int color;
    public int tileNum;

    //Tile constructor
    public Tile(){
        this.color = Color.BLACK;
        this.tileNum = 1;
    }

    //Copy constructor for Tile
    public Tile(Tile orig) {
        this.color = orig.color;
        this.tileNum = orig.tileNum;
    }

    @Override
    public String toString() {
        return color + " " + tileNum;
    }
}
