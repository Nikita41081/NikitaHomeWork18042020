package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

   /* By logOutButton = By.xpath("//button[@class='btn logout']");
    By depositButton = By.xpath("//button[contains(text(),'Deposit')]");
    By amountField = By.xpath("//input[@placeholder='amount']");
    By depositBtn = By.xpath("//button[@class='btn btn-default']");
    By depositSuccessfulMsg = By.xpath("//span[@class='error ng-binding']");
    By withdrawButton = By.xpath("//button[contains(text(),'Withdrawl')]");
    //By amountToBeWithdrawnField = By.xpath("//input[@placeholder='amount']");
    By withdrawBtn = By.xpath("//button[@class='btn btn-default']");
    By transactionSuccessfulMsg = By.xpath("//span[@class='error ng-binding']");
    By homeButton = By.xpath("//button[@class='btn home']");*/

@FindBy(xpath = "//button[@class='btn logout']")
    WebElement _logOutButton;
@FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement _depositButton;
@FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _amountField;
@FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _depositBtn;
@FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement _depositSuccessfulMsg;
@FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement _withdrawButton;
@FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _withdrawbtn;
@FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement _transactionSuccessfulMsg;
@FindBy(xpath = "//button[@class='btn home']")
    WebElement _homeButton;





    public void clickOnDepositButton(){
        Reporter.log("Clicking on deposite button" + _depositButton.toString()+"<br>");
        clickOnElement(_depositButton);
        log.info("Clicking on deposite button" + _depositButton.toString());
    }
    public void enterAmount(String amount){
        Reporter.log("Entering amount" + amount+ "in amount field" + _amountField.toString()+"<br>");
        sendTextToElement(_amountField, amount);
        log.info("Entering amount" + amount+ "in amount field" + _amountField.toString());
    }
    public void clickOnDepositBtn(){
        Reporter.log("Clicking on deposite button" + _depositBtn.toString()+"<br>");
        clickOnElement(_depositBtn);
        log.info("Clicking on deposite button" + _depositBtn.toString());
    }
    public String getDepositSuccessfulMessage(){
        Reporter.log("Getting deposite successful message" + _depositSuccessfulMsg.toString()+"<br>");
        log.info("Getting deposite successful message" + _depositSuccessfulMsg.toString());
        return getTextFromElement(_depositSuccessfulMsg);}

    public void clickOnWithdrawlBtn(){
        Reporter.log("Clicking on withdrawl button" + _withdrawButton.toString()+"<br>");
        clickOnElement(_withdrawButton);
        log.info("Clicking on withdrawl button" + _withdrawButton.toString());
    }
    public void enterAmountToBeWithdrawn(String amt){
        Reporter.log("Entering amount"+ amt+ "in amount withdrawn field" + _amountField.toString()+"<br>");
        sendTextToElement(_amountField, amt);
        log.info("Entering amount"+ amt+ "in amount withdrawn field" + _amountField.toString());
    }
    public void clickOnWithdrawBtn(){
        Reporter.log("Clickig on withdraw btn" + _withdrawbtn.toString()+"<br>");
        clickOnElement(_withdrawbtn);
        log.info("Clickig on withdraw btn" + _withdrawbtn.toString());
    }
    public String getTransactionSuccessfulMessage(){
        Reporter.log("Get transaction successful message" + _transactionSuccessfulMsg.toString()+"<br>");
        log.info("Get transaction successful message" + _transactionSuccessfulMsg.toString());
        return getTextFromElement(_transactionSuccessfulMsg);}

    public void clickOnHomeButton(){
        Reporter.log("Clicking on home button" + _homeButton.toString()+"<br>");
        clickOnElement(_homeButton);
        log.info("Clicking on home button" + _homeButton.toString());
    }
    public void verifyThatLogOutBtnIsDisplayed() {
        if
        (verifyThatElementIsDisplayed(_logOutButton))

        {   Reporter.log("Verifying logout button is present" + _logOutButton.toString()+"<br>");
            log.info("Verifying logout button is present" + _logOutButton.toString());
            System.out.println("LogOut Button is Present");
            clickOnElement(_logOutButton);
        } else
            Reporter.log("Clicking on logout button" + _logOutButton.toString()+"<br>");
        System.out.println("User is not successfully Logged In.");
        log.info("Clicking on logout button" + _logOutButton.toString());
    }
}
