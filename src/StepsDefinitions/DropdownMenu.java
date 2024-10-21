package StepsDefinitions;

import Pages.PageHome;
import Utility.BDP;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DropdownMenu extends BDP {
    @Test(groups = {"Smoke Test"})
    @Parameters("browserType")
    public void DropDownMenu() {
        PageHome ph = new PageHome();

           actions.moveToElement(ph.dropdownMenu).build().perform();

        for (int i = 0; i < ph.dropdownItems.size(); i++) {
            ph.dropdownItems.get(i).click();
            wait.until(ExpectedConditions.visibilityOf(ph.campusLoginButton));
            driver.navigate().back();
            wait.until(ExpectedConditions.visibilityOf(ph.dropdownMenu));
            actions.moveToElement(ph.dropdownMenu).build().perform();
        }
    }

}
