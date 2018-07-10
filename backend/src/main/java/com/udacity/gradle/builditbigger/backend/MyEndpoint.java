package com.udacity.gradle.builditbigger.backend;

import com.example.android.jokesjavalib.MyJokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "jokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "putJoke")
    public MyBean putJoke() {

        MyJokes myJokes = new MyJokes();
        MyBean response = new MyBean();
        response.setMyJokes(myJokes.getRandomJoke());
        return response;

    }

}