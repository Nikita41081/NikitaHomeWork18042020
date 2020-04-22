package com.demo.nopcommerce.testsuit;

import com.demo.nopcommerce.pages.Homepage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestWithExcel extends TestBase {
    Homepage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        homePage = new Homepage();
        loginPage = new LoginPage();
    }
    @Test(groups = {"Regression"})
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test(groups = {"Smoke","Regression"})
    public void userShouldLogInSuccessfully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("nikita41081@gmail.com");
        loginPage.enterPassword("nikita41081");
        loginPage.clickOnLoginButton();
        String expectedText = "Welcome to our store";
        String actualText = loginPage.getWelcomeText1();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test(groups = {"Sanity","Regression"})
    public void userShouldNotLogInSuccessfully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("abcdefg@yahoo.com");
        loginPage.enterPassword("12345");
        loginPage.clickOnLoginButton();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
        String actualText = loginPage.getErrorLoginWasUnsuccefulText();
        Assert.assertEquals(expectedText,actualText);
    }
}
