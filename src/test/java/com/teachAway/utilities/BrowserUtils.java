package com.teachAway.utilities;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    /**
     * This method will wait until the web element is visible on the page(explicit wait)
     */
    public static void waitForElementToBeVisible(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * This method will accept a String as expected value and verify actual URL CONTAINS the value.
     */
    public static void verifyURLContains(String expectedInURL) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }


    /**
     * Switches to new window by the exact title. Returns to original window if target title not found
     */
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    /**
     * This method will stop the code run
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method will accept int (in seconds) and execute implicit wait
     * for given duration
     */
    public static void implicitWait(int second) {
        Driver.getDriver().manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }

    /**
     * Verifies whether the element is displayed on page
     *
     * @throws AssertionError if the element is not found or not displayed
     */
    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }
}
