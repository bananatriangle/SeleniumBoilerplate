import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MySemiProBrowserTest {

    WebDriver browser;
    By topMenuWhyGitHub = By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[1]/details/summary");
    By topMenuFeatures = By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[1]/details/div/a");
    By codeReviewTile = By.xpath("/html/body/div[4]/div[2]/div/div/a[1]/span");

    @BeforeTest
    public void setUpTests() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        browser = new ChromeDriver(options);
    }

    @Test
    public void helloWorldTest() {
        System.out.println("Hello World");
    }

    @Test
    public void advancedTest() {
        browser.get("https://www.github.com");

        Actions action = new Actions(browser);
        WebElement element = browser.findElement(topMenuWhyGitHub);
        action.moveToElement(element).build().perform();

        browser.findElement(topMenuFeatures).click();
        String textFromElement = browser.findElement(codeReviewTile).getText();

        Assert.assertTrue(textFromElement.equals("Code review"));
    }

    @Test
    public void nazovTestu() {
        browser.get("http://www.azet.sk");
        browser.findElement(By.xpath("//*[@id='magaziny']/div[2]/div[1]/div[1]/h2/a")).click();
    }

    @AfterTest
    public void tearDownTests() {
        browser.quit();
    }
}