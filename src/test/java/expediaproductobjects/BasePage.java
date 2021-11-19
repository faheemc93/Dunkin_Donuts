package expediaproductobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void input(String xpath, String query) {
		driver.findElement(By.xpath(xpath)).sendKeys(query);
	}
	
	public void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

}
