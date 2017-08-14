package com.example.user.blackjack;

/**
 * Created by user on 14/08/2017.
 */

public class Rules {

    private int limit;


    public static String checkForWon(Player player, Player dealer) {
        if (player.getPoints() > dealer.getPoints()) {
            return "player wins";
        }
        else if (player.getPoints() < dealer.getPoints()) {
            return "dealer wins";
        }
        else if (player.getPoints() == dealer.getPoints()) {
            return "push";
        }
        else {
            return "error";
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



}
