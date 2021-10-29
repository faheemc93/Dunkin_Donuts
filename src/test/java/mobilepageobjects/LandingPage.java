package mobilepageobjects;

import io.appium.java_client.AppiumDriver;

public class LandingPage extends BasePage{
	
	private String acceptButton = "acceptButton";

	public LandingPage(AppiumDriver driver) {
		super(driver);
	}
	
	public void startingFlow() {
		sleep(3000);
		click(acceptButton);
	}

}
