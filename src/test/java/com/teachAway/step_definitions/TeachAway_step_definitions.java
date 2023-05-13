package com.teachAway.step_definitions;

import com.teachAway.pages.JobsBoardPage;
import com.teachAway.pages.TeachAwayPage;
import com.teachAway.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TeachAway_step_definitions {
    TeachAwayPage teachAwayPage = new TeachAwayPage();
    JobsBoardPage jobsBoardPage = new JobsBoardPage();


    @Then("Verify that the title is {string}")
    public void verifyThatTheTitleIs(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Then("you should see all menu´s of the main page")
    public void you_should_see_all_menu_s_of_the_main_page() {
        Assert.assertTrue(jobsBoardPage.jobs.isDisplayed());
        jobsBoardPage.jobs.click();
        Assert.assertTrue(jobsBoardPage.jobBoard.isDisplayed());
        Assert.assertTrue(teachAwayPage.destinations.isDisplayed());
        Assert.assertTrue(teachAwayPage.featuredPrograms.isDisplayed());
        Assert.assertTrue(teachAwayPage.jobOpenings.isDisplayed());

        Assert.assertTrue(teachAwayPage.tefl.isDisplayed());

        teachAwayPage.tefl.click();

        Assert.assertTrue(teachAwayPage.teflCourses.isDisplayed());
        Assert.assertTrue(teachAwayPage.teacherCertification.isDisplayed());
        Assert.assertTrue(teachAwayPage.teacherCertification.isDisplayed());
        teachAwayPage.teacherCertification.click();

        Assert.assertTrue(teachAwayPage.teacherCertificationGuide.isDisplayed());
        Assert.assertTrue(teachAwayPage.certificationPrograms.isDisplayed());
        Assert.assertTrue(teachAwayPage.hawai.isDisplayed());
        Assert.assertTrue(teachAwayPage.arizona.isDisplayed());
    }


    @Then("Verify that the url is {string}")
    public void verifyThatTheUrlIs(String expectedURL) {
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }
}
