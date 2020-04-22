package uk.gov.harrow.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.gov.harrow.utility.Utility;

public class MainMenuPage extends Utility {

    private static final Logger log = LogManager.getLogger(MainMenuPage.class.getName());

    //By mainMenuAerialLabel = By.xpath("//a[contains(text(),'Benefits')]");

    @FindBy(xpath = "//a[contains(text(),'Benefits')]")
    WebElement _mainMenuAerialLabel;

    public void mouseHoverOnBenefitsAndClick(){
        Reporter.log("Clicking on Main menu"+ _mainMenuAerialLabel.toString()+"<br>");
       // waitUntilElementToBeClickable(_mainMenuAerialLabel,20);
        //clickOnElement(_mainMenuAerialLabel);
        mouseHoverToElement(_mainMenuAerialLabel); clickOnElement(_mainMenuAerialLabel);
        log.info("Clicking on Main menu"+ _mainMenuAerialLabel.toString());
    }
}
