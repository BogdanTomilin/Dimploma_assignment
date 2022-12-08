package pageObjects.litnet;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;

import java.time.Duration;

public class PopUpWindow extends BasePage {

    private final By bell = By.id("notices");

    private final By windowBell = By.id("notice-popup");

    public PopUpWindow clickBell () {
        click(bell);
        return this;
    }

    public PopUpWindow checkTableIsDisplayed() {
        waitVisibilityOfElement(windowBell);
        Assert.assertTrue(driver.findElement(windowBell).isDisplayed());
        waitUntil(2);
        return this;
    }

}
