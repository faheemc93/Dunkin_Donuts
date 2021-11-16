package expediatestrunner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import expediaproductobjects.LandingPage;
import expediaproductobjects.SearchBar;

public class SearchTest extends Hooks {
	
	@Test(enabled=true)
	public void test() throws InterruptedException {

		SearchBar searchBar = new SearchBar(driver);
		LandingPage landing = new LandingPage(driver);
		
		searchBar.click(landing.overlayCloseButton);
		if(driver.findElement(By.xpath(landing.overlayCloseButton)).isDisplayed()) {
			searchBar.click(landing.overlayCloseButton);
		}
		
		searchBar.singleDestinationQuery("Miami, Florida, United States", "Sat Nov 20 2021", "Fri Nov 26 2021");
		
	}

}