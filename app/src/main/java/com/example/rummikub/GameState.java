package com.example.rummikub;

import java.util.ArrayList;

/*
@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmestede
 */

public class GameState {

    /**
     * Instance Variables REQ. for Rummikub:
     *  - player object
     *      - name of player
     *      - # of tiles in hand
     *      - current score
     *      - hasWon boolean(?)
     *  - # of tiles in deck/pile
     *  - # of tiles on board
     *  - current turn
     *  - timer
     */

    private int curr_turn;
    private int timer;
    private Player[] players;
    private Tile[]   t_pile;
    private Tile[][] t_board;


    public GameState() {
        int timer = 100;
        int scores = 0;
        int turn = 0;
        //int Array[][] inPlay = [][];
        //ArrayList<> drawPile = new ArrayList();
        //int Array[][] playable = [][];

    }


    @Override
    public String toString() {
        return "GameState{}";
    }

    public boolean drawTile(){
        return false;
    }


}
