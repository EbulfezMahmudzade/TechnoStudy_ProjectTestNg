package StepsDefinitions;

import Pages.PageHome;
import Utility.BDP;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossCampus extends BDP {
    @Test(groups = "Regression Test")
    @Parameters("browserType")
    public void LoginCampusPage() {
        PageHome ph = new PageHome();

        ph.myClick(ph.campusLoginButton);
        wait.until(ExpectedConditions.urlToBe("https://campus.techno.study/"));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://campus.techno.study/"));
    }
}
