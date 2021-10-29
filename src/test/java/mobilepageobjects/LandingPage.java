package mobilepageobjects;

import io.appium.java_client.AppiumDriver;

public class LandingPage extends BasePage{
	
	private String navigationMenu = "Main Navigation Menu";
	
	
	public LandingPage(AppiumDriver driver) {
		super(driver);
	}
	
	public void acceptButton() {
		String selector = "new UiSelector().className(\"android.widget.Button\").textContains(\"ACCEPT\")";
		uiSelector(selector);
		sleep(2000);
	}
			
	public void landingFlow() {
		
		acceptButton();
		
	}

}
