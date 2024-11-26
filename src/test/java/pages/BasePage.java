package pages;

import helpMethods.ElementsMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    protected ElementsMethods elementsMethods;

    public BasePage(WebDriver driver){
        this.driver = driver;
        elementsMethods = new ElementsMethods(this.driver);

        PageFactory.initElements(this.driver,this);
    }
}
