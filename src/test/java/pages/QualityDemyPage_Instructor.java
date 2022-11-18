package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.logging.XMLFormatter;

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
    //Login>>HomePage==Instructor
    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement instructorButton;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION==CourseManagerButton
    @FindBy(xpath = "//span[text()='Course manager']")
    public WebElement courseManagerButton;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCorner==AddnewCourse
    @FindBy(xpath = "//a[text()='Add new course']")
    public WebElement addNewCourseButton;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse==Requirements
    @FindBy(xpath = "//span[text()='Requirements']")
    public WebElement requirementsButton;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Requirements==requirementsGreenPlusButton
    @FindBy(xpath = "//button[@onclick='appendRequirement()']")
    public WebElement requirementsGreenPlusButton;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Requirements==requirementsRedMinusButton
    @FindBy(xpath = "(//button[@onclick='removeRequirement(this)'])[2]")
    public WebElement requirementsRedMinusButton;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse==OutComes
    @FindBy(xpath = "//span[text()='Outcomes']")
    public WebElement outComesButton;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>OutComes==outComesGreenPlusButton
    @FindBy(xpath = "//button[@onclick='appendOutcome()']")
    public WebElement outComesGreenPlusButton;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>OutComes==outComesRedMinusButton
    @FindBy(xpath = "(//i[@class='fa fa-minus'])[3]")
    public WebElement outComesRedMinusButton;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse==Seo
    @FindBy(xpath = "//span[text()='Seo']")
    public WebElement seoSectionButton;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Seo==metaKeywordTextbox
    @FindBy(xpath = "(//input[@placeholder='Write a keyword and then press enter button'])[2]")
    public WebElement metaKeywordTextbox;
}
