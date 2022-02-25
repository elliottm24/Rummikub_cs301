package com.example.rummikub;

/*
@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmestede
 */

public class Tile {
    private int color;
    private int tileNum;

    public Tile(int initColor, int initTileNum) {
        this.color = initColor;
        this.tileNum = initTileNum;
    }

    public Tile(Tile orig) {
        this.color = orig.color;
        this.tileNum = orig.tileNum;
    }

    @Override
    public String toString() {
        return color + " " + tileNum;
    }
}