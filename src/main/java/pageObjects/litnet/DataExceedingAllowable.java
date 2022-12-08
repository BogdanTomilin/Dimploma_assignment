package pageObjects.litnet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;

import java.io.File;
import java.time.Duration;

public class DataExceedingAllowable extends BasePage {

    private final By account = By.cssSelector("[class='ln_topbar_avatar']");

    private final By editProfile = By.linkText("Редактировать профиль");

    private final By personalSite = By.id("editprofileform-site");

    private final By goodData = By.cssSelector("[class='alert my-alert alert-success']");

    private final By clickGoodData = By.cssSelector("[class='close']");

    private final By verifyLimitValues = By.cssSelector("[class='col-xs-4']>[class='form-group field-editprofileform-site has-error']>[class='help-block']");

    private final By loadPhoto = By.id("avatar-js-upload-btn");

    private final By pageWithPhoto = By.cssSelector("#avatar-image-modal > div > div");

    private final By clickSaveBtn = By.id("avatar-submit-button");




    public DataExceedingAllowable clickChangePhotoBtn(){
        String absolutePath = new File("Image/Load_File.jpg").getAbsolutePath();
        driver.findElement(loadPhoto).sendKeys(absolutePath);
        driver.findElement(pageWithPhoto);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(clickSaveBtn);
        js.executeScript("window.scrollBy(0,500)");
        actions.moveToElement(findElement(clickSaveBtn)).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(clickSaveBtn));
        waitVisibilityOfElement(clickSaveBtn);
        waitUntil(5);
        click(clickSaveBtn);
        return this;
    }



    public DataExceedingAllowable clickAccount(){
        click(account);
        return this;
    }

    public DataExceedingAllowable clickEditProfile(){
        click(editProfile);
        return this;
    }

    public DataExceedingAllowable enterLimit(String enterData){
        enter(personalSite, enterData);
        return this;
    }

    public DataExceedingAllowable verifyLimitValues(){
        Assert.assertEquals(getText(verifyLimitValues),"Значение «Личный сайт» должно содержать максимум 40 символов.");
        return this;
    }

    public DataExceedingAllowable verifyLimitValuesNormal(){
        Assert.assertTrue(findElement(goodData).isDisplayed());
        click(clickGoodData);
        return this;
    }

    private void enter(By locator, String enterData) {
        findElement(locator).clear();
        findElement(locator).sendKeys(enterData,Keys.ENTER);

    }

}
