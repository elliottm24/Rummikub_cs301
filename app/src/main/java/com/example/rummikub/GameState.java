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

    //These are the player hands
    private ArrayList<Tile> player1_hand = new ArrayList<Tile>();
    private ArrayList<Tile> player2_hand = new ArrayList<Tile>();

    //This is the list of tiles currently on the board
    private ArrayList<Tile> t_board = new ArrayList<Tile>();

    //This is the pile of tiles the players are gonna draw from
    private ArrayList<Tile> t_pile = new ArrayList<Tile>();


    public GameState() {
        curr_turn = 0;
        timer = 100;

    }


    @Override
    public String toString() {

        System.out.println("~~ Current Game Info ~~\n");

        System.out.println("Currently Player " + curr_turn + "'s Turn");
        System.out.println("Timer: " + timer + "s\n");

        System.out.println("Player 1 Hand: ");
        for (int i = 0; i < player1_hand.size(); i++) {
            System.out.println(player1_hand.get(i));
        }

        System.out.println("");
        System.out.println("Player 2 Hand: ");
        for (int i = 0; i < player2_hand.size(); i++) {
            System.out.println(player2_hand.get(i));
        }

        System.out.println("");
        System.out.println("Tiles on Board: ");
        for (int i = 0; i < t_board.size(); i++) {
            System.out.println(t_board.get(i));
        }

        System.out.println("");
        System.out.println("Tiles in Pile: ");
        for (int i = 0; i < t_pile.size(); i++) {
            System.out.println(t_pile.get(i));
        }

        return null;
    }

    public boolean drawTile(){
        if(turn)
        return false;
    }


}
