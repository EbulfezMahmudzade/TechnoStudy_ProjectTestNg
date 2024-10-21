package StepsDefinitions;

import Pages.PageHome;
import Utility.BDP;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CourseDetails extends BDP {
        @Test(groups = "Regression Test")
    @Parameters("browserType")
    public void LoginCampusPage() {
        PageHome ph = new PageHome();

        for (int i = 0; i < ph.detailedInformation.size(); i++) {
            wait.until(ExpectedConditions.visibilityOf(ph.detailedInformation.get(i)));
            ph.scrolltoElement(ph.detailedInformation.get(i));
            ph.detailedInformation.get(i).click();
            wait.until(ExpectedConditions.visibilityOf(ph.logoLink));
            logAdd.info((i+1)+" URL-" +driver.getCurrentUrl());
            driver.navigate().back();

        }
    }
}
