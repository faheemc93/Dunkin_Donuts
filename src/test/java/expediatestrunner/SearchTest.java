package expediatestrunner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import expediaproductobjects.SearchBar;

public class SearchTest extends Hooks {
	
	@Test(enabled=true)
	public void test() throws InterruptedException {

		SearchBar searchBar = new SearchBar(driver);
		
		HashMap<String, ArrayList<Object>> roomsAndGuests = new HashMap<String, ArrayList<Object>>();
		roomsAndGuests.put(null, null);

		searchBar.singleDestinationQuery("Miami, Florida, United States", "Sat Nov 20 2021", "Fri Nov 26 2021");
		
	}

}