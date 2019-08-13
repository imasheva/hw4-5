import org.testng.Assert;
import org.testng.annotations.Test;


public class TestHowWeWorkPage extends ParentClassBaseUI {

    String currentUrlHowItWorksPage;

    String expectedUrlHowItWorksPage = "https://romanceabroad.com/content/view/how-it-works";

    @Test
    public void testHowItWorksPage() {
        driver.findElement(Locators.LINK_HOW_IT_WORKS).click();
        checkAssert();
    }

    @Test
    public void testHowItWorksPageByCss() {
        driver.findElement(Locators.LINK_HOW_IT_WORKS_CSS).click();

        checkAssert();

    }
        public void checkAssert(){
        currentUrlHowItWorksPage = driver.getCurrentUrl();
        System.out.println(currentUrlHowItWorksPage);
        Assert.assertEquals(currentUrlHowItWorksPage, expectedUrlHowItWorksPage);

        }
}

