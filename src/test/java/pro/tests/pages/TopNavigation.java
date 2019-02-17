package pro.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TopNavigation {

    private final WebDriver browser;
    public static By topMenuWhyGitHub = By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[1]/details/summary");
    public static By topMenuFeatures = By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[1]/details/div/a");

    public TopNavigation(WebDriver browser) {
        this.browser = browser;
    }

    private void hoverOnWhyGitHub(){
        Actions action = new Actions(browser);
        WebElement element = browser.findElement(topMenuWhyGitHub);
        action.moveToElement(element).build().perform();
    }

    public void navigateToFeatures() {
        hoverOnWhyGitHub();
        browser.findElement(topMenuFeatures).click();
    }
}