package mobilepageobjects;

import io.appium.java_client.AppiumDriver;

public class LandingPage extends BasePage{
	
	private String enableLocationServices = "";
			
	public LandingPage(AppiumDriver driver) {
		super(driver);
	}
	
	public void acceptButton() {
		String selector = "new UiSelector().className(\"android.widget.Button\").textContains(\"ACCEPT\")";
		uiSelector(selector);
	}
	
	public void enableLocationServices() {
		sleep(2000);
		String selector = "new UiSelector().className(\"android.widget.Button\").textContains(\"ENABLE LOCATION SERVICES\")";
		uiSelector(selector);
	}
	
	public void searchLocation(String cityState) {
		sleep(2000);
		String selector = "new UiSelector().className(\"android.widget.EditText\").textContains(\"Search by Zip or City & State\")";
		sendQuery(selector, cityState);
	}
	
	
	
	public void startingFlow() {
		
		acceptButton();
		enableLocationServices();
		acceptPrompt();
		searchLocation("queens new york");
		
	}

}
