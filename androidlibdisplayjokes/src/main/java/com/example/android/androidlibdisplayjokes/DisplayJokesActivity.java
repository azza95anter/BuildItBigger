package com.example.android.androidlibdisplayjokes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class DisplayJokesActivity extends AppCompatActivity {

   public static final String JOKE = "joke";
    TextView jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);
        jokeText = (TextView) findViewById(R.id.JoketextView);

        String joke = getIntent().getStringExtra(JOKE);
        jokeText.setText(joke);
    }
}
