package expediaproductobjects;

import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage {

	public LandingPage(WebDriver driver) {
		super(driver);
	}

	public String overlayCloseButton = "//button[@aria-label='Close overlay']";
	
}