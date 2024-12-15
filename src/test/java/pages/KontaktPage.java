package pages;

import loggerUtillity.LoggerUtillity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class KontaktPage extends BasePage{
    public KontaktPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@data-mobile-title='Kontaktieren Sie uns!']//a")
    private WebElement kontaktierenSieUnsElement;

    public void clickKontaktierenSieUnsElement(){
        elementsMethods.clickElement(kontaktierenSieUnsElement);
        LoggerUtillity.infoLog("Kontaktieren Sie uns wurde angeklickt");
    }




}
