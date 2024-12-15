package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ManagementPage;
import pages.UeberUnsMenuPage;
import sharedData.Hooks;

public class ManagementTest extends Hooks {

    @Test
    public void metodaTest(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickUeberUnsButton();
        UeberUnsMenuPage ueberUnsMenuPage = new UeberUnsMenuPage(getDriver());
        ueberUnsMenuPage.clickManagementButton();
        ManagementPage managementPage = new ManagementPage(getDriver());
        managementPage.checkAll8Managers();

    }
}
