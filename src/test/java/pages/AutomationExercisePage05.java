package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.logging.XMLFormatter;

public class AutomationExercisePage05 {

    public AutomationExercisePage05() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLinki;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignup;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement newUserName;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement newEmailAdress;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButton;

    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement alreadyExist;
}
