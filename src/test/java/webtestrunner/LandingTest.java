package webtestrunner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import webproductobjects.LandingPage;

public class LandingTest extends Hooks {

	@Test
	public void test() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.click(landingPage.navbarMenuXpath);
	}
	
}
