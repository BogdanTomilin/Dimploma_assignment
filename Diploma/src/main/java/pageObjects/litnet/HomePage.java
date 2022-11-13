package pageObjects.litnet;

import org.openqa.selenium.By;
import pageObjects.baseObjects.BasePage;

public class HomePage extends BasePage {

    private By loginBtn = By.cssSelector("[class=ln_topbar_login]>[class=ln_topbar_nav-lnk]");
//  private By loginBtn = By.linkText("Вход");
//  private By loginBtn = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/a[1]");

    private By loginBtn2 = By.linkText("Телефон или Email");
    /*  private By loginBtn2 = By.cssSelector("[class=reg]>div>a[href=\"/auth/login?classic=1&link=https%3A%2F%2Flitnet.com%2F\"]");
     Так у меня не получилось */




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
