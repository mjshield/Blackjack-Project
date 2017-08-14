package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14/08/2017.
 */

public class HandTest {

    Hand hand;

    @Before
    public void before() {
        hand = new Hand();
    }

    @Test
    public void handStartsEmpty() {
        assertEquals(0, hand.cardCount());
    }

}
