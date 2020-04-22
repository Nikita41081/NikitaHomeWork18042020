package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerPage.class.getName());

   /* By homeBtn = By.xpath("//button[@class='btn home']");
    By searchCustomerField = By.xpath("//input[@placeholder='Search Customer']");
    By deleteButton = By.xpath("//button[contains(text(),'Delete')]");*/

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement _homeBtn;

    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement _searchCustomerField;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement _deleteButton;

    public void clickOnHomeBtn(){
        Reporter.log("Clicking on home button" + _homeBtn.toString()+"<br>");
        clickOnElement(_homeBtn);
        log.info("Clicking on home button" + _homeBtn.toString());
    }
    public void enterCustomerName(String searchName){
        Reporter.log("Entering name"+ searchName+"in search field" + _searchCustomerField.toString()+"<br>");
        sendTextToElement(_searchCustomerField,searchName);
        log.info("Entering name"+ searchName+"in search field" + _searchCustomerField.toString());
    }
    public void clickOnDeleteButton(){
        Reporter.log("Clicking on delete button" + _deleteButton.toString()+"<br>");
        clickOnElement(_deleteButton);
        log.info("Clicking on delete button" + _deleteButton.toString());
    }
}
