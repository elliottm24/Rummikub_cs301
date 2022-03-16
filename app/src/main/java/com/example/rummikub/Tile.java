package com.example.rummikub;

/**
 *@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmstede
 * */

//Default constructor for Tile
public class Tile {
    public int color;
    public int tileNum;

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
