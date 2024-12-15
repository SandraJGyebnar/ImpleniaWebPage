package tests;

import configFiles.DataConfig;
import modelObject.KontaktFormModel;
import org.testng.annotations.Test;
import pages.FormPage;
import pages.HomePage;
import pages.KontaktPage;
import sharedData.Hooks;

public class ContactUsTest extends Hooks {

    @Test
    public void metodaTest(){

        KontaktFormModel testData = new KontaktFormModel(DataConfig.KONTAKTFORM_DATA);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickKontaktButton();

        KontaktPage kontaktPage = new KontaktPage(getDriver());
        kontaktPage.clickKontaktierenSieUnsElement();

        FormPage formPage = new FormPage(getDriver());
        formPage.dealKontaktFrame();
        formPage.fillKontaktForm(testData);
        formPage.validateFormSendComfirmation();

    }

}
