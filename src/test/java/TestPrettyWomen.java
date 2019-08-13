import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPrettyWomen extends ParentClassBaseUI {


    String currentUrlPrettyWomen;
    String expectedUrlPrettyWomen = "https://romanceabroad.com/users/search";



    @Test
    public void testPrettyWomen(){
        driver.findElement(Locators.LINK_PRETTY_WOMEN).click();
        checkAssert();

    }
    @Test
    public void testPrettyWomenByCssSelector(){
        driver.findElement(Locators.LINK_PRETTY_WOMEN_CSS).click();
        checkAssert();

    }
    public void checkAssert() {
        currentUrlPrettyWomen = driver.getCurrentUrl();
        System.out.println(currentUrlPrettyWomen);
        Assert.assertEquals(currentUrlPrettyWomen, expectedUrlPrettyWomen);

    }
}
