package StepsDefinitions;

import Pages.PageHome;
import Utility.BDP;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubmenuSocialMedia extends BDP {
    @Test(groups = "Regression Test")
    @Parameters("browserType")
    public void SocialMedia() {
        PageHome ph = new PageHome();


        for (int i = 0; i < ph.socialMediaItems.size(); i++) {
            ph.scrolltoElement(ph.socialMediaItems.get(i));
            ph.socialMediaItems.get(i).click();

            Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("techno"));
            logAdd.info(i + 1 + "URL: " + driver.getCurrentUrl());
            driver.navigate().back();
        }
    }
}

