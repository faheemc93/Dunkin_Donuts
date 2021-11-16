package expediatestrunner;

import org.testng.annotations.Test;
import expediaproductobjects.SearchBar;

public class SearchTest extends Hooks {
	
	@Test(enabled=true)
	public void test() throws InterruptedException {

		SearchBar searchBar = new SearchBar(driver);

		searchBar.singleDestinationQuery("Miami, Florida, United States", "Sat Nov 20 2021", "Fri Nov 26 2021");
		
	}

}