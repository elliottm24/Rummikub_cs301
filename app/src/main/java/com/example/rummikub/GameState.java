package com.example.rummikub;

import java.util.ArrayList;

/**
 *@authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmestede
 * */

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
    //private Tile[]   t_pile;
    private Tile[][] t_board;

    //These are the player hands
    private ArrayList<Tile> player1_hand = new ArrayList<Tile>();
    private ArrayList<Tile> player2_hand = new ArrayList<Tile>();

    //This is the pile of tiles the players are gonna draw from
    private ArrayList<Tile> tile_pile = new ArrayList<Tile>();


    public GameState() {
        int timer = 100;
        int scores = 0;
        int curr_turn = 0;
        Tile[] t_pile = new Tile[];
        Tile[][] t_board = new Tile[][];


    }


    @Override
    public String toString() {
        return "GameState{}";
    }

    public boolean drawTile(){
        if(turn)
        return false;
    }


}
