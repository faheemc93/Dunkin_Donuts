package expediaproductobjects;

import org.openqa.selenium.WebDriver;

public class FilterOptions extends BasePage{
	
	public String starRatingXpath = "//label[@for='f-star-rating-[RATING]']";
	public String slideXpath = "//div[@role='slider']";


	public FilterOptions(WebDriver driver) {
		super(driver);
	}
	
	public void starRating(int desiredRating) {
		
		String rating = String.valueOf(desiredRating);
		this.click(starRatingXpath.replace("[RATING]", rating));
	}
}
