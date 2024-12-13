package pages;

import loggerUtillity.LoggerUtillity;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@role='menubar']//a[@title='Kontakte']")
    private WebElement kontakteElement;
    @FindBy(xpath = "//div[@class='site-header__meta [ js-page-header-meta ]']//ul[@class='site-header__top-links top-links']//a[@title='Stellenangebote']")
    private WebElement stellangebotElement;
    @FindBy(id="html5_video_3q5zvdw8uz3")
    private WebElement heroVideoElement;
    @FindBy(xpath = "//div[@class='caption__content']//a[@class='button button--primary js-data-analytics']")
    private WebElement spotlightAnsehenButtonElement;



    public void clickKontaktButton(){
        WebElement shadowHost = driver.findElement(By.cssSelector("#usercentrics-root")); // Using the id as CSS selector
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement acceptCookiesButton = shadowRoot.findElement(By.cssSelector("button[data-testid='uc-accept-all-button']"));
        acceptCookiesButton.click();

        elementsMethods.clickJSElement(kontakteElement);
    }

    public void clickStellangebotButton(){
        WebElement shadowHost = driver.findElement(By.cssSelector("#usercentrics-root")); // Using the id as CSS selector
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement acceptCookiesButton = shadowRoot.findElement(By.cssSelector("button[data-testid='uc-accept-all-button']"));
        acceptCookiesButton.click();

        elementsMethods.clickJSElement(stellangebotElement);
        LoggerUtillity.infoLog("Stellangebot Button wurde geklickt");

    }
    public boolean checkHeroVideoElement() {
        WebElement shadowHost = driver.findElement(By.cssSelector("#usercentrics-root")); // Using the id as CSS selector
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement acceptCookiesButton = shadowRoot.findElement(By.cssSelector("button[data-testid='uc-accept-all-button']"));
        acceptCookiesButton.click();
        LoggerUtillity.infoLog("Hero Video ist sichtbar");
        try {
            WebElement element = driver.findElement((By) heroVideoElement);
            return element.isDisplayed();
        } catch (Exception e) {
            return false; // Returns false if the element is not found or not visible
        }
    }

    // Method to check if the button is visible
    public boolean checkSpotlightAnsehenButtonVisible() {
        LoggerUtillity.infoLog("Hero Video ist sichtbar");
        try {
            return spotlightAnsehenButtonElement.isDisplayed();
        } catch (Exception e) {
            return false; // If the element is not found or not visible
        }
    }













}
