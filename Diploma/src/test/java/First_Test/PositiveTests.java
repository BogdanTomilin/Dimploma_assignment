package First_Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.baseObjects.BaseTest;
import pageObjects.litnet.CreateEssence;
import pageObjects.litnet.HomePage;
import pageObjects.litnet.LoginPage;
import pageObjects.litnet.RemoveEssence;

public class PositiveTests extends BaseTest {

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

    @Test (priority = 1)
    public void positiveTestThree (){
        new CreateEssence()
                .clickLitnetBtn()
                .clickFantasyGenre()
                .clickBookOne()
                .clickAddInLibrary()
                .clickMyLibrary()
                .VerifyLibrary();
    }

    @Test (priority = 2)
    public void positiveTestFour (){
       new RemoveEssence()
               .clickMove()
               .clickRemoveFromLibrary()
               .VerifyLibrary();
    }



}
