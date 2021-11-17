package expediaproductobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResults extends BasePage {
	
	public String adResults = "//span[@class='_2cLakF _2fSdu2 _1bK8qu iXrmyZ' and text()='Ad']";
	public String hotelAdResultBanner = "//li[@data-hotel-id='[HOTEL-ID]']/child::*/child::*/child::*[1]/child::div";
	
	public SearchResults(WebDriver driver) {
		super(driver);
	}
	
	public boolean detectAdResult(String hotelId) {
		try {
			driver.findElement(By.xpath(hotelAdResultBanner.replace("[HOTEL-ID]", hotelId))).isDisplayed();
			return true;
		} catch(NoSuchElementException ignore) {
			return false;
		}
	}
	
	public void displayTwoResults(List<WebElement> resultHotelIds) {
		List<WebElement> resultsToDisplay = new ArrayList<WebElement>();
		int counter = 0;
		for(int i = 0; i < resultHotelIds.size(); i++) {
			if(!detectAdResult(resultHotelIds.get(i).getAttribute("data-hotel-id"))) {
				resultsToDisplay.add(resultHotelIds.get(i));
				counter++;
			}
			if(counter >= 2) break;
		}
		System.out.print("Da Results");
	}
	
}
