package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

   /* By addCustomersBtn = By.xpath("//button[contains(text(),'Add Customer')]");
    By openAccountBtn = By.xpath("//button[contains(text(),'Open Account')]");
    By customerButton = By.xpath("//button[contains(text(),'Customers')]");*/

    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement _addCustomersBtn;

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement _openAccountBtn;

    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    WebElement _customerButton;


    public void clickOnAddCustomerBtn() {
        Reporter.log("Clicking on add customer btn" + _addCustomersBtn.toString()+"<br>");
        clickOnElement(_addCustomersBtn);
        log.info("Clicking on add customer btn" + _addCustomersBtn.toString());
    }

    public void clickOnOpenAccountBtn() {
        Reporter.log("Clicking on open account btn" + _openAccountBtn.toString()+"<br>");
        clickOnElement(_openAccountBtn);
        log.info("Clicking on open account btn" + _openAccountBtn.toString());
    }

    public void clickOnCustomerButton(){
        Reporter.log("Clicking on customer button" + _customerButton.toString()+"<br>");
        clickOnElement(_customerButton);
        log.info("Clicking on customer button" + _customerButton.toString());
    }


    public void handleAlert() {
        String actual_msg =driver.switchTo().alert().getText();
        System.out.println("Alert Message : "+actual_msg);
        driver.switchTo().alert().accept();
        String expected_msg = "Customer added successfully";
        Assert.assertNotEquals(actual_msg,expected_msg);

    }
}
