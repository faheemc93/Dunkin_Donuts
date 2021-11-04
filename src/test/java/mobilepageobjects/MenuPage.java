package mobilepageobjects;

import java.util.HashMap;
import java.util.Map;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class MenuPage extends BasePage{
	
	String startOrder = "new UiSelector().className(\"android.widget.TextView\").textContains(\"START ORDER\")";

	//Contains all featured options on the menu page
	public Map<String, String> featuredItems = new HashMap<>() {{
		put("breakfast remix", "new UiSelector().className(\"android.widget.LinearLayout\").descriptionContains(\"Breakfast RemixButton\")");
		put("touch of holiday magic", "new UiSelector().className(\"android.widget.TextView\").textContains(\"Touch of Holiday Magic\")");
		put("pumpkin & more", "new UiSelector().className(\"android.widget.TextView\").textContains(\"Pumpkin & More\")");
		put("crafted cold brew", "new UiSelector().className(\"android.widget.TextView\").textContains(\"Crafted Cold Brew\")");
		put("handcrafted espresso", "new UiSelector().className(\"android.widget.TextView\").textContains(\"Handcrafted Espresso\")");
	}};

	//Contains all Breakfast Remix options on the menu page
	public Map<String, String> breakfastRemixItems = new HashMap<>() {{
		put("holiday blend", "new UiSelector().className(\"android.widget.TextView\").textContains(\"HOLIDAY BLEND\")");
		put("pancake minis", "new UiSelector().className(\"android.widget.TextView\").textContains(\"PANCAKE MINIS\")");
		put("cranberry orange muffin", "new UiSelector().className(\"android.widget.TextView\").textContains(\"CRANBERRY ORANGE MUFFIN\")");
		put("cold brew with sweet cold foam", "new UiSelector().className(\"android.widget.TextView\").textContains(\"COLD BREW WITH SWEET COLD FOAM\")");
		put("plain stuffed bagel minis", "new UiSelector().className(\"android.widget.TextView\").textContains(\"PLAIN STUFFED BAGEL MINIS\")");
		put("oatmilk iced latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"OATMILK ICED LATTE\")");
		put("avocado toast", "new UiSelector().className(\"android.widget.TextView\").textContains(\"AVOCADO TOAST\")");
	}};

	//Contains all Touch of Holiday Magic options on the menu page
	public Map<String, String> holidayMagicItems = new HashMap<>() {{
		put("peppermint mocha signature latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"PEPPERMINT MOCHA SIGNATURE LATTE\")");
		put("toasted white chocolate iced signature latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"TOASTED WHITE CHOCOLATE ICED SIGNATURE LATTE\")");
		put("white mocha hot chocolate", "new UiSelector().className(\"android.widget.TextView\").textContains(\"WHITE MOCHA HOT CHOCOLATE\")");
		put("half dozen donuts", "new UiSelector().className(\"android.widget.TextView\").textContains(\"HALF DOZEN DONUTS\")");
		put("dozen donuts", "new UiSelector().className(\"android.widget.TextView\").textContains(\"DOZEN DONUTS\")");
		put("toasted white chocolate iced coffee", "new UiSelector().className(\"android.widget.TextView\").textContains(\"TOASTED WHITE CHOCOLATE ICED COFFEE\")");
		put("peppermint mocha cold brew with sweet cold foam", "new UiSelector().className(\"android.widget.TextView\").textContains(\"PEPPERMINT MOCHA COLD BREW WITH SWEET COLD FOAM\")");
		put("toasted white chocolate chai latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"TOASTED WHITE CHOCOLATE CHAI LATTE\")");
	}};

	//Contains all Pumpkin & More options on the menu page
	public Map<String, String> pumpkinMoreItems = new HashMap<>() {{
		put("pumpkin spice signature latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"PUMPKIN SPICE SIGNATURE LATTE\")");
		put("pumpkin spice iced signature latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"PUMPKIN SPICE ICED SIGNATURE LATTE\")");
		put("pumpkin cream cold brew", "new UiSelector().className(\"android.widget.TextView\").textContains(\"PUMPKIN CREAM COLD BREW\")");
		put("maple sugar snackin bacon", "new UiSelector().className(\"android.widget.TextView\").textContains(\"MAPLE SUGAR SNACKIN' BACON\")");
		put("maple sugar bacon breakfast sandwich", "new UiSelector().className(\"android.widget.TextView\").textContains(\"MAPLE SUGAR BACON BREAKFAST SANDWICH\")");
		put("pumpkin iced coffee", "new UiSelector().className(\"android.widget.TextView\").textContains(\"PUMPKIN ICED COFFEE\")");
		put("pumpkin chai latte", "new UiSelector().className(\"android.widget.TextView\").textContains(\"PUMPKIN CHAI LATTE\")");
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

	public void breakFastRemixFlow(){
		uiSelector(featuredItems.get("breakfast remix"));
		uiSelector(breakfastRemixItems.get("pancake minis"));
	}
}
