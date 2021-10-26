package mobilepageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class AppBasePage {

    AppiumDriver driver;

    public AppBasePage(AppiumDriver driver){
        this.driver = driver;
    }

    public void click(String selector){
        driver.findElement(MobileBy.AccessibilityId(selector)).click();
    }

    public void clickUI(String selector){
        driver.findElement(MobileBy.AndroidUIAutomator(selector)).click();
    }

}
