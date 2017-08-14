package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14/08/2017.
 */

public class CardTest {

    Card card;


    @Before
    public void before() {
        card = new Card("Two", "Spades", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Two", card.getName());
    }

    @Test
    public void canGetSuit() {
        assertEquals("Spades", card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(2, card.getRank());
    }



}
