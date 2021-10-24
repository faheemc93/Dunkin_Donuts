package testrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebHooks {

	WebDriver driver;
	
	@BeforeMethod (alwaysRun=true)
	public void setup() {
		
		String url = "https://www.saucedemo.com";
		
		String pathToDriver = System.getProperty("user.dir") + "/resources/chromedriver";
		System.setProperty("webdriver.chrome.driver", pathToDriver);
		
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	
	@AfterMethod (alwaysRun=true)
	public void tearDown() {
		
		try {
			Thread.sleep(2500);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
		
	}
	
}
