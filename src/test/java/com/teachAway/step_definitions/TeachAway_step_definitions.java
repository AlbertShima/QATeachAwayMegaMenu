package com.teachAway.step_definitions;

import com.teachAway.pages.JobBoardPage;
import com.teachAway.pages.TeachAwayPage;
import com.teachAway.utilities.BrowserUtils;
import com.teachAway.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TeachAway_step_definitions {
    TeachAwayPage teachAwayPage = new TeachAwayPage();
    JobBoardPage jobsBoardPage = new JobBoardPage();

    @When("user click on log in button")
    public void user_click_on_log_in_button() {
        teachAwayPage.logIn.click();
    }

    @When("user enter email {string}")
    public void user_enter_email(String email) {
        BrowserUtils.implicitWait(4);
        teachAwayPage.emailAddress.sendKeys(email);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
       teachAwayPage.password.click();
        teachAwayPage.emailAddress.click();
        teachAwayPage.password.click();
    }

    @Then("user should see the {string} on url")
    public void userShouldSeeTheOnUrl(String dashboard) {
        BrowserUtils.waitForElementToBeVisible(teachAwayPage.dashboard,10);
        BrowserUtils.verifyURLContains(dashboard);
    }

    @Then("Verify that the title is {string}")
    public void verifyThatTheTitleIs(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("user should see a pop-up sms left bottom {string}")
    public void userShouldSeeAPopUpSmsLeftBottom(String invalidEmOrPass) {
        BrowserUtils.waitForElementToBeVisible(teachAwayPage.errorEmailOrPasswordMessages,5);
        Assert.assertEquals(teachAwayPage.errorEmailOrPasswordMessages.getText(), invalidEmOrPass);
    }

    @Then("user should see below password field {string}")
    public void userShouldSeeBelowPasswordField(String blankCredentials) {
        Assert.assertEquals(teachAwayPage.thisFieldIsRequiredPassword.getText(), blankCredentials);
    }

    @Then("user should see below email field {string}")
    public void userShouldSeeBelowEmailField(String blankCredentials) {
        Assert.assertEquals(teachAwayPage.thisFieldIsRequiredEmail.getText(), blankCredentials);
    }

    @Then("you should see all menu´s of the main page")
    public void you_should_see_all_menu_s_of_the_main_page() {
        jobsBoardPage.jobs.click();
        Assert.assertTrue(jobsBoardPage.jobs.isDisplayed());
        Assert.assertTrue(jobsBoardPage.jobBoard.isDisplayed());
        Assert.assertTrue(teachAwayPage.destinations.isDisplayed());
        Assert.assertTrue(teachAwayPage.featuredPrograms.isDisplayed());
        Assert.assertTrue(teachAwayPage.jobOpenings.isDisplayed());
        Assert.assertTrue(teachAwayPage.teachThe.isDisplayed());
        Assert.assertTrue(teachAwayPage.community.isDisplayed());
        Assert.assertTrue(teachAwayPage.courses.isDisplayed());
        teachAwayPage.tefl.click();
        Assert.assertTrue(teachAwayPage.tefl.isDisplayed());
        BrowserUtils.waitFor(3);
        Assert.assertTrue(teachAwayPage.teflCourses.isDisplayed());
        teachAwayPage.teacherCertification.click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue(teachAwayPage.teacherCertification.isDisplayed());
    }


    @Then("Verify that the url is {string}")
    public void verifyThatTheUrlIs(String expectedURL) {
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }

    @When("user click REGISTER button")
    public void userClickREGISTERButton() {
        teachAwayPage.webRegister.click();
    }

    @And("fill all necessary fields, {string}, {string}, {string}, , {string}")
    public void fillAllNecessaryFields(String firstName, String lastName, String email, String password) {
        teachAwayPage.webInputFirstName.sendKeys(firstName);
        teachAwayPage.webInputLastName.sendKeys(lastName);
        teachAwayPage.webInputEmail.sendKeys(email);
        teachAwayPage.webInputPassword.sendKeys(password);
    }

    @And("user check the check box")
    public void userCheckTheCheckBox() {
        teachAwayPage.webCheckboxSendUpdatesInput.click();
    }

    @And("user click Sign up button")
    public void userClickSignUpButton() {
        teachAwayPage.webButtonCreateAccountAction.click();
    }

    @Then("user see the welcome messages, {string}")
    public void userSeeTheWelcomeMessages(String firstName) {
        BrowserUtils.waitForElementToBeVisible(teachAwayPage.webWelcome, 10);
        String expectedMessage = "Welcome, " + firstName + "!";
        String actualMessage = teachAwayPage.webWelcome.getText();
        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("user enter password {string}")
    public void userEnterPassword(String password) {
        teachAwayPage.password.sendKeys(password);
    }

    @And("user clicks on log in button")
    public void userClicksOnLogInButton() {
        teachAwayPage.logInSubmit.click();
    }
}
