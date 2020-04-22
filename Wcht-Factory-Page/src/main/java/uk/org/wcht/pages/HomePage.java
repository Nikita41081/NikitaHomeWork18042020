package uk.org.wcht.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.org.wcht.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    //By accessibilityLink = By.xpath("//a[contains(text(),'Accessibility')]");

@FindBy(xpath = "//a[contains(text(),'Accessibility')]")
    WebElement _accessibilityLink;


    public void clickOnAccessibilityLink(){
        Reporter.log("Clicking on accessibility link" + _accessibilityLink.toString()+"<br>");
        clickOnElement(_accessibilityLink);
        log.info("Clicking on accessibility link" + _accessibilityLink.toString());
    }
}
