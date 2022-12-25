package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class QualityDemyPage_Instructor {
    public QualityDemyPage_Instructor(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // homepage>>loginlinki

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()='Accept']")
    public WebElement acceptCookies;
    @FindBy (xpath = "//div[@class='cookieButton']")
    public WebElement acceptButton;
    //Login>>HomePage==Instructor
    @FindBy(xpath = "//a[text()=\"Instructor\"]")
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
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse==Media
    @FindBy(xpath = "//span[text()='Media']")
    public WebElement mediaButton;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Media==CourseoverviewproviderDropDown
    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[4]")
    public WebElement courseOverviewProviderDropDown;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Media=courseOverviewProviderBox
    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[4]")
    public WebElement courseOverviewProviderBox;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Media=courseOverviewUrl
    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement courseOverviewUrl;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Media=uploadCourseThumbnail;
    @FindBy(xpath = "//label[@for='course_thumbnail']")
    public WebElement uploadCourseThumbnail;

    @FindBy(xpath = "//div[@class='box']")
    public WebElement uploadPhotoSection;
   //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse==Basic
   @FindBy(xpath = "//input[@placeholder='Enter course title']")
   public WebElement courseTitle;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse==Basic
   @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[1]")
   public WebElement categoryDropDown;

   @FindBy(xpath = "(//*[text()='Web Design for Web Developers'])[2]")
   public WebElement webDesignLesson;

    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Media==CourseThumbnail
    @FindBy(xpath = "//*[text()=' Course thumbnail ']")
    public WebElement courseThumbnailPhoto;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse==Seo
    @FindBy(xpath = "//span[text()='Seo']")
    public WebElement seoButton;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Seo==metaKeywordTextbox
    @FindBy(xpath = "(//input[@placeholder='Write a keyword and then press enter button'])[2]")
    public WebElement metaKeywordTextbox;
   //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Seo=courseOverviewUrlBox
    @FindBy(xpath = "//input[@name='course_overview_url']")
    public WebElement courseOverviewUrlBox;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Seo=metaKeywordTextCheck
    @FindBy(xpath = "(//span[@class='tag label label-info'])[1]")
    public WebElement metaKeywordTextCheck;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Seo=metaKeywordTextCheck2
    @FindBy(xpath = "(//span[@class='tag label label-info'])[2]")
    public WebElement metaKeywordTextCheck2;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>Seo=metaDescriptionsCheck
    @FindBy(xpath = "//*[text()='Hello']")
    public WebElement metaDescriptionsCheck;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>FINISH
    @FindBy(xpath = "//a[@href='#finish']")
    public WebElement finishSection;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>FINISH
    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitFinish;
    //LOGIN>>HOMEPAGE>>INSTRUCTOR>>UNDER_NAVIGATION_CourseManager>>RightCornerAddnewCourse>>FINISH
    @FindBy(xpath = "//div[@class='jq-toast-single jq-has-icon jq-icon-success']")
    public WebElement congratulationsMessage;

    @FindBy(xpath ="//div[@class='js--image-preview']")
    public WebElement resimYukleme;

    @FindBy(xpath = "//a[@id='topbar-userdrop']")
    public WebElement testUser;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutButton;
    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement buttonCookiesAccept;

    @FindBy(id = "cookieConsentContainer")
    public WebElement cookiesContainer;

    public void CookiesComp() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void acceptCookies() {
        if (buttonCookiesAccept.isDisplayed()){
            ReusableMethods.waitForClickablility(buttonCookiesAccept,5);
            buttonCookiesAccept.click();
            hideCookies();
        }
    }

    public void hideCookies() {
        JavascriptExecutor driver = (JavascriptExecutor) Driver.getDriver();
        driver.executeScript("arguments[0].style.visibility='hidden'", cookiesContainer);

    }



}
