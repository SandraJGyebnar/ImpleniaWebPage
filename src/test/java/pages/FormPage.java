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
    @FindBy(xpath = "//div[@class='powermail_create']")
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
        LoggerUtillity.infoLog("Vorname wurde ausgefuellt");

        elementsMethods.fillElement(nachnameElement,testData.getNachnameElement());
        LoggerUtillity.infoLog("Nachname wurde ausgefuellt");

        elementsMethods.fillElement(emailElement,testData.getEmailElement());
        LoggerUtillity.infoLog("Email wurde ausgefuellt");


        elementsMethods.fillElement(unternehmenElement,testData.getUnternehmenElement());
        LoggerUtillity.infoLog("Unternehme wurde ausgefuellt");

        elementsMethods.fillElement(adresseElement,testData.getAdresseElement());
        LoggerUtillity.infoLog("Adresse wurde ausgefuellt");

        elementsMethods.fillElement(telefonElement,testData.getTelefonElement());
        LoggerUtillity.infoLog("Telefon wurde ausgefuellt");

        elementsMethods.fillElement(nachrichtElement,testData.getNachrichtElement());
        LoggerUtillity.infoLog("Nachricht wurde ausgefuellt");

        elementsMethods.scrollToBottom();
        LoggerUtillity.infoLog("Seite wurde gescrollt");

        elementsMethods.clickElement(checkDatenschutzElement);
        LoggerUtillity.infoLog("Datenschutz wurde markiert");

        elementsMethods.clickJSElement(submitElement);
        LoggerUtillity.infoLog("Kontakt Formular wurde gesendet");


    }

    public void validateFormSendComfirmation() {
        elementsMethods.waitVisibleElement(erfolgreichGesndetNachricht);
        String actualMessage = erfolgreichGesndetNachricht.getText();
        String expectedMessage = "✓ Vielen Dank für Ihre Nachricht. Wir kontaktieren Sie in Kürze.";

        Assert.assertEquals(actualMessage, expectedMessage, "Die Bestätigungsnachricht ist falsch!");
        LoggerUtillity.infoLog("Die Erfolgsmeldung '" + actualMessage + "' wurde validiert.");
    }
}
