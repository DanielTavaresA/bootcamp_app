package com.example.bootcamp;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {
    @Test
    public void greetingTest(){
        Intent myIntent = new Intent(ApplicationProvider.getApplicationContext(), Greeting.class);
        myIntent.putExtra("name", "Daniel");
        ActivityScenario.launch(myIntent);
        Espresso.onView(ViewMatchers.withId(R.id.greetingMessage)).check(ViewAssertions.matches(ViewMatchers.withText("Hello Daniel")));
    }
}
