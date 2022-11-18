package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;

public class US_34 {

    @Test
    public void seoSectionTest(){
        QualityDemyPage_Instructor qualityDemyPage_instructor=new QualityDemyPage_Instructor();
        Driver.getDriver().get(ConfigReader.getProperty("qualityDemyUrlNevzat"));
        Driver.getDriver().get(ConfigReader.getProperty("qualityDemyUrlNevzat"));
        qualityDemyPage_instructor.acceptCookies.click();

        qualityDemyPage_instructor.loginButtonHomepage.click();
        qualityDemyPage_instructor.emailboxLogin.sendKeys(ConfigReader.getProperty("qualityDemyGecerliMailNevzat"));
        qualityDemyPage_instructor.passwordboxLogin.sendKeys(ConfigReader.getProperty("qualityDemyGecerliPasswordNevzat"));
        qualityDemyPage_instructor.loginButton.click();

        qualityDemyPage_instructor.instructorButton.click();
        qualityDemyPage_instructor.courseManagerButton.click();
        qualityDemyPage_instructor.addNewCourseButton.click();
        qualityDemyPage_instructor.seoSectionButton.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.click(qualityDemyPage_instructor.metaKeywordTextbox).
                sendKeys(ConfigReader.getProperty("seoMetaKeywordsTextbox")+Keys.ENTER).
                sendKeys(ConfigReader.getProperty("seoMetaKeywordsTextbox2")+Keys.ENTER).perform();


    }
}
