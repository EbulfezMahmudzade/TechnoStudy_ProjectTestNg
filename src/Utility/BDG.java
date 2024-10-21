package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BDG {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;
    public static Logger logger = LogManager.getLogger(BDP.class);

    @BeforeClass
    public void Start() {

        driver = new ChromeDriver();
        actions = new Actions(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        navigateUrl();
    }

    @AfterClass
    public void Finish() {
        Tools.Wait(3);
        driver.quit();
    }

    public void navigateUrl() {
        driver.get("https://techno.study/tr/#submenu:details");

    }
}
