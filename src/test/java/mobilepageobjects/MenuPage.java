package mobilepageobjects;

import java.util.HashMap;
import java.util.Map;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class MenuPage extends BasePage{
	
	String startOrder = "new UiSelector().className(\"android.widget.TextView\").textContains(\"START ORDER\")";
	
	//Contains all featured options on the menu page
	public Map<String, String> featuredItems = new HashMap<>() {{
		put("", "");
		put("", "");
		put("", "");
		put("", "");
		put("", "");
		put("", "");
	}};
	
	//Contains all category options on the menu page
	public Map<String, String> categoryItems = new HashMap<>() {{
		put("iced drinks", "ICED DRINKSButton");
		put("hot drinks", "HOT DRINKSButton");
		put("sandwiches & wraps", "SANDWICHES & WRAPSButton");
		put("donuts & bakery", "DONUTS & BAKERYButton");
		put("frozen drinks", "FROZEN DRINKSButton");
		put("snackin", "SNACKIN'Button");
		put("brew at home", "BREW AT HOMEButton");
		put("merch", "MERCHButton");
		put("bottled drinks", "BOTTLED DRINKSButton");
	}};
	
	//Contains all drink options on the iced drinks menu page
	public Map<String, String> icedDrinksItems = new HashMap<>() {{
		put("original blend iced coffee", "new UiSelector().className(\"android.widget.TextView\").textContains(\"ORIGINAL BLEND ICED COFFEE\")");
		put("cold brew", "new UiSelector().className(\"android.widget.TextView\").textContains(\"COLD BREW\")");
		put("cold brew with sweet cold foam", "new UiSelector().className(\"android.widget.TextView\").textContains(\"COLD BREW WITH SWEET COLD FOAM\")");
		put("coconutmilk iced latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"COCONUTMILK ICED LATTE\")");
		put("iced signature latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"ICED SIGNATURE LATTE\")");
		put("oatmilk iced latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"OATMILK ICED LATTE\")");
		put("iced latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"ICED LATTE\")");
		put("iced cappuccino", "new UiSelector().className(\"android.widget.TextView\").textContains(\"ICED CAPPUCCINO\")");
		put("iced macchiato", "new UiSelector().className(\"android.widget.TextView\").textContains(\"ICED MACCHIATO\")");
		put("iced americano", "new UiSelector().className(\"android.widget.TextView\").textContains(\"ICED AMERICANO\")");
		put("dunkin' refreshers", "new UiSelector().className(\"android.widget.TextView\").textContains(\"DUNKIN' REFRESHERS\")");
		put("dunkin' coconut refreshers", "new UiSelector().className(\"android.widget.TextView\").textContains(\"DUNKIN' COCONUT REFRESHERS\")");
		put("iced matcha latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"ICED MATCHA LATTE\")");
		put("iced chai latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"ICED CHAI LATTE\")");
		put("iced tea", "new UiSelector().className(\"android.widget.TextView\").textContains(\"ICED TEA\")");
	}};
	
	public Map<String, String> hotDrinksItems = new HashMap<>() {{
		put("original blend", "new UiSelector().className(\"android.widget.TextView\").textContains(\"ORIGINAL BLEND\")");
		put("dunkin midnight", "new UiSelector().className(\"android.widget.TextView\").textContains(\"DUNKIN' MIDNIGHT\")");
		put("100% guatemalan", "new UiSelector().className(\"android.widget.TextView\").textContains(\"100% GUATEMALAN\")");
	}};
		
	public MenuPage(AppiumDriver driver) {
		super(driver);
	}
	
	public void icedDrinksMenuFlow() {
		click(categoryItems.get("iced drinks"));
		uiSelector(icedDrinksItems.get("cold brew"));
	}
	
	public void hotDrinksMenuFlow() {
		click(categoryItems.get("hot drinks"));
		uiSelector(hotDrinksItems.get("dunkin midnight"));
		uiSelector(startOrder);
	}
}
