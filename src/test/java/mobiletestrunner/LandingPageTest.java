package mobiletestrunner;

import org.testng.annotations.Test;

import mobilepageobjects.LandingPage;

public class LandingPageTest extends Hooks{
	
	@Test(enabled = false)
	public void Test1( ) {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.acceptButton();
	}
}
