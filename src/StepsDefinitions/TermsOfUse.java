package StepsDefinitions;

import Pages.ApplyPage;
import Utility.BDP;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TermsOfUse extends BDP {
    @Test(groups = "Smoke Test")
    @Parameters("browserType")
    public void SocialMedia() {
        ApplyPage ap=new ApplyPage();

        ap.scrolltoElement(ap.agreeCheckbox);
        ap.agreeCheckbox.click();
    }
}
