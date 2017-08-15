package com.example.user.blackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    TextView dealerLog;
    TextView playerLog;
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
        stick = (Button) findViewById(R.id.stick_button);
        twist = (Button) findViewById(R.id.twist_button);
        restart = (Button) findViewById(R.id.restart_button);

        game = new Game();
        game.start();
    }
}
