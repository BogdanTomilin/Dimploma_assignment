package pageObjects.litnet;

import org.openqa.selenium.By;
import pageObjects.baseObjects.BasePage;

public class LoginPage extends BasePage {

    private final By username = By.id("loginform-login");
    private final By password = By.id("loginform-password");
    private final By loginBtn = By.cssSelector("button[type='submit']");


    public LoginPage enterUsername() {
        enter(this.username, properties.getProperty("email"));
        return this;
    }

    public LoginPage enterPassword() {
        enter(this.password, properties.getProperty("password"));
        return this;
    }

    public LoginPage clickLogin() {
        click(loginBtn);
        return this;
    }

}
