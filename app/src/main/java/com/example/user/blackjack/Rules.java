package com.example.user.blackjack;

/**
 * Created by user on 14/08/2017.
 */

public class Rules {

    public static String checkForWon(Player player, Player dealer) {
        if (player.getPoints() > dealer.getPoints()) {
            return "You win!";
        }
        else if (player.getPoints() < dealer.getPoints()) {
            return "Dealer wins!";
        }
        else if (player.getPoints() == dealer.getPoints()) {
            return "It's a tie!";
        }
        else {
            return "nobody";
        }
    }

    public static boolean checkForBust(Player person) {
        if (person.getPoints() > 21) {
            return true;
        }
        else {
            return false;
        }
    }


    public static String checkDealBlackjack(Player player, Player dealer) {
        if (player.getPoints() == 21 && dealer.getPoints() == 21) {
            return "You both got Blackjack!";
        }
        else if (player.getPoints() == 21) {
            return "You got Blackjack!";
        }
        else if (dealer.getPoints() == 21) {
            return "Dealer got Blackjack!";
        }
        else {
            return "nobody";
        }
    }
}
