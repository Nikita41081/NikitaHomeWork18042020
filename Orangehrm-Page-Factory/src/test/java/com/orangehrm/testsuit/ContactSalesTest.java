package com.orangehrm.testsuit;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import com.orangehrm.utility.Utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactSalesTest extends TestBase {
    HomePage homePage;

    @BeforeMethod
    public void setup(){
        homePage = new HomePage();
    }

    @Test
    public void verifyUserIsAbleToSubmitContactSalesDetails() throws InterruptedException {
      homePage.clickOnContactSalesButton();
        homePage.enterFirstName("Nikita");
        homePage.enterLastName("Patel");
        homePage.enterCompanyName("ORGHRM");
        homePage.selectNumberOfEmployeesFromDropDown("301 - 350");
        homePage.enterPhoneNumber("3789342569");
        homePage.enterJobTitle("Customer Service Assistant");
        homePage.enterEmailID("Nikita41081@yahoo.com");
        homePage.selectCountryNameFromDropDown("Zambia");
        homePage.enterComment("None");
        // Thread.sleep(2000);
        //homePage.clickOnSubmitButton();
    }
}

