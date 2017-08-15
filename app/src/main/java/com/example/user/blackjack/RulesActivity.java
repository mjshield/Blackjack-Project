package com.example.user.blackjack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RulesActivity extends AppCompatActivity {

    TextView rules;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        rules = (TextView) findViewById(R.id.rules);
        startButton = (Button) findViewById(R.id.start_button);
    }

    public void onStartButtonClicked(View start_button) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);

    }

}
