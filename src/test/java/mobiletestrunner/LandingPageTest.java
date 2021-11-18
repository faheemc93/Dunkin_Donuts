package mobiletestrunner;

import org.testng.annotations.Test;

import mobilepageobjects.LandingPage;

public class LandingPageTest extends Hooks{
	
	@Test
	public void Test1() {
		
		new NavigateTo(driver,new LandingPage(driver)).start();
	}
}