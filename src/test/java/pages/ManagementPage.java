package pages;

import loggerUtillity.LoggerUtillity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class ManagementPage extends BasePage{

    @FindBy (xpath = "//div[@class='contact']//div[@class='contact__infos contact__infos--general']//div[@class='contact__name hl-4'][normalize-space(text())='André Wyss']")
    private WebElement manager1;
    @FindBy (xpath = "//div[@class='contact']//div[@class='contact__infos contact__infos--general']//div[@class='contact__name hl-4'][normalize-space(text())='Adrian Wyss']")
    private WebElement manager2;
    @FindBy (xpath = "//div[@class='contact']//div[@class='contact__infos contact__infos--general']//div[@class='contact__name hl-4'][normalize-space(text())='Jens Vollmar']")
    private WebElement manager3;
    @FindBy (xpath = "//div[@class='contact']//div[@class='contact__infos contact__infos--general']//div[@class='contact__name hl-4'][normalize-space(text())='Erwin Scherer']")
    private WebElement manager4;
    @FindBy (xpath = "//div[@class='contact']//div[@class='contact__infos contact__infos--general']//div[@class='contact__name hl-4'][normalize-space(text())='Anita Eckardt']")
    private WebElement manager5;
    @FindBy (xpath = "//div[@class='contact']//div[@class='contact__infos contact__infos--general']//div[@class='contact__name hl-4'][normalize-space(text())='Stefan Baumgärtner']")
    private WebElement manager6;
    @FindBy (xpath = "//div[@class='contact']//div[@class='contact__infos contact__infos--general']//div[@class='contact__name hl-4'][normalize-space(text())='Claudia Bidwell']")
    private WebElement manager7;
    @FindBy (xpath = "//div[@class='contact']//div[@class='contact__infos contact__infos--general']//div[@class='contact__name hl-4'][normalize-space(text())='German Grüniger']")
    private WebElement manager8;



    public ManagementPage(WebDriver driver) {
        super(driver);
    }

    public void checkAll8Managers(){
            LoggerUtillity.infoLog("Überprüfe die Sichtbarkeit aller Manager-Elemente...");

            List<WebElement> managers = Arrays.asList(
                    manager1, manager2, manager3, manager4, manager5, manager6, manager7, manager8);

            for (int i = 0; i < managers.size(); i++) {
                WebElement manager = managers.get(i);
                try {
                    Assert.assertTrue(manager.isDisplayed(), "Manager " + (i + 1) + " ist nicht sichtbar!");
                    LoggerUtillity.infoLog("Manager " + (i + 1) + " ist sichtbar.");
                } catch (Exception e) {
                    LoggerUtillity.errorLog("Manager " + (i + 1) + " konnte nicht validiert werden: " + e.getMessage());
                    Assert.fail("Manager " + (i + 1) + " ist nicht sichtbar oder existiert nicht!");
                }
            }

            LoggerUtillity.infoLog("Die Sichtbarkeit aller Manager-Elemente wurde erfolgreich validiert.");
        }

    }





