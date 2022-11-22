package pageObjects.litnet;

import org.openqa.selenium.By;
import pageObjects.baseObjects.BasePage;

public class HomePage extends BasePage {

    private By loginBtn = By.cssSelector("[class=ln_topbar_login]>[class=ln_topbar_nav-lnk]");

    private By loginBtn2 = By.linkText("Телефон или Email");


    public HomePage open() {
        load();
        return this;
    }

    public HomePage clickLoginBtn() {
        click(loginBtn);
        return this;
    }

    public HomePage clickLoginBtn2() {
        click(loginBtn2);
        return this;
    }



}
