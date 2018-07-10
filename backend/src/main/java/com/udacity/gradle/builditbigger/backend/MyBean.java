package com.udacity.gradle.builditbigger.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private String myJokes;

    public void setMyJokes(String myJokes) {
        this.myJokes = myJokes;
    }

    public String getJoke() {
        return myJokes;
    }
}