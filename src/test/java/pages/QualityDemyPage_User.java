package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage_User {

   public QualityDemyPage_User(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

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
    //Login>>HomePage==Instructor
    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement instructorButton;

    @FindBy (xpath = "(//input[@type='text'])[1]")
    public WebElement nameBox;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement emailAdressBox;

    @FindBy (xpath = "//textarea[@name='address']")
    public WebElement adressBox;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneNumberBox;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement anyMessageBox;

    @FindBy(xpath = "//input[@onchange='changeTitleOfImageUploader(this)']")
    public WebElement document;

    @FindBy(xpath ="//button[text()='Apply']")
    public WebElement applyButton;


    @FindBy(xpath = "//div[@class='jq-toast-single jq-has-icon jq-icon-success']")
    public WebElement applyCongrastMessage;

}
