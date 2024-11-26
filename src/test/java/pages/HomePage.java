package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@role='menubar']//a[@title='Kontakte']")
    private WebElement kontakteElement;

//    public void clickFormsMenu(){
//        elementMethods.clickJSElement(formsMenu);
//        LoggerUtility.infoLog("The user clicks on Forms menu");
//
//    }

    public void clickKontaktButton(){
    elementsMethods.clickJSElement(kontakteElement);
    }








}
