package com.example.rummikub;

import java.util.ArrayList;

/**
 *@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmstede
 * */

public class PlayerHand extends Tile {
    public int p_id;
    public ArrayList<Tile> hand;

    public PlayerHand(int init_id, ArrayList<Tile> init_hand) {
        this.p_id     = init_id;
        this.hand     = init_hand;
    }

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