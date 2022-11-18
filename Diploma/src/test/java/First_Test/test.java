package First_Test;

import driver.SimpleDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.baseObjects.BaseTest;
import pageObjects.litnet.CreateAndRemoveEssence;
import pageObjects.litnet.HomePage;
import pageObjects.litnet.LoginPage;

public class test extends BaseTest {



    @Parameters("url")
    @Test
    public void loginTest (){
        new HomePage()
                .open()
                .clickLoginBtn()
                .clickLoginBtn2();
        new LoginPage()
                .enterUsername()
                .enterPassword()
                .clickLogin();
        new CreateAndRemoveEssence();


    }
}
