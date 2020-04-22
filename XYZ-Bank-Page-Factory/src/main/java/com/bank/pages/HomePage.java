package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    By bankManagerLoginButton = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLoginButton = By.xpath("//button[contains(text(),'Customer Login')]");

@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement _bankManagerLoginButton;
@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement _customerLoginButton;

    public void clickOnBankManagerLoginButton(){
        Reporter.log("Clicking on bank manager login button" + _bankManagerLoginButton.toString()+"<br>");
        clickOnElement(_bankManagerLoginButton);
        log.info("Clicking on bank manager login button" + _bankManagerLoginButton.toString());
    }
    public void clickOnCustomerLoginButton(){
        Reporter.log("Clicking on customer login button" + _customerLoginButton.toString()+"<br>");
        clickOnElement(_customerLoginButton);
        log.info("Clicking on customer login button" + _customerLoginButton.toString());
    }
}
