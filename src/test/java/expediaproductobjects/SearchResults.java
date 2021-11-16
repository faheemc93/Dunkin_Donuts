package expediaproductobjects;

import org.openqa.selenium.WebDriver;

public class SearchResults extends BasePage {
	
	public String adResults = "//span[@class='_2cLakF _2fSdu2 _1bK8qu iXrmyZ' and text()='Ad']";
	//path: //li[@data-hotel-id='165008']/child::*/child::*/child::*[1]/child::div
	public SearchResults(WebDriver driver) {
		super(driver);
	}
	
}
