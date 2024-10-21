package Pages;

import Utility.BDG;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyPage extends ParentE{
    public ApplyPage() {
        PageFactory.initElements(BDG.driver,this);
    }
    @FindBy(xpath = "(//div[@class='tn-atom'])[2]")
    public WebElement contactUsText;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement phone;

    @FindBy(xpath = "//div[@class='t-input-phonemask__select']/span[2]")
    public WebElement phoneDropdown;

    @FindBy(xpath = "//div[@data-phonemask-name='Andorra']")
    public WebElement phoneCode;

    @FindBy(xpath = "//input[@name='Input']")
    public WebElement age;

    @FindBy(xpath = "//input[@name='Input_2']")
    public WebElement job;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement educationStatus;

    @FindBy(xpath = "//select[@name='country_2']")
    public WebElement countries;

    @FindBy(xpath = "//select[@name='course']")
    public WebElement courses;

    @FindBy(xpath = "//select[@name='survey']")
    public WebElement surveys;

    @FindBy(xpath = "//input[@name='Checkbox']/following-sibling::div")
    public WebElement agreeCheckbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendButton;

    @FindBy(xpath = "(//div[@id='tildaformsuccesspopuptext']//span)[1]")
    public WebElement messageText1;     public String value1="Başvurunuz alınmıştır. Bilgilendirme emailinize gönderilmiştir.";

    @FindBy(xpath = "(//div[@id='tildaformsuccesspopuptext']//span)[2]")
    public WebElement messageText2; public String value2="Lütfen posta kutunuzu kontrol ediniz.";
}
