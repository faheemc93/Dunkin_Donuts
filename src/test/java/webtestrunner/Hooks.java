package webtestrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Hooks {
	
	WebDriver driver;
	
	@BeforeMethod (alwaysRun=true)
	public void setup() {
		
		String url = "https://www.dunkindonuts.com";
		
		String pathToDriver = System.getProperty("user.dir") + "/src/test/resources/chromedriver";
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
	
	@DataProvider(name = "login-info")
	public Object[][] dpMethod() {
		Object data[][] = {
				{"standard_user", "secret_sauce"}
				};
		
		return data;
	}

} 
