package mobilepageobjects;

import io.appium.java_client.AppiumDriver;

public class MenuPage extends BasePage{
	
	private String navigationMenu = "Main Navigation Menu";

	public MenuPage(AppiumDriver driver) {
		super(driver);
	}
	
	public void menuButton() {
		String selector = "new UiSelector().className(\"android.widget.TextView\").textContains(\"MENU\")";
		uiSelector(selector);
	}
	
	public void menuFlow() {
		
		click(navigationMenu);
		menuButton();
		
	}

}
