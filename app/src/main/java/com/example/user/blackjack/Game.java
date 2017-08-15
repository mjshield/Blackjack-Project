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
        if (gameActive == false) {
            gameActive = true;
            deck.refresh();
            deal(player);
            deal(player);
            deal(dealer);
            deal(dealer);
        }
        else {}
    }

    public int drawNum() {
        Random rand = new Random();
        int number = rand.nextInt(deck.cardCount());
        return number;
    }

    public void deal(Player person) {
        //conditional where if you're the player, not the dealer, and the game is not active, you can't deal

        if (person == player && gameActive == false) {}

        else {
            int index = drawNum();
            Card card = deck.getCard(index);

            deck.removeCard(index);
            if (card.getRank() == 1 && person.getPoints() <= 10) {
                person.addPoints(11);
            }
            else { person.addPoints(card.getRank()); }
            person.addCard(card);
        }
    }

    public void playerSticks() {

        if (gameActive == true) {
            gameActive = false;

            while (dealer.getPoints() <= 16 && Rules.checkForBust(dealer) == false) {
                deal(dealer);
            }
        }
        else {}
    }

    public void restart() {
        if (gameActive == false) {
            deck.refresh();
            player.resetPoints();
        }
        else {}
    }

    public Hand getPlayerHand() {
        return player.hand;
    }

    public Card getPlayerCardFromHand(int index) {
        return player.getCardFromhand(index);
    }

    public Card getDealerCardFromHand(int index) {
        return dealer.getCardFromhand(index);
    }

    public Hand getDealerHand() {
        return dealer.hand;
    }

    public int getPlayerHandSize() {
      return player.getHandSize();
    }

    public int getDealerHandSize() {
       return dealer.getHandSize();
    }

    public int getDeckSize() {
        return deck.cardCount();
    }

    public int getPlayerPoints() {
        return player.getPoints();
    }

    public int getDealerPoints() {
        return dealer.getPoints();
    }
}
