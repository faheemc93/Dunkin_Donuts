package mobiletestrunner;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import mobilepageobjects.LandingPage;
import mobilepageobjects.SignUpFormPage;

public class SignUpTest extends Hooks {
	
	//Test case for inputting credentials into sign up form. Does not complete registration to avoid flags
	@Test(dataProvider = "sign-up-creds")
	public void signUpTest(
				String firstName,
				String lastName,
				String email,
				String password,
				String mobile,
				String zipCode
			) throws InterruptedException {
		Thread.sleep(3000);
		LandingPage landing = new LandingPage(driver);
		SignUpFormPage signUp = new SignUpFormPage(driver);
		
		String tosAcceptSelector = "new UiSelector().className(\"android.widget.Button\").text(\"ACCEPT\")";
		driver.findElement(MobileBy.AndroidUIAutomator(tosAcceptSelector)).click();
		
		landing.click(landing.landingPageItems.get("menu button"));
		String signUpSelector = "new UiSelector().className(\"android.widget.Button\").textContains(\"SIGN UP\")";
		driver.findElement(MobileBy.AndroidUIAutomator(signUpSelector)).click();
		
		signUp.sendQuery(signUp.firstNameFieldSelector, firstName);
		signUp.sendQuery(signUp.lastNameFieldSelector, lastName);
		signUp.sendQuery(signUp.emailAddressFieldSelector, email);
		signUp.sendQuery(signUp.passwordFieldSelector, password);
		signUp.sendQuery(signUp.mobileNumberFieldSelector, mobile);
		signUp.sendQuery(signUp.zipCodeFieldSelector, zipCode);
		
		signUp.scroll(500, 500, 500, 100);
		
		Thread.sleep(3000);
		signUp.uiSelector(signUp.checkBoxButtonSelector);	
	}
	
	//Credentials for signing up 
	@DataProvider(name = "sign-up-creds")
	public Object[][] dpMethod() {
		Object data[][] = {
				{
					"Syed", 
					"Ishmam",
					"test@codeboost.com",
					"Codeboost123!",
					"(123) 456-7890",
					"12345"
				}
		};
		return data;
	}

}
