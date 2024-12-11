package pages;

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

    }








}
