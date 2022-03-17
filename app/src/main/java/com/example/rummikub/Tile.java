package com.example.rummikub;

/**
 *@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmstede
 * */

public class Tile {
    private int color;
    private int tileNum;

    //Default constructor for Tile
    public Tile(int init_color, int init_tileNum) {
        this.color = init_color;
        this.tileNum = init_tileNum;
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
