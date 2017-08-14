package com.example.user.blackjack;

import java.util.Random;

/**
 * Created by user on 14/08/2017.
 */

public class Game {

    private boolean gameActive;

    private Deck deck;
    private Player player;
    private Player dealer;

    public Game() {
        gameActive = false;
        deck = new Deck();
        player = new Player();
        dealer = new Player();
    }

    public void start() {
        if (gameActive = false) {
            gameActive = true;
            deck.refresh();
            deal(player);
            deal(player);
            deal(dealer);
            deal(dealer);
        }
        else {return;}
    }

    public int drawNum() {
        Random rand = new Random();
        int number = rand.nextInt(deck.cardCount());
        return number;
    }

    public void deal(Player person) {
        int index = drawNum();
        Card card = deck.getCard(index);
        deck.removeCard(index);
        person.addPoints(card.getRank());
        person.addCard(card);
    }
}
