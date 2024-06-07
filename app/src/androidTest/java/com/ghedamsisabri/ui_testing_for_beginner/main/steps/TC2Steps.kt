package com.ghedamsisabri.ui_testing_for_beginner.main.steps

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.ghedamsisabri.ui_testing_for_beginner.Helper.getText
import com.ghedamsisabri.ui_testing_for_beginner.Helper.isViewDisplayed
import com.ghedamsisabri.ui_testing_for_beginner.Helper.tap
import com.ghedamsisabri.ui_testing_for_beginner.R
import org.hamcrest.Matcher
import org.junit.Assert

class TC2Steps {

    fun goBackWithBackButton(): TC2Steps {
        backButton.tap()
        return this
    }

    fun validateMainPageComponents(): TC2Steps {
        Assert.assertEquals("MainActivity", firstPageActivity.getText(5))
        Assert.assertTrue(NextBtn.isViewDisplayed())
        return this
    }

    companion object {
        val NextBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.button_next_activity) }
        val firstPageActivity: Matcher<View> by lazy { ViewMatchers.withId(R.id.activity_main_title) }
        val backButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.button_back) }
    }
}
