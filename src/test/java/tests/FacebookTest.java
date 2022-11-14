package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class FacebookTest {

    @Test
    public void facebooktest(){
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        Faker faker=new Faker();
        FacebookPage facebook=new FacebookPage();
        facebook.cerezler.click();
        facebook.facebookEmail.sendKeys(faker.internet().password());
        facebook.facebookPassword.sendKeys(faker.internet().emailAddress()+Keys.ENTER);
        Assert.assertTrue(facebook.facebooksifreDogrulama.isDisplayed());

    }
}
