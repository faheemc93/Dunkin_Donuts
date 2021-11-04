package mobilepageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class ProductPage extends BasePage{

    private String calorieText = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Cal\")";

    public ProductPage(AppiumDriver driver){
        super(driver);
    }

    public String getCalories(){
        String productCalories = driver.findElement(MobileBy.AndroidUIAutomator(calorieText)).getText();
        return productCalories;
    }
}
