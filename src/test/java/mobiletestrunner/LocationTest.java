package mobiletestrunner;

import org.testng.annotations.Test;

import mobilepageobjects.LandingPage;
import mobilepageobjects.LocationPage;

public class LocationTest extends Hooks{
	
	@Test
	public void Test1() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.locationMenuFlow();
		
		LocationPage locationPage = new LocationPage(driver);
		locationPage.locationFlow();
	}

}
