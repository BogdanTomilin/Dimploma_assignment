package pageObjects.litnet;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;

import java.time.Duration;

public class AddNewRomance extends BasePage {
    private final By dialogWindow = By.id("nickname-modal");

    private final By addRomance = By.linkText("Добавить роман");

    public By getType(String type) {
        return By.cssSelector("[class='nav nav-stacked nav-lc-menu'] a[href$='" + type + "']");
    }


    public AddNewRomance clickAddRomance2 (String type) {
        actions.moveToElement(findElement(addRomance)).build().perform();
        waitVisibilityOfElement(addRomance);
        waitUntil(5);
        actions.moveToElement(findElement(addRomance)).build().perform();
        click(getType(type));
        return this;
    }


    public AddNewRomance clickAddRomance(){
        actions.moveToElement(findElement(addRomance)).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addRomance));
        waitUntil(5);
        click(addRomance);
        return this;
    }

    public AddNewRomance checkDialogMassage(){
        waitVisibilityOfElement(dialogWindow);
        Assert.assertTrue(driver.findElement(dialogWindow).isDisplayed());
        waitUntil(2);
        return this;
    }

}
