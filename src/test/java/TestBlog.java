import org.testng.Assert;
import org.testng.annotations.Test;


public class TestBlog extends ParentClassBaseUI {

    String currentUrlBlog;
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";


    @Test
    public void testBlog() {
        driver.findElement(Locators.LINK_BLOG_PAGE).click();
        checkAssert();

    }

    @Test
    public void testBlogCssSelector() {
        driver.findElement(Locators.LINK_BLOG_PAGE_CSS).click();
        checkAssert();

    }

    public void checkAssert() {
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, expectedUrlBlog);
    }

}
