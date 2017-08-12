package com.example.brinypeddler.connect3.RedWinInstrumentedTest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.brinypeddler.connect3.MainActivity;
import com.example.brinypeddler.connect3.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by salman on 12/8/17.
 */

@RunWith(AndroidJUnit4.class)
public class RedWinInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkRedFirstWinCase() {
        onView(withId(R.id.imageView1)).perform(click());
        onView(withId(R.id.imageView0)).perform(click());
        onView(withId(R.id.imageView2)).perform(click());
        onView(withId(R.id.imageView3)).perform(click());
        onView(withId(R.id.imageView5)).perform(click());
        onView(withId(R.id.imageView6)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Red has won")));
    }

    @Test
    public void checkRedSecondWinCase() {
        onView(withId(R.id.imageView0)).perform(click());
        onView(withId(R.id.imageView1)).perform(click());
        onView(withId(R.id.imageView2)).perform(click());
        onView(withId(R.id.imageView4)).perform(click());
        onView(withId(R.id.imageView5)).perform(click());
        onView(withId(R.id.imageView7)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Red has won")));
    }

    @Test
    public void checkRedThirdWinCase() {
        onView(withId(R.id.imageView1)).perform(click());
        onView(withId(R.id.imageView2)).perform(click());
        onView(withId(R.id.imageView6)).perform(click());
        onView(withId(R.id.imageView5)).perform(click());
        onView(withId(R.id.imageView7)).perform(click());
        onView(withId(R.id.imageView8)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Red has won")));
    }

    @Test
    public void checkRedFourthWinCase() {
        onView(withId(R.id.imageView4)).perform(click());
        onView(withId(R.id.imageView0)).perform(click());
        onView(withId(R.id.imageView6)).perform(click());
        onView(withId(R.id.imageView1)).perform(click());
        onView(withId(R.id.imageView7)).perform(click());
        onView(withId(R.id.imageView2)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Red has won")));
    }

    @Test
    public void checkRedFifthWinCase() {
        onView(withId(R.id.imageView2)).perform(click());
        onView(withId(R.id.imageView3)).perform(click());
        onView(withId(R.id.imageView6)).perform(click());
        onView(withId(R.id.imageView4)).perform(click());
        onView(withId(R.id.imageView8)).perform(click());
        onView(withId(R.id.imageView5)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Red has won")));
    }

    @Test
    public void checkRedSixthWinCase() {
        onView(withId(R.id.imageView1)).perform(click());
        onView(withId(R.id.imageView6)).perform(click());
        onView(withId(R.id.imageView2)).perform(click());
        onView(withId(R.id.imageView7)).perform(click());
        onView(withId(R.id.imageView4)).perform(click());
        onView(withId(R.id.imageView8)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Red has won")));
    }

    @Test
    public void checkRedSeventhWinCase() {
        onView(withId(R.id.imageView2)).perform(click());
        onView(withId(R.id.imageView0)).perform(click());
        onView(withId(R.id.imageView6)).perform(click());
        onView(withId(R.id.imageView4)).perform(click());
        onView(withId(R.id.imageView5)).perform(click());
        onView(withId(R.id.imageView8)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Red has won")));
    }

    @Test
    public void checkRedEigthWinCase() {
        onView(withId(R.id.imageView1)).perform(click());
        onView(withId(R.id.imageView2)).perform(click());
        onView(withId(R.id.imageView5)).perform(click());
        onView(withId(R.id.imageView4)).perform(click());
        onView(withId(R.id.imageView7)).perform(click());
        onView(withId(R.id.imageView6)).perform(click());

        onView(withId(R.id.winner)).check(matches(withText("Red has won")));
    }

}
