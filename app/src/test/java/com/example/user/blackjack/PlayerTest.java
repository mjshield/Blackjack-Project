package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14/08/2017.
 */

public class PlayerTest {

    Player player;
    Deck deck;

    @Before
    public void before() {
        player = new Player();
        deck = new Deck();
        deck.refresh();
    }

    @Test
    public void canGetPoints() {
        assertEquals(0, player.getPoints());
    }

    @Test
    public void canAddPoints() {
        player.addPoints(5);
        player.addPoints(7);
        assertEquals(12, player.getPoints());
    }

    @Test
    public void canStick() {
        player.stick();
        assertEquals(true, player.getStuck());
    }

    @Test
    public void canTwist() {
        player.twist(4, deck);
        assertEquals(1, player.getHandSize());
        assertEquals(5, player.getPoints());
    }

}
