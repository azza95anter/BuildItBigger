package com.example.android.jokesjavalib;

import java.util.Random;

public class MyJokes {
    private String[] jokes = new String[4];
    private Random random;

    public MyJokes() {

        jokes[0] = "0 is false and 1 is true, Right?\n" +
                "1";
        jokes[1] = "A programmer puts two glasses on his bedside table before going to sleep. A full one, in case he gets thirsty, and an empty one, in case he doesn’t";
        jokes[2] = "Why do Java developers wear glasses? Because they can't C#";
        jokes[3] = "Q: What is the difference between Android 2.1 and 2.2?\n" +
                "A: 6 months";
        random = new Random();
    }


    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
