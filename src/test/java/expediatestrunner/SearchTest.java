package expediatestrunner;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import expediaproductobjects.LandingPage;
import expediaproductobjects.SearchBar;
import expediaproductobjects.SearchResults;

public class SearchTest extends Hooks {
	
	@Test(enabled=true)
	public void test() throws InterruptedException {

		SearchBar searchBar = new SearchBar(driver);
		LandingPage landing = new LandingPage(driver);
		SearchResults searchResults = new SearchResults(driver);

		if(driver.findElement(By.xpath(landing.overlayCloseButton)).isDisplayed()) {
			searchBar.click(landing.overlayCloseButton);
		}
		
		searchBar.singleDestinationQuery("Miami, Florida, United States", "Sat Nov 20 2021", "Fri Nov 26 2021");
		Thread.sleep(10000);
		List<WebElement> resultHotelIds = driver.findElements(By.xpath("//li[@data-hotel-id]"));
		searchResults.displayTwoResults(resultHotelIds);
		//System.out.println(resultHotelIds.get(1).getAttribute("data-hotel-id"));
		//System.out.println(searchResults.detectAdResult(resultHotelIds.get(1).getAttribute("data-hotel-id")));
		//To-Do: Detect ad results and skip them
		
	}

}