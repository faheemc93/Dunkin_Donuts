package mobilepageobjects;

import io.appium.java_client.AppiumDriver;

public class AppLandingPage extends AppBasePage {

    private String policyAccptBtn = "new UiSelector().className(\"android.widget.Button\").textContains(\"ACCEPT\")";
    private String navBtn = "Main Navigation Menu";
    private String menuBtn = "new UiSelector().className(\"android.widget.TextView\").textContains(\"MENU\")";

    public AppLandingPage(AppiumDriver driver){
        super(driver);
    }

}
