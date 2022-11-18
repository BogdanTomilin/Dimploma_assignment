package pageObjects.litnet;

import org.openqa.selenium.By;
import pageObjects.baseObjects.BasePage;

public class CreateAndRemoveEssence extends BasePage {

    private final By departmentBooks = By.id("choose_genre");

    private final By myLibrary = By.id("Моя библиотека");

    private By fantasyGenre = By.linkText("Фэнтези");
    private By bookOne = By.linkText("Нищенка в Королевской Академии магии. Зимняя практика 2");

    private By bookTwo = By.linkText("Колючка в Академии Магии");
    private By addInLibrary = By.cssSelector("[class=lib-btn]>[class=to_lib]");

    private By move = By.cssSelector("[class=pull-right]>[type= button]");
    /*[class=pull-right]>[class~=btn]*/

    private By removeFromLibrary = By.xpath("/html/body/div[3]/div/div/div[2]/div[6]/div[1]/div[2]/div[2]/ul/li[3]/a");


public CreateAndRemoveEssence clickDepartmentBooks (){
    click(departmentBooks);
    return this;
}

    public CreateAndRemoveEssence clickFantasyGenre () {
        click(fantasyGenre);
        return this;
    }

        public CreateAndRemoveEssence clickBookOne () {
            click(bookOne);
            return this;
        }

    public CreateAndRemoveEssence clickBookTwo () {
        click(bookTwo);
        return this;
    }

            public CreateAndRemoveEssence clickAddInLibrary () {
                click(addInLibrary);
                return this;
            }





}
