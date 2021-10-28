package mobiletestrunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {
	
	AppiumDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void setup() throws MalformedURLException {

		String path = System.getProperty("user.dir").concat("/src/test/resources/dunkin.apk");
		String url = "http://127.0.0.1:4723/wd/hub";
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "11");
		desiredCapabilities.setCapability("deviceName", "Pixel_3a");
		desiredCapabilities.setCapability("app", path);
		desiredCapabilities.setCapability("unicodeKeyboard", true);
		desiredCapabilities.setCapability("resetKeyboard", true);
	
		driver = new AndroidDriver(new URL(url),desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
	}
	
}
