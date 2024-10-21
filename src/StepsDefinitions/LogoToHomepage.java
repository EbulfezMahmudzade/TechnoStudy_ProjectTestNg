package StepsDefinitions;

import Pages.PageHome;
import Utility.BDP;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogoToHomepage extends BDP {
    @Test(groups = "Smoke Test")
    @Parameters("browserType")
    public void DropDownMenu() {
        PageHome ph = new PageHome();

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        for (int i = 0; i < ph.allLinks.size(); i++) {
            ph.allLinks = driver.findElements(By.xpath("//a"));
            if (!ph.allLinks.get(i).getText().equals("Campus Login") && ph.allLinks.get(i).isDisplayed()) {
                logAdd.info((i + 1) + " Link = " + ph.allLinks.get(i).getText());
                ph.myClick(ph.allLinks.get(i));
            }
            ph.myClick(ph.logoLink);
            ph.locationVerification(ph.applyButton);
        }
    }
}
