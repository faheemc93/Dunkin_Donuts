package mobiletestrunner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mobilepageobjects.MenuPage;

public class MenuTest extends Hooks{
	
	@Test
	public void test1() {
		
		new NavigateTo(driver,new MenuPage(driver)).
		withCategory("hot drinks").
		withItem("original blend").
		start();
	}
}