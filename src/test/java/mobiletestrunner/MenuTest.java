package mobiletestrunner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mobilepageobjects.MenuPage;

public class MenuTest extends Hooks{
	
	//tests all items in the hot drinks category, from hot drinks data provider
	@Test(dataProvider = "hot drinks")
	public void hotDrinks(String item) throws InterruptedException {
		new NavigateTo(driver,new MenuPage(driver)).
		withCategory("hot drinks").
		withItem(item).
		start();
	}
	
	//tests all items in the iced drinks category, from iced drinks data provider
	@Test(dataProvider = "iced drinks")
	public void coldDrinks(String item) throws InterruptedException {
		new NavigateTo(driver,new MenuPage(driver)).
		withCategory("iced drinks").
		withItem(item).
		start();
	}
}