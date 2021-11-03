package mobiletestrunner;

import io.appium.java_client.AppiumDriver;
import mobilepageobjects.BasePage;
import mobilepageobjects.LandingPage;
import mobilepageobjects.MenuPage;

public class NavigateTo {
	
	String category;
	String item;
	
	BasePage pageToNavigateTo;
	LandingPage landingPage;
	MenuPage menuPage;
	
	public NavigateTo(AppiumDriver driver, BasePage pageToNavigateTo) {
		
		this.landingPage = new LandingPage(driver);
		this.menuPage = new MenuPage(driver);
		this.pageToNavigateTo = pageToNavigateTo;
		
	}
	
	public NavigateTo withCategory(String category) {
		
		this.category = category;
		return this;
	}
	
	public NavigateTo withItem(String item) {
		
		this.item = item;
		return this;
	}

	public void start() {
		
		if (this.pageToNavigateTo.getClass() == LandingPage.class) {
			landingPage.acceptButton();
		}
		
		if (this.pageToNavigateTo.getClass() == MenuPage.class) {
			landingPage.acceptButton();
			landingPage.navigationMenuFlow();		
			menuPage.menuFlow(category, item);	
			menuPage.startOrder();
		}
	}
}
