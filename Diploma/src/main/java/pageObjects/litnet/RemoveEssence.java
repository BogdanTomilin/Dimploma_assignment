package pageObjects.litnet;

import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;



public class RemoveEssence extends BasePage {

    private final By myLibrary = By.linkText("Моя библиотека");

    private final By move = By.xpath("/html/body/div[3]/div/div/div[2]/div[6]/div/div[2]/div[2]/button");

    private final By removeFromLibrary = By.xpath("/html/body/div[3]/div/div/div[2]/div[6]/div[1]/div[2]/div[2]/ul/li[3]/a");

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

    public RemoveEssence VerifyLibrary (){
        Assert.assertEquals(getText(title), "В библиотеке пока пусто");
        return this;
    }




}


