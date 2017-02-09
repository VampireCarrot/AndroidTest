package com.lwd.androidtest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * User: LWD
 * Date: 2017/2/9
 * Email: 13102169005@163.com
 * Description:
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void registerIdlingResource() {

    }

    @Test
    public void save() throws Exception {

        String str = "LWD";
        onView(withId(R.id.edt_test)).perform(typeText(str),closeSoftKeyboard());
        onView(withId(R.id.btn_save)).perform(click());
        onView(withId(R.id.tv_test)).check(matches(withText(str)));



    }
    @Test
    public void clear() throws Exception{
        onView(withId(R.id.btn_clear)).perform(click());

        //校验 该组件是否匹配空字符
        onView(withId(R.id.tv_test)).check(matches(withText("")));
    }

    @After
    public void unregisterIdlingResource() {

    }
}
