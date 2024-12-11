package pages;


import helpMethods.ElementsMethods;
import helpMethods.FrameMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;
    protected ElementsMethods elementsMethods;
    protected FrameMethods frameMethods;

    public BasePage(WebDriver driver){
        this.driver = driver;
        elementsMethods = new ElementsMethods(this.driver);
        frameMethods = new FrameMethods(this.driver);

        PageFactory.initElements(this.driver,this);
    }
}
