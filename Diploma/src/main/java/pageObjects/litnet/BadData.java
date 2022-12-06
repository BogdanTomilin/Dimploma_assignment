package pageObjects.litnet;

import org.openqa.selenium.By;

import org.testng.Assert;
import pageObjects.baseObjects.BasePage;


public class BadData extends BasePage {

    private final By find = By.cssSelector("[class='ln_topbar_search-icon']");
    private final By title = By.cssSelector("[class='l-container']>[class='alert alert-danger']");

    public BadData clickFind(){
        click(find);
        return this;
    }


    public BadData VerifyBadData(){
        Assert.assertEquals(getText(title), "Введите поисковый запрос");
        return this;
    }

}
