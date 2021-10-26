package webtestrunner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import webproductobjects.LandingPage;
import webproductobjects.signInPage;

public class LandingTest extends Hooks {

	@Test
	public void test() {
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//a[@class='u-cta u-cta--primary']
		
		
		LandingPage landingPage = new LandingPage(driver);
		signInPage signInPage = new signInPage(driver);
		
		landingPage.click(landingPage.signInButton);
		landingPage.input(signInPage.emailField, "syedishmam17@gmail.com");
		landingPage.input(signInPage.passwordField, "R3mdunk!");
	}
	
}
