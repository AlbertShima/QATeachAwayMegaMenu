package com.teachAway.pages;

import com.teachAway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //These web element is for handling cookies
    @FindBy(xpath = "//a[@role='button']")
    public WebElement accept;

    //These web element is for handling profile update pop up
    @FindBy(id = "profile-complete-modal-cancel-button")
    public WebElement dismissUpdateMissingSections;

    @FindBy(xpath = "(//div[@class=\"ta-web-ui-button__text\"])[11]")
    public WebElement quickApply;

    @FindBy(xpath = "//div[@data-testid=\"ta-web-ui-toast-text\"][@class=\"ta-web-ui-toast__text\"]")
    public WebElement youDontMeetTheRequirement;

    @FindBy(css = "li[id=\"tab-241909-1\"] a[class*=\"inner--active\"]")
    public WebElement applications;

    @FindBy(xpath = "(//div[@class=\"ta-web-ui-list__item-text--title\"])[1]")
    public WebElement titleOfTheFirstJob;





}
