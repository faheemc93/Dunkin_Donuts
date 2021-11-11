package mobiletestrunner;

import org.testng.annotations.Test;

import mobilepageobjects.LandingPage;
import mobilepageobjects.LocationPage;
import mobilepageobjects.MenuPage;

public class MenuTest extends Hooks{
	
	@Test(enabled=false)
	public void Test1() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.navigationMenuFlow();
		
		MenuPage menuPage = new MenuPage(driver);
		menuPage.hotDrinksMenuFlow();
		
		LocationPage locationPage = new LocationPage(driver);
		locationPage.locationFlow();		
	}
}
