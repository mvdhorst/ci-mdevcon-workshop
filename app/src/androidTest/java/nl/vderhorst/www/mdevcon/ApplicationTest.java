package nl.vderhorst.www.mdevcon;

import android.app.Application;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testHelloWorld() {
        Espresso.onView(ViewMatchers.withId(R.id.test)).check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")));
    }
}