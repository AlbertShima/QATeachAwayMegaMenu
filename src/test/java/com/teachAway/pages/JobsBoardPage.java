package com.teachAway.pages;

import com.teachAway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsBoardPage {
    public JobsBoardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title=\"Jobs\"]")
    public WebElement jobs;

    @FindBy(css = "a[title$=\"Board\"]")
    public WebElement jobBoard;

    @FindBy(css = "[data-drupal-selector = 'edit-location']")
    public WebElement allCountries;

    @FindBy(css = "div[class=\"filter-option-inner-inner\"]")
    public WebElement allPositions;

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

    @FindBy(css = "[data-toggle = 'modal']")
    public WebElement filters;

    @FindBy(css = "p")
    public WebElement paragraphSeeOur;

    @FindBy(xpath = "//p[.//strong]")
    public WebElement paragraphCheckBack;

    
    
    
    
}
