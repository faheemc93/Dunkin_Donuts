package productobjects;

import org.openqa.selenium.WebDriver;

public class WebLandingPage extends WebBasePage {
	
	//Contains all options in navbar. Menu, Location, Delivery, etc
	String navbarXpaths = "//p[@class='global-nav__header']";

	public WebLandingPage(WebDriver driver) {
		super(driver);
	}

}
