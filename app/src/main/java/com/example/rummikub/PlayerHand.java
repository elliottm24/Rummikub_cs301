package com.example.rummikub;

/**
 *@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmestede
 * */

public class PlayerHand extends Tile {
    private int p_id;
    public Tile[] hand;

    public PlayerHand(int init_id, int init_score, Tile[] init_hand) {
        this.p_id     = init_id;
        this.hand     = init_hand;
    }

    public PlayerHand(PlayerHand orig) {
        this.p_id     = orig.p_id;
        this.hand     = orig.hand;
    }

    @Override
    public String toString(){

        String str_hand;

        for(int i = 0; i < hand.length; i++) {
            str_hand +=
        }
    }
}