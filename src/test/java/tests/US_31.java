package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;

public class US_31 {

    @Test
    public void outComesAddTest(){

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
        qualityDemyPage_instructor.outComesButton.click();
        qualityDemyPage_instructor.outComesGreenPlusButton.click();
        Assert.assertTrue(qualityDemyPage_instructor.outComesRedMinusButton.isDisplayed());
    }
}
