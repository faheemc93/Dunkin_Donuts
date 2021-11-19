package expediaproductobjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchBar extends BasePage {
	
	public String destinationField = "//input[@data-stid='sqm-destination']";
	
	public String checkInDateButton = "//button[@class='_1yFrqc _1ZtnNu']";
	public String checkOutDateButton = "//button[@class='_1yFrqc _1RdfF-']";
	public String date = "//button[@name='[DATE] 12:00:00 GMT-0500 (Eastern Standard Time)']";
	public String applyButton = "//button[@aria-label='Apply']";
	
	public String guestsButton = "//button[@class='_1yFrqc']";
	
	public String searchButton = "//button[@aria-label='Search']";

	public SearchBar(WebDriver driver) {
		super(driver);
	}
	
	public void pressEnter(String xpath) {
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.RETURN);
	}
	
	public void singleDestinationQuery(String destination, String checkInDate, String checkOutDate) {
		this.click(destinationField);
		this.input(destinationField, destination);
		this.pressEnter(destinationField);
		
		this.click(checkInDateButton);;
		this.click(date.replace("[DATE]", checkInDate));
		this.click(date.replace("[DATE]", checkOutDate));
		this.click(applyButton);
		
		this.click(searchButton);
	}

}

















