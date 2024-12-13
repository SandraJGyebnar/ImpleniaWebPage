package pages;

import lombok.Getter;
import lombok.Setter;
import modelObject.JobSearchInDeutschlandModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter

public class JobSearchPage extends BasePage{

    @FindBy(id="tomselect-1-ts-control")
    private WebElement landElement;
    @FindBy(id="tomselect-1-opt-2")
    private WebElement deutschLandElement;
    @FindBy(id="tomselect-31-opt-3")
    private WebElement schweizLandElement;
    @FindBy(id="tomselect-31-opt-4")
    private WebElement norwegenLandElement;
    @FindBy(id="tomselect-31-opt-5")
    private WebElement swedenLandElement;
    @FindBy(id="tomselect-31-opt-6")
    private WebElement oesterreichLandElement;
    @FindBy(id="tomselect-31-opt-7")
    private WebElement frankreichLandElement;
    @FindBy(id="tomselect-2-ts-control")
    private WebElement stadtElement;
    @FindBy(id="tomselect-20-opt-2")
    private WebElement arnstadtStadtElement;
    @FindBy(id="tomselect-32-opt-50")
    private WebElement opfikonStadtElement;
    @FindBy(id="tomselect-3-ts-control")
    private WebElement taetigkeitsbereichElement;
    @FindBy(id="tomselect-3-opt-8" )
    private WebElement financeElement;
    @FindBy(id="tomselect-4-ts-control")
    private WebElement anstellungsverhaeltnisElement;
    @FindBy (id="tomselect-5-ts-control")
    private WebElement gesellschaftElement;



    public JobSearchPage(WebDriver driver) {
        super(driver);
    }


    public void jobsSucheInDeutschland(JobSearchInDeutschlandModel testData){
        elementsMethods.selectDropDownElement(landElement,testData.getLandElement());
        elementsMethods.selectDropDownElement(stadtElement, testData.getStadtElement());
        elementsMethods.selectDropDownElement(taetigkeitsbereichElement, testData.getTaetigkeitsbereichElement());
        elementsMethods.selectDropDownElement(anstellungsverhaeltnisElement, testData.getAnstellungsverhaeltnisElement());
        elementsMethods.selectDropDownElement(gesellschaftElement, testData.getGesellschaftElement());


    }



}
