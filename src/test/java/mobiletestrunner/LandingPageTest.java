package mobiletestrunner;

import org.testng.annotations.Test;

import mobilepageobjects.LandingPage;

public class LandingPageTest extends Hooks{
	
	@Test
	public void Test1( ) {
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.startingFlow();
	}

}
