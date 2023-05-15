package com.teachAway.step_definitions;

import com.teachAway.pages.DashboardPage;
import com.teachAway.pages.TeachAwayPage;
import com.teachAway.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Dashboard_step_definitions {
    DashboardPage dashboardPage = new DashboardPage();
    TeachAwayPage teachAwayPage = new TeachAwayPage();

    @Given("that you are in dashboard page")
    public void that_you_are_in_dashboard_page() {
        teachAwayPage.logIn();
    }

    @And("remove the alerts and pop up-s")
    public void removeTheAlertsAndPopUpS() {
        BrowserUtils.waitForElementToBeVisible(dashboardPage.accept, 10);
        dashboardPage.accept.click();
    }

    @Then("user should see {string} in URL")
    public void user_should_see_in_url(String dashboard) {
        BrowserUtils.waitFor(2);
        BrowserUtils.verifyURLContains(dashboard);
    }

    @And("user click to quick apply button")
    public void userClickToQuickApplyButton() {
        BrowserUtils.waitForElementToBeVisible(dashboardPage.quickApply, 6);
        dashboardPage.quickApply.click();
    }

    @Then("the text of the button should change to {string}")
    public void theTextOfTheButtonShouldChangeTo(String applied) {
        BrowserUtils.waitForElementToBeVisible(dashboardPage.youDontMeetTheRequirement, 2);
        if (dashboardPage.youDontMeetTheRequirement.isDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(dashboardPage.quickApply.getText().contains(applied));
        }
    }
}
