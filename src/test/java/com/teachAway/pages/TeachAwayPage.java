package com.teachAway.pages;

import com.teachAway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeachAwayPage {
    public TeachAwayPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "span[title=\"Destinations\"]")
    public WebElement destinations;

    @FindBy(css = "span[title$=\"Programs\"]")
    public WebElement featuredPrograms;

    @FindBy(css = "span[title$=\"Openings\"]")
    public WebElement jobOpenings;

    @FindBy(css = "span[title$=\"US\"]")
    public WebElement teachThe;

    @FindBy(css = "span[title=\"Community\"]")
    public WebElement community;

    @FindBy(css = "span[title=\"Tefl\"]")
    public WebElement tefl;

    @FindBy(css = "a[title=\"TEFL Courses\"]")
    public WebElement teflCourses;
    
    


}
