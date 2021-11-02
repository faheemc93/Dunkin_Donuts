package mobilepageobjects;

import io.appium.java_client.AppiumDriver;

public class LandingPage extends BasePage{

	private String policyAccptBtn = "new UiSelector().className(\"android.widget.Button\").textContains(\"ACCEPT\")";
	private String navBtn = "Main Navigation Menu";
	private String menuBtn = "new UiSelector().className(\"android.widget.TextView\").textContains(\"MENU\")";

	public LandingPage(AppiumDriver driver) {
		super(driver);
	}

	public void startingFlow(){
		uiSelector(policyAccptBtn);
		click(navBtn);
		uiSelector(menuBtn);
	}
}
