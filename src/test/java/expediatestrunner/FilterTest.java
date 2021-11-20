package expediatestrunner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import expediaproductobjects.FilterOptions;
import expediaproductobjects.LandingPage;
import expediaproductobjects.SearchBar;

public class FilterTest extends Hooks {
	
	//this test searches for hotels with the given location and dates, and filters the results based on desired star rating and price range
	@Test(enabled=true)
	public void test() throws InterruptedException {
		
		SearchBar searchBar = new SearchBar(driver);
		LandingPage landing = new LandingPage(driver);
		FilterOptions filterOptions = new FilterOptions(driver);
		
		if(driver.findElement(By.xpath(landing.overlayCloseButton)).isDisplayed()) {
			searchBar.click(landing.overlayCloseButton);
		}
		
		searchBar.singleDestinationQuery("Boston, Massachusetts United States", "Wed Dec 01 2021", "Sat Dec 04 2021");
		Thread.sleep(5000);
		filterOptions.starRating(4);			//enter desired star rating for hotel
		filterOptions.starRating(5);			//enter desired star rating for hotel
		filterOptions.nightlyPrice(200, 400);	//enter min and max price for hotel
	}
}
