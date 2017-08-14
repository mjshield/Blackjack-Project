package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14/08/2017.
 */

public class RulesTest {

    Rules rules;
    Player player;
    Player dealer;

    @Before
    public void before() {
        rules = new Rules();
        player = new Player();
        dealer = new Player();
    }

    @Test
    public void playerCanWin() {
        player.addPoints(20);
        dealer.addPoints(18);
        assertEquals("player wins", Rules.checkForWon(player, dealer));
    }

    @Test
    public void dealerCanWin() {
        player.addPoints(17);
        dealer.addPoints(18);
        assertEquals("dealer wins", Rules.checkForWon(player, dealer));
    }

    @Test
    public void playersCanTie() {
        player.addPoints(17);
        dealer.addPoints(17);
        assertEquals("push", Rules.checkForWon(player, dealer));
    }

    @Test
    public void canGoBust() {
        player.addPoints(22);
        dealer.addPoints(21);
        assertEquals(true, Rules.checkForBust(player));
        assertEquals(false, Rules.checkForBust(dealer));
    }





}
