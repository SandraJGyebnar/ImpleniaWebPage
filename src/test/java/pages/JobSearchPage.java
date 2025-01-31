package pages;

import loggerUtillity.LoggerUtillity;
import lombok.Getter;
import lombok.Setter;
import modelObject.JobSearchInDeutschlandModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter

public class JobSearchPage extends BasePage{

    @FindBy(id="tomselect-1")
    private WebElement landElement;
    @FindBy(id="tomselect-1-opt-2")
    private WebElement deutschLandElement;
//    @FindBy(id="tomselect-31-opt-3")
//    private WebElement schweizLandElement;
//    @FindBy(id="tomselect-31-opt-4")
//    private WebElement norwegenLandElement;
//    @FindBy(id="tomselect-31-opt-5")
//    private WebElement swedenLandElement;
//    @FindBy(id="tomselect-31-opt-6")
//    private WebElement oesterreichLandElement;
//    @FindBy(id="tomselect-31-opt-7")
//    private WebElement frankreichLandElement;
    @FindBy(id="tomselect-2")
    private WebElement stadtElement;
    @FindBy(id="tomselect-2-opt-2")
    private WebElement arnstadtStadtElement;
//    @FindBy(id="tomselect-32-opt-50")
//    private WebElement opfikonStadtElement;
    @FindBy(id="tomselect-3")
    private WebElement taetigkeitsbereichElement;
    @FindBy(id="tomselect-25-opt-8" )
    private WebElement financeElement;
    @FindBy(id="tomselect-4")
    private WebElement anstellungsverhaeltnisElement;
    @FindBy (id="tomselect-5")
    private WebElement gesellschaftElement;



    public JobSearchPage(WebDriver driver) {
        super(driver);
    }


    public void jobsSucheInDeutschland(JobSearchInDeutschlandModel testData){
        elementsMethods.selectDropDownElement(landElement,testData.getLandElement());
        LoggerUtillity.infoLog("Land wurde ausgewaehlt");
//        Assert.assertEquals(landElement, testData.getLandElement(), "Deutschland");


        elementsMethods.selectDropDownElement(stadtElement, testData.getStadtElement());
        LoggerUtillity.infoLog("Stadt wurde ausgewaehlt");
//        Assert.assertEquals(stadtElement, testData.getStadtElement(), "Arnstadt");

        elementsMethods.selectDropDownElement(taetigkeitsbereichElement, testData.getTaetigkeitsbereichElement());
        LoggerUtillity.infoLog("Taetigkeits Bereich wurde ausgewaehlt");
//        Assert.assertEquals(taetigkeitsbereichElement, testData.getTaetigkeitsbereichElement(), "Taetigkeitsbereich selection mismatch!");


        elementsMethods.selectDropDownElement(anstellungsverhaeltnisElement, testData.getAnstellungsverhaeltnisElement());
        LoggerUtillity.infoLog("Anstellungsverhaeltnis wurde ausgewaehlt");
//        Assert.assertEquals(anstellungsverhaeltnisElement, testData.getAnstellungsverhaeltnisElement(), "Anstellungsverhaeltnis selection mismatch!");


        elementsMethods.selectDropDownElement(gesellschaftElement, testData.getGesellschaftElement());
        LoggerUtillity.infoLog("Gesellschaft wurde ausgewaehlt");
//        Assert.assertEquals(gesellschaftElement, testData.getGesellschaftElement(), "Gesellschaft selection mismatch!");


    }





}
