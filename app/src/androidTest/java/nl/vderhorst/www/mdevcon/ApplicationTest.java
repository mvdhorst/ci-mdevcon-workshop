package nl.vderhorst.www.mdevcon;

import android.app.Application;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public ApplicationTest() {
        super(MainActivity.class);
    }

    public void testHelloWorld() {
        getActivity();
        Espresso.onView(ViewMatchers.withId(R.id.test)).
                check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")));
    }
}