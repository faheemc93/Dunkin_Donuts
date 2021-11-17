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
	public String hotelResultNameTag = "//li[@data-hotel-id='[HOTEL-ID]']/child::div/child::div/child::div[2]/child::div[1]/child::section[1]/child::div/child::h2";
	public SearchResults(WebDriver driver) {
		super(driver);
	}
	
	//Method checks for Ad Banner. If it is there, return true, otherwise return false
	public boolean detectAdResult(String hotelId) {
		try {
			driver.findElement(By.xpath(hotelAdResultBanner.replace("[HOTEL-ID]", hotelId))).isDisplayed();
			return true;
		} catch(NoSuchElementException ignore) {
			return false;
		}
	}
	
	public void displayTwoResults(List<WebElement> resultHotelIds) {
		List<String> resultsToDisplay = new ArrayList<String>();
		int counter = 0;
		//If result is an ad, skip it, otherwise add to resultsToDisplay
		for(int i = 0; i < resultHotelIds.size(); i++) {
			if(!detectAdResult(resultHotelIds.get(i).getAttribute("data-hotel-id"))) {
				resultsToDisplay.add(resultHotelIds.get(i).getAttribute("data-hotel-id"));
				counter++;
			}
			if(counter >= 2) break;
		}
		
		System.out.println("RESULTS:");
		for(int i = 0; i < resultsToDisplay.size(); i++) {
			System.out.println(driver.findElement(By.xpath(hotelResultNameTag.replace("[HOTEL-ID]", resultsToDisplay.get(i)))).getText());
		}
	}
	
}