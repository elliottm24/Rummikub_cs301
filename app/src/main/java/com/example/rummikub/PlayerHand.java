package com.example.rummikub;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/**
 * @authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmstede
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

    @NonNull
    @Override
    public String toString(){

        StringBuilder str_hand = new StringBuilder();

        for(int i = 0; i < hand.size(); i++) {
            str_hand.append(hand.get(i)).append("\n");
        }

        return str_hand.toString();
    }
}