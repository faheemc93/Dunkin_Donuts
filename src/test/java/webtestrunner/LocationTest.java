package webtestrunner;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import webproductobjects.LandingPage;
import webproductobjects.LocationPage;

public class LocationTest extends Hooks {

	@Test
	public void distanceLowToHighTest() throws Exception {
		
		//LandingPage landingPage = new LandingPage(driver);
		LocationPage locationPage = new LocationPage(driver);
		
		//landingPage.click(landingPage.menuItems.get("location"));
		Thread.sleep(10000);
		
		List<WebElement> distanceValuesXpath = driver.findElements(By.xpath(locationPage.distanceValuesXpath));
		
		//Convert all WebElements to Double values
		List<Double> distanceValues = new ArrayList<Double>();
		for(int i = 1; i < distanceValuesXpath.size(); i++) {
			String str = distanceValuesXpath.get(i).getText().replaceAll("[a-zA-Z ]", "");
			double temp = Double.parseDouble(str);
			distanceValues.add(temp);
		}
		
		//Check each distance value with proceeding to see if it is less than the proceeding value
		for(int i = 1; i < distanceValues.size() - 1; i++) {
			if(distanceValues.get(i) > distanceValues.get(i + 1)) {
				throw new Exception("Distance Error. Not ordered from closest to furthest:" + i);
			}
		}
		
	}
	 
}
