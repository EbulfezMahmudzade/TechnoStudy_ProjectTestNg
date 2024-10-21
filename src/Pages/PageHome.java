package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageHome extends ParentE{
    public PageHome() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@id='allrecords']//li//a")
    public WebElement dropdownMenu;

    @FindBy(xpath = "//div[contains (@class, 'content')]//li/div/a")
    public List < WebElement > dropdownItems;

    @FindBy(linkText = "Campus Login")
    public WebElement campusLoginButton;

    @FindBy(xpath = "//div[@class='t396']//a[1]")
    public WebElement applyButton;

    @FindBy(xpath = "//div[@class='t396']//a//img")
    public List<WebElement> socialMediaItems;

    @FindBy(xpath = "//a")
    public List<WebElement> allLinks;

    @FindBy(xpath = "//a[@class='tn-atom' and text()='Detaylı bilgi']")
    public List<WebElement> detailedInformation;

    @FindBy(xpath = "//a[@href='/tr']/img")
    public WebElement logoLink;

}
