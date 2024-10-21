package Pages;

import Utility.BDP;
import Utility.Tools;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;


public class ParentE extends BDP {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public void mySendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrolltoElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void myClick(WebElement element) {
         wait.until(ExpectedConditions.elementToBeClickable(element));
         scrolltoElement(element);
         element.click();
    }
    public void mySelectValue(WebElement element,String value) {
        Select sl=new Select(element);
        wait.until(ExpectedConditions.elementToBeSelected(element));
        sl.selectByValue(value);
    }
    public void mySelectIndex(WebElement element) {
        Select select = new Select(element);
        int rndIndex= Tools.randomGenerator(select.getOptions().size()-2);
        select.selectByIndex(rndIndex);
    }

    public void scrolltoElement(WebElement element) {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()) );
    }
    public void locationVerification(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.isDisplayed(),"Location not found!");
    }
    public void verifyElementOrNavigateBack(WebElement element, String currentUrl){
        try {
           locationVerification(element);
        } catch (NoSuchElementException e) {
            driver.get(currentUrl);
        }
    }

}