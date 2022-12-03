package pageObjects.litnet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;

public class DataExceedingAllowable extends BasePage {

    private final By account = By.cssSelector("[class='ln_topbar_avatar']");

    private final By editProfile = By.linkText("Редактировать профиль");

    private final By personalSite = By.id("editprofileform-site");

    private final By goodData = By.cssSelector("[class='alert my-alert alert-success']");

    private final By clickGoodData = By.cssSelector("[class='close']");

    private final By verifyLimitValues = By.cssSelector("[class='col-xs-4']>[class='form-group field-editprofileform-site has-error']>[class='help-block']");


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
