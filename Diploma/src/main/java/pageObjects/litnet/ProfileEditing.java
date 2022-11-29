package pageObjects.litnet;

import org.openqa.selenium.By;
import pageObjects.baseObjects.BasePage;

public class ProfileEditing extends BasePage {
    private final By changePhotoBtn = By.id("avatar-js-upload_file_action_btn");

    public ProfileEditing clickChangePhotoBtn(){
        //click(changePhotoBtn);
        driver.findElement(changePhotoBtn).sendKeys("Load_File.jpg");
        //System.getProperty(("user.dir")+"Load_File.jpg");
        return this;
    }
}
