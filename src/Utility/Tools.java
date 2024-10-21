package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {
    public static void Wait(int sn) {

        try {
            Thread.sleep(sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int randomGenerator(int border) {
        return (int) (Math.random() * (border - 2)) + 2;
    }

    public static void SuccesMessageValidation() {

        WebElement msgLabel = BDG.driver.findElement(By.xpath(""));
        Assert.assertTrue(msgLabel.getText().toLowerCase().contains(""));
    }
    public static void MessageValidation(WebElement element, String expectedText) {

        Assert.assertTrue(element.getText().equals(expectedText));
    }
    public static boolean listContainsString(List<WebElement> elements, String SearchedWord) {
        boolean found = false;
        for (WebElement element : elements) {
            if (element.getText().equals(SearchedWord)) {
                found = true;
                break;
            }
        }
        return found;
    }

}
