package pageObjects.litnet;

import org.openqa.selenium.By;
import pageObjects.baseObjects.BasePage;

public class DataExceedingAllowable extends BasePage {

    private final By account = By.cssSelector("[class='ln_topbar_avatar']");

    private final By editProfile = By.cssSelector("a[href=/account/profile/edit]");

    public DataExceedingAllowable clickAccount(){
        click(account);
        return this;
    }

    public DataExceedingAllowable clickEditProfile(){
        click(editProfile);
        return this;
    }

}
