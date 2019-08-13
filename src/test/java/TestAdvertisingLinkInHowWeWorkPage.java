import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdvertisingLinkInHowWeWorkPage extends ParentClassBaseUI{


  String currentUrlAdvertising;
  String expectedUrlAdvertising = "https://romanceabroad.com/content/view/advertising";



    @Test
    public void testAdvertising() {
        driver.findElement(Locators.LINK_HOW_IT_WORKS).click();
        driver.findElement(Locators.LINK_ADVERTISING).click();
        checkAssert();

    }
    @Test
    public void testAdvertisingCssSelector() {
        driver.findElement(Locators.LINK_HOW_IT_WORKS_CSS).click();
        driver.findElement(Locators.LINK_ADVERTISING_CSS).click();
        checkAssert();

    }

    public void checkAssert(){
        currentUrlAdvertising = driver.getCurrentUrl();
        System.out.println(currentUrlAdvertising);
        Assert.assertEquals(currentUrlAdvertising, expectedUrlAdvertising);
    }

}

