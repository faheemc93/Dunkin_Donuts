package productobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class WebBasePage {

	WebDriver driver;
	
	public WebBasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	protected void input(String xpath, String query) {
		driver.findElement(By.xpath(xpath)).sendKeys(query);
	}
	
	protected void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
}
