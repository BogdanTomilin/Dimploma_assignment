package pageObjects.litnet;

import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;

public class CreateEssence extends BasePage {


    private final By departmentBooks = By.id("choose_genre");

    private final By fantasyGenre = By.cssSelector("body > div.wrap > div > div > div.content > div.white-container > div:nth-child(1) > div.block.b-categories > div > div > ul > li:nth-child(1) > a");

    private final By bookOne = By.linkText("Нищенка в Королевской Академии магии. Зимняя практика 2");

    private final By litnetBtn = By.xpath("/html/body/div[2]/div/div/div[1]/div/a");

    private final By addInLibrary = By.cssSelector("[class=lib-btn]>[class=to_lib]");

    private final By myLibrary = By.linkText("Моя библиотека");

    private final By title = By.cssSelector("[class=book-title]");


    public CreateEssence clickDepartmentBooks (){
        click(departmentBooks);
        return this;
    }

    public CreateEssence clickFantasyGenre (){
        click(fantasyGenre);
        return this;
    }
    public CreateEssence clickLitnetBtn(){
        click(litnetBtn);
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

 public CreateEssence VerifyLibrary (){
     Assert.assertEquals(getText(title), "Нищенка в Королевской Академии магии. Зимняя практика 2");
     System.out.println(getText(title));
     return this;
 }




}
