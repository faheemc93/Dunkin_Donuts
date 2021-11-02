package mobiletestrunner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mobilepageobjects.LandingPage;

public class SignUpTest extends Hooks {
	
	@Test
	public void signUpTest() {
		LandingPage landing = new LandingPage(driver);
		landing.click(landing.landingPageItems.get("menu button"));
	}
	
	@DataProvider(name = "sign-up-creds")
	public Object[][] dpMethod() {
		Object data[][] = {
				{
					"Syed", 
					"Ishmam",
					"test@codeboost.com",
					"Codeboost123",
					"(123) 456-7890",
					"12345"
				}
		};
		return data;
	}

}
