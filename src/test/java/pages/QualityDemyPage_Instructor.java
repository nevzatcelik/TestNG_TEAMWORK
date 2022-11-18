package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage_Instructor {
    public QualityDemyPage_Instructor(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // homepage>>loginlinki
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginButtonHomepage;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailboxLogin;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordboxLogin;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()='Accept']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement instructorButton;

    @FindBy(xpath = "//span[text()='Course manager']")
    public WebElement courseManagerButton;

    @FindBy(xpath = "//a[text()='Add new course']")
    public WebElement addNewCourseButton;

    @FindBy(xpath = "//span[text()='Requirements']")
    public WebElement requirementsButton;

    @FindBy(xpath = "//button[@onclick='appendRequirement()']")
    public WebElement requirementsGreenPlusButton;

    @FindBy(xpath = "(//button[@onclick='removeRequirement(this)'])[2]")
    public WebElement requirementsRedMinusButton;

    @FindBy(xpath = "//span[text()='Outcomes']")
    public WebElement outComesButton;

    @FindBy(xpath = "//button[@onclick='appendOutcome()']")
    public WebElement outComesGreenPlusButton;

    @FindBy(xpath = "(//i[@class='fa fa-minus'])[3]")
    public WebElement outComesRedMinusButton;
}
