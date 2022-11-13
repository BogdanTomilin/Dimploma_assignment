package First_Test;

import driver.SimpleDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.baseObjects.BaseTest;
import pageObjects.litnet.HomePage;

public class test extends BaseTest {



    @Parameters("url")
    @Test
    public void loginTest (){
        new HomePage()
                .open()
                .clickLoginBtn()
                .clickLoginBtn2();

    }
}
