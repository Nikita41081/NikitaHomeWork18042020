package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

   /* By yourNameDropDownMenu = By.xpath("//select[@id='userSelect']");
    By loginButton = By.xpath("//button[@class='btn btn-default']");*/

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement _yourNameDropDownMenu;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _loginButton;

    public void selectYourNameFromDropDownMenu(String selectname){
        Reporter.log("Clicking on dropdown menu"+ selectname + "selecting customer's name" + _yourNameDropDownMenu.toString()+"<br>");
        clickOnElement(_yourNameDropDownMenu);
        selectByVisibleTextFromDropDown(_yourNameDropDownMenu, selectname);
        log.info("Clicking on dropdown menu"+ selectname + "selecting customer's name" + _yourNameDropDownMenu.toString());
    }

    public void clickOnLogInButton(){
        Reporter.log("Clicking on login button" + _loginButton.toString()+"<br>");
        clickOnElement(_loginButton);
        log.info("Clicking on login button" + _loginButton.toString());
    }

}
