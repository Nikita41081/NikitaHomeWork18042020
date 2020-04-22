package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

//    By contactSalesButton = By.xpath("//a[contains(@class,'btn-orange contact-ohrm')]");
//    By firstNameField = By.name("firstname");
//    By lastNameField = By.name("lastname");
//    By companyNameField = By.name("company");
//    By numberOfEmployees = By.name("numemployees");
//    By phoneNumberField = By.name("phone");
//    By jobTitleField = By.name("jobtitle");
//    By emailField = By.name("email");
//    By countryField = By.name("country");
//    By commentField = By.name("message");
//    By submitButton = By.xpath("//input[@class='hs-button primary large']");

@FindBy(xpath = "//a[contains(@class,'btn-orange contact-ohrm')]")
    WebElement _contactSalesButton;
@FindBy(name = "firstname")
    WebElement _firstNameField;
@FindBy(name = "lastname")
    WebElement _lastNameField;
@FindBy(name = "company")
    WebElement _companyNameField;
@FindBy(name = "numemployees")
    WebElement _numberOfEmployees;
@FindBy(name = "phone")
    WebElement _phoneNumberField;
@FindBy(name = "jobtitle")
    WebElement _jobTitleField;
@FindBy(name = "email")
    WebElement _emailField;
@FindBy(name = "country")
    WebElement _countryField;
@FindBy(name = "message")
    WebElement _commentField;
@FindBy(xpath = "//input[@class='hs-button primary large']")
    WebElement _submitButton;


    public void clickOnContactSalesButton(){
        Reporter.log("Clicking on contact sales button" + _contactSalesButton.toString()+"<br>");
        clickOnElement(_contactSalesButton);
        log.info("Clicking on contact sales button" + _contactSalesButton.toString());
    }
    public void enterFirstName(String firstName){
        Reporter.log("Entering first name"+ firstName +"in first name field" + _firstNameField.toString()+"<br>");
        sendTextToElement(_firstNameField, firstName);
        log.info("Entering first name"+ firstName +"in first name field" + _firstNameField.toString());
    }
    public void enterLastName(String lastName){
        Reporter.log("Entering last name"+ lastName +"in last name field" + _lastNameField.toString()+"<br>");
        sendTextToElement(_lastNameField, lastName);
        log.info("Entering last name"+ lastName +"in last name field" + _lastNameField.toString());
    }
    public void enterCompanyName(String companyName){
        Reporter.log("Entering Company name" + companyName + "in company name field" + _companyNameField.toString()+"<br>");
        sendTextToElement(_companyNameField, companyName);
        log.info("Entering Company name" + companyName + "in company name field" + _companyNameField.toString());
    }
    public void selectNumberOfEmployeesFromDropDown(String numberofEmployees){
        Reporter.log("Selecting number of employees" + _numberOfEmployees.toString()+"<br>");
        selectByValueFromDropDown(_numberOfEmployees,numberofEmployees);
        log.info("Selecting number of employees" + _numberOfEmployees.toString());
    }
    public void enterPhoneNumber(String phoneNumber){
        Reporter.log("Entering phone number" + phoneNumber + " in phone number field" + _phoneNumberField.toString()+"<br>");
        sendTextToElement(_phoneNumberField,phoneNumber);
        log.info("Entering phone number" + phoneNumber + " in phone number field" + _phoneNumberField.toString());
    }
    public void enterJobTitle(String jobTitle){
        Reporter.log("Entering job title" + jobTitle + "in jobtitle field" + _jobTitleField.toString()+"<br>");
        sendTextToElement(_jobTitleField, jobTitle);
        log.info("Entering job title" + jobTitle + "in jobtitle field" + _jobTitleField.toString());
    }
    public void enterEmailID(String email){
        Reporter.log("Entering email" + email + "in email field" + _emailField.toString()+"<br>");
        sendTextToElement(_emailField, email);
        log.info("Entering email" + email + "in email field" + _emailField.toString());
    }
    public void selectCountryNameFromDropDown(String countryName){
        Reporter.log("Selecting country name" + _countryField.toString()+"<br>");
        selectByValueFromDropDown( _countryField, countryName);
        log.info("Selecting country name" + _countryField.toString());
    }
    public void enterComment(String comment){
        Reporter.log("Entering comment" + _commentField.toString()+"<br>");
        sendTextToElement(_commentField, comment);
        log.info("Entering comment" + _commentField.toString());
    }
    public void clickOnSubmitButton(){
        Reporter.log("Clicking on submit button" + _submitButton.toString()+"<br>");
       // log.info("Clicking on submit button" + _submitButton.toString());
        //waitUntilElementToBeClickable((By)_submitButton,20);
        clickOnElement(_submitButton);
        log.info("Clicking on submit button" + _submitButton.toString());
    }
}
