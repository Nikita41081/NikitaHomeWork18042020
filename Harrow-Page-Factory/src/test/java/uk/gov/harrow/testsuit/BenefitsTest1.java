package uk.gov.harrow.testsuit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.gov.harrow.pages.BenefitsPage;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.pages.MainMenuPage;
import uk.gov.harrow.testbase.TestBase;

public class BenefitsTest1 extends TestBase {
    HomePage homePage;
    BenefitsPage benefitsPage;
    MainMenuPage mainMenuPage;

    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();
        benefitsPage = new BenefitsPage();
        mainMenuPage = new MainMenuPage();

    }


    @Test
public void verifyUserIsAbleToNavigateToBenefitsPage(){
     homePage.mouseHoverOnBenefitsAndClick();
     mainMenuPage.mouseHoverOnBenefitsAndClick();
     benefitsPage.clickOnApplyForHousingBenefitLink();
     benefitsPage.clickOnEntitlementCalcBtn();
     benefitsPage.clickOnStartBtn();
     benefitsPage.clickOnMortgageOrOwnedOutright();
     benefitsPage.enterPostCodeInPostCodeField("LU1 1NR");
     benefitsPage.clickOnNextBtn();

 }

}
