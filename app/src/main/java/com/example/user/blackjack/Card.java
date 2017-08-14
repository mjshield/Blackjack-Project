package com.example.user.blackjack;

/**
 * Created by user on 14/08/2017.
 */

public class Card {

    private String name;
    private String suit;
    private int rank;

    public Card(String name, String suit, int rank) {
        this.name = name;
        this.suit = suit;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public String getSuit() {
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }


}
