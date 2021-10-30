package mobilepageobjects;

import java.util.HashMap;
import java.util.Map;

import io.appium.java_client.AppiumDriver;

public class MenuPage extends BasePage{
	
	//Contains all options on the menu page
	public Map<String, String> menuPageItems = new HashMap<>() {{
		put("", "");
		put("", "");
		put("", "");
		put("", "");
		put("", "");
		put("", "");
	}};
	
	public MenuPage(AppiumDriver driver) {
		super(driver);
	}
	
}
