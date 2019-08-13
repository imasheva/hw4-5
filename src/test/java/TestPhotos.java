import org.testng.Assert;
import org.testng.annotations.Test;


public class TestPhotos extends ParentClassBaseUI {

    String currentUrl;
    String expectedUrl = "https://romanceabroad.com/store/category-sweets";


    @Test
    public void testPhotos(){
        driver.findElement(Locators.LINK_PHOTOS).click();
        checkAssert();

    }
    @Test
    public void testPhotosByCssSelector(){
        driver.findElement(Locators.LINK_PHOTOS_CSS).click();
        checkAssert();

    }
    public void checkAssert() {
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrl);

    }
}
