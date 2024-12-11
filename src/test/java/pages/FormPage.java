package pages;

import loggerUtillity.LoggerUtillity;
import modelObject.KontaktFormModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FormPage extends BasePage{

    @FindBy(id = "powermail_field_vorname")
    private WebElement vornameElement;
    @FindBy(id="powermail_field_nachname")
    private WebElement nachnameElement;
    @FindBy(id="powermail_field_e_mail")
    private WebElement emailElement;
    @FindBy(id="powermail_field_firma")
    private WebElement unternehmenElement;
    @FindBy(id="powermail_field_adresseinklland")
    private WebElement adresseElement;
    @FindBy(id="powermail_field_telefon")
    private WebElement telefonElement;
    @FindBy(id="powermail_field_ihrenachricht")
    private WebElement nachrichtElement;
    @FindBy(xpath = "//div[@class='fieldset__inner']//label[@for='powermail_field_datenschutz_1']")
    private WebElement checkDatenschutzElement;
    @FindBy(xpath = "//input[@class='powermail_submit']")
    private WebElement submitElement;
    @FindBy(xpath = "//iframe[@class='mfp-iframe']")
    private  WebElement kontaktFrame;
    @FindBy(id = "c368066")
    private WebElement erfolgreichGesndetNachricht;

    public FormPage(WebDriver driver) {
        super(driver);
    }

    public void dealKontaktFrame(){
        frameMethods.switchToSpecificIFrameByElement(kontaktFrame);
        LoggerUtillity.infoLog("The user switches to Kontakt iframe");

    }

    public void fillKontaktForm(KontaktFormModel testData){
        elementsMethods.fillElement(vornameElement,testData.getVornameElement());
        elementsMethods.fillElement(nachnameElement,testData.getNachnameElement());
        elementsMethods.fillElement(emailElement,testData.getEmailElement());
        elementsMethods.fillElement(unternehmenElement,testData.getUnternehmenElement());
        elementsMethods.fillElement(adresseElement,testData.getAdresseElement());
        elementsMethods.fillElement(telefonElement,testData.getTelefonElement());
        elementsMethods.fillElement(nachrichtElement,testData.getNachrichtElement());
        elementsMethods.scrollToBottom();
        elementsMethods.clickElement(checkDatenschutzElement);
        elementsMethods.clickJSElement(submitElement);

    }

    public void validateFormValues() {
        elementsMethods.waitVisibleElement(erfolgreichGesndetNachricht);
        Assert.assertEquals(erfolgreichGesndetNachricht.getText(), "Kontaktformular");
    }
}
