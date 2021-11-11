package expediaproductobjects;

import org.openqa.selenium.WebDriver;

public class SearchBar extends BasePage {
	
	public String goingToFieldXpath = "//input[@data-stid='sqm-destination']";
	public String checkInDate = "";
	public String checkOutDate = "//span[@class='_2qpRyR']";
	public String date = "//button[@name='[DATE] (Eastern Standard Time)']";
	public String applyButton = "//button[@aria-label='Apply']";
	public String searchButton = "//button[@aria-label='Search']";

	public SearchBar(WebDriver driver) {
		super(driver);
	}

}
