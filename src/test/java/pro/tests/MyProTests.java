package pro.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pro.tests.base.TestBase;
import pro.tests.pages.Features;
import pro.tests.pages.TopNavigation;

public class MyProTests extends TestBase{

    @Test
    public void advancedTest() {
        TopNavigation navigation = new TopNavigation(browser);
        navigation.navigateToFeatures();

        String textFromElement = browser.findElement(Features.codeReviewTile).getText();

        Assert.assertTrue(textFromElement.equals("Code review"));
    }
}