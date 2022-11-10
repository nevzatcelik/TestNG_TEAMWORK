package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisePage03;
import pages.AutomationExercisePage04;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationExerciseTest04 {

    @Test
    public void test04() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        SoftAssert softAssert = new SoftAssert();
        String expectedUrl = "https://automationexercise.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        softAssert.assertEquals(actualUrl, expectedUrl, "homepage'de degislsiniz");
        //4. Click on 'Signup / Login' button
        AutomationExercisePage04 automationExercisePage = new AutomationExercisePage04();
        ReusableMethods.bekle(2);
        automationExercisePage.signUpLinki.click();
        //5. Verify 'Login to your account' is visible
        softAssert.assertTrue(automationExercisePage.loginAccountElementi.isDisplayed(),"Login to your account gorunmuyor");
        //6. Enter correct email address and password
        automationExercisePage.loginEmailAdressKutusu.sendKeys("aurora11@gmail.com");
        automationExercisePage.loginPasswordKutusu.sendKeys("123456");
        //7. Click 'login' button
        automationExercisePage.loginButton.click();
        //8. Verify that 'Logged in as username' is visible
         softAssert.assertTrue(automationExercisePage.loggedinAs.isDisplayed(),"logged in as gorunmuyor");
        //9. Click 'Logout' button
        automationExercisePage.logoutButton.click();
        //10. Verify that user is navigated to login page
        softAssert.assertTrue(automationExercisePage.loginAccountElementi.isDisplayed(),"Login to your account gorunmuyor");

         softAssert.assertAll();

        Driver.closeDriver();
    }
}
