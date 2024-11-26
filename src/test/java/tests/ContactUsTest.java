package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.KontaktPage;
import sharedData.Hooks;

public class ContactUsTest extends Hooks {

    @Test
    public void metodaTest(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickKontaktButton();

        KontaktPage kontaktPage = new KontaktPage(getDriver());
        kontaktPage.clickKontaktierenSieUnsElement();

    }
}
