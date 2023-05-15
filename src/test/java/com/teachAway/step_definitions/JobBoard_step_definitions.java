package com.teachAway.step_definitions;

import com.teachAway.pages.JobBoardPage;
import com.teachAway.utilities.BrowserUtils;
import com.teachAway.utilities.ConfigurationReader;
import com.teachAway.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class JobBoard_step_definitions {
    String countryName = "";
    JobBoardPage jobBoardPage = new JobBoardPage();

    @Given("that you are on tech away site")
    public void that_you_are_on_tech_away_site() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("user go to the jobs board")
    public void userGoToTheJobsBoard() {
        jobBoardPage.jobs.click();
        jobBoardPage.jobBoard.click();
    }

    @Then("user should see the text")
    public void user_should_see_the_text(List<String> expectedString) {

        String actualString = "";

        for (int i = 0; i < expectedString.size(); i++) {
            switch (i) {
                case 0:
                    actualString = jobBoardPage.findTeachingJobsAbroad.getText();
                    break;
                case 1:
                    actualString = jobBoardPage.h2Text.getText();
                    break;
                case 2:
                    actualString = jobBoardPage.h3Text.getText();
                    break;
            }

            Assert.assertEquals(actualString, expectedString.get(i));

        }
    }

    @Then("user should click the link ESL job board")
    public void userShouldClickTheLinkESLJobBoard(String link) {
        jobBoardPage.eslJobBoardLink.click();
        BrowserUtils.verifyURLContains(link);
    }

    @Then("user should see on the page All countries, All Positions and Search jobs")
    public void userShouldSeeOnThePageAllCountriesAllPositionsAndSearchJobs() {
        Assert.assertTrue(jobBoardPage.allCountries.isDisplayed());
        Assert.assertTrue(jobBoardPage.searchJobs.isDisplayed());
        BrowserUtils.waitForElementToBeVisible(jobBoardPage.allPositions,10);
        Assert.assertTrue(jobBoardPage.allPositions.isDisplayed());
    }

    @And("user type the country name {string}")
    public void userTypeTheCountryName(String country) {
        countryName = country;
        jobBoardPage.allCountries.sendKeys(country);
    }
    /*
    @And("choose {string} from All Positions")
    public void chooseFromAllPositions(String position) {
        BrowserUtils.waitForElementToBeVisible(jobBoardPage.allPositions, 10);
        jobBoardPage.allPositions.click();
        switch (position) {
            case "All Positions":
                jobBoardPage.allPositions.click();
                break;
            case "Certified Teacher":
                jobBoardPage.certifiedTeacher.click();
                break;
            case "College & University":
                jobBoardPage.collegeUniversity.click();
                break;
            case "ESL Teaching":
                jobBoardPage.eSLTeaching.click();
                break;
            case "Preschool & Early Childhood":
                jobBoardPage.preschoolEarlyChildhood.click();
                break;
            case "Principal & Admin":
                jobBoardPage.principalAdmin.click();
                break;
            case "School Support & Librarian":
                jobBoardPage.schoolSupportLibrarian.click();
                break;
        }

    }

     */

    @Then("user should see suggestion for the letters you typed")
    public void userShouldSeeSuggestionForTheLettersYouTyped(List<String> stringList) {
        for (String each : stringList) {
            boolean containsValue = each.contains(countryName);
            Assert.assertTrue("The list contains the search value: " + countryName, containsValue);
            break;
        }

    }

}
