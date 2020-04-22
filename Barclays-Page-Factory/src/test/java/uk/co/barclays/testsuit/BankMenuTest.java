package uk.co.barclays.testsuit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;
import uk.co.barclays.utility.Utility;

public class BankMenuTest extends TestBase {
    HomePage homePage;

    @BeforeMethod
    public void setup(){
    homePage = new HomePage();
    }

    @Test
    public void VerifyUserIsAbleToFindTheBranchToSwitchBankAccount() {
        homePage.mouseHoverOnBank();
        homePage.mouseHoverAndClickOnSwitchingBankAccountToBarclays();
        homePage.clickOnNewToUsButton();
        Utility.scrollWindowUp(500);
        homePage.clickOnBranchFinderButton();
        homePage.enterLocation("Luton");
        homePage.clickOnSearchButton();
    }
}
