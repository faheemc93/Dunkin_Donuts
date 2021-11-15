package expediatestrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks {
	
	WebDriver driver;
	
	@BeforeMethod (alwaysRun=true)
	public void setup() {
		
		String url = "https://www.hotels.com/";
		
		String pathToDriver = System.getProperty("user.dir") + "/src/test/resources/chromedriver";
		System.setProperty("webdriver.chrome.driver", pathToDriver);
		
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	
	@AfterMethod (alwaysRun=true)
	public void tearDown() {
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
		
	}


}
