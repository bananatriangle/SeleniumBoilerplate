import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyBeginnerBrowserTest {

    // ORDER OF TESTS IS NOT GUARANTEED!

    @Test
    public void sayHelloWorldTest(){
        System.out.println("Hello World!");
    }

    @Test
    public void openBrowserWindowTest() {
        WebDriver browser = new ChromeDriver();
    }

    @Test
    public void openAndCloseBrowserWindowTest() {
        WebDriver browser = new ChromeDriver();
        browser.quit();
    }

    @Test
    public void navigateToWebsiteTest() {
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.github.com");
        browser.quit();
    }

    @Test
    public void navigateFullScreenTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver browser = new ChromeDriver(options);
        browser.get("https://www.github.com");
        browser.quit();
    }

    @Test
    public void hoverOnElementTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver browser = new ChromeDriver(options);
        browser.get("https://www.github.com");

        WebElement element = browser.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[1]/details/summary"));
        Actions action = new Actions(browser);
        action.moveToElement(element).build().perform();

        browser.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[1]/details/div/a")).click();
        browser.quit();
    }
}