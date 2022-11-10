package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisePage05;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseTest05andTest07 {

    @Test
    public void testcase5(){


         // 1. Launch browser
         //  2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

        // 3. Verify that home page is visible successfully
        SoftAssert softAssert=new SoftAssert();

        String expectedUrl=ConfigReader.getProperty("autoUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"You are not on the Home Page");

        // 4. Click on 'Signup / Login' button
        AutomationExercisePage05 page05=new AutomationExercisePage05();
        page05.signUpLinki.click();

        // 5. Verify 'New User Signup!' is visible
        softAssert.assertTrue(page05.newUserSignup.isDisplayed(),"New User Signup! not found");

        //6. Enter name and already registered email address

        page05.newUserName.sendKeys(ConfigReader.getProperty("newusername"));
        page05.newEmailAdress.sendKeys(ConfigReader.getProperty("automationemailadress"));

        // 7. Click 'Signup' button
        page05.signupButton.click();

        //  8. Verify error 'Email Address already exist!' is visible
        softAssert.assertTrue(page05.alreadyExist.isDisplayed(),"already exist text not found");
        softAssert.assertAll();


    }
    @Test
    public void testcase07(){
         //  1. Launch browser
        //   2. Navigate to url 'http://automationexercise.com'
       //    3. Verify that home page is visible successfully
      //     4. Click on 'Test Cases' button
     //      5. Verify user is navigated to test cases page successfully

    }
}
