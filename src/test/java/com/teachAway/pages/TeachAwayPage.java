package com.teachAway.pages;

import com.teachAway.utilities.BrowserUtils;
import com.teachAway.utilities.ConfigurationReader;
import com.teachAway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeachAwayPage {
    public TeachAwayPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //These Web Elements are for REGISTRATION part

    @FindBy(id = "register")
    public WebElement webRegister;

    @FindBy(id = "first_name")
    public WebElement webInputFirstName;

    @FindBy(id = "last_name")
    public WebElement webInputLastName;

    @FindBy(id = "email")
    public WebElement webInputEmail;

    @FindBy(id = "password")
    public WebElement webInputPassword;

    @FindBy(id = "send-updates")
    public WebElement webCheckboxSendUpdatesInput;

    @FindBy(id = "create_account_action")
    public WebElement webButtonCreateAccountAction;

    @FindBy(xpath = "//h2[@id='welcome-firstName']")
    public WebElement webWelcome;

    @FindBy(xpath = "//div[@class='ta-web-ui-button__text']")
    public WebElement webGetStarted;

    //These Web Elements are for LOG IN part
    @FindBy(xpath = "//a[@title='Login']")
    public WebElement logIn;

    @FindBy(xpath = "//input[@placeholder='Email address']")
    public WebElement emailAddress;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[@data-testid='ta-web-ui-button-login_action']")
    public WebElement logInSubmit;

    @FindBy(xpath = "//div[@data-testid='ta-web-ui-input-username-error']")
    public WebElement thisFieldIsRequiredEmail;

    @FindBy(xpath = "//div[@data-testid='ta-web-ui-input-password-error']")
    public WebElement thisFieldIsRequiredPassword;

    @FindBy(xpath = "//div[@class='ta-web-ui-toast__text-container']/div")
    public WebElement errorEmailOrPasswordMessages;

    //Log in method
    public void logIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        logIn.click();
        BrowserUtils.waitForElementToBeVisible(emailAddress, 10);
        emailAddress.sendKeys(ConfigurationReader.getProperty("email"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        logInSubmit.click();
    }

    //Web Elements of mega menu
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

    @FindBy(css = "span[title=\"Teacher Certification\"]")
    public WebElement teacherCertification;

    @FindBy(css = "span[title=\"Teacher Certification Guide\"]")
    public WebElement teacherCertificationGuide;

    @FindBy(css = "span[title=\"Certification Programs\"]")
    public WebElement certificationPrograms;

    @FindBy(css = "span[title=\"Hawai\"]")
    public WebElement hawai;

    @FindBy(css = "span[title=\"Arizona\"]")
    public WebElement arizona;

    @FindBy(css = "a[title=\"Courses\"]")
    public WebElement courses;

}
