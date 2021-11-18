package mobilepageobjects;

import io.appium.java_client.AppiumDriver;

public class SignUpFormPage extends BasePage {

	public String firstNameFieldSelector = "new UiSelector().className(\"android.widget.EditText\").text(\"First Name\")";
	public String lastNameFieldSelector = "new UiSelector().className(\"android.widget.EditText\").text(\"Last Name\")";
	public String emailAddressFieldSelector = "new UiSelector().className(\"android.widget.EditText\").text(\"Email Address\")";
	public String passwordFieldSelector = "new UiSelector().className(\"android.widget.EditText\").text(\"Password\")";
	public String mobileNumberFieldSelector = "new UiSelector().className(\"android.widget.EditText\").text(\"Mobile Number\")";
	public String zipCodeFieldSelector = "new UiSelector().className(\"android.widget.EditText\").text(\"Zip Code (Optional)\")";
	public String checkBoxButtonSelector = "new UiSelector().className(\"android.widget.CheckBox\").index(0)";
	
	public SignUpFormPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
