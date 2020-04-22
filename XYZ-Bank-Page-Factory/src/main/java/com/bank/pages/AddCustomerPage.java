package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

   /*By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postCodeField = By.xpath("//input[@placeholder='Post Code']");
    By addCustomersButton = By.xpath("//button[@class='btn btn-default']");
*/
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement _firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement _lastNameField;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement _postCodeField;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _addCustomersButton;

    public void enterFirstName(String firstname){

        Reporter.log("Enter first name" + firstname + "to first name field" + _firstNameField.toString()+"<br>");
        sendTextToElement(_firstNameField, firstname);
        log.info("Enter first name" + firstname + "to first name field" + _firstNameField.toString());
    }
    public void enterLastName(String lastname){
        Reporter.log("Enter last name"+ lastname+ "to last name field" + _lastNameField.toString()+"<br>");
        sendTextToElement(_lastNameField, lastname);
        log.info("Enter last name"+ lastname+ "to last name field" + _lastNameField.toString());
    }
    public void enterpostcode(String postcode){
        Reporter.log("Enter postcode"+ postcode +"to postcode field" + _postCodeField.toString()+"<br>");
        sendTextToElement(_postCodeField, postcode);
        log.info("Enter postcode"+ postcode +"to postcode field" + _postCodeField.toString());
    }
    public void clickOnAddCustomerButton(){
        Reporter.log("Clicking on add customer button" + _addCustomersButton.toString()+"<br>");
        clickOnElement(_addCustomersButton);
        log.info("Clicking on add customer button" + _addCustomersButton.toString());
    }
}
