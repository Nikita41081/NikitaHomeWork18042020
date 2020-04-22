package uk.co.barclays.pages;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

/*
By bankMenuItem = By.linkText("Bank");
By switchingBankAccountToBarclays = By.linkText("Switching bank account to Barclays");
By newToUsButton = By.xpath("//a[@class='btn btn-secondary']");
By branchFinderButton = By.xpath("//a[contains(text(),'Branch finder')]");
By locationTextField = By.xpath("//input[@id='location']");
By searchButton = By.xpath("//input[@class='btn btn-primary']");
*/

@FindBy(linkText = "Bank")
    WebElement _bankMenuItem;
@FindBy(linkText = "Switching bank account to Barclays")
    WebElement _switchingBankAccountToBarclays;
@FindBy(xpath = "//a[@class='btn btn-secondary']")
    WebElement _newToUsButton;
@FindBy(xpath = "//a[contains(text(),'Branch finder')]")
    WebElement _branchFinderButton;
@FindBy(xpath = "//input[@id='location']")
    WebElement _locationTextField;
@FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement _searchButton;

public void mouseHoverOnBank(){
    Reporter.log("Mouse Hovering on Bank Menu" + _bankMenuItem.toString()+"<br>");
    mouseHoverToElement(_bankMenuItem);
    log.info("Mouse Hovering on Bank Menu" + _bankMenuItem.toString());
}
public void mouseHoverAndClickOnSwitchingBankAccountToBarclays(){
    Reporter.log("Mouse Hovering to switching bank account to Barclays and clicking" + _switchingBankAccountToBarclays.toString()+"<br>");
    mouseHoverToElementAndClick(_switchingBankAccountToBarclays);
    log.info("Mouse Hover to switching bank account to Barclays and clicking" + _switchingBankAccountToBarclays.toString());
}
public void clickOnNewToUsButton(){
    Reporter.log("Clicking on new to us button" + _newToUsButton.toString()+"<br>");
    clickOnElement(_newToUsButton);
    log.info("Clicking on new to us button" + _newToUsButton.toString());
}
public void clickOnBranchFinderButton(){
    Reporter.log("Clicking on branch finder button" + _branchFinderButton.toString()+"<br>");
    clickOnElement(_branchFinderButton);
    log.info("Clicking on branch finder button" + _branchFinderButton.toString());
}
public void enterLocation(String location){
    Reporter.log("Entering location "+ location +" in location field" + _locationTextField.toString()+"<br>");
    sendTextToElement(_locationTextField, location);
    log.info("Entering location "+ location +" in location field" + _locationTextField.toString());
}
public void clickOnSearchButton(){
    Reporter.log("Clicking on search button" + _searchButton.toString()+"<br>");
    clickOnElement(_searchButton);
    log.info("Clicking on search button" + _searchButton.toString());
}
}
