package productobjects;

import org.openqa.selenium.WebDriver;

public class WebLandingPage extends WebBasePage {
	
	//Contains all options in navbar
	String navbarXpaths = "//p[@class='global-nav__header']";
	//Contains all category xpaths in menu. ex "Espresso & Coffee"
	String menuCategoriesXpaths = "//button[@class='product-menu__category__list__item__button']";
	
	String espressoCoffeeMenuCategoryXpath;
	String teasMoreMenuCategoryXpath;
	String frozenDrinksMenuCategoryXpath;
	String sandwichesMoreMenuCategoryXpath;
	String snacksWrapsMenuCategoriesXpath;
	String bagelsMuffinsMenuCategoryXpath;
	String donutsMenuCategoryXpath;
	String brewAtHomeMenuCategroyXpath;

	public WebLandingPage(WebDriver driver) {
		super(driver);
	}

}
