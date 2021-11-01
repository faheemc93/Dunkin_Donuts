package mobilepageobjects;

import org.openqa.selenium.Keys;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class BasePage {
	
	AppiumDriver driver;
	
	public BasePage(AppiumDriver driver) {
		this.driver = driver;
	}
	
	public void click(String selector) {
		driver.findElement(MobileBy.AccessibilityId(selector)).click();
		
	}
	
	public void sleep(int time) {
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void uiSelector(String selector) {
		driver.findElement(MobileBy.AndroidUIAutomator(selector)).click();
	}

	public void sendQuery(String selector, String query) {
		driver.findElement(MobileBy.AndroidUIAutomator(selector)).sendKeys(query);
		//driver.findElement(MobileBy.AndroidUIAutomator(selector)).sendKeys(Keys.ENTER);
	}
	
	public void acceptPrompt() {
		sleep(2000);
		driver.switchTo().alert().accept();
	}
	
}