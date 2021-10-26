package webproductobjects;

import org.openqa.selenium.WebDriver;

public class LocationPage extends BasePage {
	
	public String distanceValuesXpath = "//div[@class='store-item__distance']/child::span";

	public LocationPage(WebDriver driver) {
		super(driver);
	}

}
