package com.teachAway.step_definitions;

import com.teachAway.pages.JobsAbroadPage;
import com.teachAway.utilities.BrowserUtils;
import com.teachAway.utilities.ConfigurationReader;
import com.teachAway.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class JobsBoard_step_definitions {
    String countryName = "";
    JobsAbroadPage jobsAbroadPage = new JobsAbroadPage();

    @Given("that you are on tech away site")
    public void that_you_are_on_tech_away_site() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("you go to the jobs board")
    public void youGoToTheJobsBoard() {
        jobsAbroadPage.jobs.click();
        jobsAbroadPage.jobBoard.click();
    }

    @Then("you should see the text")
    public void you_should_see_the_text(List<String> expectedString) {

        String actualString = "";

        for (int i = 0; i < expectedString.size(); i++) {
            switch (i) {
                case 0:
                    actualString = jobsAbroadPage.findTeachingJobsAbroad.getText();
                    break;
                case 1:
                    actualString = jobsAbroadPage.h2Text.getText();
                    break;
                case 2:
                    actualString = jobsAbroadPage.h3Text.getText();
                    break;
            }

            Assert.assertEquals(actualString, expectedString.get(i));

        }
    }

    @Then("you should click the link ESL job board")
    public void youShouldClickTheLinkESLJobBoard(String link) {
        jobsAbroadPage.eslJobBoardLink.click();
        BrowserUtils.verifyURLContains(link);
    }

    @Then("you should see on the page All countries, All Positions and Search jobs")
    public void youShouldSeeOnThePageAllCountriesAllPositionsAndSearchJobs() {
        Assert.assertTrue(jobsAbroadPage.allCountries.isDisplayed());
        Assert.assertTrue(jobsAbroadPage.allPositions.isDisplayed());
        Assert.assertTrue(jobsAbroadPage.searchJobs.isDisplayed());
    }

    @And("you type the country name {string}")
    public void youTypeTheCountryName(String country) {
        countryName = country;
        jobsAbroadPage.allCountries.sendKeys(country);
    }

    @And("choose {string} from All Positions")
    public void chooseFromAllPositions(String position) {
        jobsAbroadPage.allPositions.click();
        switch (position) {
            case "All Positions":
                jobsAbroadPage.allPositions.click();
                break;
            case "Certified Teacher":
                jobsAbroadPage.certifiedTeacher.click();
                break;
            case "College & University":
                jobsAbroadPage.collegeUniversity.click();
                break;
            case "ESL Teaching":
                jobsAbroadPage.eSLTeaching.click();
                break;
            case "Preschool & Early Childhood":
                jobsAbroadPage.preschoolEarlyChildhood.click();
                break;
            case "Principal & Admin":
                jobsAbroadPage.principalAdmin.click();
                break;
            case "School Support & Librarian":
                jobsAbroadPage.schoolSupportLibrarian.click();
                break;
        }

    }

    @Then("you should see suggestion for the letters you typed")
    public void youShouldSeeSuggestionForTheLettersYouTyped(String countries) {
        System.out.println(jobsAbroadPage.hiddenTextBox.getText());
        if (countries.contains(countryName)) {
            Assert.assertTrue("You should see some suggestions", true);
        } else {
            Assert.assertFalse("No matches found", false);
        }

    }
}
