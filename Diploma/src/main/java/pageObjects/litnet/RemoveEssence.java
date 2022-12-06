package pageObjects.litnet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;



public class RemoveEssence extends BasePage {

    private final By myLibrary = By.linkText("Моя библиотека");

    private final By move = By.cssSelector("[class='btn btn-default btn-xs dropdown-toggle']");

    private final By removeFromLibrary = By.cssSelector("[class='dropdown-menu'] [href*='delete']");

    private final By title = By.cssSelector("[class=no_items_found]");

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
    }

    public RemoveEssence verifyLibrary (){
        Assert.assertEquals(getText(title), "В библиотеке пока пусто");
        return this;
    }
    public RemoveEssence scrollToCenter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(move);
        js.executeScript("window.scrollBy(0,500)");
        return this;
    }
}


