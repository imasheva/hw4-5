import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTourToUkraine extends ParentClassBaseUI{

    String currentUrl;
    String expectedUrl= "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";


    @Test
    public void testTourToUkraine() {
        driver.findElement(Locators.LINK_TOUR_TO_UKRAINE).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrl);
    }


}
