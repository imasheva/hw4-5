import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBookNow extends ParentClassBaseUI {

    String currentUrl;
    String expectedUrl = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";

    @Test
    public void testHowItWorksPage() {
        driver.findElement(Locators.LinkBookNow).click();
        checkAssert();

    }
    @Test
    public void testHowItWorksPageCssSelector() {
        driver.findElement(Locators.LinkBookNowCss).click();
        checkAssert();

    }
    public void checkAssert() {
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrl);

    }
}

