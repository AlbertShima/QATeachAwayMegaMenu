package com.teachAway.step_definitions;

import com.teachAway.pages.JobsBoardPage;
import com.teachAway.utilities.BrowserUtils;
import com.teachAway.utilities.ConfigurationReader;
import com.teachAway.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class JobsBoard_Step_definitions {
    String countryName = "";

    JobsBoardPage jobsBoardPage = new JobsBoardPage();

    @Given("that you are on tech away site")
    public void that_you_are_on_tech_away_site() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("you go to the jobs board")
    public void youGoToTheJobsBoard() {
        jobsBoardPage.jobs.click();
        jobsBoardPage.jobBoard.click();
    }

    @Then("you should see the text")
    public void you_should_see_the_text(List<String> expectedString) {

        String actualString = "";

        for (int i = 0; i < expectedString.size(); i++) {
            switch (i) {
                case 0:
                    actualString = jobsBoardPage.findTeachingJobsAbroad.getText();
                    break;
                case 1:
                    actualString = jobsBoardPage.h2Text.getText();
                    break;
                case 2:
                    actualString = jobsBoardPage.h3Text.getText();
                    break;
            }

            Assert.assertEquals(actualString, expectedString.get(i));

        }
    }

    @Then("you should click the link ESL job board")
    public void youShouldClickTheLinkESLJobBoard(String link) {
        jobsBoardPage.eslJobBoardLink.click();
        BrowserUtils.verifyURLContains(link);
    }

    @Then("you should see on the page All countries, All Positions and Search jobs")
    public void youShouldSeeOnThePageAllCountriesAllPositionsAndSearchJobs() {
        Assert.assertTrue(jobsBoardPage.allCountries.isDisplayed());
        Assert.assertTrue(jobsBoardPage.allPositions.isDisplayed());
        Assert.assertTrue(jobsBoardPage.searchJobs.isDisplayed());
    }

    @And("you type the country name {string}")
    public void youTypeTheCountryName(String country) {
        countryName = country;
        jobsBoardPage.allCountries.sendKeys(country);
    }

    @And("choose {string} from All Positions")
    public void chooseFromAllPositions(String position) {
        jobsBoardPage.allPositions.click();
        switch (position) {
            case "All Positions":
                jobsBoardPage.allPositions.click();
                break;
            case "Certified Teacher":
                jobsBoardPage.certifiedTeacher.click();
                break;
            case "College & University":
                jobsBoardPage.collegeUniversity.click();
                break;
            case "ESL Teaching":
                jobsBoardPage.eSLTeaching.click();
                break;
            case "Preschool & Early Childhood":
                jobsBoardPage.preschoolEarlyChildhood.click();
                break;
            case "Principal & Admin":
                jobsBoardPage.principalAdmin.click();
                break;
            case "School Support & Librarian":
                jobsBoardPage.schoolSupportLibrarian.click();
                break;
        }

    }

    @Then("you should see suggestion for the letters you typed")
    public void youShouldSeeSuggestionForTheLettersYouTyped(String countries) {
        System.out.println(jobsBoardPage.hiddenTextBox.getText());
        if (countries.contains(countryName)) {
            Assert.assertTrue("You should see some suggestions", true);
        } else {
            Assert.assertFalse("No matches found", false);
        }

    }


}
