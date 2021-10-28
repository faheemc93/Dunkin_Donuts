package webtestrunner;

import org.testng.annotations.Test;

import webproductobjects.LandingPage;
import webproductobjects.signInPage;

public class SignInTest extends Hooks {
	
	@Test(enabled=false)
	public void test() throws InterruptedException {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//a[@class='u-cta u-cta--primary']
		
		
		LandingPage landingPage = new LandingPage(driver);
		signInPage signInPage = new signInPage(driver);
		
		landingPage.click(landingPage.signInButton);
		
		signInPage.input(signInPage.emailField, "syedishmam17@gmail.com");
		signInPage.input(signInPage.passwordField, "DunkinTesting123!?");
		signInPage.click("//input[@type='submit']");
		
		Thread.sleep(15000);
		//Sleep to handle Captcha manually
	}

}
