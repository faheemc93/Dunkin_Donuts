package mobiletestrunner;

import org.testng.annotations.Test;

import mobilepageobjects.LandingPage;
import mobilepageobjects.MenuPage;

public class MenuTest extends Hooks{
	
	@Test
	public void Test1() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.landingFlow();
		
		MenuPage menuPage = new MenuPage(driver);
		menuPage.menuFlow();
	}

}
