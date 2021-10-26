package webproductobjects;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage {

	//Contains all options in navbar
	public Map<String, String> menuItems = new HashMap<>() {{
		put("menu", "//p[@class='global-nav__header' and @xpath='1']");
		put("location", "//p[@class='global-nav__header' and @xpath='2']");
		put("delivery", "//p[@class='global-nav__header' and @xpath='3']");
		put("ddPerks", "//p[@class='global-nav__header' and @xpath='4']");
		put("dunkinCard", "//p[@class='global-nav__header' and @xpath='5']");
		put("shop", "//p[@class='global-nav__header' and @xpath='6']");
	}};

	//Contains all category xpaths in menu. ex "Espresso & Coffee"
	String espressoCoffeeMenuCatXpath = "//button[@class='product-menu__category__list__item__button product-menu__category__list__item__button--active' and @xpath='1']";
	String teasMoreMenuCatXpath = "//button[@class='product-menu__category__list__item__button' and xpath='1']";
	String frozenDrinksMenuCatXpath = "//button[@class='product-menu__category__list__item__button' and xpath='2']";
	String sandwichesMoreMenuCatXpath = "//button[@class='product-menu__category__list__item__button' and xpath='3']";
	String snacksWrapsMenuCatXpath = "//button[@class='product-menu__category__list__item__button' and xpath='4']";
	String bagelsMuffinsMenuCatXpath = "//button[@class='product-menu__category__list__item__button' and xpath='5']";
	String donutsMenuCat = "//button[@class='product-menu__category__list__item__button' and xpath='6']";
	String espressoCoffeeMenuCat = "//button[@class='product-menu__category__list__item__button' and xpath='7']";


	//The below strings contain all xpaths to category items
	Map<String, String> esspressoCoffeeListItems = new HashMap<>() {{
		put("coffee", "//div[@role='listitem' and @data-slick-index='0']");
		put("iced coffee", "//div[@role='listitem' and @data-slick-index='1']");
		put("cold brew", "//div[@role='listitem' and @data-slick-index='2']");
		put("americano", "//div[@role='listitem' and @data-slick-index='3']");
		put("iced americano", "//div[@role='listitem' and @data-slick-index='4']");
		put("latte", "//div[@role='listitem' and @data-slick-index='5']");
		put("iced latte", "//div[@role='listitem' and @data-slick-index='6']");
		put("signature latte", "//div[@role='listitem' and @data-slick-index='7']");
		put("iced signature latte", "//div[@role='listitem' and @data-slick-index='8']");
		put("macchiato", "//div[@role='listitem' and @data-slick-index='9']");
		put("iced macchiato", "//div[@role='listitem' and @data-slick-index='10']");
		put("cappuccino", "//div[@role='listitem' and @data-slick-index='11']");
		put("iced cappuccino", "//div[@role='listitem' and @data-slick-index='12']");
		put("espresso", "//div[@role='listitem' and @data-slick-index='13']");
	}};

	Map<String, String> teasMoreListItems = new HashMap<>() {{
		put("tea", "//div[@role='listitem' and @data-slick-index='0']");
		put("iced tea", "//div[@role='listitem' and @data-slick-index='1']");
		put("dunkin refreshers", "//div[@role='listitem' and @data-slick-index='2']");
		put("hot chocolate", "//div[@role='listitem' and @data-slick-index='3']");
		put("dunkaccino", "//div[@role='listitem' and @data-slick-index='4']");
		put("matcha latte", "//div[@role='listitem' and @data-slick-index='5']");
		put("iced matcha latte", "//div[@role='listitem' and @data-slick-index='6']");
		put("chai latte", "//div[@role='listitem' and @data-slick-index='7']");
		put("iced chai latte", "//div[@role='listitem' and @data-slick-index='8']");
		put("vanilla spice", "//div[@role='listitem' and @data-slick-index='9']");
	}};

	Map<String, String> frozenDrinkListItems = new HashMap<>() {{
		put("frozen coffee", "//div[@role='listitem' and @data-slick-index='0']");
		put("coolatte", "//div[@role='listitem' and @data-slick-index='1']");
		put("frozen chocolate", "//div[@role='listitem' and @data-slick-index='2']");
		put("frozen matcha latte", "//div[@role='listitem' and @data-slick-index='3']");
	}};

	Map<String, String> sandwichesMoreListItems = new HashMap<>() {{
		put("sausage egg and cheese", "//div[@role='listitem' and @data-slick-index='0']");
		put("bacon egg and cheese", "//div[@role='listitem' and @data-slick-index='1']");
		put("turkey sausage egg and cheese", "//div[@role='listitem' and @data-slick-index='2']");
		put("ham egg and cheese", "//div[@role='listitem' and @data-slick-index='3']");
		put("egg and cheese", "//div[@role='listitem' and @data-slick-index='4']");
		put("veggie egg white omelet", "//div[@role='listitem' and @data-slick-index='5']");
		put("power breakfast sandwich", "//div[@role='listitem' and @data-slick-index='6']");
		put("sourdough breakfast sandwich", "//div[@role='listitem' and @data-slick-index='7']");
		put("wake-up wrap", "//div[@role='listitem' and @data-slick-index='8']");
	}};

	Map<String, String> snacksWrapsListItems = new HashMap<>() {{
		put("wake-up wrap", "//div[@role='listitem' and @data-slick-index='0']");
		put("hash browns", "//div[@role='listitem' and @data-slick-index='1']");
		put("snackin bacon", "//div[@role='listitem' and @data-slick-index='2']");
		put("stuffed bagel minis", "//div[@role='listitem' and @data-slick-index='3']");
	}};

	Map<String, String> bagelsMuffinsListItems = new HashMap<>() {{
		put("bagels with cream cheese spread", "//div[@role='listitem' and @data-slick-index='0']");
		put("muffins", "//div[@role='listitem' and @data-slick-index='1']");
		put("croissant", "//div[@role='listitem' and @data-slick-index='2']");
		put("english muffin", "//div[@role='listitem' and @data-slick-index='3']");
		put("multigrain thin", "//div[@role='listitem' and @data-slick-index='4']");
	}};

	Map<String, String> donutsListItems = new HashMap<>() {{
		put("donuts", "//div[@role='listitem' and @data-slick-index='0']");
		put("munchkins", "//div[@role='listitem' and @data-slick-index='1']");
	}};

	Map<String, String> brewAtHomeListItems = new HashMap<>() {{
		put("packaged coffee", "//div[@role='listitem' and @data-slick-index='0']");
		put("k-cup pods", "//div[@role='listitem' and @data-slick-index='1']");
		put("packaged tea", "//div[@role='listitem' and @data-slick-index='2']");
	}};

	public LandingPage(WebDriver driver) {
		super(driver);
	}

}