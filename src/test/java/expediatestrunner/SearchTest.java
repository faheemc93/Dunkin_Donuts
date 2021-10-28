package expediatestrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import expediaproductobjects.LandingPage;

public class SearchTest extends Hooks {
	
	@Test(enabled=true)
	public void test() throws InterruptedException {
		LandingPage landing = new LandingPage(driver);
		
		WebElement goingToField = driver.findElement(By.xpath(landing.goingToFieldXpath));
		
		landing.click(landing.goingToFieldXpath);
		landing.input(landing.goingToFieldXpath, "Miami, Florida, United States");
		
		goingToField.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		
		landing.click("//button[@class='_1yFrqc _1RdfF-']");
		System.out.println(landing.date.replace("[DATE]", "Sat Nov 20 2021 12:00:00 GMT-0500"));
		landing.click(landing.date.replace("[DATE]", "Sat Nov 20 2021 12:00:00 GMT-0500"));
		landing.click(landing.applyButton);
		landing.click(landing.searchButton);
		
	}

}