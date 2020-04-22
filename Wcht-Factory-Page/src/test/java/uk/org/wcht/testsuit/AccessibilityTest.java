package uk.org.wcht.testsuit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.org.wcht.pages.AccessibilityPage;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;
import uk.org.wcht.utility.Utility;

public class AccessibilityTest extends TestBase {
    HomePage homePage;
    AccessibilityPage accessibilityPage;


    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();
        accessibilityPage = new AccessibilityPage();

    }

    @Test
    public void VerifyUserIsAbleToNavigateToAccessibilityPage() {
        homePage.clickOnAccessibilityLink();
        accessibilityPage.mouseHoverOnYourCommunityTab();
        //accessibilityPage.mouseHoverOnGetInvolvedAndClick();

    }

}
