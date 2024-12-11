package helpMethods;

import lombok.AllArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sharedData.SharedData;

@AllArgsConstructor
public class FrameMethods extends SharedData {

    public WebDriver driver;

    public void switchToParentIFrame(){
        driver.switchTo().parentFrame();
    }

    public void switchToSpecificIFrameByElement(WebElement element){
        driver.switchTo().frame(element);

    }
}
