package mobilepageobjects;

import io.appium.java_client.AppiumDriver;

public class LocationPage extends BasePage{
	
	public LocationPage(AppiumDriver driver) {
		super(driver);
	}
	
	public void enableLocationServices() {
		sleep(3000);
		String selector = "new UiSelector().className(\"android.widget.Button\").textContains(\"ENABLE LOCATION SERVICES\")";
		uiSelector(selector);
	}
	
	public void searchLocation(String cityState) {
		sleep(3000);
		String selector = "new UiSelector().className(\"android.widget.EditText\").textContains(\"Search by Zip or City & State\")";
		sendQuery(selector, cityState);
	}
	
	public void locationFlow() {
		
		enableLocationServices();
		acceptPrompt();
		searchLocation("queens new york");
	}
}
