package com.example.user.blackjack;

import java.util.Random;

/**
 * Created by user on 14/08/2017.
 */

public class Player {

    private int points;
    private boolean stuck;
    private Hand hand;

    public Player() {
        this.points = 0;
        this.stuck = false;
        this.hand = new Hand();
    }

    public int getPoints() {
        return points;
    }

    public int getHandSize() {
        return hand.cardCount();
    }

    public boolean getStuck() {
        return stuck;
    }

    public void addPoints(int newPoints) {
        this.points += newPoints;
    }

    public void stick() {
        this.stuck = true;
    }

    public void twist(int index, Deck deck) {
       Card card = deck.getCard(index);
        deck.removeCard(index);

        addPoints(card.getRank());

        hand.addCard(card);
    }
}
