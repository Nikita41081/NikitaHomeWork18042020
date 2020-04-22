package com.bank.testsuit;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends TestBase {

    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    CustomerLoginPage customerLoginPage;
    AccountPage accountPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomerPage customerPage;


    @BeforeMethod
    public void setup() {
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        customerPage = new CustomerPage();
        accountPage = new AccountPage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
    }

    @Test()
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName("Nikita");
        addCustomerPage.enterLastName("Patel");
        addCustomerPage.enterpostcode("LU5 4LF");
        addCustomerPage.clickOnAddCustomerButton();


        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName("Nikita");
        addCustomerPage.enterLastName("Patel");
        addCustomerPage.enterpostcode("LU5 4LF");
        addCustomerPage.clickOnAddCustomerButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickOnCustomerDropDownMenAndSelectCustomerName("Nikita Patel");
        openAccountPage.clickOnDropDownMenuAndSelectCurrency("Pound");
        openAccountPage.clickOnProcessButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);

    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName("Nikita");
        addCustomerPage.enterLastName("Patel");
        addCustomerPage.enterpostcode("LU5 4LF");
        addCustomerPage.clickOnAddCustomerButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickOnCustomerDropDownMenAndSelectCustomerName("Nikita Patel");
        openAccountPage.clickOnDropDownMenuAndSelectCurrency("Pound");
        openAccountPage.clickOnProcessButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        openAccountPage.clickOnHomeButton();
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDownMenu("Nikita Patel");
        Thread.sleep(3000);
        customerLoginPage.clickOnLogInButton();
        accountPage.verifyThatLogOutBtnIsDisplayed();
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName("Pratiksha");
        addCustomerPage.enterLastName("Patel");
        addCustomerPage.enterpostcode("LU5 4LF");
        addCustomerPage.clickOnAddCustomerButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickOnCustomerDropDownMenAndSelectCustomerName("Nikita Patel");
        openAccountPage.clickOnDropDownMenuAndSelectCurrency("Pound");
        openAccountPage.clickOnProcessButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        openAccountPage.clickOnHomeButton();
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDownMenu("Nikita Patel");
        Thread.sleep(3000);
        customerLoginPage.clickOnLogInButton();
        accountPage.verifyThatLogOutBtnIsDisplayed();
        customerPage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDownMenu("Nikita Patel");
        Thread.sleep(3000);
        customerLoginPage.clickOnLogInButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmount("100");
        accountPage.clickOnDepositBtn();
        String expectedText = "Deposit Successful";
        String actualText = accountPage.getDepositSuccessfulMessage();
        Assert.assertEquals(expectedText, actualText);

    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName("Pratiksha");
        addCustomerPage.enterLastName("Patel");
        addCustomerPage.enterpostcode("AL10 8PW");
        addCustomerPage.clickOnAddCustomerButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickOnCustomerDropDownMenAndSelectCustomerName("Nikita Patel");
        openAccountPage.clickOnDropDownMenuAndSelectCurrency("Pound");
        openAccountPage.clickOnProcessButton();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        openAccountPage.clickOnHomeButton();
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDownMenu("Nikita Patel");
        Thread.sleep(3000);
        customerLoginPage.clickOnLogInButton();
        accountPage.verifyThatLogOutBtnIsDisplayed();
        customerPage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDownMenu("Nikita Patel");
        Thread.sleep(3000);
        customerLoginPage.clickOnLogInButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmount("100");
        accountPage.clickOnDepositBtn();
        String expectedText = "Deposit Successful";
        String actualText = accountPage.getDepositSuccessfulMessage();
        Assert.assertEquals(expectedText, actualText);
        accountPage.clickOnWithdrawlBtn();
        accountPage.enterAmountToBeWithdrawn("10");
        accountPage.clickOnWithdrawBtn();
        String expectedText1 = "Transaction successful";
        String actualText1 = accountPage.getTransactionSuccessfulMessage();
        Assert.assertEquals(expectedText1, actualText1);
        accountPage.clickOnHomeButton();
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnCustomerButton();
        customerPage.enterCustomerName("Nikita");
        customerPage.clickOnDeleteButton();
    }
}
