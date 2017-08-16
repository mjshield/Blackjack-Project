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

        if (person == player && gameActive == false) return;

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

    public void playerTwists() {
        deal(player);
    }

    public boolean playerBust() {
        return Rules.checkForBust(player);
    }

    public boolean dealerBust() {
        return Rules.checkForBust(dealer);
    }

    public void gameEnd() {
        gameActive = false;
        deck.refresh();
        player.resetPoints();
        dealer.resetPoints();
        player.clearHand();
        dealer.clearHand();
    }

    public String outcome() {
        return Rules.checkForWon(player, dealer);
    }

    public String blackjack() {
        return Rules.checkDealBlackjack(player, dealer);
    }

    public boolean checkGameActive() {
        return gameActive;
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
