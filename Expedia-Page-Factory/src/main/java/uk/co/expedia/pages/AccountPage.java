package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created by Jay
 */
public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

   /* By signInBtn = By.id("header-account-signin-button");
    By createAccount = By.xpath("//a[@id='header-account-register']//span");
    */
@FindBy(id = "header-account-signin-button")
    WebElement _signInBtn;

@FindBy(xpath = "//a[@id='header-account-register']//span")
    WebElement _createAccount;


    public void clickOnSignInButton(){
        Reporter.log("Clicking On SignIn Button : "+ _signInBtn.toString()+ "<br>");
        clickOnElement(_signInBtn);
        log.info("Clicking On SignIn Button : "+ _signInBtn.toString());
    }

    public void clickOnAccountMenu(){
        Reporter.log("Clicking On create account link : "+ _createAccount.toString()+ "<br>");
        clickOnElement(_createAccount);
        log.info("Clicking On create account link : "+ _createAccount.toString());
    }
}
