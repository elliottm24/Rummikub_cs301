package com.example.rummikub;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameStateTest {

    @Test
    public void isWin() {
        GameState testState = new GameState();
        assertTrue("A Player has won", testState.isWin());
    }

    @Test
    public void drawTile() {
    }

    @Test
    public void changeTurn() {
        GameState testState = new GameState();
        testState.setCurr_turn(0);
        testState.changeTurn();

        assertEquals(1, testState.getCurr_turn());
    }
}