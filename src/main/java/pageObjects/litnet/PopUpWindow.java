package pageObjects.litnet;

import org.openqa.selenium.By;
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

    public PopUpWindow checkTableIsDisplayed2() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(driver.findElement(windowBell).isDisplayed());
        return this;
    }

}
