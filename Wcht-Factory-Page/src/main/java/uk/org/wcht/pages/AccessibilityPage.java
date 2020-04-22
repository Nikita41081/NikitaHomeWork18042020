package uk.org.wcht.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.org.wcht.utility.Utility;

public class AccessibilityPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccessibilityPage.class.getName());

    /*By yourCommunityTab = By.xpath("//a[@class='header__nav-area-title'][contains(text(),'Your community')]");
    By getInvolved = By.xpath("//ul[@class='header__sub-nav js-sub-nav']//a[contains(text(),'Get involved')]");
*/
@FindBy(xpath = "//a[@class='header__nav-area-title'][contains(text(),'Your community')]")
    WebElement _yourCommunityTab;
@FindBy(xpath = "ul[@class='header__sub-nav js-sub-nav']//a[contains(text(),'Get involved')]")
    WebElement _getInvolved;


public void mouseHoverOnYourCommunityTab(){
    Reporter.log("Mouse hovering on your community" + _yourCommunityTab.toString()+"<br>");
    mouseHoverToElement(_yourCommunityTab);
    log.info("Mouse hovering on your community" + _yourCommunityTab.toString());
}
public void mouseHoverOnGetInvolvedAndClick(){
    Reporter.log("Mouse hover on get involved and click" + _getInvolved.toString()+"<br>");
    mouseHoverToElementAndClick(_getInvolved);
    log.info("Mouse hover on get involved and click" + _getInvolved.toString());
}
}
