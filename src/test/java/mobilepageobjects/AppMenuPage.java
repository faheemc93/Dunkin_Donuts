package mobilepageobjects;

import io.appium.java_client.AppiumDriver;

public class AppMenuPage extends AppBasePage{

    private String icedDrinksBtn = "ICED DRINKSButton";
    private String hotDrinksBtn = "HOT DRINKSButton";
    private String sandwichBtn = "SANDWICHES & WRAPSButton";
    private String donutsBtn = "DONUTS & BAKERYButton";
    private String featuredCategoriesBtns = "new UiSelector().className(\"android.widget.TextView\")";
    //private String everythingPumpkinsBtn = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Everything Pumpkin\")";
    //private String halloweenBtn = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Halloween Treats\")";
    //private String fallFlavorsBtn = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Flavors of Fall\")";
    //private String coldBrewBtn = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Crafted Cold Brew\")";
    //private String espressoBtn = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Handcrafted Espresso\")";


    public AppMenuPage(AppiumDriver driver){
        super(driver);
    }

}
