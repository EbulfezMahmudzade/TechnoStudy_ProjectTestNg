package StepsDefinitions;

import Pages.ApplyPage;
import Pages.PageHome;
import UData.UserData;
import Utility.BDP;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Booking extends BDP {

    @Test(dataProvider = "getData")
    public void apply(String fullName, String email, String phoneNumber, String age, String job) {
        ApplyPage ap = new ApplyPage();
        PageHome ph = new PageHome();

        wait.until(ExpectedConditions.visibilityOf(ph.applyButton));
        ph.applyButton.click();
        ap.locationVerification(ap.contactUsText);

        ap.mySendKeys(ap.fullName, fullName);
        ap.mySendKeys(ap.email, email);
        ap.phoneDropdown.click();
        wait.until(ExpectedConditions.visibilityOf(ap.phoneCode));
        ap.phoneCode.click();
        ap.mySendKeys(ap.phone, phoneNumber);
        ap.mySendKeys(ap.age, age);
        ap.mySendKeys(ap.job, job);

        ap.mySelectIndex(ap.educationStatus);
        ap.mySelectIndex(ap.countries);
        ap.mySelectIndex(ap.courses);
        ap.mySelectIndex(ap.surveys);

        ap.myClick(ap.agreeCheckbox);
        ap.myClick(ap.sendButton);

        ap.verifyContainsText(ap.messageText1, ap.value1);
        ap.verifyContainsText(ap.messageText2, ap.value2);
    }
    @DataProvider
    Object[][] getData() {
        Object[][] data = {{UserData.fullName, UserData.email, UserData.phone, UserData.age, UserData.job}};
        return data;
    }
}
