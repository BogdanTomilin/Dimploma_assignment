package First_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.baseObjects.BaseTest;
import pageObjects.litnet.BadData;
import pageObjects.litnet.DataExceedingAllowable;
import pageObjects.litnet.HomePage;
import pageObjects.litnet.LoginPage;

public class NegativeTest extends BaseTest {

    @BeforeTest
    @Parameters("url")
    public void precondition () {
        new HomePage()
                .open()
                .clickLoginBtn()
                .clickLoginBtn2();
        new LoginPage()
                .enterUsername()
                .enterPassword()
                .clickLogin();
    }

//    @Test
//    public void negativeTestOne () {
//       new BadData()
//               .clickFind()
//               .VerifyBadData();
//    }

    @Test
    public void negativeTestTwo (){
         new DataExceedingAllowable()
                 .clickAccount()
                 .clickEditProfile();
}

}
