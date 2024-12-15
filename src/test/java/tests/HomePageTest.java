package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.UeberUnsMenuPage;
import sharedData.Hooks;

public class HomePageTest extends Hooks {

    @Test
    public void testMethod(){

        HomePage homePage = new HomePage(getDriver());
        homePage.checkHeroVideoElement();
        homePage.checkSpotlightAnsehenButtonVisibility();
        homePage.checkAdhocMitteilungenElementVisibility();
        homePage.checkMedienMitteillungenElementVisibility();
        homePage.checkThemenUndProjekteElementVisibility();
        homePage.checkReportsElementVisibility();
        homePage.checkMainNavigationServiceVisibility();

    }
}
