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

        JobSearchInDeutschlandModel testData = new JobSearchInDeutschlandModel(DataConfig.JOBSEARCH_DATA);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickStellangebotButton();

        JobSearchPage jobSearchPage = new JobSearchPage(getDriver());
        jobSearchPage.jobsSucheInDeutschland(testData);

    }
}
