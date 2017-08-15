package com.example.user.blackjack;

import java.util.Random;

/**
 * Created by user on 14/08/2017.
 */

public class Player {

    private int points;
    private boolean stuck;
    protected Hand hand;

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

    public void resetPoints() {
        this.points = 0;
    }

    public void addCard(Card card) {
        hand.addCard(card);
    }

    public void stick() {
        this.stuck = true;
    }

}
