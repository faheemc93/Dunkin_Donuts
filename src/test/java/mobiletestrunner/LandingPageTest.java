package mobiletestrunner;

import mobilepageobjects.LandingPage;
import org.testng.annotations.Test;

public class LandingPageTest extends Hooks{
	
	@Test
	public void Test1( ) {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.startingFlow();
	}

}
