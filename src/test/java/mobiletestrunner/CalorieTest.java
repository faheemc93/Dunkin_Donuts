package mobiletestrunner;

import mobilepageobjects.LandingPage;
import mobilepageobjects.MenuPage;
import mobilepageobjects.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalorieTest extends Hooks{

    @Test
    public void calorieTest(){
        LandingPage landingPage = new LandingPage(driver);
        MenuPage menuPage = new MenuPage(driver);
        ProductPage productPage = new ProductPage(driver);

        landingPage.navigationMenuFlow();
        menuPage.breakFastRemixFlow();
        String productCals = productPage.getCalories();
        String zeroCals = "0 Cal";
        Assert.assertNotEquals(productCals,zeroCals);
    }
}
