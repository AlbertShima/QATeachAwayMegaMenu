package com.teachAway.pages;

import com.teachAway.utilities.Driver;
import org.apache.poi.sl.draw.geom.Guide;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeachAwayPage {
    public TeachAwayPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@id='hs-eu-decline-button']")
    public WebElement decline;

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

    @FindBy(css = "a[title='TEFL Certification Guide']")
    public WebElement tEFLCertificationGuide;

    @FindBy(css = "span[title=\"Teacher\"]")
    public WebElement teacherCertification;

    @FindBy(css = "span[title=\"Teacher Certification Guide\"]")
    public WebElement teacherCertificationGuide;

    @FindBy(css = "span[title=\"Certification Programs\"]")
    public WebElement certificationPrograms;

    @FindBy(css = "span[title=\"Hawai\"]")
    public WebElement hawai;

    @FindBy(css = "span[title=\"Arizona\"]")
    public WebElement arizona;



    
    



    


}
