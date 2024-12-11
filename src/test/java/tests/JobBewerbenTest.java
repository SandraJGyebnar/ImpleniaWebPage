package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import sharedData.Hooks;

public class JobBewerbenTest extends Hooks {

    @Test
    public void metodaTest(){

        HomePage homePage = new HomePage(getDriver());
        homePage.clickStellangebotButton();

    }

    }
