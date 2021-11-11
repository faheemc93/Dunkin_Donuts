package expediaproductobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchBar extends BasePage {
	
	public String goingToFieldXpath = "//input[@data-stid='sqm-destination']";
	public String checkInDate = "";
	public String checkOutDate = "//button[@class='_1yFrqc _1RdfF-']";
	public String date = "//button[@name='[DATE] (Eastern Standard Time)']";
	public String applyButton = "//button[@aria-label='Apply']";
	public String searchButton = "//button[@aria-label='Search']";

	public SearchBar(WebDriver driver) {
		super(driver);
	}
	
	public void pressEnter(String xpath) {
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.RETURN);
	}
	
	public void singleDestinationQuery(String destination, String checkInDate, String checkOutDate, String rooms, String adultGuests, String childGuests) {
		this.click(goingToFieldXpath);
		this.input(goingToFieldXpath, destination);
		this.pressEnter(goingToFieldXpath);
		
		this.click(checkOutDate);
		this.click(date.replace("[DATE]", checkOutDate));
		this.click(applyButton);
		this.click(searchButton);
	}

}
