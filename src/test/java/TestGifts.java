import org.testng.Assert;
import org.testng.annotations.Test;


public class TestGifts extends ParentClassBaseUI {

    String currentUrl;
    String expectedUrl = "https://romanceabroad.com/store/category-sweets";


    @Test
    public void testGifts(){
        driver.findElement(Locators.LINK_CATEGORY_SWEETS).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrl);
    }
    @Test
    public void testGiftsByCssSelector(){

        driver.findElement(Locators.LINK_CATEGORY_SWEETS_CSS).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrl);
    }

}

