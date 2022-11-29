package pageObjects.litnet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;



public class RemoveEssence extends BasePage {

    private final By myLibrary = By.linkText("Моя библиотека");

    private final By move = By.xpath("/html/body/div[3]/div/div/div[2]/div[6]/div/div[2]/div[2]/button");

    private final By removeFromLibrary = By.xpath("/html/body/div[3]/div/div/div[2]/div[6]/div[1]/div[2]/div[2]/ul/li[3]/a");
     /*[class='dropdown-menu']>li>a[href$="400348"]*/
    private final By title = By.cssSelector("[class=no_items_found]");

    private final By editProfile = By.linkText("Редактировать профиль");

    //private final By scroll = By.id("rental-books-widget-hide-modal");

    //private final By scroll = By.cssSelector("[class='wrap']>[class='content-wrapper']>[class='container']>[class='content']");

    public RemoveEssence clickMyLibrary (){
        click(myLibrary);
        return this;
    }

    public RemoveEssence clickMove () {
        click(move);
        return this;
    }

    public RemoveEssence clickRemoveFromLibrary  () {
        click(removeFromLibrary);
        return this;
    } /*использовать select*/

    public RemoveEssence verifyLibrary (){
        Assert.assertEquals(getText(title), "В библиотеке пока пусто");
        return this;
    }

    public RemoveEssence scrollLibrary(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(move);
        js.executeScript("window.scrollBy(0,500)");
        return this;
    }

    public RemoveEssence clickEditProfile(){
        click(editProfile);
        return this;
    }
}


