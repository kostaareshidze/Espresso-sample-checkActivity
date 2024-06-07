package com.ghedamsisabri.ui_testing_for_beginner.main.steps

import com.ghedamsisabri.ui_testing_for_beginner.Helper.getText
import com.ghedamsisabri.ui_testing_for_beginner.Helper.tap
import org.junit.Assert

class CommonSteps {
    fun checkIfMainPageLoaded(): CommonSteps {
        Assert.assertEquals("MainActivity", TC2Steps.firstPageActivity.getText(5))
        return this
    }

    fun clickNextButton(): CommonSteps {
        TC2Steps.NextBtn.tap()
        return this
    }
}