package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    /*By flightsTab = By.xpath("//button[@id='tab-flight-tab-hp']//span[@class='uitk-icon uitk-icon-flights']");
    By accountLink = By.id("header-account-menu");*/

@FindBy(xpath = "//button[@id='tab-flight-tab-hp']//span[@class='uitk-icon uitk-icon-flights']")
    WebElement _flightsTab;
@FindBy(id = "header-account-menu")
WebElement _accountLink;

    public void clickOnFlightsTab() {
        Reporter.log("Clicking on flights tab : " + _flightsTab.toString() + "<br>");
        clickOnElement(_flightsTab);
        log.info("Clicking on flights tab : " + _flightsTab.toString());
    }

    public void clickOnAccountMenu() {
        Reporter.log("Clicking on account menu : " + _accountLink.toString() + "<br>");
        clickOnElement(_accountLink);
        log.info("Clicking on account menu : " + _accountLink.toString());
    }

}
