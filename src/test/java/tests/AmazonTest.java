package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonTest {


    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        String aramaSonucu=amazonPage.aramasonucuElementi.getText();

        Assert.assertTrue(aramaSonucu.contains(ConfigReader.getProperty("aranankelime")));

        Driver.closeDriver();

        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN);

    }

    @Test
    public void test02(){
        QualityDemyPage_Instructor qualityDemyPage_instructor=new QualityDemyPage_Instructor();
        Driver.getDriver().get("https://www.qualitydemy.com");
        qualityDemyPage_instructor.acceptCookies.click();
        ReusableMethods.bekle(4);


    }
}
