import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPrettyWomenGiftPage extends ParentClassBaseUI {


    String currentUrlGift;
    String expectedUrlGift = "https://romanceabroad.com/store/category-sweets";


    @Test
    public void testAdvertising() {
        driver.findElement(Locators.LINK_PRETTY_WOMEN).click();
        driver.findElement(Locators.LINK_GIFT).click();
        checkAssert();
    }
    @Test
    public void testAdvertisingByCssSelector() {
        driver.findElement(Locators.LINK_PRETTY_WOMEN_CSS).click();
        driver.findElement(Locators.LINK_GIFT_CSS).click();
        checkAssert();

    }
    public void checkAssert() {
        currentUrlGift = driver.getCurrentUrl();
        System.out.println(currentUrlGift);
        Assert.assertEquals(currentUrlGift, expectedUrlGift);


    }

}


