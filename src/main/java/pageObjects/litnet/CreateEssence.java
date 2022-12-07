package pageObjects.litnet;

import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;

public class CreateEssence extends BasePage {


    private final By bookOne = By.linkText("Нищенка в Королевской Академии магии. Зимняя практика 2");

    private final By addInLibrary = By.cssSelector("[class=lib-btn]>[class=to_lib]");

    private final By myLibrary = By.linkText("Моя библиотека");

    private final By title = By.cssSelector("[class=book-title]");


    public By getType(String type) {
        return By.cssSelector("[class=container-inner] a[href$='" + type + "']");
    }


    public CreateEssence clickBookType(String type) {
        click(getType(type));
        return this;
    }

    public CreateEssence clickBookOne () {
        click(bookOne);
        return this;
    }

    public CreateEssence clickAddInLibrary () {
        click(addInLibrary);
        return this;
    }
    public CreateEssence clickMyLibrary (){
        click(myLibrary);
        return this;
    }

    public CreateEssence verifyLibrary (){
        Assert.assertEquals(getText(title), "Нищенка в Королевской Академии магии. Зимняя практика 2");
        return this;
    }


}
