package pageObjects.litnet;

import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.baseObjects.BasePage;

public class DataExceedingAllowable extends BasePage {

        private final By account = By.cssSelector("[class='ln_topbar_avatar']");

        private final By editProfile = By.cssSelector("a[href=/account/profile/edit]");

        private final By personalSite = By.id("editprofileform-site");

        private final By verifyLimitValues = By.cssSelector("[class='col-xs-4']>[class='form-group field-editprofileform-site has-error']>[class='help-block']");


      public DataExceedingAllowable clickAccount(){
        click(account);
        return this;
      }

      public DataExceedingAllowable clickEditProfile(){
        click(editProfile);
        return this;
      }


      public DataExceedingAllowable clickPersonalSite(){
        click(personalSite);
        return this;
      }


      public DataExceedingAllowable enterLimit(){
          enter(personalSite , "1234567890123456789012345678901234567890");
          return this;
      }

    public DataExceedingAllowable verifyLimitValues(){
        Assert.assertTrue(elementNotExist(verifyLimitValues));
        return this;
    }

/*здесь нужен оверрайд*/

}
