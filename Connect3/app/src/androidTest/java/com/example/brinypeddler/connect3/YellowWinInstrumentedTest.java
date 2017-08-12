package com.example.brinypeddler.connect3;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class YellowWinInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkFirstYellowWinCase() {
        onView(withId(R.id.imageView0)).perform(click());
        onView(withId(R.id.imageView1)).perform(click());
        onView(withId(R.id.imageView3)).perform(click());
        onView(withId(R.id.imageView2)).perform(click());
        onView(withId(R.id.imageView6)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Yellow has won")));
    }

    @Test
    public void checkSecondYellowWinCase() {
        onView(withId(R.id.imageView1)).perform(click());
        onView(withId(R.id.imageView0)).perform(click());
        onView(withId(R.id.imageView4)).perform(click());
        onView(withId(R.id.imageView3)).perform(click());
        onView(withId(R.id.imageView7)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Yellow has won")));
    }

    @Test
    public void checkThirdYellowWinCase() {
        onView(withId(R.id.imageView2)).perform(click());
        onView(withId(R.id.imageView0)).perform(click());
        onView(withId(R.id.imageView5)).perform(click());
        onView(withId(R.id.imageView3)).perform(click());
        onView(withId(R.id.imageView8)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Yellow has won")));
    }

    @Test
    public void checkFourthYellowWinCase() {
        onView(withId(R.id.imageView0)).perform(click());
        onView(withId(R.id.imageView4)).perform(click());
        onView(withId(R.id.imageView1)).perform(click());
        onView(withId(R.id.imageView3)).perform(click());
        onView(withId(R.id.imageView2)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Yellow has won")));
    }

    @Test
    public void checkFifthYellowWinCase() {
        onView(withId(R.id.imageView3)).perform(click());
        onView(withId(R.id.imageView0)).perform(click());
        onView(withId(R.id.imageView4)).perform(click());
        onView(withId(R.id.imageView3)).perform(click());
        onView(withId(R.id.imageView5)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Yellow has won")));
    }

    @Test
    public void checkSixthYellowWinCase() {
        onView(withId(R.id.imageView6)).perform(click());
        onView(withId(R.id.imageView0)).perform(click());
        onView(withId(R.id.imageView7)).perform(click());
        onView(withId(R.id.imageView3)).perform(click());
        onView(withId(R.id.imageView8)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Yellow has won")));
    }

    @Test
    public void checkSeventhYellowWinCase() {
        onView(withId(R.id.imageView0)).perform(click());
        onView(withId(R.id.imageView1)).perform(click());
        onView(withId(R.id.imageView4)).perform(click());
        onView(withId(R.id.imageView3)).perform(click());
        onView(withId(R.id.imageView8)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Yellow has won")));
    }

    @Test
    public void checkEighthYellowWinCase() {
        onView(withId(R.id.imageView2)).perform(click());
        onView(withId(R.id.imageView0)).perform(click());
        onView(withId(R.id.imageView4)).perform(click());
        onView(withId(R.id.imageView3)).perform(click());
        onView(withId(R.id.imageView6)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Yellow has won")));
    }

}
