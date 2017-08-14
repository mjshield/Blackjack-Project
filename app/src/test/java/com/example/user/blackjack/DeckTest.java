package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14/08/2017.
 */

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canRefreshDeck() {
        deck.refresh();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canGetCard() {
        deck.refresh();
        Card card = deck.getCard(1);
        assertEquals("Two", card.getName());
    }

    @Test
    public void canRemoveCard() {
        deck.refresh();
        deck.removeCard(3);
        assertEquals(51, deck.cardCount());
    }

}
