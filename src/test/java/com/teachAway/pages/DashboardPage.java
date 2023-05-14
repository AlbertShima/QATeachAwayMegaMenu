package com.teachAway.pages;

import com.teachAway.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
