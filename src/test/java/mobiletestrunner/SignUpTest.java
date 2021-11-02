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
		
		driver.findElement(MobileBy.AndroidUIAutomator(signUp.firstNameFieldSelector)).sendKeys(firstName);
		driver.findElement(MobileBy.AndroidUIAutomator(signUp.lastNameFieldSelector)).sendKeys(lastName);
		driver.findElement(MobileBy.AndroidUIAutomator(signUp.emailAddressFieldSelector)).sendKeys(email);
		driver.findElement(MobileBy.AndroidUIAutomator(signUp.passwordFieldSelector)).sendKeys(password);
		driver.findElement(MobileBy.AndroidUIAutomator(signUp.mobileNumberFieldSelector)).sendKeys(mobile);
		driver.findElement(MobileBy.AndroidUIAutomator(signUp.zipCodeFieldSelector)).sendKeys(zipCode);
		
		signUp.scroll(500, 500, 500, 100);
		
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator(signUp.checkBoxButtonSelector)).click();
		
		
	}
	
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
