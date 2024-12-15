package pages;

import loggerUtillity.LoggerUtillity;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UeberUnsMenuPage extends BasePage{
    @FindBy(xpath = "//ul[@id='menu-list-52387-1']//li[@class='stage-menu__item menu-item']//a[@role='menuitem']//span[text()='Management']")
    private WebElement ManagementButton;

    public UeberUnsMenuPage(WebDriver driver) {
        super(driver);
    }

    public void clickManagementButton(){
        elementsMethods.clickElement(ManagementButton);
        LoggerUtillity.infoLog("ManagementButton ist geklickt");

        WebElement shadowHost = driver.findElement(By.cssSelector("#usercentrics-root")); // Using the id as CSS selector
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement acceptCookiesButton = shadowRoot.findElement(By.cssSelector("button[data-testid='uc-accept-all-button']"));
        acceptCookiesButton.click();

        String expectedUrl = "https://implenia.com/ueber-uns/organisation/management/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Die URL nach dem Klick auf ManagementButton ist falsch!");
        LoggerUtillity.infoLog("Die Seite wurde erfolgreich zur Management-Seite weitergeleitet.");

    }


}
