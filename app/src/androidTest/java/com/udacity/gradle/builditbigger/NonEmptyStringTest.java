package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ProgressBar;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class NonEmptyStringTest {
Context context;
    private ProgressBar mProgressBar;

    @Rule
    public final ActivityTestRule<Main2Activity> mActivityActivityTestRule
            = new ActivityTestRule<>(Main2Activity.class);
    @Test
    public void testAsyncTaskLoadsJoke() throws Exception {

        // Assign
        EndpointsAsyncTask testTask = new EndpointsAsyncTask(context,mProgressBar);

        // Action
      testTask.execute();
        String joke = testTask.get();

        // Assert
        assertNotNull(joke);
        assertFalse(joke.isEmpty());
    }
}
