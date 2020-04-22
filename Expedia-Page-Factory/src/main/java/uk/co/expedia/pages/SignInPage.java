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
public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

   /* By emailAddressField = By.id("gss-signin-email");
    By passwordField = By.id("gss-signin-password");
    By signInBtn = By.id("gss-signin-submit");
    By errorMessage = By.id("gss-signin-incorrect-email-or-password");*/

@FindBy(id = "gss-signin-email")
    WebElement _emailAddressField;
@FindBy(id = "gss-signin-password")
    WebElement _passwordField;
@FindBy(id = "gss-signin-submit")
    WebElement _signInBtn;
@FindBy(id = "gss-signin-incorrect-email-or-password")
    WebElement _errorMessage;




    public void enterEmailAddress(String email) {
        Reporter.log("Entering email : " + email + " On email address field : " + _emailAddressField.toString() + "<br>");
        sendTextToElement(_emailAddressField, email);
        log.info("Entering email : " + email + " On email address field : " + _emailAddressField.toString());
    }

    public void enterPassword(String password) {
        Reporter.log("Entering password : " + password + " On password field : " + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("Entering password : " + password + " On password field : " + _passwordField.toString());
    }

    public void clickOnSignInButton() {
        Reporter.log("Clicking on sign in button : " + _signInBtn.toString() + "<br>");
        clickOnElement(_signInBtn);
        log.info("Clicking on sign in button : " + _signInBtn.toString());
    }

    public String getErrorMessage() {
        Reporter.log("Getting text from error message : " + _errorMessage.toString() + "<br>");
        log.info("Getting text from error message : " + _errorMessage.toString());
        return getTextFromElement(_errorMessage);
    }
}
