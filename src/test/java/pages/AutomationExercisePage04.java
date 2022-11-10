package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage04 {
    public AutomationExercisePage04() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


        @FindBy(xpath = "//a[@href='/login']")
        public WebElement signUpLinki;

        @FindBy(xpath = "//h2[text()='Login to your account']")
        public WebElement loginAccountElementi;

        @FindBy(xpath = "(//input[@type='email'])[1]")
        public WebElement loginEmailAdressKutusu;

        @FindBy(xpath = "(//input[@type='password'])[1]")
        public WebElement loginPasswordKutusu;

        @FindBy(xpath = "(//button[@type='submit'])[1]")
        public WebElement loginButton;

        @FindBy(xpath = "//*[text()=' Logged in as ']")
        public WebElement loggedinAs;

        @FindBy(xpath = "//a[@href='/logout']")
        public WebElement logoutButton;

}
