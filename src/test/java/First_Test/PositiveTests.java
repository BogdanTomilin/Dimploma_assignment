package First_Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.baseObjects.BaseTest;
import pageObjects.litnet.*;

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

    @Test (priority = 3 , description = "Тест на проверку всплывающего сообщения")
    public void positiveTestTwo (){
        new PopUpWindow()
                .clickBell()
                .checkTableIsDisplayed();
    }

    @Test (priority = 1 , description = "Тест на создание сущности")
    public void positiveTestThree (){
        new CreateEssence()
                .clickBookType("fentezi")
                .clickBookOne()
                .clickAddInLibrary()
                .clickMyLibrary()
                .verifyLibrary();
    }

    @Test (priority = 2 , description = "Tест на удаление сущности")
    public void positiveTestFour (){
        new RemoveEssence()
                .scrollToCenter()
                .clickMove()
                .clickRemoveFromLibrary()
                .verifyLibrary();
    }

    @Test (priority = 7 , description ="Tест на загрузку файла")
    public void positiveTestSix(){
        new DataExceedingAllowable()
                .clickEditProfile()
                .clickChangePhotoBtn();
    }

    @Test  (priority = 4 , description = "Tест на проверку поля для ввода на граничные значения")
    public void positiveTestOne () {
        new DataExceedingAllowable()
                .clickAccount()
                .clickEditProfile()
                .enterLimit("123456789012345678901234567890123456789")
                .verifyLimitValuesNormal()
                .enterLimit("1234567890123456789012345678901234567890")
                .verifyLimitValuesNormal();

    }

    @Test (priority = 8 , description = "Tест отображения диалогового окна")
    public void positiveTestFive(){
        new AddNewRomance()
                .clickAddRomance2("Добавить роман")
                .checkDialogMassage();
    }

}
