import org.testng.Assert;
import org.testng.annotations.Test;


public class TestHome extends ParentClassBaseUI {

    String currentUrlHome;
    String expectedUrlHome = "https://romanceabroad.com/";


    @Test
    public void testHome() {
        driver.findElement(Locators.LINK_HOME_PAGE).click();
        checkAssert();

    }



    public void checkAssert() {
        currentUrlHome = driver.getCurrentUrl();
        System.out.println(currentUrlHome);
        Assert.assertEquals(currentUrlHome, expectedUrlHome);
    }

}
