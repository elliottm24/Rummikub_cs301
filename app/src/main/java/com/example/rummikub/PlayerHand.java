package com.example.rummikub;

import java.util.ArrayList;

/**
 *@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmstede
 * */


public class PlayerHand extends Tile {
    public int p_id;
    public ArrayList<Tile> hand;

    //constructor for PlayerHand
    public PlayerHand() {
        this.p_id     = 0;
        this.hand     = null;
    }

    //Deep copy constructor for PlayerHand
    public PlayerHand(PlayerHand orig) {
        this.p_id     = orig.p_id;
        this.hand     = orig.hand;
    }

    @Override
    public String toString(){

        String str_hand = "";

        for(int i = 0; i < hand.size(); i++) {
            str_hand += hand.get(i) + "\n";
        }

        return str_hand;
    }
}