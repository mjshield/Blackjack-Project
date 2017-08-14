package com.example.user.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 14/08/2017.
 */

public class Hand {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();

    }

    public int cardCount() {
        return this.hand.size();
    }

    public void addCard(Card card) {
        hand.add(card);
    }
}
