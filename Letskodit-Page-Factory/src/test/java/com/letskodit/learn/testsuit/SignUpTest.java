package com.letskodit.learn.testsuit;

import com.letskodit.learn.pages.Homepage;
import com.letskodit.learn.pages.PracticePage;
import com.letskodit.learn.pages.SignUpPage;
import com.letskodit.learn.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest extends TestBase {

    Homepage homepage;
    SignUpPage signUpPage;

    @BeforeMethod
    public void setUp(){
        homepage = new Homepage();
        signUpPage = new SignUpPage();
    }

    @Test
    public void verifyUserIsAbleToSignUpSuccessfully(){
        homepage.clickOnSignUpButton();
        signUpPage.enterFullName("Nikita Patel");
        signUpPage.enterEmailAddress("abcdefg@yahoo.co.uk");
        signUpPage.enterPassword("41081");
        signUpPage.enterConfirmPassword("41081");
        signUpPage.clickOnReCaptchaCheckBox();
        signUpPage.clickOnIAgreeToTheTermsAndConditionsCheckBox();
        signUpPage.clickOnSignUpButton();

    }
}
