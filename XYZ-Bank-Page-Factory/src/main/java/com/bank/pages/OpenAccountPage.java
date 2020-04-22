package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

   /* By customerDropDownMenu = By.id("userSelect");
    By currencyDropDownMenu = By.xpath("//select[@id='currency']");
    By processButton = By.xpath("//button[contains(text(),'Process')]");
    By homeButton = By.xpath("//button[@class='btn home']");*/

    @FindBy(id = "userSelect")
    WebElement _customerDropDownMenu;

    @FindBy(xpath = "//select[@id='currency']")
    WebElement _currencyDropDownMenu;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement _processButton;

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement _homeButton;

    public void clickOnCustomerDropDownMenAndSelectCustomerName(String customername){
        Reporter.log("Clicking on customer dropdown and selecting customer" + _customerDropDownMenu.toString()+"<br>");
        clickOnElement(_customerDropDownMenu);
        selectByVisibleTextFromDropDown(_customerDropDownMenu,"Pratiksha Patel");
        log.info("Clicking on customer dropdown and selecting customer" + _customerDropDownMenu.toString());
    }
    public void clickOnDropDownMenuAndSelectCurrency(String currency){
        Reporter.log("Clicking on currency dropdown" + currency + "selecting currency" + _currencyDropDownMenu.toString()+"<br>");
        selectByValueFromDropDown(_currencyDropDownMenu, currency);
        selectByVisibleTextFromDropDown(_currencyDropDownMenu,currency);
        log.info("Clicking on currency dropdown and selecting currency" + _currencyDropDownMenu.toString());
    }
    public void clickOnProcessButton(){
        Reporter.log("Clicking on process button" + _processButton.toString()+"<br>");
        clickOnElement(_processButton);
        log.info("Clicking on process button" + _processButton.toString());
    }
    public void clickOnHomeButton(){
        Reporter.log("Clicking on home button" + _homeButton.toString()+"<br>");
        clickOnElement(_homeButton);
        log.info("Clicking on home button" +_homeButton.toString());
    }
}
