package com.teachAway.pages;

import com.teachAway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobBoardPage {
    public JobBoardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title=\"Jobs\"]")
    public WebElement jobs;

    @FindBy(xpath = "//a[text()=' Job Board ']")
    public WebElement jobBoard;

    @FindBy(css = "[data-drupal-selector = 'edit-submit']")
    public WebElement searchJobs;

    @FindBy(xpath = "//a[@data-toggle='tooltip']")
    public WebElement eslJobBoardLink;

    @FindBy(css = "h1 span")
    public WebElement findTeachingJobsAbroad;

    @FindBy(css = "div[class$=\"subtitle\"] h2")
    public WebElement h2Text;

    @FindBy(css = "div[class$=\"subtitle\"] h3")
    public WebElement h3Text;

    @FindBy(xpath = "//div[@class='tt-dataset tt-dataset-locations search-no-result']")
    public WebElement hiddenTextBox;

    @FindBy(css = "[data-toggle = 'modal']")
    public WebElement filters;

    @FindBy(css = "p")
    public WebElement paragraphSeeOur;

    @FindBy(xpath = "//p[.//strong]")
    public WebElement paragraphCheckBack;

    @FindBy(css = "[data-drupal-selector = 'edit-location']")
    public WebElement allCountries;

    @FindBy(xpath = "//span[text()='All Positions']")
    public WebElement allPositions;

    @FindBy(xpath = "//span[text()='Certified Teacher']")
    public WebElement certifiedTeacher;

    @FindBy(xpath = "//span[text()='College & University']")
    public WebElement collegeUniversity;

    @FindBy(xpath = "//span[text()='ESL Teaching']")
    public WebElement eSLTeaching;

    @FindBy(xpath = "//span[text()='Preschool & Early Childhood']")
    public WebElement preschoolEarlyChildhood;

    @FindBy(xpath = "//span[text()='Principal & Admin']")
    public WebElement principalAdmin;

    @FindBy(xpath = "//span[text()='School Support & Librarian']")
    public WebElement schoolSupportLibrarian;


}
