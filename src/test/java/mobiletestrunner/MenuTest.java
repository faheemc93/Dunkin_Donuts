package mobiletestrunner;

import org.testng.annotations.Test;

import mobilepageobjects.LandingPage;
import mobilepageobjects.LocationPage;
import mobilepageobjects.MenuPage;

public class MenuTest extends Hooks{
	
	@Test
	public void Test1() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.navigationMenuFlow();
		
		MenuPage menuPage = new MenuPage(driver);
		//This will take you to the item of your choice based on the category and the specific item you enter
		menuPage.menuFlow("hot drinks", "original blend");		
	}
}