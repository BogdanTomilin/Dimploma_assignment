package pageObjects.litnet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;

import static driver.DriverManager.getDriver;

public class RemoveEssence extends BasePage {

    //private final By myLibrary = By.linkText("Моя библиотека");

    private final By move = By.xpath("//*[class='btn btn-default btn-xs dropdown-toggle' and text() = 'Переместить']//]//ancestor::div[@class='lib-books-list'");

    private final By removeFromLibrary = By.xpath("/html/body/div[3]/div/div/div[2]/div[6]/div[1]/div[2]/div[2]/ul/li[3]/a");

//    private final By title = By.cssSelector("[class=book-title]");

    public static WebElement getElementProduct(String bookName) {
        return getDriver().findElement(By.xpath("//*[class = 'book-title' and text() = '" + bookName + "']//ancestor::div[@class='lib-books-list']"));
    }

    public static WebElement getBookName(String bookName){
        return getElementProduct(bookName).findElement(By.className("book-title"));
    }

//    public static String enterBookName(String bookName) {
//        return getText(getBookName(bookName));
//    }



//    public RemoveEssence clickMyLibrary (){
//        click(myLibrary);
//        return this;
//    }

    public RemoveEssence clickMove () {
        click(move);
        return this;
    }

    public RemoveEssence clickRemoveFromLibrary  () {
        click(removeFromLibrary);
        return this;
    }

//    public RemoveEssence VerifyLibrary (){
//        Assert.assertEquals(enterBookName, "В библиотеке пока пусто");
//        return this;
//    }



    // public CreateAndRemoveEssence VerifyLibrary (){
//     Assert.assertEquals(getText(title), "Нищенка в Королевской Академии магии. Зимняя практика 2");
//     return this;
// } Мой вариант!!!!!!!!!!!
}


