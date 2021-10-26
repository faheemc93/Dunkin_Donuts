package webproductobjects;

import org.openqa.selenium.WebDriver;

public class signInPage extends BasePage {

	public signInPage(WebDriver driver) {
		super(driver);
	}
	public String emailField = "//input[@id='email']";
	public String passwordField = "//input[@id='password']";
	
}
