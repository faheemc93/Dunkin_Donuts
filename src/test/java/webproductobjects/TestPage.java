package webproductobjects;

import org.openqa.selenium.WebDriver;

public class TestPage extends BasePage {

	public TestPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickContinue() {
		click("//button[@id='checkout']");
	}
	
}
