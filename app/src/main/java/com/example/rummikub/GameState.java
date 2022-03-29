package com.example.rummikub;

import java.util.ArrayList;

/**
 * @authors Jacob Arnez, Maja Elliott, Dylan Kim, Chase Ohmstede
 * @version 3/17/2022
 *
 * (description here)
 *
 * Bugs:
 *
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

    //Copy Constructor I don't know if it's deep copy since the ArrayList aren't fully instantiated
    public GameState(GameState copy){
        this.curr_turn = copy.getCurr_turn();
        this.timer = copy.getTimer();
        this.player1_hand = copy.getPlayer2_hand();
        this.player2_hand = copy.getPlayer2_hand();
        this.t_pile = copy.getT_pile();

    }

    @Override
    public String toString() {

        String str_player1_hand = "", str_player2_hand = "", str_t_board = "", str_t_pile = "";

        for (int i = 0; i < player1_hand.size(); i++) {
            str_player1_hand += player1_hand.get(i) + "\n";
        }

        for (int i = 0; i < player2_hand.size(); i++) {
            str_player2_hand += player2_hand.get(i) + "\n";
        }

        for (int i = 0; i < t_board.size(); i++) {
            str_t_board += t_board.get(i) + "\n";
        }

        for (int i = 0; i < t_pile.size(); i++) {
            str_t_pile += t_pile.get(i) + "\n";
        }

        String str_return

                = "~~ Current Game Info ~~                      \n\n"
                + "Currently Player " + curr_turn + "'s Turn    \n"
                + "Timer: " + timer + "s                        \n\n"
                + "Player 1 Hand:                               \n"
                + str_player1_hand + "                          \n\n"
                + "Player 2 Hand:                               \n"
                + str_player2_hand + "                          \n\n"
                + "Tiles on Board:                              \n"
                + str_t_board + "                               \n\n"
                + "Tiles in Pile:                               \n"
                + str_t_pile;

        return str_return;

    }

    //Checks if either player hand is empty. This should be called at the end of each turn
    public boolean isWin(){
        if(player1_hand.isEmpty()){
            //The print line is just a placeholder, the method should change the screen to reflect who's won the game
            System.out.println("Player 1 has won the game!");
            return true;
        }
        if(player2_hand.isEmpty()){
            System.out.println("Player 2 has won the game");
        }
        //If neither player hand is empty then the game continues
        return false;
    }

    //This action should draw tile for the current player. This tile will be taken from the tile pile and added to the current players hand
    public boolean drawTile(){
        if (curr_turn == 0){
            //Add tile from tile pile to player_0's hand
            //Remove this tile from tile pile
            changeTurn();
            return true;
        }
        if(curr_turn == 1){
            //Add tile from tile pile to player_1's hand
            //Remove this tile from tile pile
            changeTurn();
            return true;
        }
        return false;

    }

    // Helper method to change the turn of the player
    public void changeTurn(){
        if (curr_turn == 0) curr_turn = 1;
        else curr_turn = 0;

    }

    //Getters and Setters
    public int getCurr_turn() {
        return curr_turn;
    }

    public void setCurr_turn(int curr_turn) {
        this.curr_turn = curr_turn;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public ArrayList<Tile> getPlayer1_hand() {
        return player1_hand;
    }

    public void setPlayer1_hand(ArrayList<Tile> player1_hand) {
        this.player1_hand = player1_hand;
    }

    public ArrayList<Tile> getPlayer2_hand() {
        return player2_hand;
    }

    public void setPlayer2_hand(ArrayList<Tile> player2_hand) {
        this.player2_hand = player2_hand;
    }

    public ArrayList<Tile> getT_board() {
        return t_board;
    }

    public void setT_board(ArrayList<Tile> t_board) {
        this.t_board = t_board;
    }

    public ArrayList<Tile> getT_pile() {
        return t_pile;
    }

    public void setT_pile(ArrayList<Tile> t_pile) {
        this.t_pile = t_pile;
    }



}
