package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created by Jay
 */
public class FlightsPage extends Utility {

    private static final Logger log = LogManager.getLogger(FlightsPage.class.getName());


   /* By flyingFrom = By.id("flight-origin-hp-flight");
    By goingTo = By.id("flight-destination-hp-flight");
    By departing = By.id("flight-departing-hp-flight");
    By returning = By.id("flight-returning-hp-flight");
    By searchBtn = By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[9]/label/button");
    */
@FindBy(id = "flight-origin-hp-flight")
    WebElement _flyingFrom;
@FindBy(id = "flight-destination-hp-flight")
    WebElement _goingTo;
@FindBy(id = "flight-departing-hp-flight")
    WebElement _departing;
@FindBy(id = "flight-returning-hp-flight")
    WebElement _returning;
@FindBy(xpath = "//*[@id=\"gcw-flights-form-hp-flight\"]/div[9]/label/button")
    WebElement _searchBtn;

    public void enterFlyingFrom(String origin) {
        Reporter.log("Entering flying from : " + origin + " On flying from field : " + _flyingFrom.toString() + "<br>");
        sendTextToElement(_flyingFrom, origin);
        log.info("Entering flying from : " + origin + " On flying from field : " + _flyingFrom.toString());
    }

    public void enterGoingTo(String destination) {
        Reporter.log("Entering going to : " + destination + " On going to field : " + _goingTo.toString() + "<br>");
        sendTextToElement(_goingTo, destination);
        log.info("Entering going to : " + destination + " On going to field : " + _goingTo.toString());
    }

    public void enterDepartingDate(String date) {
        Reporter.log("Entering departing date : " + date + " On departing date field : " + _departing.toString() + "<br>");
        sendTextToElement(_departing, date);
        log.info("Entering departing date : " + date + " On departing date field : " + _departing.toString());
    }

    public void enterReturningDate(String date) {
        Reporter.log("Entering returning date : " + date + " On returning date field : " + _returning.toString() + "<br>");
        log.info("Entering returning date : " + date + " On returning date field : " + _returning.toString());
        getElement(_returning).sendKeys(Keys.CONTROL, "a");
        getElement(_returning).sendKeys(Keys.DELETE);
        sendTextToElement(_returning, date);
        //log.info("Entering returning date : " + date + " On returning date field : " + _returning.toString());
    }

    public void clickOnSearchButton() {
        Reporter.log("Clicking on search button : " + _searchBtn.toString() + "<br>");
        log.info("Clicking on search button : " + _searchBtn.toString());
        getElement(_searchBtn).submit();
        //log.info("Clicking on search button : " + _searchBtn.toString());
    }


}
