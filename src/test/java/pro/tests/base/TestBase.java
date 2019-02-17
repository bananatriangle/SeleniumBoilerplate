package pro.tests.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    public WebDriver browser;

    @BeforeTest
    public void setUpTests() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        browser = new ChromeDriver(options);
        browser.get("https://www.github.com");
    }

    @AfterTest
    public void tearDownTests() {
        browser.quit();
    }
}