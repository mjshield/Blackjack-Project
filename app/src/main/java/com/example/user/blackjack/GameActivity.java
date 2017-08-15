package com.example.user.blackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    TextView dealerLog;
    TextView playerLog;
    TextView playerScore;
    TextView dealerScore;
    Button stick;
    Button twist;
    Button restart;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        dealerLog = (TextView) findViewById(R.id.dealer_log);
        playerLog = (TextView) findViewById(R.id.player_log);
        playerScore = (TextView) findViewById(R.id.player_score);
        dealerScore = (TextView) findViewById(R.id.dealer_score);

        stick = (Button) findViewById(R.id.stick_button);
        twist = (Button) findViewById(R.id.twist_button);
        restart = (Button) findViewById(R.id.restart_button);

        game = new Game();
        game.start();
        Card dealerCard1 = game.getDealerCardFromHand(0);
        Card playerCard1 = game.getPlayerCardFromHand(0);
        Card playerCard2 = game.getPlayerCardFromHand(1);

        dealerLog.setText(dealerCard1.getName() + " of " + dealerCard1.getSuit());
        playerLog.setText(playerCard1.getName() + " of " + playerCard1.getSuit() + "\n");
        playerLog.append(playerCard2.getName() + " of " + playerCard2.getSuit() + "\n");

        playerScore.setText(String.valueOf(game.getPlayerPoints()));
        dealerScore.setText(String.valueOf(game.getDealerPoints()));



    }

    public void onTwistButtonClicked(View twist) {
    }



}
