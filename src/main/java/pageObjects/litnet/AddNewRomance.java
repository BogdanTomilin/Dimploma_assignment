package pageObjects.litnet;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.baseObjects.BasePage;

public class AddNewRomance extends BasePage {
    private final By dialogWindow = By.id("nickname-modal");

    public AddNewRomance checkDialogMassage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(dialogWindow));
        return this;
    }

}
