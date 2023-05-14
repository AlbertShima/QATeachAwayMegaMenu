package com.teachAway.step_definitions;

import com.teachAway.pages.DashboardPage;
import com.teachAway.pages.TeachAwayPage;
import com.teachAway.utilities.BrowserUtils;
import com.teachAway.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DashBoard_step_definitions {
    DashboardPage dashboardPage = new DashboardPage();
    TeachAwayPage teachAwayPage = new TeachAwayPage();
    @Given("that you are in dashboard page")
    public void that_you_are_in_dashboard_page() {
        teachAwayPage.logIn();
    }
    @And("remove the alerts and pop up-s")
    public void removeTheAlertsAndPopUpS() {
        BrowserUtils.waitFor(6);
        dashboardPage.accept.click();

    }

    @Then("you should see {string} in URL")
    public void you_should_see_in_url(String dashboard) {
        BrowserUtils.verifyURLContains(dashboard);
    }
}
