package com.teachAway.step_definitions;

import com.teachAway.pages.JobsBoardPage;
import com.teachAway.pages.TeachAwayPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TeachAway_step_definitions {
    TeachAwayPage teachAwayPage = new TeachAwayPage();
    JobsBoardPage jobsBoardPage = new JobsBoardPage();

    @Then("you should see all menu´s of the main page")
    public void you_should_see_all_menu_s_of_the_main_page() {
        Assert.assertTrue(jobsBoardPage.jobs.isDisplayed());
        jobsBoardPage.jobs.click();
        Assert.assertTrue(jobsBoardPage.jobBoard.isDisplayed());
        Assert.assertTrue(teachAwayPage.destinations.isDisplayed());
        Assert.assertTrue(teachAwayPage.featuredPrograms.isDisplayed());
        Assert.assertTrue(teachAwayPage.jobOpenings.isDisplayed());
        Assert.assertTrue(teachAwayPage.te.isDisplayed());
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


}
