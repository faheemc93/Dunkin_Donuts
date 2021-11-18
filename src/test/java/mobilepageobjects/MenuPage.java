package mobilepageobjects;

import java.util.HashMap;
import java.util.Map;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class MenuPage extends BasePage{
	
	//Contains all featured options at the top of the menu page
	public Map<String, String> featuredItems = new HashMap<>() {{
		put("", "");
		put("", "");
		put("", "");
		put("", "");
		put("", "");
		put("", "");
	}};
	
	//Contains all category options in the menu page
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
	
	//Contains all iced drink options in the "iced drinks" category page.
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
	
	//Contains all hot drinks options in the "hot drinks" category page.
	public Map<String, String> hotDrinksItems = new HashMap<>() {{
		put("original blend", "new UiSelector().className(\"android.widget.TextView\").textContains(\"ORIGINAL BLEND\")");
		put("dunkin midnight", "new UiSelector().className(\"android.widget.TextView\").textContains(\"DUNKIN' MIDNIGHT\")");
		put("100% guatemalan", "new UiSelector().className(\"android.widget.TextView\").textContains(\"100% GUATEMALAN\")");
	}};
	
	//Contains all sandwich and wrap options in the "sandwiches & wraps" category page.
	public Map<String, String> sandwiches_wraps = new HashMap<>() {{
		put("bacon-topped avocado toast", "new UiSelector().className(\"android.widget.TextView\").textContains(\"BACON-TOPPED AVOCADO TOAST\")");
		put("avocado toast", "new UiSelector().className(\"android.widget.TextView\").textContains(\"AVOCADO TOAST\")");
		put("maple sugar bacon breakfast sandwich", "new UiSelector().className(\"android.widget.TextView\").textContains(\"MAPLE SUGAR BACON BREAKFAST SANDWICH\")");
		put("power breakfast sandwich", "new UiSelector().className(\"android.widget.TextView\").textContains(\"POWER BREAKFAST SANDWICH\")");
		put("sourdough breakfast sandwich", "new UiSelector().className(\"android.widget.TextView\").textContains(\"SOURDOUGH BREAKFAST SANDWICH\")");
	}};
	
	public Map<String, String> donuts_bakery = new HashMap<>() {{
		put("", "");
		put("", "");
		put("", "");
	}};
	
	public Map<String, String> frozenDrinks = new HashMap<>() {{
		put("", "");
		put("", "");
		put("", "");
	}};
	
	public Map<String, String> snackin = new HashMap<>() {{
		put("", "");
		put("", "");
		put("", "");
	}};
	
	public Map<String, String> brewAtHome = new HashMap<>() {{
		put("", "");
		put("", "");
		put("", "");
	}};
	
	public Map<String, String> merch = new HashMap<>() {{
		put("", "");
		put("", "");
		put("", "");
	}};
	
	public Map<String, String> bottledDrinks = new HashMap<>() {{
		put("", "");
		put("", "");
		put("", "");
	}};
		
	public MenuPage(AppiumDriver driver) {
		super(driver);
	}
		
	public void menuFlow(String category, String item) {
		//Takes the chosen category from all the menu items as an argument and clicks on that category.
		click(categoryItems.get(category));
		//Clicks on desired item based on the chosen category.
		if (category=="iced drinks") {
			uiSelector(icedDrinksItems.get(item));
		}
		if (category=="hot drinks") {
			uiSelector(hotDrinksItems.get(item));
		}
		if (category=="sanwiches & wraps") {
			uiSelector(sandwiches_wraps.get(item));
		}
		if (category=="donuts & bakery") {
			uiSelector(donuts_bakery.get(item));
		}
		if (category=="frozen drinks") {
			uiSelector(frozenDrinks.get(item));
		}
		if (category=="snackin'") {
			uiSelector(snackin.get(item));
		}
		if (category=="brew at home") {
			uiSelector(brewAtHome.get(item));
		}
		if (category=="merch") {
			uiSelector(merch.get(item));
		}
		if (category=="bottled drinks") {
			uiSelector(bottledDrinks.get(item));
		}
	}

	//Starts order flow based on the chosen category and associated menu item available in that category. 
	public void startOrder() {
		String startOrder = "new UiSelector().className(\"android.widget.TextView\").textContains(\"START ORDER\")";
		uiSelector(startOrder);
	}
	
}
