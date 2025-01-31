package tests;

import configFiles.DataConfig;
import modelObject.JobSearchInDeutschlandModel;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JobSearchPage;
import sharedData.Hooks;

public class JobSearchInDeutschlandTest extends Hooks {

    @Test
    public void metodaTest(){


        HomePage homePage = new HomePage(getDriver());
        homePage.clickStellangebotButton();

        JobSearchPage jobSearchPage = new JobSearchPage(getDriver());
        JobSearchInDeutschlandModel testData = new JobSearchInDeutschlandModel(DataConfig.JOBSEARCH_DATA);

        jobSearchPage.jobsSucheInDeutschland(testData);

    }
}
