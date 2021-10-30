package mobilepageobjects;

import java.util.HashMap;
import java.util.Map;

import io.appium.java_client.AppiumDriver;

public class LandingPage extends BasePage{
		
	//Contains all options in landing page
	public Map<String, String> landingPageItems = new HashMap<>() {{
		put("menu button", "Main Navigation Menu");
		put("location button", "Select a location");
		put("join button", "Join - button");
		put("sign in button", "Sign in - button");
		put("guest order button", "Guest order - button");
	}};
	
	//Contains all options in menu slide
	public Map<String, String> menuSlideItems = new HashMap<>() {{
		put("sign up", "new UiSelector().className(\"android.widget.Button\").textContains(\"SIGN UP\")");
		put("delivery", "new UiSelector().className(\"android.widget.TextView\").textContains(\"DELIVERY\")");
		put("locations", "new UiSelector().className(\"android.widget.TextView\").textContains(\"LOCATIONS\")");
		put("menu", "new UiSelector().className(\"android.widget.TextView\").textContains(\"MENU\")");
		put("offers", "new UiSelector().className(\"android.widget.TextView\").textContains(\"OFFERS\")");
		put("settings", "new UiSelector().className(\"android.widget.TextView\").textContains(\"SETTINGS\")");
	}};
	
	
	public LandingPage(AppiumDriver driver) {
		super(driver);
	}
	
	public void acceptButton() {
		String selector = "new UiSelector().className(\"android.widget.Button\").textContains(\"ACCEPT\")";
		uiSelector(selector);
		sleep(2000);
	}
			
	public void navigationMenuFlow() {
		acceptButton();
		click(landingPageItems.get("menu button"));
		uiSelector(menuSlideItems.get("menu"));
	}
	
	public void locationMenuFlow() {
		acceptButton();
		click(landingPageItems.get("location button"));
	}
}
