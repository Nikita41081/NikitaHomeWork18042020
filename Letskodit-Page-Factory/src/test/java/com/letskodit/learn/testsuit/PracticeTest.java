package com.letskodit.learn.testsuit;

import com.letskodit.learn.pages.Homepage;
import com.letskodit.learn.pages.PracticePage;
import com.letskodit.learn.pages.SignUpPage;
import com.letskodit.learn.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTest extends TestBase {
    Homepage homepage;
    PracticePage practicePage;

    @BeforeMethod
    public void setUp(){
        homepage = new Homepage();
        practicePage = new PracticePage();
    }

@Test
public void verifyUserIsAbelToUsePracticePageFunctions(){
    homepage.clickOnPracticeLink();
    practicePage.clickOnHondaRadioButton();
    practicePage.clickOnSelectCarsAndSelectHonda("Honda");
    practicePage.clickOnPeachOption();
    practicePage.clickOnHondaCheckBox();
    practicePage.enterNameInYourNameField("Nikita");
    practicePage.clickOnAlertButton();
    Alert alert = driver.switchTo().alert();
    alert.accept();
}
@Test
public void verifyUserIsAbleToUseMouseHoverFunction() throws InterruptedException {
    homepage.clickOnPracticeLink();
    practicePage.mouseHoverOnMouseHoverButton();
    practicePage.clickOnTop();
    Thread.sleep(2000);
}
}
